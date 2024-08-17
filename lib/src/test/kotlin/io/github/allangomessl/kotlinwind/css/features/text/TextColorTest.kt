package io.github.allangomessl.kotlinwind.css.features.text

import io.github.allangomessl.kotlinwind.css.KW
import io.github.allangomessl.kotlinwind.css.api.Style
import io.github.allangomessl.kotlinwind.css.core.COLOR
import kotlin.test.Test
import kotlin.test.assertEquals

class TextColorTest {

  @Test
  fun color_custom() {
    val expected = Style(COLOR, "#123").toString()
    val returned = KW.inline { text.color["#123"] }
    assertEquals(expected, returned)
  }

  @Test
  fun color_black() {
    val expected = Style(COLOR, "#000").toString()
    val returned = KW.inline { text.black }
    assertEquals(expected, returned)
  }

}
