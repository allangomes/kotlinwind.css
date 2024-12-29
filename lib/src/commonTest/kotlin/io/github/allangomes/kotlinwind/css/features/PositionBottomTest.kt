package io.github.allangomes.kotlinwind.css.features

import assertStringMatchesAny
import io.github.allangomes.kotlinwind.css.KW
import io.github.allangomes.kotlinwind.css.api.Style
import io.github.allangomes.kotlinwind.css.core.BOTTOM
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.fail

class PositionBottomTest {

  @Test
  fun bottom() {
    val expected = Style(BOTTOM, "2.5rem").toString()
    val returned = KW.inline { bottom[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun bottom_fraction() {
    val expectedJvm = Style(BOTTOM, "25.0%").toString()
    val expectedJs = Style(BOTTOM, "25%").toString()
    val returned = KW.inline { bottom_pct[1, 4] }
    assertStringMatchesAny(returned, expectedJvm, expectedJs)
  }

  @Test
  fun bottom_pct() {
    val expectedJvm = Style(BOTTOM, "32.0%").toString()
    val expectedJs = Style(BOTTOM, "32%").toString()
    val returned = KW.inline { bottom_pct[32] }
    assertStringMatchesAny(returned, expectedJvm, expectedJs)
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
