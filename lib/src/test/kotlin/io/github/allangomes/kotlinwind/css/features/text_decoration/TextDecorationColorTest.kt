package io.github.allangomes.kotlinwind.css.features.text_decoration

import io.github.allangomes.kotlinwind.css.KW
import io.github.allangomes.kotlinwind.css.api.Style
import io.github.allangomes.kotlinwind.css.core.TEXT_DECORATION_COLOR
import io.github.allangomes.kotlinwind.css.core.TEXT_DECORATION_LINE
import io.github.allangomes.kotlinwind.css.extensions.inline
import kotlin.test.Test
import kotlin.test.assertEquals

class TextDecorationColorTest {

  @Test
  fun color_custom() {
    val expected = listOf(
      Style(TEXT_DECORATION_LINE, "underline"),
      Style(TEXT_DECORATION_COLOR, "#123")
    ).inline()
    val returned = KW.inline { underline.color["#123"] }
    assertEquals(expected, returned)
  }

  @Test
  fun color_black() {
    val expected = listOf(
      Style(TEXT_DECORATION_LINE, "underline"),
      Style(TEXT_DECORATION_COLOR, "#000")
    ).inline()
    val returned = KW.inline { underline.black }
    assertEquals(expected, returned)
  }

}
