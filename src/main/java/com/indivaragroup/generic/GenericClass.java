package com.indivaragroup.generic;

public class GenericClass <T> {

    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void testGeneric () {
        System.out.println("Print " + this.value);
    }
}
