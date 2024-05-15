package dev.kata.bolsas

class Person {
    val backpack = Backpack()
    val bags: MutableList<Bag> = mutableListOf(
        Bag(Category.Metals),
        Bag(),
        Bag(Category.Weapons),
        Bag()
    )

    fun addElement(element: String): Boolean {
        if (!backpack.isFull) {
            return backpack.add(element)
        }
        bags.forEach {
            if (!it.isFull) {
                return it.add(element)
            }
        }
        return false
    }
    fun castSpell(): MutableList<Bag> {
        val elements = getElements()
        this.bags.forEach { bag -> (
                    if(bag.bagType != null){
                        bag.apply {
                            this.itemsList = elements.filter { element -> (
                                    bag.bagType!!.itsMyElement(element)
                                    )
                            }.toMutableList() }
                    }
                )
                bag.organizeAlphabetically()
             }
        return bags
    }

    private fun getElements(): MutableList<String>{
        val itemsElement = this.bags.flatMap { it.itemsList }.toMutableList()
        itemsElement += backpack.itemsList
        return itemsElement
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Person

        if (backpack != other.backpack) return false
        if (bags != other.bags) return false

        return true
    }

    override fun hashCode(): Int {
        var result = backpack.hashCode()
        result = 31 * result + bags.hashCode()
        return result
    }

}
