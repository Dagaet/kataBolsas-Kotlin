package dev.kata.bolsas

interface Category{
    fun itsMyElement(element : String) : Boolean
    object Metals : Category{
        private val elements = listOf("Copper", "Gold", "Iron", "Silver")
        override fun itsMyElement(element : String): Boolean {
            return elements.find { it == element } != null
        }
    }
    object Clothes : Category{
        private val elements = listOf("Leather", "Linen", "Silk", "Wool")
        override fun itsMyElement(element : String): Boolean {
            return elements.find { it == element } != null
        }
    }
    object Herbs : Category {
        private val elements = listOf("Cherry Blossom", "Marigold", "Rose", "Seaweed")
        override fun itsMyElement(element : String): Boolean {
            return elements.find { it == element } != null
        }
    }
    object Weapons : Category{
        private val elements = listOf("Axe", "Dagger", "Mace", "Sword")
        override fun itsMyElement(element : String): Boolean {
            return elements.find { it == element } != null
        }
    }
    object NoCategory : Category{
        override fun itsMyElement(element : String): Boolean {
            return true
        }
    }
}
class Bag(private val category: Category = Category.NoCategory): Bags{

    private val capacity = 4
    private val itemsList: MutableList<String> = mutableListOf()
    override fun add(item: String): Boolean {
        return itemsList.add(item)
    }

    override fun isFull(): Boolean {
        return itemsList.size == capacity
    }

    override fun organizeAlphabetically(): MutableList<String> {
        return itemsList.apply { this.sort() }
    }
}
