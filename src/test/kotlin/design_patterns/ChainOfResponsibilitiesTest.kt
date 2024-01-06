package design_patterns

import org.junit.Test
import org.junit.Assert.assertEquals

class ChainOfResponsibilitiesTest {

    @Test
    fun test_when_we_have_only_stone_pickaxe() {
        val pickaxe = StonePickaxe()

        assertEquals(true, pickaxe.mine(StoneBlock()))
        assertEquals(false, pickaxe.mine(DiamondBlock()))
        assertEquals(false, pickaxe.mine(ObsidianBlock()))
    }

    @Test
    fun test_when_we_have_stone_and_iron_pickaxes() {
        val pickaxe = StonePickaxe()
        pickaxe.changeNextPickaxe(IronPickaxe())

        assertEquals(true, pickaxe.mine(StoneBlock()))
        assertEquals(true, pickaxe.mine(DiamondBlock()))
        assertEquals(false, pickaxe.mine(ObsidianBlock()))
    }

    @Test
    fun test_when_we_have_all_three_pickaxes() {
        val pickaxe = StonePickaxe()
        val ironPickaxe = IronPickaxe().apply {
            changeNextPickaxe(DiamondPickaxe())
        }
        pickaxe.changeNextPickaxe(ironPickaxe)

        assertEquals(true, pickaxe.mine(StoneBlock()))
        assertEquals(true, pickaxe.mine(DiamondBlock()))
        assertEquals(true, pickaxe.mine(ObsidianBlock()))
    }

}