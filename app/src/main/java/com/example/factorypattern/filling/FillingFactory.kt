package com.example.factorypattern.filling

import com.example.factorypattern.Bread
import com.example.factorypattern.enums.BreadType
import com.example.factorypattern.enums.FillingType
import com.example.factorypattern.abstractfactory.AbstractFactory
import com.example.factorypattern.drinks.Drink
import com.example.factorypattern.enums.DrinkTypes

class FillingFactory : AbstractFactory(){
    override fun getBread(type: BreadType): Bread? {
        return null
    }

    override fun getFilling(type: FillingType): Filling {
        return when(type){
            FillingType.CHEESE -> Cheese()
            FillingType.HAM -> Ham()
            FillingType.TOMATO -> Tomato()
        }
    }

    override fun getDrink(type: DrinkTypes): Drink? {
        return null
    }
}