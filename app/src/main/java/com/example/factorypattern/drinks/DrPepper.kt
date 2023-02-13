package com.example.factorypattern.drinks

class DrPepper: Drink {
    override fun name(): String {
        return "Doctor Pepper"
    }

    override fun calories(): String {
        return " : 150 kcal"
    }
}