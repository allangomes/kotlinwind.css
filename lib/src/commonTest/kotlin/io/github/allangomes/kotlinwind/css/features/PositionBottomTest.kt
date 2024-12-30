package io.github.allangomes.kotlinwind.css.features

import io.github.allangomes.kotlinwind.css.KW
import io.github.allangomes.kotlinwind.css.api.Style
import io.github.allangomes.kotlinwind.css.core.BOTTOM
import kotlin.test.Test
import kotlin.test.assertEquals

class PositionBottomTest {

  @Test
  fun bottom() {
    val expected = Style(BOTTOM, "2.5rem").toString()
    val returned = KW.inline { bottom[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun bottom_fraction() {
    val expected = Style(BOTTOM, "25%").toString()
    val returned = KW.inline { bottom_pct[1, 4] }
    assertEquals(expected, returned)
  }

  @Test
  fun bottom_pct() {
    val expected = Style(BOTTOM, "32%").toString()
    val returned = KW.inline { bottom_pct[32] }
    assertEquals(expected, returned)
  }

  @Test
  fun bottom_auto() {
    val expected = Style(BOTTOM, "auto").toString()
    val returned = KW.inline { bottom_auto }
    assertEquals(expected, returned)
  }

  @Test
  fun bottom_full() {
    val expected = Style(BOTTOM, "100%").toString()
    val returned = KW.inline { bottom_full }
    assertEquals(expected, returned)
  }

}
