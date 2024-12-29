package io.github.allangomes.kotlinwind.css.features.common

import assertStringMatchesAny
import io.github.allangomes.kotlinwind.css.KW
import io.github.allangomes.kotlinwind.css.api.Style
import io.github.allangomes.kotlinwind.css.core.GAP
import io.github.allangomes.kotlinwind.css.core.GAP_COLUMN
import io.github.allangomes.kotlinwind.css.core.GAP_ROW
import kotlin.test.Test
import kotlin.test.assertEquals

class GapTest {

  @Test
  fun gap_1() {
    val expectedJvm: String = Style(GAP, "1.0rem").toString()
    val expectedJs: String = Style(GAP, "1rem").toString()
    val returned = KW.inline { grid.gap[4f] }
    assertStringMatchesAny(returned, expectedJvm, expectedJs)
  }

  @Test
  fun gap_x() {
    val expectedJvm: String = Style(GAP_COLUMN, "1.0rem").toString()
    val expectedJs: String = Style(GAP_COLUMN, "1rem").toString()
    val returned = KW.inline { grid.gap_x[4f] }
    assertStringMatchesAny(returned, expectedJvm, expectedJs)
  }

  @Test
  fun gap_y() {
    val expectedJvm: String = Style(GAP_ROW, "1.0rem").toString()
    val expectedJs: String = Style(GAP_ROW, "1rem").toString()
    val returned = KW.inline { grid.gap_y[4f] }
    assertStringMatchesAny(returned, expectedJvm, expectedJs)
  }

  @Test
  fun flex_support() {
    val expectedJvm = Style(GAP,"1.0rem").toString()
    val expectedJs = Style(GAP,"1rem").toString()
    val returned = KW.inline { flex.gap[4] }
    assertStringMatchesAny(returned, expectedJvm, expectedJs)
  }

}
