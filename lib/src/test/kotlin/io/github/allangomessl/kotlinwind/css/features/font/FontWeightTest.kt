package io.github.allangomessl.kotlinwind.css.features.font

import io.github.allangomessl.kotlinwind.css.KW
import io.github.allangomessl.kotlinwind.css.api.Style
import io.github.allangomessl.kotlinwind.css.core.FONT_WEIGHT
import kotlin.test.Test
import kotlin.test.assertEquals

class FontWeightTest {

  @Test
  fun thin() {
    val expected = Style(FONT_WEIGHT, "100").toString()
    val returned = KW.inline { font.thin }
    assertEquals(expected, returned)
  }

  @Test
  fun normal() {
    val expected = Style(FONT_WEIGHT, "400").toString()
    val returned = KW.inline { font.normal }
    assertEquals(expected, returned)
  }

  @Test
  fun bold() {
    val expected = Style(FONT_WEIGHT, "700").toString()
    val returned = KW.inline { font.bold }
    assertEquals(expected, returned)
  }

  @Test
  fun weight_100() {
    val expected = Style(FONT_WEIGHT, "100").toString()
    val returned = KW.inline { font.weight_100 }
    assertEquals(expected, returned)
  }

  @Test
  fun weight_200() {
    val expected = Style(FONT_WEIGHT, "200").toString()
    val returned = KW.inline { font.weight_200 }
    assertEquals(expected, returned)
  }

  @Test
  fun weight_300() {
    val expected = Style(FONT_WEIGHT, "300").toString()
    val returned = KW.inline { font.weight_300 }
    assertEquals(expected, returned)
  }

  @Test
  fun weight_400() {
    val expected = Style(FONT_WEIGHT, "400").toString()
    val returned = KW.inline { font.weight_400 }
    assertEquals(expected, returned)
  }

  @Test
  fun weight_500() {
    val expected = Style(FONT_WEIGHT, "500").toString()
    val returned = KW.inline { font.weight_500 }
    assertEquals(expected, returned)
  }

  @Test
  fun weight_600() {
    val expected = Style(FONT_WEIGHT, "600").toString()
    val returned = KW.inline { font.weight_600 }
    assertEquals(expected, returned)
  }

  @Test
  fun weight_700() {
    val expected = Style(FONT_WEIGHT, "700").toString()
    val returned = KW.inline { font.weight_700 }
    assertEquals(expected, returned)
  }

  @Test
  fun weight_800() {
    val expected = Style(FONT_WEIGHT, "800").toString()
    val returned = KW.inline { font.weight_800 }
    assertEquals(expected, returned)
  }

  @Test
  fun weight_900() {
    val expected = Style(FONT_WEIGHT, "900").toString()
    val returned = KW.inline { font.weight_900 }
    assertEquals(expected, returned)
  }

}
