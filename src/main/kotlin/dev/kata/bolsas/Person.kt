package dev.kata.bolsas

class Person {
    val bags : MutableList<Bags> = mutableListOf(Backpack() ,Bag(), Bag(), Bag(), Bag())
    fun addElements(element: String) : Boolean{
        return false
    }
}
