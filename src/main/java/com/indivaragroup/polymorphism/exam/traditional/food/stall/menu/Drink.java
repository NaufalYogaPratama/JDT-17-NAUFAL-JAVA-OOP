package com.indivaragroup.polymorphism.exam.traditional.food.stall.menu;

import java.math.BigDecimal;

public class Drink extends MenuItem {

    private String drinkType;
    private String drinkTemp;
    private String drinkFlavour;

    public Drink(String name, String drinkType, String drinkTemp, String drinkFlavour) {
        super(name);
        this.drinkType = drinkType;
        this.drinkTemp = drinkTemp;
        this.drinkFlavour = drinkFlavour;
    }

    @Override
    public BigDecimal prizeCalc() {
        BigDecimal basePrize = new BigDecimal("5000");

        if (this.drinkType.equalsIgnoreCase("JERUK")) {
            basePrize = basePrize.add(new BigDecimal("3000"));
        }
        if (this.drinkTemp.equalsIgnoreCase("DINGIN")) {
            basePrize = basePrize.add(new BigDecimal("1000"));
        }
        if (this.drinkFlavour.equalsIgnoreCase("TAWAAR")) {
            basePrize = basePrize.subtract(new BigDecimal("1000"));
        }
        return basePrize;
    }

    @Override
    public void showInfo() {
        System.out.printf("[MINUMAN] %-20s \nKategori: %s - %s - %s \nHarga: Rp %,d\n",
                super.getName(), drinkType, drinkTemp, drinkFlavour, prizeCalc().longValue());
    }
}
