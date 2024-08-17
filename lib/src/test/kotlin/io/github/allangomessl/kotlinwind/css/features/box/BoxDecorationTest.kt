package io.github.allangomessl.kotlinwind.css.features.box

import io.github.allangomessl.kotlinwind.css.KW
import io.github.allangomessl.kotlinwind.css.api.Style
import io.github.allangomessl.kotlinwind.css.core.BOX_DECORATION_BREAK
import kotlin.test.Test
import kotlin.test.assertEquals

class BoxDecorationTest {

  @Test
  fun box_decoration_clone() {
    val expected = Style(BOX_DECORATION_BREAK, "clone").toString()
    val returned = KW.inline { box.decoration_clone }
    assertEquals(expected, returned)
  }

  @Test
  fun box_decoration_slice() {
    val expected = Style(BOX_DECORATION_BREAK, "slice").toString()
    val returned = KW.inline { box.decoration_slice }
    assertEquals(expected, returned)
  }


}
