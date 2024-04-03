package dev.kata.bolsas

class Backpack: Bags{
    private val capacity = 8
    val items: MutableList<Pair<String, String>> = mutableListOf()

    override fun add(item: Pair<String, String>): Boolean {
        return items.add(item)
    }

    override fun isFull(): Boolean {
        TODO("Not yet implemented")
    }

    override fun organizeAlphabetically(): List<Pair<String, String>> {
        TODO("Not yet implemented")
    }
}
