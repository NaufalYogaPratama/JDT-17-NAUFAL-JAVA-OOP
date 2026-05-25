package com.indivaragroup.polymorphism.exam.traditional.food.stall;

import com.indivaragroup.polymorphism.exam.traditional.food.stall.menu.Drink;
import com.indivaragroup.polymorphism.exam.traditional.food.stall.menu.Food;
import com.indivaragroup.polymorphism.exam.traditional.food.stall.menu.MenuItem;

public class TegalFoodStall {
    public void displayMenu() {
        System.out.println("==========================================================");
        System.out.println("                MENU WARTEG JDT 17 by Naufal              ");
        System.out.println("==========================================================\n");

        MenuItem[] listMenu = {
                new Food("Nila Goreng", "Daging", "Ikan", "Goreng"),
                new Food("Ayam Rebus (Pecok)", "Daging", "Ayam", "Rebus"),
                new Food("Rendang Sapi", "Daging", "Sapi", "Rebus"),
                new Food("Bakwan Jagung", "Gorengan", "Bakwan", "Goreng"),
                new Food("Tahu Isi", "Gorengan", "Tahu", "Goreng"),

                new Drink("Es Teh Manis", "Teh", "Dingin", "Manis"),
                new Drink("Kopi Panas Tawar", "Kopi", "Panas", "Tawar"),
                new Drink("Es Jeruk Kurang Manis", "Jeruk", "Dingin", "Kurang Manis")
        };

        for (MenuItem item : listMenu) {
            item.showInfo();

            if (item instanceof Food) {
                Food food = (Food) item;
            }

            System.out.println("----------------------------------------------------------");
        }
    }
}
