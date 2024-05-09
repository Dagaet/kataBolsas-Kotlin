package dev.kata.bolsas

class Person {
    val backpack = Backpack()

    val bags: MutableList<Bag> = mutableListOf(
        Bag(Category.Metals), Bag(),
        Bag(Category.Weapons), Bag())

    fun addElements(element: String): Boolean {
        if (!backpack.isFull) {
            backpack.add(element)
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
                bag.apply { bag.itemsList = elements.filter { element -> (
                    bag.bagType.itsMyElement(element))
                }.toMutableList() })
             }
        return bags
    }

    private fun getElements(): MutableList<String>{
        val itemsElement = this.bags.flatMap { it.itemsList }.toMutableList()
        itemsElement += backpack.itemsList
        return itemsElement
    }

}
