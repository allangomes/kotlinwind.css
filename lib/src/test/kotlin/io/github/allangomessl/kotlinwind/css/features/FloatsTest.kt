package io.github.allangomessl.kotlinwind.css.features

import io.github.allangomessl.kotlinwind.css.KW
import io.github.allangomessl.kotlinwind.css.api.Style
import io.github.allangomessl.kotlinwind.css.core.FLOAT
import kotlin.test.Test
import kotlin.test.assertEquals

class FloatsTest {

  @Test
  fun float_start() {
    val expected = Style(FLOAT, "inline-start").toString()
    val returned = KW.inline { float_start }
    assertEquals(expected, returned)
  }

  @Test
  fun float_end() {
    val expected = Style(FLOAT, "inline-end").toString()
    val returned = KW.inline { float_end }
    assertEquals(expected, returned)
  }

  @Test
  fun float_right() {
    val expected = Style(FLOAT, "right").toString()
    val returned = KW.inline { float_right }
    assertEquals(expected, returned)
  }

  @Test
  fun float_left() {
    val expected = Style(FLOAT, "left").toString()
    val returned = KW.inline { float_left }
    assertEquals(expected, returned)
  }

  @Test
  fun float_none() {
    val expected = Style(FLOAT, "none").toString()
    val returned = KW.inline { float_none }
    assertEquals(expected, returned)
  }

}
