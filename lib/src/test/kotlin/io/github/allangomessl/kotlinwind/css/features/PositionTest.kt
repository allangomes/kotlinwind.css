package io.github.allangomessl.kotlinwind.css.features

import io.github.allangomessl.kotlinwind.css.KW
import io.github.allangomessl.kotlinwind.css.api.Style
import io.github.allangomessl.kotlinwind.css.core.POSITION
import kotlin.test.Test
import kotlin.test.assertEquals

class PositionTest {


  @Test
  fun static() {
    val expected = Style(POSITION,"static").toString()
    val returned = KW.inline { static }
    assertEquals(expected, returned)
  }

  @Test
  fun fixed() {
    val expected = Style(POSITION,"fixed").toString()
    val returned = KW.inline { fixed }
    assertEquals(expected, returned)
  }

  @Test
  fun absolute() {
    val expected = Style(POSITION,"absolute").toString()
    val returned = KW.inline { absolute }
    assertEquals(expected, returned)
  }

  @Test
  fun relative() {
    val expected = Style(POSITION,"relative").toString()
    val returned = KW.inline { relative }
    assertEquals(expected, returned)
  }

  @Test
  fun sticky() {
    val expected = Style(POSITION,"sticky").toString()
    val returned = KW.inline { sticky }
    assertEquals(expected, returned)
  }

}
