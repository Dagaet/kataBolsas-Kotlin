package dev.kata.bolsas

class Backpack: Bags{
    private val capacity = 8
    val items: List<Pair<String, String>> = listOf()

    override fun add(item: Pair<String, String>): Boolean {
        val itemsMutableList = items.toMutableList()
        if(!itemsMutableList.add(item)){
            return false
        }
        itemsMutableList.toList()
        return true
    }

    override fun isFull(): Boolean {
        TODO("Not yet implemented")
    }

    override fun organizeAlphabetically(): List<Pair<String, String>> {
        TODO("Not yet implemented")
    }
}
