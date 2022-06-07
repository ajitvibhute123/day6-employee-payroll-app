package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;

import java.util.List;

public interface IEmployeePayrollService {

    List<EmployeePayrollData> getEmployeePayrollData();

    EmployeePayrollData getEmployeePayrollDataById(int empId);

    List<EmployeePayrollData> getEmployeesByDepartment(String department);

    EmployeePayrollData createEmployeePayrollData(EmployeeDTO empPayrollDTO);

    EmployeePayrollData updateEmployeePayrollData(int empId,EmployeeDTO empPayrollDTO);

    void deleteEmployeePayrollData(int empId);
}