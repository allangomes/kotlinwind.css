package io.github.allangomes.kotlinwind.css.features.text_decoration

import io.github.allangomes.kotlinwind.css.KW
import io.github.allangomes.kotlinwind.css.api.Style
import io.github.allangomes.kotlinwind.css.core.TEXT_DECORATION_LINE
import io.github.allangomes.kotlinwind.css.core.TEXT_DECORATION_STYLE
import io.github.allangomes.kotlinwind.css.extensions.inline
import kotlin.test.Test
import kotlin.test.assertEquals


class TextDecorationStyleTest {

  @Test
  fun solid() {
    val expected = listOf(
      Style(TEXT_DECORATION_LINE, "underline"),
      Style(TEXT_DECORATION_STYLE, "solid")
    ).inline()
    val returned = KW.inline { underline.solid }
    assertEquals(expected, returned)
  }

  @Test
  fun double() {
    val expected = listOf(
      Style(TEXT_DECORATION_LINE, "line-through"),
      Style(TEXT_DECORATION_STYLE, "double")
    ).inline()
    val returned = KW.inline { line_through.double }
    assertEquals(expected, returned)
  }

  @Test
  fun dotted() {
    val expected = listOf(
      Style(TEXT_DECORATION_LINE, "overline"),
      Style(TEXT_DECORATION_STYLE, "dotted")
    ).inline()
    val returned = KW.inline { overline.dotted }
    assertEquals(expected, returned)
  }

  @Test
  fun dashed() {
    val expected = listOf(
      Style(TEXT_DECORATION_LINE, "underline"),
      Style(TEXT_DECORATION_STYLE, "dashed")
    ).inline()
    val returned = KW.inline { underline.dashed }
    assertEquals(expected, returned)
  }

  @Test
  fun wavy() {
    val expected = listOf(
      Style(TEXT_DECORATION_LINE, "underline"),
      Style(TEXT_DECORATION_STYLE, "wavy")
    ).inline()
    val returned = KW.inline { underline.wavy }
    assertEquals(expected, returned)
  }

}
