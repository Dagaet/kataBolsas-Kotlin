package dev.kata.bolsas

class Bag: Bags{
    private val capacity = 4
    private val itemsList: MutableList<Pair<String, String>> = mutableListOf()
    override fun add(item: Pair<String, String>): Boolean {
        return itemsList.add(item)
    }

    override fun isFull(): Boolean {
        return itemsList.size == capacity
    }

    override fun organizeAlphabetically(): MutableList<Pair<String, String>> {
        itemsList.sortBy { it.second }
        return itemsList
    }
}
