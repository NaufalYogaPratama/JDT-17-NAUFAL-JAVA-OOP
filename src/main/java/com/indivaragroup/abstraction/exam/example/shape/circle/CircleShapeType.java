package com.indivaragroup.abstraction.exam.example.shape.circle;

import com.indivaragroup.abstraction.exam.example.shape.ShapeType;

public class CircleShapeType extends ShapeType {
    int circleRadius;

    @Override
    public int getShapeSize() {
        return Math.abs(10) + circleRadius;
    }
}
