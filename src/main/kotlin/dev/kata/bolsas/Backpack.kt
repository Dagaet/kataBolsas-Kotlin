package dev.kata.bolsas

class Backpack: Bags{
    val capacity = 8
    override val itemsList: MutableList<String> = mutableListOf()

    override fun add(item: String): Boolean {
        if (isFull){
            println("The item has not been added because it is at maximum capacity")
            return false
        }
        if(!itemsList.add(item)){
            return false
        }
        return true
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

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Backpack

        if (capacity != other.capacity) return false
        if (itemsList != other.itemsList) return false

        return true
    }

    override fun hashCode(): Int {
        var result = capacity
        result = 31 * result + itemsList.hashCode()
        return result
    }
}
