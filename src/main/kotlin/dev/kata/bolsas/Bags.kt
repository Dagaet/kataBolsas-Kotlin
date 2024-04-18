package dev.kata.bolsas

interface Bags {
    fun add(item: String):Boolean
    val isFull: Boolean
    fun organizeAlphabetically(): List<String>

}