package com.example.factorypattern.drinks

import com.example.factorypattern.Bread
import com.example.factorypattern.abstractfactory.AbstractFactory
import com.example.factorypattern.enums.BreadType
import com.example.factorypattern.enums.DrinkTypes
import com.example.factorypattern.enums.FillingType
import com.example.factorypattern.filling.Filling

class DrinkFactory: AbstractFactory() {
    override fun getBread(type: BreadType): Bread? {
        return null
    }

    override fun getFilling(type: FillingType): Filling? {
        return null
    }

    override fun getDrink(type: DrinkTypes): Drink? {
        return when(type){
            DrinkTypes.COKE -> Coke()
            DrinkTypes.PEPSI -> Pepsi()
            DrinkTypes.DR_PEPPER -> DrPepper()
        }
    }
}