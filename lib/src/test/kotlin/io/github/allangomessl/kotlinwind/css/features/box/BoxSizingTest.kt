package io.github.allangomessl.kotlinwind.css.features.box

import io.github.allangomessl.kotlinwind.css.KW
import io.github.allangomessl.kotlinwind.css.api.Style
import io.github.allangomessl.kotlinwind.css.core.BOX_SIZING
import kotlin.test.Test
import kotlin.test.assertEquals

class BoxSizingTest {

  @Test
  fun box_border() {
    val expected = Style(BOX_SIZING, "border-box").toString()
    val returned = KW.inline { box.border }
    assertEquals(expected, returned)
  }

  @Test
  fun box_content() {
    val expected = Style(BOX_SIZING, "content-box").toString()
    val returned = KW.inline { box.content }
    assertEquals(expected, returned)
  }

}
