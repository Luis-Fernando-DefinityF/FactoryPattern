package com.example.factorypattern.filling

class Tomato : Filling {
    override fun name(): String {
        return "Tomate"
    }

    override fun calories(): String {
        return " : 18 kcal"
    }

}