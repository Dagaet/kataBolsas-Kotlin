package dev.kata.bolsas

class Person{
    val bags : MutableList<Bags> = mutableListOf(Backpack() ,Bag(), Bag(), Bag(), Bag())
    fun addElements(element: String) : Boolean{
       bags.forEach {
           if (!it.isFull) {
               return it.add(element)
           }
       }
        return false
    }

    fun castSpell(): List<Bags> {
        val itemsElement = this.bags.flatMap { it.itemsList }

    }

}
