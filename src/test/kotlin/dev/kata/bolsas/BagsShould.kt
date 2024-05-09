package dev.kata.bolsas

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.shouldBe

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
            val result = person.addElements("Algo")
            result.shouldBeTrue()
        }
        it("start adding in bag when backpack is full"){
            val person = Person()
            for (i in 0..7){
                person.addElements("Algo")
            }
            val result = person.addElements("Algo")
            result.shouldBeTrue()
        }
        it ("cast a spell to organize bags"){
            val person = Person()
            person.addElements("Linen")
            person.addElements("Iron")
            person.addElements("Mace")
            person.addElements("Copper")
            person.addElements("Dagger")
            person.addElements("Gold")
            person.addElements("Silver")
            person.addElements("Silk")
            person.addElements("Cherry Blossom")
            val result = person.castSpell()

            val objet = Person().bags.addAll(mutableListOf(
                Bag(Category.Metals).addAllItems("Cooper", "Gold", "Iron", "Silver"),
                Bag(),
                Bag(Category.Weapons).addAllItems("Dagger", "Mace"),
                Bag()))
            result shouldBe objet
        }
    }

})