package com.example.factorypattern.filling

class Cheese : Filling {
    override fun name(): String {
        return "Queso"
    }

    override fun calories(): String {
        return " : 41 kcal"
    }
}