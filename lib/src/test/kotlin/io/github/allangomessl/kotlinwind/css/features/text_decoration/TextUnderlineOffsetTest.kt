package io.github.allangomessl.kotlinwind.css.features.text_decoration

import io.github.allangomessl.kotlinwind.css.KW
import io.github.allangomessl.kotlinwind.css.api.Style
import io.github.allangomessl.kotlinwind.css.core.TEXT_DECORATION_LINE
import io.github.allangomessl.kotlinwind.css.core.TEXT_UNDERLINE_OFFSET
import io.github.allangomessl.kotlinwind.css.extensions.inline
import kotlin.test.Test
import kotlin.test.assertEquals

class TextUnderlineOffsetTest {

  @Test
  fun custom() {
    val expected = listOf(
      Style(TEXT_DECORATION_LINE, "underline"),
      Style(TEXT_UNDERLINE_OFFSET, "10px")
    ).inline()
    val returned = KW.inline { underline.offset[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun custom_rem() {
    val expected = listOf(
      Style(TEXT_DECORATION_LINE, "underline"),
      Style(TEXT_UNDERLINE_OFFSET, "10rem")
    ).inline()
    val returned = KW.inline { underline.offset["10rem"] }
    assertEquals(expected, returned)
  }

  @Test
  fun offset_auto() {
    val expected = listOf(
      Style(TEXT_DECORATION_LINE, "underline"),
      Style(TEXT_UNDERLINE_OFFSET, "auto")
    ).inline()
    val returned = KW.inline { underline.offset_auto }
    assertEquals(expected, returned)
  }

  @Test
  fun offset_0() {
    val expected = listOf(
      Style(TEXT_DECORATION_LINE, "underline"),
      Style(TEXT_UNDERLINE_OFFSET, "0px")
    ).inline()
    val returned = KW.inline { underline.offset_0 }
    assertEquals(expected, returned)
  }

  @Test
  fun offset_1() {
    val expected = listOf(
      Style(TEXT_DECORATION_LINE, "underline"),
      Style(TEXT_UNDERLINE_OFFSET, "1px")
    ).inline()
    val returned = KW.inline { underline.offset_1 }
    assertEquals(expected, returned)
  }

  @Test
  fun offset_2() {
    val expected = listOf(
      Style(TEXT_DECORATION_LINE, "underline"),
      Style(TEXT_UNDERLINE_OFFSET, "2px")
    ).inline()
    val returned = KW.inline { underline.offset_2 }
    assertEquals(expected, returned)
  }

  @Test
  fun offset_4() {
    val expected = listOf(
      Style(TEXT_DECORATION_LINE, "underline"),
      Style(TEXT_UNDERLINE_OFFSET, "4px")
    ).inline()
    val returned = KW.inline { underline.offset_4 }
    assertEquals(expected, returned)
  }

  @Test
  fun offset_8() {
    val expected = listOf(
      Style(TEXT_DECORATION_LINE, "underline"),
      Style(TEXT_UNDERLINE_OFFSET, "8px")
    ).inline()
    val returned = KW.inline { underline.offset_8 }
    assertEquals(expected, returned)
  }

}
