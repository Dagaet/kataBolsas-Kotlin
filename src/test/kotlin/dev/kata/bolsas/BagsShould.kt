package dev.kata.bolsas

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.shouldBe

// Backpack should add objects when there is capacity
// Backpack should return true when reach max capacity
// Backpack should organize itself alphabetically when the spell is used

// Bag should add objects when there is capacity
// Bag should return true when reach max capacity
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
            val addItems = backpack.add(
                Pair("Algo", "Algo"),
                Pair("Zezeze", "Zezeze"),
                Pair("Uno", "Dos")
            )
            val result = backpack.organizeAlphabetically()
            val expectedResult : List<Pair<String, String>> = listOf(Pair("Algo", "Algo"), Pair("Uno", "Dos"), Pair("Zezeze", "Zezeze"))
            result shouldBe expectedResult
        }
    }
})