package io.github.allangomes.kotlinwind.css.features

import assertStringMatchesAny
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
    val expectedJvm = Style(LEFT, "25.0%").toString()
    val expectedJs = Style(LEFT, "25%").toString()
    val returned = KW.inline { left_pct[1, 4] }
    assertStringMatchesAny(returned, expectedJvm, expectedJs)
  }

  @Test
  fun left_pct() {
    val expectedJvm = Style(LEFT, "32.0%").toString()
    val expectedJs = Style(LEFT, "32%").toString()
    val returned = KW.inline { left_pct[32] }
    assertStringMatchesAny(returned, expectedJvm, expectedJs)
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
