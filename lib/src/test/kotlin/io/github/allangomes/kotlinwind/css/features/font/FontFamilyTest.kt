package io.github.allangomes.kotlinwind.css.features.font

import io.github.allangomes.kotlinwind.css.KW
import io.github.allangomes.kotlinwind.css.MONO
import io.github.allangomes.kotlinwind.css.SANS
import io.github.allangomes.kotlinwind.css.SERIF
import io.github.allangomes.kotlinwind.css.api.Style
import io.github.allangomes.kotlinwind.css.config.Theme
import io.github.allangomes.kotlinwind.css.core.FONT_FAMILY
import kotlin.test.Test
import kotlin.test.assertEquals

class FontFamilyTest {

  @Test
  fun sans() {
    val expected = Style(FONT_FAMILY, Theme.font_family[SANS]).toString()
    val returned = KW.inline { font.sans }
    assertEquals(expected, returned)
  }

  @Test
  fun serif() {
    val expected = Style(FONT_FAMILY, Theme.font_family[SERIF]).toString()
    val returned = KW.inline { font.serif }
    assertEquals(expected, returned)
  }

  @Test
  fun mono() {
    val expected = Style(FONT_FAMILY, Theme.font_family[MONO]).toString()
    val returned = KW.inline { font.mono }
    assertEquals(expected, returned)
  }

}
