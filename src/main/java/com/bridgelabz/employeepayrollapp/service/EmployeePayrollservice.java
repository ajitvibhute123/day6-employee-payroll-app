package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeePayrollservice implements IEmployeePayrollService{

    @Override
    public List<EmployeePayrollData> getEmployeePayrollData() {
        List<EmployeePayrollData> employeeDataList = new ArrayList<>();
        employeeDataList.add(new EmployeePayrollData(1,new EmployeeDTO("Rutuja",4000)));
        return employeeDataList;
    }

    @Override
    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(empId, new EmployeeDTO("Rutwij", 3000));
        return empData;
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeeDTO empPayrollDTO) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1, empPayrollDTO);
        return empData;
    }

    @Override
    public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeeDTO empPayrollDTO) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(empId, empPayrollDTO);
        return empData;
    }

    @Override
    public void deleteEmployeePayrollData(int empId) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(empId,new EmployeeDTO("Ranii",5000));
    }


}