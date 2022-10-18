package com.example.factorypattern;

public class SliceBread implements Bread{
    @Override
    public String name() {
        return "Slice Bread";
    }

    @Override
    public String calories() {
        return ": 80 kcal";
    }
}
