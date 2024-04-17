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
            val result = backpack.add(Pair("Algo", "Algo"))
            result.shouldBeTrue()
        }
        it("return true when reach max capacity"){
            val backpack = Backpack()
            for (i in 0..7){
                backpack.add(Pair("Algo", "Algo"))
            }
            val result = backpack.isFull()
            result.shouldBeTrue()
        }
        it("organize itself alphabetically when the spell is used"){
            val backpack = Backpack()
            backpack.add(Pair("Algo", "Algo"))
            backpack.add(Pair("Zezeze", "Zezeze"))
            backpack.add(Pair("Uno", "Dos"))
            val result = backpack.organizeAlphabetically()
            val expectedResult : MutableList<Pair<String, String>> = mutableListOf(Pair("Algo", "Algo"),
                Pair("Uno", "Dos"), Pair("Zezeze", "Zezeze"))
            result shouldBe expectedResult
        }
    }
    describe("Bag should") {
        it("add an object when there is capacity"){
            val bag = Bag()
            val result = bag.add(Pair("Algo", "Algo"))
            result.shouldBeTrue()
        }
        it("return true when reach max capacity"){
            val bag = Bag()
            for (i in 0..3){
                bag.add(Pair("Algo", "Algo"))
            }
            val result = bag.isFull()
            result.shouldBeTrue()
        }
        it("organize itself alphabetically when the spell is used"){
            val bag = Bag()
            bag.add(Pair("A", "A"))
            bag.add(Pair("Z", "Z"))
            bag.add(Pair("C", "C"))
            bag.add(Pair("B", "B"))
            val result = bag.organizeAlphabetically()
            val expectedResult : MutableList<Pair<String, String>> = mutableListOf(
                Pair("A", "A"),
                Pair("B", "B"),
                Pair("C", "C"),
                Pair("Z", "Z"))
            result shouldBe expectedResult
        }
    }
})