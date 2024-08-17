package io.github.allangomessl.kotlinwind.css.features.flex

import io.github.allangomessl.kotlinwind.css.KW
import io.github.allangomessl.kotlinwind.css.api.Style
import io.github.allangomessl.kotlinwind.css.core.FLEX
import kotlin.test.Test
import kotlin.test.assertEquals

class FlexTest {

  @Test
  fun fill() {
    val expected = Style(FLEX, "1 1 0%").toString()
    val returned = KW.inline { flex.fill }
    assertEquals(expected, returned)
  }

  @Test
  fun auto() {
    val expected = Style(FLEX, "1 1 auto").toString()
    val returned = KW.inline { flex.auto }
    assertEquals(expected, returned)
  }

  @Test
  fun initial() {
    val expected = Style(FLEX, "0 1 auto").toString()
    val returned = KW.inline { flex.initial }
    assertEquals(expected, returned)
  }

  @Test
  fun none() {
    val expected = Style(FLEX, "none").toString()
    val returned = KW.inline { flex.none }
    assertEquals(expected, returned)
  }

}
