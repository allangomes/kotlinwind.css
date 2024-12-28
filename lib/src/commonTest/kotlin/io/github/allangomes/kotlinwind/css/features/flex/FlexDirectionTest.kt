package io.github.allangomes.kotlinwind.css.features.flex

import io.github.allangomes.kotlinwind.css.KW
import io.github.allangomes.kotlinwind.css.api.Style
import io.github.allangomes.kotlinwind.css.core.DISPLAY
import io.github.allangomes.kotlinwind.css.core.FLEX
import io.github.allangomes.kotlinwind.css.core.FLEX_DIRECTION
import io.github.allangomes.kotlinwind.css.extensions.inline
import kotlin.test.Test
import kotlin.test.assertEquals

class FlexDirectionTest {

  @Test
  fun col() {
    val expected = listOf(
      Style(DISPLAY, FLEX),
      Style(FLEX_DIRECTION, "column")
    ).inline()
    val returned = KW.inline { flex.col }
    assertEquals(expected, returned)
  }

  @Test
  fun row() {
    val expected = listOf(
      Style(DISPLAY, FLEX),
      Style(FLEX_DIRECTION, "row")
    ).inline()
    val returned = KW.inline { flex.row }
    assertEquals(expected, returned)
  }

  @Test
  fun col_reverse() {
    val expected: String = Style(FLEX_DIRECTION, "column-reverse").toString()
    val returned = KW.inline { flex.col_reverse }
    assertEquals(expected, returned)
  }

  @Test
  fun row_reverse() {
    val expected: String = Style(FLEX_DIRECTION, "row-reverse").toString()
    val returned = KW.inline { flex.row_reverse }
    assertEquals(expected, returned)
  }

}
