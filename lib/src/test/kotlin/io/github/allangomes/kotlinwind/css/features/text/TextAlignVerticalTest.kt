package io.github.allangomes.kotlinwind.css.features.text

import io.github.allangomes.kotlinwind.css.KW
import io.github.allangomes.kotlinwind.css.api.Style
import io.github.allangomes.kotlinwind.css.core.VERTICAL_ALIGN
import kotlin.test.Test
import kotlin.test.assertEquals

class TextAlignVerticalTest {


  @Test
  fun top() {
    val expected = Style(VERTICAL_ALIGN, "top").toString()
    val returned = KW.inline { text.top }
    assertEquals(expected, returned)
  }

  @Test
  fun middle() {
    val expected = Style(VERTICAL_ALIGN, "middle").toString()
    val returned = KW.inline { text.middle }
    assertEquals(expected, returned)
  }

  @Test
  fun bottom() {
    val expected = Style(VERTICAL_ALIGN, "bottom").toString()
    val returned = KW.inline { text.bottom }
    assertEquals(expected, returned)
  }

}
