package com.example.factorypattern.abstractfactory

import com.example.factorypattern.Bread
import com.example.factorypattern.drinks.Drink
import com.example.factorypattern.enums.BreadType
import com.example.factorypattern.enums.DrinkTypes
import com.example.factorypattern.enums.FillingType
import com.example.factorypattern.filling.Filling

abstract class AbstractFactory {

    abstract fun getBread(type: BreadType): Bread?
    abstract fun getFilling(type: FillingType): Filling?
    abstract fun getDrink(type: DrinkTypes) : Drink?

}