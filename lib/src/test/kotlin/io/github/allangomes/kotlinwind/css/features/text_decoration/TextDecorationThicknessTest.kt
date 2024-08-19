package io.github.allangomes.kotlinwind.css.features.text_decoration

import io.github.allangomes.kotlinwind.css.KW
import io.github.allangomes.kotlinwind.css.api.Style
import io.github.allangomes.kotlinwind.css.core.TEXT_DECORATION_LINE
import io.github.allangomes.kotlinwind.css.core.TEXT_DECORATION_THICKNESS
import io.github.allangomes.kotlinwind.css.extensions.inline
import kotlin.test.Test
import kotlin.test.assertEquals

class TextDecorationThicknessTest {

  @Test
  fun custom() {
    val expected = listOf(
      Style(TEXT_DECORATION_LINE, "underline"),
      Style(TEXT_DECORATION_THICKNESS, "10px")
    ).inline()
    val returned = KW.inline { underline.size[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun custom_rem() {
    val expected = listOf(
      Style(TEXT_DECORATION_LINE, "underline"),
      Style(TEXT_DECORATION_THICKNESS, "10rem")
    ).inline()
    val returned = KW.inline { underline.size["10rem"] }
    assertEquals(expected, returned)
  }


  @Test
  fun auto() {
    val expected = listOf(
      Style(TEXT_DECORATION_LINE, "underline"),
      Style(TEXT_DECORATION_THICKNESS, "auto")
    ).inline()
    val returned = KW.inline { underline.auto }
    assertEquals(expected, returned)
  }

  @Test
  fun from_font() {
    val expected = listOf(
      Style(TEXT_DECORATION_LINE, "underline"),
      Style(TEXT_DECORATION_THICKNESS, "from-font")
    ).inline()
    val returned = KW.inline { underline.from_font }
    assertEquals(expected, returned)
  }

  @Test
  fun size_0() {
    val expected = listOf(
      Style(TEXT_DECORATION_LINE, "underline"),
      Style(TEXT_DECORATION_THICKNESS, "0px")
    ).inline()
    val returned = KW.inline { underline.size_0 }
    assertEquals(expected, returned)
  }

  @Test
  fun size_1() {
    val expected = listOf(
      Style(TEXT_DECORATION_LINE, "underline"),
      Style(TEXT_DECORATION_THICKNESS, "1px")
    ).inline()
    val returned = KW.inline { underline.size_1 }
    assertEquals(expected, returned)
  }

  @Test
  fun size_2() {
    val expected = listOf(
      Style(TEXT_DECORATION_LINE, "underline"),
      Style(TEXT_DECORATION_THICKNESS, "2px")
    ).inline()
    val returned = KW.inline { underline.size_2 }
    assertEquals(expected, returned)
  }

  @Test
  fun size_4() {
    val expected = listOf(
      Style(TEXT_DECORATION_LINE, "underline"),
      Style(TEXT_DECORATION_THICKNESS, "4px")
    ).inline()
    val returned = KW.inline { underline.size_4 }
    assertEquals(expected, returned)
  }

  @Test
  fun size_8() {
    val expected = listOf(
      Style(TEXT_DECORATION_LINE, "underline"),
      Style(TEXT_DECORATION_THICKNESS, "8px")
    ).inline()
    val returned = KW.inline { underline.size_8 }
    assertEquals(expected, returned)
  }

}
