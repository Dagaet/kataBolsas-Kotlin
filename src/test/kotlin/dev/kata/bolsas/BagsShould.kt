package dev.kata.bolsas

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.equals.shouldBeEqual

// Backpack should add objects when there is capacity
// Backpack should return true when reach max capacity
// Backpack should notify when is possible to add more elements
// Backpack notify character when reach max capacity
// Backpack should organize itself alphabetically when the spell is used

// Bag should add objects when there is capacity
// Bag should return true when reach max capacity
// Bag should notify when is possible to add more elements
// Bag should organize itself alphabetically when the spell is used
// Bag should return its category when player asks them

// Person should add object in backpack until its full
// Person should start adding in bag when backpack is full
// Person should cast a spell to organize bags

internal class BagsShould: DescribeSpec( {
    describe("Person should"){
        it("add object in backpack until its full"){
            val person = Person()
            val result = person.addElement("Algo")
            result.shouldBeTrue()
        }
        it("start adding in bag when backpack is full"){
            val person = Person()
            for (i in 0..7){
                person.addElement("Algo")
            }
            val result = person.addElement("Algo")
            result.shouldBeTrue()
        }
        it ("cast a spell to organize bags"){
            val person = Person()
//            person.addElements("Linen")
            person.addElement("Iron")
            person.addElement("Mace")
            person.addElement("Copper")
            person.addElement("Dagger")
            person.addElement("Gold")
            person.addElement("Silver")
            person.addElement("Silk")
//            person.addElements("Cherry Blossom")
            person.castSpell()

            val person2 = Person()
//            objet.backpack.addAllItems("Linen", "Cherry Blossom")
            person2.backpack.addAllItems()
            person2.bags.forEach {
                if (it.bagType != null){
                    if (it.bagType!! == Category.Metals){
                        it.addAllItems("Copper", "Gold", "Iron", "Silver")
                    }else{
                        it.addAllItems("Dagger", "Mace")
                    }
                }
            }
            person.bags shouldBeEqual  person2.bags
        }
    }

})