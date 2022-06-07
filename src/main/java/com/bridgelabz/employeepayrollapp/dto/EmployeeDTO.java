package com.bridgelabz.employeepayrollapp.dto;

import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.List;

public @ToString class EmployeeDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",
            message = "Employee name is Invalid")

    @NotEmpty(message = "Employee name cannot be null")
    public String name;

    @Min(value = 500, message = "Min wage should be more than 500")

    public long salary;

    public LocalDate startDate;

    public String gender;

    public String note;

    public String profilePic;

    public List<String> department;


    public EmployeeDTO(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
        public String toString() {
            return "name="+name+":salary="+salary;
        }
}