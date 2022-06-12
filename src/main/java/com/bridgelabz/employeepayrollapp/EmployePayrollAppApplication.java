package com.bridgelabz.employeepayrollapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class EmployePayrollAppApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Payroll App !!!!");
		SpringApplication.run(EmployePayrollAppApplication.class, args);
	}
}