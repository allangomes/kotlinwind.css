package io.github.allangomessl.kotlinwind.css.features.decoration

import io.github.allangomessl.kotlinwind.css.KW
import io.github.allangomessl.kotlinwind.css.api.Style
import io.github.allangomessl.kotlinwind.css.core.TEXT_DECORATION_LINE
import io.github.allangomessl.kotlinwind.css.extensions.inline
import kotlin.test.Test
import kotlin.test.assertEquals

class TextDecorationTest {

  @Test
  fun no_decoration() {
    val expected = listOf(
      Style(TEXT_DECORATION_LINE, "underline"),
      Style(TEXT_DECORATION_LINE, "none"),
    ).inline()
    val returned = KW.inline { underline; no_decoration }
    assertEquals(expected, returned)
  }

}