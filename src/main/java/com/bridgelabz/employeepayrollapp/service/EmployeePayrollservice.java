package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.exception.EmployeePayrollException;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import com.bridgelabz.employeepayrollapp.repository.EmployeePayrollRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@Slf4j
public class EmployeePayrollservice implements IEmployeePayrollService{

    @Autowired
    private EmployeePayrollRepository employeePayrollRepository;

    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        return employeePayrollRepository.findAll();
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        return employeePayrollRepository
                .findById(empId)
                .orElseThrow(()->new EmployeePayrollException(("Employee with employeeOd "+empId+ "does not exists...")));
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeeDTO empPayrollDTO) {
        EmployeePayrollData empData=null;
        empData = new EmployeePayrollData(empPayrollDTO);
        log.debug("Emp Data: "+empData.toString());
        return employeePayrollRepository.save(empData);
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeeDTO empPayrollDTO){
        EmployeePayrollData empData=this.getEmployeePayrollDataById(empId);
        empData.updateEmployeePayrollData(empPayrollDTO);
        return employeePayrollRepository.save(empData);
    }
    @Override
    public void deleteEmployeePayrollData(int empId){
        EmployeePayrollData employeePayrollData = this.getEmployeePayrollDataById(empId);
        employeePayrollRepository.delete(employeePayrollData);
    }
}