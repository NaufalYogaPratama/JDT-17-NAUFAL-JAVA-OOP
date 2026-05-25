package com.indivaragroup.polymorphism.exam.traditional.food.stall.menu;

import com.indivaragroup.interfacing.traditional.food.stall.DisplayAllMenu;

import java.math.BigDecimal;

public abstract class MenuItem implements DisplayAllMenu {

    protected String name;
    public MenuItem(String name) {
        this.name = name.toUpperCase();
    }

    public String getName(){
        return name;
    }

    public abstract void showInfo();

    public abstract BigDecimal prizeCalc();
}
