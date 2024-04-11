package dev.kata.bolsas

class Backpack: Bags{
    private val capacity = 8
    private var itemsList: List<Pair<String, String>> = listOf()

    override fun add(vararg items: Pair<String, String>): Boolean {
        if (isFull()){
            println("The item has not been added because it is at maximum capacity")
            return false
        }
        val itemsMutableList = itemsList.toMutableList()
        for (item in items){
            if(!itemsMutableList.add(item)){
                return false
            }
        }
        itemsList = itemsMutableList.toList()
        return true
    }

    override fun isFull(): Boolean {
        return itemsList.size == capacity
    }

    override fun organizeAlphabetically(): List<Pair<String, String>> {
       val itemsMutableList = itemsList.toMutableList()
        itemsMutableList.sortBy { it.second }
        itemsList = itemsMutableList.toList()
        return itemsList
    }
}
