package io.github.allangomes.kotlinwind.css.features.font

import io.github.allangomes.kotlinwind.css.KW
import kotlin.test.Test
import kotlin.test.assertEquals


class FontTest {

  @Test
  fun empty() {
    val returned = KW.inline { font }
    assertEquals("", returned)
  }

}
