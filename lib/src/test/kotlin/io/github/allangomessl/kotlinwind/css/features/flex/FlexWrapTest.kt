package io.github.allangomessl.kotlinwind.css.features.flex

import io.github.allangomessl.kotlinwind.css.KW
import io.github.allangomessl.kotlinwind.css.api.Style
import io.github.allangomessl.kotlinwind.css.core.FLEX_WRAP
import kotlin.test.Test
import kotlin.test.assertEquals

class FlexWrapTest {


  @Test
  fun wrap() {
    val expected = Style(FLEX_WRAP, "wrap").toString()
    val returned = KW.inline { flex.wrap }
    assertEquals(expected, returned)
  }

  @Test
  fun wrap_reverse() {
    val expected = Style(FLEX_WRAP, "wrap-reverse").toString()
    val returned = KW.inline { flex.wrap_reverse }
    assertEquals(expected, returned)
  }

  @Test
  fun nowrap() {
    val expected = Style(FLEX_WRAP, "nowrap").toString()
    val returned = KW.inline { flex.nowrap }
    assertEquals(expected, returned)
  }

}
