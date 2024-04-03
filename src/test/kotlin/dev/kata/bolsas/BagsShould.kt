package dev.kata.bolsas

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.booleans.shouldBeTrue

// Backpack should add objects when there is capacity
// Backpack should return true when reach max capacity
// Backpack should organize itself alphabetically when the spell is used

// Bag should add objects when there is capacity
// Bag should return true when reach max capacity
// Bag should organize itself alphabetically when the spell is used
// Bag should return its category when player asks them

internal class BagsShould: DescribeSpec( {
    describe("Backpack should"){
        it("Add objects when there's capacity") {
            val backpack = Backpack()
            val result = backpack.add()
            result.shouldBeTrue()
        }
    }
})