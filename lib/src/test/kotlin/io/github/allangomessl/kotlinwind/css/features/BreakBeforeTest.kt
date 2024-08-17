package io.github.allangomessl.kotlinwind.css.features

import io.github.allangomessl.kotlinwind.css.KW
import io.github.allangomessl.kotlinwind.css.api.Style
import io.github.allangomessl.kotlinwind.css.core.BREAK_BEFORE
import kotlin.test.Test
import kotlin.test.assertEquals

class BreakBeforeTest {


  @Test
  fun break_before_auto() {
    val expected = Style(BREAK_BEFORE, "auto").toString()
    val returned = KW.inline { break_before_auto }
    assertEquals(expected, returned)
  }

  @Test
  fun break_before_avoid() {
    val expected = Style(BREAK_BEFORE, "avoid").toString()
    val returned = KW.inline { break_before_avoid }
    assertEquals(expected, returned)
  }

  @Test
  fun break_before_all() {
    val expected = Style(BREAK_BEFORE, "all").toString()
    val returned = KW.inline { break_before_all }
    assertEquals(expected, returned)
  }

  @Test
  fun break_before_avoid_page() {
    val expected = Style(BREAK_BEFORE, "avoid-page").toString()
    val returned = KW.inline { break_before_avoid_page }
    assertEquals(expected, returned)
  }

  @Test
  fun break_before_page() {
    val expected = Style(BREAK_BEFORE, "page").toString()
    val returned = KW.inline { break_before_page }
    assertEquals(expected, returned)
  }

  @Test
  fun break_before_left() {
    val expected = Style(BREAK_BEFORE, "left").toString()
    val returned = KW.inline { break_before_left }
    assertEquals(expected, returned)
  }

  @Test
  fun break_before_right() {
    val expected = Style(BREAK_BEFORE, "right").toString()
    val returned = KW.inline { break_before_right }
    assertEquals(expected, returned)
  }

  @Test
  fun break_before_column() {
    val expected = Style(BREAK_BEFORE, "column").toString()
    val returned = KW.inline { break_before_column }
    assertEquals(expected, returned)
  }

}
