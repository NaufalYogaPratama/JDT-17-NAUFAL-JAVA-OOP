package com.indivaragroup;

import com.indivaragroup.inheritance.exam.company.organization.CompanyRegistration;
import com.indivaragroup.polymorphism.exam.traditional.food.stall.TegalFoodStall;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Task 1
        CompanyRegistration companyTask = new CompanyRegistration();
        companyTask.runRegistration();

        System.out.println("\n");

        // Task 2
        TegalFoodStall wartegSystem = new TegalFoodStall();
        wartegSystem.displayMenu();
    }
}