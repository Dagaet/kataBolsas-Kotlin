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
//    object NoCategory : Category{
//        override fun itsMyElement(element : String): Boolean {
//            return true
//        }
//    }
}
class Bag(): Bags{
    var bagType: Category? = null
    private val capacity = 4
    constructor(category: Category) : this() {
        changeType(category)
    }
    private fun changeType(category: Category){
        this.bagType = category
    }


    override var itemsList: MutableList<String> = mutableListOf()
    override fun add(item: String): Boolean {
        return itemsList.add(item)
    }
    override val isFull: Boolean
        get() = itemsList.size == capacity

    override fun organizeAlphabetically(): List<String> {
        return itemsList.apply { this.sort() }.toList()
    }
    override fun addAllItems(vararg elements : String) : Bag {
        for (element in elements) {
            itemsList.add(element)
        }
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Bag

        if (bagType != other.bagType) return false
        if (capacity != other.capacity) return false
        if (itemsList != other.itemsList) return false

        return true
    }

    override fun hashCode(): Int {
        var result = bagType.hashCode()
        result = 31 * result + capacity
        result = 31 * result + itemsList.hashCode()
        return result
    }

}
