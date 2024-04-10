package dev.kata.bolsas

class Backpack: Bags{
    private val capacity = 8
    private var items: List<Pair<String, String>> = listOf()

    override fun add(item: Pair<String, String>): Boolean {
        if (isFull()){
            return false
        }
        val itemsMutableList = items.toMutableList()
        if(!itemsMutableList.add(item)){
            return false
        }
        items = itemsMutableList.toList()
        return true
    }

    override fun isFull(): Boolean {
        return items.size == capacity
    }

    override fun organizeAlphabetically(): List<Pair<String, String>> {
        TODO("Not yet implemented")
    }
}
