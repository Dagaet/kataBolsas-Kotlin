package dev.kata.bolsas

class Bag {
    private val capacity = 4
    private var itemsList: List<Pair<String, String>> = listOf()

    fun add(vararg items: Pair<String, String>): Boolean {
        val mutableItemsList = itemsList.toMutableList()
        if (!mutableItemsList.addAll(items)){
            return false
        }
        itemsList = mutableItemsList
        return true
    }
}
