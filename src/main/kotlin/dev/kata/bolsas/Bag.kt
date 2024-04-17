package dev.kata.bolsas

class Bag: Bags{
    private val size = 4
    private val itemsList: MutableList<Pair<String, String>> = mutableListOf()
    override fun add(item: Pair<String, String>): Boolean {
        return itemsList.add(item)
    }

    override fun isFull(): Boolean {
        TODO("Not yet implemented")
    }

    override fun organizeAlphabetically(): MutableList<Pair<String, String>> {
        TODO("Not yet implemented")
    }
}
