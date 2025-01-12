package io.github.allangomes.kotlinwind.css.features

import io.github.allangomes.kotlinwind.css.KW
import io.github.allangomes.kotlinwind.css.api.Style
import io.github.allangomes.kotlinwind.css.core.OVERFLOW
import io.github.allangomes.kotlinwind.css.core.OVERFLOW_X
import io.github.allangomes.kotlinwind.css.core.OVERFLOW_Y
import kotlin.test.Test
import kotlin.test.assertEquals

class OverflowTest {

    @Test
    fun overflow_auto() {
        val expected = Style(OVERFLOW, "auto").toString()
        val actual = KW.inline { overflow_auto }
        assertEquals(expected, actual)
    }

    @Test
    fun overflow_hidden() {
        val expected = Style(OVERFLOW, "hidden").toString()
        val actual = KW.inline { overflow_hidden }
        assertEquals(expected, actual)
    }

    @Test
    fun overflow_clip() {
        val expected = Style(OVERFLOW, "clip").toString()
        val actual = KW.inline { overflow_clip }
        assertEquals(expected, actual)
    }

    @Test
    fun overflow_visible() {
        val expected = Style(OVERFLOW, "visible").toString()
        val actual = KW.inline { overflow_visible }
        assertEquals(expected, actual)
    }

    @Test
    fun overflow_scroll() {
        val expected = Style(OVERFLOW, "scroll").toString()
        val actual = KW.inline { overflow_scroll }
        assertEquals(expected, actual)
    }

    @Test
    fun overflow_x_auto() {
        val expected = Style(OVERFLOW_X, "auto").toString()
        val actual = KW.inline { overflow_x_auto }
        assertEquals(expected, actual)
    }

    @Test
    fun overflow_x_hidden() {
        val expected = Style(OVERFLOW_X, "hidden").toString()
        val actual = KW.inline { overflow_x_hidden }
        assertEquals(expected, actual)
    }

    @Test
    fun overflow_x_clip() {
        val expected = Style(OVERFLOW_X, "clip").toString()
        val actual = KW.inline { overflow_x_clip }
        assertEquals(expected, actual)
    }

    @Test
    fun overflow_x_visible() {
        val expected = Style(OVERFLOW_X, "visible").toString()
        val actual = KW.inline { overflow_x_visible }
        assertEquals(expected, actual)
    }

    @Test
    fun overflow_x_scroll() {
        val expected = Style(OVERFLOW_X, "scroll").toString()
        val actual = KW.inline { overflow_x_scroll }
        assertEquals(expected, actual)
    }

    @Test
    fun overflow_y_auto() {
        val expected = Style(OVERFLOW_Y, "auto").toString()
        val actual = KW.inline { overflow_y_auto }
        assertEquals(expected, actual)
    }

    @Test
    fun overflow_y_hidden() {
        val expected = Style(OVERFLOW_Y, "hidden").toString()
        val actual = KW.inline { overflow_y_hidden }
        assertEquals(expected, actual)
    }

    @Test
    fun overflow_y_clip() {
        val expected = Style(OVERFLOW_Y, "clip").toString()
        val actual = KW.inline { overflow_y_clip }
        assertEquals(expected, actual)
    }

    @Test
    fun overflow_y_visible() {
        val expected = Style(OVERFLOW_Y, "visible").toString()
        val actual = KW.inline { overflow_y_visible }
        assertEquals(expected, actual)
    }

    @Test
    fun overflow_y_scroll() {
        val expected = Style(OVERFLOW_Y, "scroll").toString()
        val actual = KW.inline { overflow_y_scroll }
        assertEquals(expected, actual)
    }
}