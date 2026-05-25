package com.indivaragroup.inheritance.exam.company.organization.dto;

public class ApplicantDTO {
    private String name;
    private int age;
    private String role;

    public ApplicantDTO(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getRole() { return role; }
}