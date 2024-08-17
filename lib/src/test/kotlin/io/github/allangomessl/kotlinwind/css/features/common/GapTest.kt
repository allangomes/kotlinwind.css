package io.github.allangomessl.kotlinwind.css.features.common

import io.github.allangomessl.kotlinwind.css.KW
import io.github.allangomessl.kotlinwind.css.api.Style
import io.github.allangomessl.kotlinwind.css.core.GAP
import io.github.allangomessl.kotlinwind.css.core.GAP_COLUMN
import io.github.allangomessl.kotlinwind.css.core.GAP_ROW
import kotlin.test.Test
import kotlin.test.assertEquals

class GapTest {

  @Test
  fun gap_1() {
    val expected: String = Style(GAP, "1.0rem").toString()
    val returned = KW.inline { grid.gap[4f] }
    assertEquals(expected, returned)
  }

  @Test
  fun gap_x() {
    val expected: String = Style(GAP_COLUMN, "1.0rem").toString()
    val returned = KW.inline { grid.gap_x[4f] }
    assertEquals(expected, returned)
  }

  @Test
  fun gap_y() {
    val expected: String = Style(GAP_ROW, "1.0rem").toString()
    val returned = KW.inline { grid.gap_y[4f] }
    assertEquals(expected, returned)
  }

  @Test
  fun flex_support() {
    val expected = Style(GAP,"1.0rem").toString()
    val returned = KW.inline { flex.gap[4] }
    assertEquals(expected, returned)
  }

}
