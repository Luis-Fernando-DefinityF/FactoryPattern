package com.example.factorypattern;

public class BreadFactory {

    public Bread getBread(BreadType type){
        if (type == BreadType.BAGUETTE) return new Baguette();
        else if (type == BreadType.SLICE_BREAD) return new SliceBread();
        else if (type == BreadType.ROLL) return new Roll();

        return null;
    }

}
