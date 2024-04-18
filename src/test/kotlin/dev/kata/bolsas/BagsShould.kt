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

internal class BagsShould: DescribeSpec( {
    describe("Backpack should"){
        it("add objects when there's capacity") {
            val backpack = Backpack()
            val result = backpack.add("Algo")
            result.shouldBeTrue()
        }
        it("return true when reach max capacity"){
            val backpack = Backpack()
            for (i in 0..7){
                backpack.add("Algo")
            }
            val result = backpack.isFull()
            result.shouldBeTrue()
        }
        it("organize itself alphabetically when the spell is used"){
            val backpack = Backpack()
            backpack.add("Algo")
            backpack.add("Zezeze")
            backpack.add("Uno")
            val result = backpack.organizeAlphabetically()
            val expectedResult : MutableList<String> = mutableListOf("Algo", "Uno", "Zezeze")
            result shouldBe expectedResult
        }
    }
    describe("Bag should") {
        it("add an object when there is capacity"){
            val bag = Bag(Category.Metals)
            val result = bag.add("Algo")
            result.shouldBeTrue()
        }
        it("return true when reach max capacity"){
            val bag = Bag(Category.Herbs)
            for (i in 0..3){
                bag.add("Algo")
            }
            val result = bag.isFull()
            result.shouldBeTrue()
        }
        it("organize itself alphabetically when the spell is used"){
            val bag = Bag()
            bag.add("A")
            bag.add("Z")
            bag.add("C")
            bag.add("B")
            val result = bag.organizeAlphabetically()
            val expectedResult : MutableList<String> = mutableListOf("A", "B", "C", "Z")
            result shouldBe expectedResult
        }

    }
    describe("Person should"){
        it("add the elements to the backpack until its full"){
            val person = Person()
            person.addElements("Linen")
            person.addElements("Copper")
            person.addElements("Gold")
            person.addElements("Iron")
            person.addElements("Rose")
            person.addElements("Sword")
            person.addElements("Cherry Blossom")
            person.addElements("Dagger")
        }
    }

})