package dev.kata.bolsas

class Backpack: Bags{
    private val capacity = 8
    private val itemsList: MutableList<Pair<String, String>> = mutableListOf()

    override fun add(item: Pair<String, String>): Boolean {
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

    override fun organizeAlphabetically(): MutableList<Pair<String, String>> {
        itemsList.sortBy { it.second }
        return itemsList
    }
}
