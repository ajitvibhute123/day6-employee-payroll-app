package com.bridgelabz.employeepayrollapp.conroller;

import com.bridgelabz.employeepayrollapp.dto.EmployeeDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeePayrollController {

    @RequestMapping(value={"", "/", "/get"})
    public ResponseEntity<String> getEmployeePayrollData(){
        return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
    }

    @GetMapping("/get/{empId}")
    public ResponseEntity<String> getEmployeePayrollData(@PathVariable("empId") int empId){
        return new ResponseEntity<String>("Get Call Success for id: "+empId, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> addEmployeePayrollData(@RequestBody EmployeeDTO empDTO){
        return new ResponseEntity<String>("Created Employee Payroll Data for: "+empDTO, HttpStatus. OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateEmployeePayrollData(@RequestBody EmployeeDTO empDTO){
        return new ResponseEntity<String>("Updated Employee Payroll Data for: "+ empDTO, HttpStatus. OK);
    }

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable("empId") int empId){
        return new ResponseEntity<String>("Delete Call Success for id: "+empId, HttpStatus. OK);
    }

}