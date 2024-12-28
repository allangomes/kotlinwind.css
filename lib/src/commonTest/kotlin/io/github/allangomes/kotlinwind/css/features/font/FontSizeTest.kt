package io.github.allangomes.kotlinwind.css.features.font

import io.github.allangomes.kotlinwind.css.*
import io.github.allangomes.kotlinwind.css.api.Style
import io.github.allangomes.kotlinwind.css.config.Theme
import io.github.allangomes.kotlinwind.css.core.FONT_SIZE
import io.github.allangomes.kotlinwind.css.core.LINE_HEIGHT
import io.github.allangomes.kotlinwind.css.extensions.inline
import kotlin.test.Test
import kotlin.test.assertEquals

class FontSizeTest {

  @Test
  fun size_1() {
    val value = "0.5rem"
    val expected = listOf(
      Style(FONT_SIZE, value),
      Style(LINE_HEIGHT, value)
    ).inline()
    val returned = KW.inline { font.size[1] }
    assertEquals(expected, returned)
  }

  @Test
  fun size_7() {
    val value = "1.25rem"
    val expected = listOf(
      Style(FONT_SIZE, value),
      Style(LINE_HEIGHT, value)
    ).inline()
    val returned = KW.inline { font.size[7] }
    assertEquals(expected, returned)
  }

  @Test
  fun xs() {
    val expected = listOf(
      Style(FONT_SIZE, Theme.font_size[XS]),
      Style(LINE_HEIGHT, Theme.line_height[XS])
    ).inline()
    val returned = KW.inline { font.xs }
    assertEquals(expected, returned)
  }

  @Test
  fun sm() {
    val expected = listOf(
      Style(FONT_SIZE, Theme.font_size[SM]),
      Style(LINE_HEIGHT, Theme.line_height[SM])
    ).inline()
    val returned = KW.inline { font.sm }
    assertEquals(expected, returned)
  }

  @Test
  fun base() {
    val expected = listOf(
      Style(FONT_SIZE, Theme.font_size[BASE]),
      Style(LINE_HEIGHT, Theme.line_height[BASE])
    ).inline()
    val returned = KW.inline { font.base }
    assertEquals(expected, returned)
  }

  @Test
  fun lg() {
    val expected = listOf(
      Style(FONT_SIZE, Theme.font_size[LG]),
      Style(LINE_HEIGHT, Theme.line_height[LG])
    ).inline()
    val returned = KW.inline { font.lg }
    assertEquals(expected, returned)
  }

  @Test
  fun xl() {
    val expected = listOf(
      Style(FONT_SIZE, Theme.font_size[XL]),
      Style(LINE_HEIGHT, Theme.line_height[XL])
    ).inline()
    val returned = KW.inline { font.xl }
    assertEquals(expected, returned)
  }

  @Test
  fun xl2() {
    val expected = listOf(
      Style(FONT_SIZE, Theme.font_size[XL2]),
      Style(LINE_HEIGHT, Theme.line_height[XL2])
    ).inline()
    val returned = KW.inline { font.xl2 }
    assertEquals(expected, returned)
  }

  @Test
  fun xl3() {
    val expected = listOf(
      Style(FONT_SIZE, Theme.font_size[XL3]),
      Style(LINE_HEIGHT, Theme.line_height[XL3])
    ).inline()
    val returned = KW.inline { font.xl3 }
    assertEquals(expected, returned)
  }

  @Test
  fun xl4() {
    val expected = listOf(
      Style(FONT_SIZE, Theme.font_size[XL4]),
      Style(LINE_HEIGHT, Theme.line_height[XL4])
    ).inline()
    val returned = KW.inline { font.xl4 }
    assertEquals(expected, returned)
  }

  @Test
  fun xl5() {
    val expected = listOf(
      Style(FONT_SIZE, Theme.font_size[XL5]),
      Style(LINE_HEIGHT, Theme.line_height[XL5])
    ).inline()
    val returned = KW.inline { font.xl5 }
    assertEquals(expected, returned)
  }

  @Test
  fun xl6() {
    val expected = listOf(
      Style(FONT_SIZE, Theme.font_size[XL6]),
      Style(LINE_HEIGHT, Theme.line_height[XL6])
    ).inline()
    val returned = KW.inline { font.xl6 }
    assertEquals(expected, returned)
  }

  @Test
  fun xl7() {
    val expected = listOf(
      Style(FONT_SIZE, Theme.font_size[XL7]),
      Style(LINE_HEIGHT, Theme.line_height[XL7])
    ).inline()
    val returned = KW.inline { font.xl7 }
    assertEquals(expected, returned)
  }

  @Test
  fun xl8() {
    val expected = listOf(
      Style(FONT_SIZE, Theme.font_size[XL8]),
      Style(LINE_HEIGHT, Theme.line_height[XL8])
    ).inline()
    val returned = KW.inline { font.xl8 }
    assertEquals(expected, returned)
  }

  @Test
  fun xl9() {
    val expected = listOf(
      Style(FONT_SIZE, Theme.font_size[XL9]),
      Style(LINE_HEIGHT, Theme.line_height[XL9])
    ).inline()
    val returned = KW.inline { font.xl9 }
    assertEquals(expected, returned)
  }

}
