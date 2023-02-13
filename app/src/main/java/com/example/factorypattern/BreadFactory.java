package com.example.factorypattern;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.factorypattern.abstractfactory.AbstractFactory;
import com.example.factorypattern.enums.BreadType;
import com.example.factorypattern.enums.FillingType;
import com.example.factorypattern.filling.Filling;

public class BreadFactory extends AbstractFactory {


    @Nullable
    @Override
    public Filling getFilling(@NonNull FillingType type) {
        return null;
    }

    @Nullable
    @Override
    public Bread getBread(@NonNull BreadType type) {
        if (type == BreadType.BAGUETTE) return new Baguette();
        else if (type == BreadType.SLICE_BREAD) return new SliceBread();
        else if (type == BreadType.ROLL) return new Roll();
        return null;
    }
}
