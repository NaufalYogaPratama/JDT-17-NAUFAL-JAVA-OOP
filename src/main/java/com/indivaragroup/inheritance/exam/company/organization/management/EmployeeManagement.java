package com.indivaragroup.inheritance.exam.company.organization.management;

import com.indivaragroup.inheritance.exam.company.organization.dto.ApplicantDTO;
import com.indivaragroup.inheritance.exam.company.organization.employee.Employee;
import com.indivaragroup.inheritance.exam.company.organization.employee.JuniorEmployee;
import com.indivaragroup.inheritance.exam.company.organization.employee.MiddleSeniorEmployee;

public class EmployeeManagement {

    public Employee createEmployeeFromDto(ApplicantDTO dto) {
        int age = dto.getAge();
        String name = dto.getName();

        if (age >= 20 && age <= 25) {
            return new JuniorEmployee(name, age);
        } else {
            return new MiddleSeniorEmployee(name, age);
        }
    }
}