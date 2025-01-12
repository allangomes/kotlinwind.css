package io.github.allangomes.kotlinwind.css.features.flex

import io.github.allangomes.kotlinwind.css.KW
import io.github.allangomes.kotlinwind.css.api.Style
import io.github.allangomes.kotlinwind.css.core.FLEX_SHRINK
import kotlin.test.Test
import kotlin.test.assertEquals

class FlexShrinkTest {

  @Test
  fun shrink() {
    val expected: String = Style(FLEX_SHRINK, "1").toString()
    val returned = KW.inline { flex.shrink }
    assertEquals(expected, returned)
  }

  @Test
  fun shrink_0() {
    val expected: String = Style(FLEX_SHRINK, "0").toString()
    val returned = KW.inline { flex.shrink_0 }
    assertEquals(expected, returned)
  }

}
