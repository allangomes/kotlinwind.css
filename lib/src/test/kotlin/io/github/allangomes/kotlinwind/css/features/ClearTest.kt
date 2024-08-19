package io.github.allangomes.kotlinwind.css.features

import io.github.allangomes.kotlinwind.css.KW
import io.github.allangomes.kotlinwind.css.api.Style
import io.github.allangomes.kotlinwind.css.core.CLEAR
import kotlin.test.Test
import kotlin.test.assertEquals

class ClearTest {


  @Test
  fun clear_start() {
    val expected = Style(CLEAR, "inline-start").toString()
    val returned = KW.inline { clear_start }
    assertEquals(expected, returned)
  }

  @Test
  fun clear_end() {
    val expected = Style(CLEAR, "inline-end").toString()
    val returned = KW.inline { clear_end }
    assertEquals(expected, returned)
  }

  @Test
  fun clear_left() {
    val expected = Style(CLEAR, "left").toString()
    val returned = KW.inline { clear_left }
    assertEquals(expected, returned)
  }

  @Test
  fun clear_right() {
    val expected = Style(CLEAR, "right").toString()
    val returned = KW.inline { clear_right }
    assertEquals(expected, returned)
  }

  @Test
  fun clear_both() {
    val expected = Style(CLEAR, "both").toString()
    val returned = KW.inline { clear_both }
    assertEquals(expected, returned)
  }

  @Test
  fun clear_none() {
    val expected = Style(CLEAR, "none").toString()
    val returned = KW.inline { clear_none }
    assertEquals(expected, returned)
  }

}
