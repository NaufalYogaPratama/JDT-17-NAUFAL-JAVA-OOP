package com.indivaragroup.inheritance.exam.company.organization.employee;

import com.indivaragroup.inheritance.exam.company.organization.role.EmployeeRole;
import java.math.BigDecimal;

public class JuniorEmployee extends Employee {
    public JuniorEmployee(String name, int age) {
        super(name, age);
        determineSalaryAndRole();
    }

    @Override
    public void determineSalaryAndRole() {
        super.setRole(EmployeeRole.JUNIOR);
        super.setSalary(new BigDecimal("8000000"));
    }
}