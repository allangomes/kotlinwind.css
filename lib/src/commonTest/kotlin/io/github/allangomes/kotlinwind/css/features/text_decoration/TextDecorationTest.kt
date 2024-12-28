package io.github.allangomes.kotlinwind.css.features.text_decoration

import io.github.allangomes.kotlinwind.css.KW
import io.github.allangomes.kotlinwind.css.api.Style
import io.github.allangomes.kotlinwind.css.core.TEXT_DECORATION_LINE
import io.github.allangomes.kotlinwind.css.extensions.inline
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
