package dev.kata.bolsas

interface Bags {
    fun add(item: String):Boolean
    val isFull: Boolean
    val itemsList : MutableList<String>
    fun organizeAlphabetically(): List<String>
    fun addAllItems(vararg elements : String): Bags

}