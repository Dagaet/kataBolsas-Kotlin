package dev.kata.bolsas

class Backpack: Bags{
    val capacity = 8
    override val itemsList: MutableList<String> = mutableListOf()

    override fun add(item: String): Boolean {
        if (isFull){
            println("The item has not been added because it is at maximum capacity")
            return false
        }
        if(!itemsList.add(item)){
            return false
        }
        return true
    }

    override val isFull: Boolean
        get() = itemsList.size == capacity

    override fun organizeAlphabetically(): List<String> {
        return itemsList.apply { this.sort() }.toList()
    }
}
