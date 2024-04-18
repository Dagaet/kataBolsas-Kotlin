package dev.kata.bolsas

interface Bags {
    fun add(item: String):Boolean
    fun isFull():Boolean
    fun organizeAlphabetically(): MutableList<String>

}