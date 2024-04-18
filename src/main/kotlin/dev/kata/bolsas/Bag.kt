package dev.kata.bolsas

interface Category{
    fun itsMyElement() : Boolean
    object metals : Category{
        private val elements = listOf("Copper", "Gold", "Iron", "Silver")
        override fun itsMyElement(): Boolean {
            TODO("Not yet implemented")
        }
    }
    object clothes : Category{
        private val elements = listOf("Leather", "Linen", "Silk", "Wool")
        override fun itsMyElement(): Boolean {
            TODO("Not yet implemented")
        }
    }
    object herbs : Category {
        private val elements = listOf("Cherry Blossom", "Marigold", "Rose", "Seaweed")
        override fun itsMyElement(): Boolean {
            TODO("Not yet implemented")
        }
    }
    object weapons : Category{
        private val elements = listOf("Axe", "Dagger", "Mace", "Sword")
        override fun itsMyElement(): Boolean {
            TODO("Not yet implemented")
        }
    }
    object noCategory : Category{
        override fun itsMyElement(): Boolean {
            return true
        }
    }
}
class Bag(private val category: Category): Bags{

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
