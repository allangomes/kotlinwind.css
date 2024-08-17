package io.github.allangomessl.kotlinwind.css.features.flex

import io.github.allangomessl.kotlinwind.css.KW
import io.github.allangomessl.kotlinwind.css.api.Style
import io.github.allangomessl.kotlinwind.css.core.FLEX_GROW
import kotlin.test.Test
import kotlin.test.assertEquals

class FlexGrowTest {

  @Test
  fun grow() {
    val expected: String = Style(FLEX_GROW, "1").toString()
    val returned = KW.inline { flex.grow }
    assertEquals(expected, returned)
  }

  @Test
  fun grow_0() {
    val expected: String = Style(FLEX_GROW, "0").toString()
    val returned = KW.inline { flex.grow_0 }
    assertEquals(expected, returned)
  }

}
