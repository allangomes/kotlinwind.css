package io.github.allangomes.kotlinwind.css.features.font

import io.github.allangomes.kotlinwind.css.KW
import io.github.allangomes.kotlinwind.css.api.Style
import io.github.allangomes.kotlinwind.css.core.FONT_VARIANT_NUMERIC
import kotlin.test.Test
import kotlin.test.assertEquals

class FontVariantNumericTest {

  @Test
  fun numeric_normal() {
    val expected = Style(FONT_VARIANT_NUMERIC, "normal").toString()
    val returned = KW.inline { font.numeric_normal }
    assertEquals(expected, returned)
  }

  @Test
  fun numeric_ordinal() {
    val expected = Style(FONT_VARIANT_NUMERIC, "ordinal").toString()
    val returned = KW.inline { font.numeric_ordinal }
    assertEquals(expected, returned)
  }

  @Test
  fun numeric_slashed() {
    val expected = Style(FONT_VARIANT_NUMERIC, "slashed-zero").toString()
    val returned = KW.inline { font.numeric_slashed }
    assertEquals(expected, returned)
  }

  @Test
  fun numeric_lining() {
    val expected = Style(FONT_VARIANT_NUMERIC, "lining-nums").toString()
    val returned = KW.inline { font.numeric_lining }
    assertEquals(expected, returned)
  }

  @Test
  fun numeric_oldstyle() {
    val expected = Style(FONT_VARIANT_NUMERIC, "oldstyle-nums").toString()
    val returned = KW.inline { font.numeric_oldstyle }
    assertEquals(expected, returned)
  }

  @Test
  fun numeric_tabular() {
    val expected = Style(FONT_VARIANT_NUMERIC, "tabular-nums").toString()
    val returned = KW.inline { font.numeric_tabular }
    assertEquals(expected, returned)
  }

  @Test
  fun numeric_proportional() {
    val expected = Style(FONT_VARIANT_NUMERIC, "proportional-nums").toString()
    val returned = KW.inline { font.numeric_proportional }
    assertEquals(expected, returned)
  }

  @Test
  fun numeric_diagonal_fractions() {
    val expected = Style(FONT_VARIANT_NUMERIC, "diagonal-fractions").toString()
    val returned = KW.inline { font.numeric_diagonal_fractions }
    assertEquals(expected, returned)
  }

  @Test
  fun numeric_stacked_fractions() {
    val expected = Style(FONT_VARIANT_NUMERIC, "stacked-fractions").toString()
    val returned = KW.inline { font.numeric_stacked_fractions }
    assertEquals(expected, returned)
  }


}
