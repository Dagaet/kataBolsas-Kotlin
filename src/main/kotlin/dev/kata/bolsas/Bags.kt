package dev.kata.bolsas

interface Bags {
    fun add(item: Pair<String, String>):Boolean
    fun isFull():Boolean
    fun organizeAlphabetically(): List<Pair<String, String>>

}