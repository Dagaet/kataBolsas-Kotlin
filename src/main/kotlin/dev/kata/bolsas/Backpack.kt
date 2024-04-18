package dev.kata.bolsas

class Backpack: Bags{
    private val capacity = 8
    private val itemsList: MutableList<String> = mutableListOf()

    override fun add(item: String): Boolean {
        if (isFull()){
            println("The item has not been added because it is at maximum capacity")
            return false
        }
        if(!itemsList.add(item)){
            return false
        }
        return true
    }

    override fun isFull(): Boolean {
        return itemsList.size == capacity
    }

    override fun organizeAlphabetically(): MutableList<String> {
        return itemsList.apply { this.sort() }
    }
}
