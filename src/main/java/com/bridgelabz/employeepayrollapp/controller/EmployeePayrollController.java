package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import com.bridgelabz.employeepayrollapp.dto.ResponseDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeePayrollController {

    @RequestMapping(value={"", "/", "/get"})
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(){
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1, new EmployeeDTO("Rutuja", 100000));
        ResponseDTO respDTO = new ResponseDTO("Get Call Successful", empData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{empId}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int empId){
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(empId, new EmployeeDTO("Ranii", 3000));
        ResponseDTO respDTO = new ResponseDTO("Get Call Success for id: ", employeePayrollData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
        public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeeDTO empPayrollDTO) {
            EmployeePayrollData employeePayrollData = null;
            employeePayrollData = new EmployeePayrollData(1, empPayrollDTO);
            ResponseDTO responseDTO = new ResponseDTO("Created employee Payroll data successfully", employeePayrollData);
            return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PutMapping("/update/{empId}")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@PathVariable int empId,@RequestBody EmployeeDTO empPayrollDTO) {
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(empId, empPayrollDTO);
        ResponseDTO responseDTO = new ResponseDTO("Updated employee Payroll data successfully", employeePayrollData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId) {
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(empId,new EmployeeDTO("Rutwij",500000));
        ResponseDTO responseDTO = new ResponseDTO("Deleted successfully","Deleted id: "+empId);
        return new  ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

}