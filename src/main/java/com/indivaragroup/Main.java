package com.indivaragroup;

import com.indivaragroup.generic.ArrayHelper;
import com.indivaragroup.generic.Entry;
import com.indivaragroup.generic.GenericClass;
import com.indivaragroup.generic.Pasangan;
import com.indivaragroup.inheritance.exam.company.organization.CompanyRegistration;
import com.indivaragroup.polymorphism.exam.traditional.food.stall.TegalFoodStall;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        // Task 1
//        CompanyRegistration companyTask = new CompanyRegistration();
//        companyTask.runRegistration();
//
//        System.out.println("\n");
//
//        // Task 2
//        TegalFoodStall wartegSystem = new TegalFoodStall();
//        wartegSystem.displayMenu();
//
//
//        // GENERIC CLASS
//        GenericClass kotakOne = new GenericClass();
//        kotakOne.setValue("halo String");
//        kotakOne.testGeneric();
//
//        GenericClass kotakTwo = new GenericClass();
//        kotakTwo.setValue(123468);
//        kotakTwo.testGeneric();
//
//        //manggilnya bisa begini
//        GenericClass<Double> kotakThree = new GenericClass<>();
//        kotakThree.setValue(123.56);
//        kotakThree.testGeneric();

        Pasangan<String> hewan = new Pasangan<>("kuda", "sapi");
        System.out.println(hewan);
        Pasangan<Integer> angka = new Pasangan<>(123, 321);
        System.out.println(angka);

        // generic class parameter > 1
        Entry<String, Integer> temp = new Entry<>("Halo", 123);
        System.out.println(temp);
        System.out.println(temp.getValue());
        System.out.println(temp.getKey());


        // GENERIC METHOD
        Integer[] test = {1, 10, 12, 9, 12};
        String[] nama = {"Naufal", "Budi", "Yadi"};
        ArrayHelper.cetakArray(test);
        System.out.println(ArrayHelper.ambilPertama(nama));
    }
}