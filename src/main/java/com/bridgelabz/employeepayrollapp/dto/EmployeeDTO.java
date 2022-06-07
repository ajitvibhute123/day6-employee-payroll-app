package com.bridgelabz.employeepayrollapp.dto;

public class EmployeeDTO {
    public String name;
    public long salary;

    public EmployeeDTO(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
        public String toString() {
            return "name="+name+":salary="+salary;
        }
}