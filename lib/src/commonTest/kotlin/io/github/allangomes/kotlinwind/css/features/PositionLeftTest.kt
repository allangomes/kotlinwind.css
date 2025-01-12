package io.github.allangomes.kotlinwind.css.features

import io.github.allangomes.kotlinwind.css.KW
import io.github.allangomes.kotlinwind.css.api.Style
import io.github.allangomes.kotlinwind.css.core.LEFT
import kotlin.test.Test
import kotlin.test.assertEquals

class PositionLeftTest {

    @Test
    fun left() {
        val expected = Style(LEFT, "2.5rem").toString()
        val returned = KW.inline { left[10] }
        assertEquals(expected, returned)
    }

    @Test
    fun left_fraction() {
        val expected = Style(LEFT, "25%").toString()
        val returned = KW.inline { left_pct[1, 4] }
        assertEquals(expected, returned)
    }

    @Test
    fun left_pct() {
        val expected = Style(LEFT, "32%").toString()
        val returned = KW.inline { left_pct[32] }
        assertEquals(expected, returned)
    }

    @Test
    fun left_auto() {
        val expected = Style(LEFT, "auto").toString()
        val returned = KW.inline { left_auto }
        assertEquals(expected, returned)
    }

    @Test
    fun left_full() {
        val expected = Style(LEFT, "100%").toString()
        val returned = KW.inline { left_full }
        assertEquals(expected, returned)
    }

}
