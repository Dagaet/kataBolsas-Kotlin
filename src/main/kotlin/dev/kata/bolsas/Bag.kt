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
            return elements.contains(element)
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
class Bag: Bags{

    private val capacity = 4
    override val itemsList: MutableList<String> = mutableListOf()
    override fun add(item: String): Boolean {
        return itemsList.add(item)
    }

    override val isFull: Boolean
        get() = itemsList.size == capacity

    override fun organizeAlphabetically(): List<String> {
        return itemsList.apply { this.sort() }.toList()
    }
    override fun addAllItems(vararg elements : String) : Bags {
        for (element in elements) {
            itemsList.add(element)
        }
        return this
    }

}
