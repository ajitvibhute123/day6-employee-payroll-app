package com.bridgelabz.employeepayrollapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class EmployePayrollAppApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Payroll App !!!!");
		ApplicationContext context = SpringApplication.run(EmployePayrollAppApplication.class, args);
		log.info("Employee Payroll App Started in {} Environment",
				context.getEnvironment().getProperty("environment"));
	}

}