package com.example.factorypattern.drinks

class Coke : Drink{
    override fun name(): String {
        return "Coca Cola"
    }

    override fun calories(): String {
        return " : 38 kcal"
    }

}