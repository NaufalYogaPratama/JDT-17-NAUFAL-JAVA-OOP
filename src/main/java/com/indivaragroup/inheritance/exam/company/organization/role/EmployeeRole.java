package com.indivaragroup.inheritance.exam.company.organization.role;

public enum EmployeeRole {
    JUNIOR("Junior"),
    MIDDLE_TO_SENIOR("Middle to Senior"),
    SENIOR_EXECUTIVE("Senior Executive"),
    TRAINEE("Trainee"),
    UNASSIGNED("Unassigned");

    private final String description;

    EmployeeRole(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
