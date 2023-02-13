package com.example.factorypattern.drinks

class Pepsi : Drink {
    override fun name(): String {
        return "Pepsi"
    }

    override fun calories(): String {
        return " : 150 kcal"
    }
}