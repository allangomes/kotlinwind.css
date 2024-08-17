package io.github.allangomessl.kotlinwind.css.features

import io.github.allangomessl.kotlinwind.css.KW
import io.github.allangomessl.kotlinwind.css.api.Style
import io.github.allangomessl.kotlinwind.css.core.BREAK_AFTER
import kotlin.test.Test
import kotlin.test.assertEquals

class BreakAfterTest {

  @Test
  fun break_after_auto() {
    val expected = Style(BREAK_AFTER, "auto").toString()
    val returned = KW.inline { break_after_auto }
    assertEquals(expected, returned)
  }

  @Test
  fun break_after_avoid() {
    val expected = Style(BREAK_AFTER, "avoid").toString()
    val returned = KW.inline { break_after_avoid }
    assertEquals(expected, returned)
  }

  @Test
  fun break_after_all() {
    val expected = Style(BREAK_AFTER, "all").toString()
    val returned = KW.inline { break_after_all }
    assertEquals(expected, returned)
  }

  @Test
  fun break_after_avoid_page() {
    val expected = Style(BREAK_AFTER, "avoid-page").toString()
    val returned = KW.inline { break_after_avoid_page }
    assertEquals(expected, returned)
  }

  @Test
  fun break_after_page() {
    val expected = Style(BREAK_AFTER, "page").toString()
    val returned = KW.inline { break_after_page }
    assertEquals(expected, returned)
  }

  @Test
  fun break_after_left() {
    val expected = Style(BREAK_AFTER, "left").toString()
    val returned = KW.inline { break_after_left }
    assertEquals(expected, returned)
  }

  @Test
  fun break_after_right() {
    val expected = Style(BREAK_AFTER, "right").toString()
    val returned = KW.inline { break_after_right }
    assertEquals(expected, returned)
  }

  @Test
  fun break_after_column() {
    val expected = Style(BREAK_AFTER, "column").toString()
    val returned = KW.inline { break_after_column }
    assertEquals(expected, returned)
  }

}
