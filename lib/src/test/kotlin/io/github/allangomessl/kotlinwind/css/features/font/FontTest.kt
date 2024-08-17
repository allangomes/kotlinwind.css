package io.github.allangomessl.kotlinwind.css.features.font

import io.github.allangomessl.kotlinwind.css.KW
import kotlin.test.Test
import kotlin.test.assertEquals


class FontTest {

  @Test
  fun empty() {
    val returned = KW.inline { font }
    assertEquals("", returned)
  }

}
