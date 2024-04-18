package dev.kata.bolsas

class Person {
    val bags : MutableList<Bags> = mutableListOf(Backpack() ,Bag(Category.Metals), Bag(), Bag(Category.Weapons), Bag())
    fun addElements(element: String) : Boolean{
        return false
    }
}
