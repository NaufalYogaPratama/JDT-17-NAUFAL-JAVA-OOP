package com.indivaragroup.abstraction.exam.example.shape;

public abstract class ShapeType {
    String shapeType;
    int shapeSize;

    public abstract int getShapeSize();

    // CONCRETE METHOD
    void printInfo() {
        System.out.println("SIZE SHAPE FOT TYPE === ()" + shapeType);
        System.out.println("SIZE SHAPE FOT SIZE === ()" + shapeSize);
    }
}