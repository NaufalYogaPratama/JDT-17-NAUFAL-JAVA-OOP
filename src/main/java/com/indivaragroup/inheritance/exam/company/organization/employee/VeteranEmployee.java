package com.indivaragroup.inheritance.exam.company.organization.employee;

import com.indivaragroup.inheritance.exam.company.organization.role.EmployeeRole;
import java.math.BigDecimal;

public class VeteranEmployee extends Employee {
    public VeteranEmployee(String name, int age) {
        super(name, age);
        determineSalaryAndRole();
    }

    @Override
    public void determineSalaryAndRole() {
        super.setRole(EmployeeRole.SENIOR_EXECUTIVE);
        super.setSalary(new BigDecimal("30000000"));
    }
}