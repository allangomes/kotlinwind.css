package io.github.allangomessl.kotlinwind.css.features

import io.github.allangomessl.kotlinwind.css.KW
import io.github.allangomessl.kotlinwind.css.api.Style
import io.github.allangomessl.kotlinwind.css.core.RIGHT
import kotlin.test.Test
import kotlin.test.assertEquals

class PositionRightTest {

  @Test
  fun right() {
    val expected = Style(RIGHT, "2.5rem").toString()
    val returned = KW.inline { right[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun right_fraction() {
    val expected = Style(RIGHT, "25.0%").toString()
    val returned = KW.inline { right_pct[1, 4] }
    assertEquals(expected, returned)
  }

  @Test
  fun right_pct() {
    val expected = Style(RIGHT, "32.0%").toString()
    val returned = KW.inline { right_pct[32] }
    assertEquals(expected, returned)
  }

  @Test
  fun right_auto() {
    val expected = Style(RIGHT, "auto").toString()
    val returned = KW.inline { right_auto }
    assertEquals(expected, returned)
  }

  @Test
  fun right_full() {
    val expected = Style(RIGHT, "100%").toString()
    val returned = KW.inline { right_full }
    assertEquals(expected, returned)
  }


}
