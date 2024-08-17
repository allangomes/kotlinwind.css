package io.github.allangomessl.kotlinwind.css.features

import io.github.allangomessl.kotlinwind.css.KW
import io.github.allangomessl.kotlinwind.css.api.Style
import io.github.allangomessl.kotlinwind.css.core.*
import io.github.allangomessl.kotlinwind.css.extensions.inline
import kotlin.test.Test
import kotlin.test.assertEquals


class PositionInsetTest {

  @Test
  fun inset() {
    val expected = Style(INSET, "2.5rem").toString()
    val returned = KW.inline { inset[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun inset_auto() {
    val expected = Style(INSET, "auto").toString()
    val returned = KW.inline { inset_auto }
    assertEquals(expected, returned)
  }

  @Test
  fun inset_full() {
    val expected = Style(INSET, "100%").toString()
    val returned = KW.inline { inset_full }
    assertEquals(expected, returned)
  }

  @Test
  fun inset_x() {
    val expected = listOf(
      Style(LEFT, "2.5rem"),
      Style(RIGHT, "2.5rem")
    ).inline()
    val returned = KW.inline { inset_x[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun inset_x_auto() {
    val expected = listOf(
      Style(LEFT, "auto"),
      Style(RIGHT, "auto")
    ).inline()
    val returned = KW.inline { inset_x_auto }
    assertEquals(expected, returned)
  }

  @Test
  fun inset_x_full() {
    val expected = listOf(
      Style(LEFT, "100%"),
      Style(RIGHT, "100%")
    ).inline()
    val returned = KW.inline { inset_x_full }
    assertEquals(expected, returned)
  }

  @Test
  fun inset_y() {
    val expected = listOf(
      Style(TOP, "2.5rem"),
      Style(BOTTOM, "2.5rem")
    ).inline()
    val returned = KW.inline { inset_y[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun inset_y_auto() {
    val expected = listOf(
      Style(TOP, "auto"),
      Style(BOTTOM, "auto")
    ).inline()
    val returned = KW.inline { inset_y_auto }
    assertEquals(expected, returned)
  }

  @Test
  fun inset_y_full() {
    val expected = listOf(
      Style(TOP, "100%"),
      Style(BOTTOM, "100%")
    ).inline()
    val returned = KW.inline { inset_y_full }
    assertEquals(expected, returned)
  }

  @Test
  fun start() {
    val expected = Style(INSET_INLINE_START, "2.5rem").toString()
    val returned = KW.inline { start[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun end() {
    val expected = Style(INSET_INLINE_END, "2.5rem").toString()
    val returned = KW.inline { end[10] }
    assertEquals(expected, returned)
  }

}
