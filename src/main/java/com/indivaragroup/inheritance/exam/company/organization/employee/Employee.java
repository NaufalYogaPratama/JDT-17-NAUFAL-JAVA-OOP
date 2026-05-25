package com.indivaragroup.inheritance.exam.company.organization.employee;

import com.indivaragroup.inheritance.exam.company.organization.role.EmployeeRole;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public abstract class Employee {
    private String name;
    private int age;
    private BigDecimal salary;
    private EmployeeRole role;

    public Employee(String name, int age) {
        this.name = name.toUpperCase();
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public BigDecimal getSalary() { return salary; }
    public void setSalary(BigDecimal salary) { this.salary = salary; }

    public EmployeeRole getRole() { return role; }
    public void setRole(EmployeeRole role) { this.role = role; }

    public abstract void determineSalaryAndRole();

    public String formatSalary() {
        if (this.salary == null) return "0";
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator(',');
        DecimalFormat df = new DecimalFormat("#,###", symbols);
        return df.format(this.salary);
    }

    @Override
    public String toString() {
        String info = "Nama     : " + this.name + "\n" +
                "Umur     : " + this.age + " tahun\n" +
                "Posisi   : " + (this.role != null ? this.role.getDescription() : "Belum Ditentukan") + "\n" +
                "Gaji     : Rp " + formatSalary();

        if (this.age > 55) {
            info += "\n[!] PESAN HEAD HRD: Umur sudah melebihi 55 tahun. SURUH PENSIUN!";
        }
        return info;
    }
}