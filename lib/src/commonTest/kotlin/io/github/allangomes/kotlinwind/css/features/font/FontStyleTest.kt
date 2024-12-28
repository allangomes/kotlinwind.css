package io.github.allangomes.kotlinwind.css.features.font

import io.github.allangomes.kotlinwind.css.KW
import io.github.allangomes.kotlinwind.css.api.Style
import io.github.allangomes.kotlinwind.css.core.FONT_STYLE
import kotlin.test.Test
import kotlin.test.assertEquals

class FontStyleTest {

  @Test
  fun italic() {
    val expected = Style(FONT_STYLE, "italic").toString()
    val returned = KW.inline { font.italic }
    assertEquals(expected, returned)
  }

  @Test
  fun not_italic() {
    val expected = Style(FONT_STYLE, "normal").toString()
    val returned = KW.inline { font.not_italic }
    assertEquals(expected, returned)
  }

}
