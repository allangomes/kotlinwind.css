package io.github.allangomes.kotlinwind.css.features

import assertStringMatchesAny
import io.github.allangomes.kotlinwind.css.KW
import io.github.allangomes.kotlinwind.css.api.Style
import io.github.allangomes.kotlinwind.css.core.TOP
import kotlin.test.Test
import kotlin.test.assertEquals

class PositionTopTest {

  @Test
  fun top() {
    val expected = Style(TOP, "2.5rem").toString()
    val returned = KW.inline { top[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun top_fraction() {
    val expectedJvm = Style(TOP, "25.0%").toString()
    val expectedJs = Style(TOP, "25%").toString()
    val returned = KW.inline { top_pct[1, 4] }
    assertStringMatchesAny(returned, expectedJvm, expectedJs)
  }

  @Test
  fun top_pct() {
    val expectedJvm = Style(TOP, "32.0%").toString()
    val expectedJs = Style(TOP, "32%").toString()
    val returned = KW.inline { top_pct[32] }
    assertStringMatchesAny(returned, expectedJvm, expectedJs)
  }

  @Test
  fun top_auto() {
    val expected = Style(TOP, "auto").toString()
    val returned = KW.inline { top_auto }
    assertEquals(expected, returned)
  }

  @Test
  fun top_full() {
    val expected = Style(TOP, "100%").toString()
    val returned = KW.inline { top_full }
    assertEquals(expected, returned)
  }

}
