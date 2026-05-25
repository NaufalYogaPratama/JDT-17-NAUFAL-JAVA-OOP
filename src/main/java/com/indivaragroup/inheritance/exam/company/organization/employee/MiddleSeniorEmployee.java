package com.indivaragroup.inheritance.exam.company.organization.employee;

import com.indivaragroup.inheritance.exam.company.organization.role.EmployeeRole;
import java.math.BigDecimal;

public class MiddleSeniorEmployee extends Employee {
    public MiddleSeniorEmployee(String name, int age) {
        super(name, age);
        determineSalaryAndRole();
    }

    @Override
    public void determineSalaryAndRole() {
        super.setRole(EmployeeRole.MIDDLE_TO_SENIOR);
        super.setSalary(new BigDecimal("15000000"));
    }
}