package com.bridgelabz.employeepayrollapp.model;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

public @Data class EmployeePayrollData {

    private int employeeId;
    private String name;
    private long salary;
    private String gender;
    private LocalDate startDate;
    private String note;
    private String profilePic;
    private List<String> department;


    public EmployeePayrollData(int employeeId, EmployeeDTO employeeDTO) {
        this.employeeId = employeeId;
        this.name = employeeDTO.name;
        this.salary = employeeDTO.salary;
        this.gender= employeeDTO.gender;
        this.startDate= employeeDTO.startDate;
        this.note= employeeDTO.note;
        this.profilePic= employeeDTO.profilePic;
        this.department = employeeDTO.department;
    }



}