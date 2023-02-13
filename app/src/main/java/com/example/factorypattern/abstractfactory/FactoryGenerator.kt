package com.example.factorypattern.abstractfactory

import com.example.factorypattern.BreadFactory
import com.example.factorypattern.enums.FactoryTypes
import com.example.factorypattern.filling.FillingFactory

class FactoryGenerator {
    companion object{

        fun getFactory(type:FactoryTypes) : AbstractFactory{
            return when(type){
                FactoryTypes.FILLING -> FillingFactory()
                FactoryTypes.BREAD -> BreadFactory()
            }
        }

    }
}