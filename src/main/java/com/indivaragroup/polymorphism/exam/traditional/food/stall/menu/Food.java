package com.indivaragroup.polymorphism.exam.traditional.food.stall.menu;

import java.math.BigDecimal;

public class Food extends MenuItem {

    private String mainCat;
    private String subCat;
    private String varCat;

    public Food(String name, String mainCat, String subCat, String varCat){
        super(name);
        this.mainCat = mainCat;
        this.subCat = subCat;
        this.varCat = varCat;
    }

    @Override
    public BigDecimal prizeCalc() {
        BigDecimal basePrize = BigDecimal.ZERO;

        switch(this.subCat.toUpperCase()) {
            case "SAPI": basePrize = new BigDecimal("25000"); break;
            case "IKAN": basePrize = new BigDecimal("15000"); break;
            case "AYAM": basePrize = new BigDecimal("12000"); break;
            case "BAKWAN": basePrize = new BigDecimal("2000"); break;
            case "TAHU": basePrize = new BigDecimal("1000"); break;
            default: basePrize = new BigDecimal(0);
            break;
        }

        if (this.varCat.equalsIgnoreCase("GORENG")) {
            basePrize = basePrize.add(new BigDecimal("1000"));
        }
        return basePrize;
    }

    @Override
    public void showInfo() {
        System.out.printf("[MAKANAN] %-20s \nKategori: %s - %s - %s \nHarga: Rp %,d\n",
                super.getName(), mainCat, subCat, varCat, prizeCalc().longValue());
    }
}
