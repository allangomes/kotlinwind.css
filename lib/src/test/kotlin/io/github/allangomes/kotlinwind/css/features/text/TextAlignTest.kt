package io.github.allangomes.kotlinwind.css.features.text

import io.github.allangomes.kotlinwind.css.KW
import io.github.allangomes.kotlinwind.css.api.Style
import io.github.allangomes.kotlinwind.css.core.TEXT_ALIGN
import kotlin.test.Test
import kotlin.test.assertEquals

class TextAlignTest {


  @Test
  fun left() {
    val expected = Style(TEXT_ALIGN, "left").toString()
    val returned = KW.inline { text.left }
    assertEquals(expected, returned)
  }

  @Test
  fun center() {
    val expected = Style(TEXT_ALIGN, "center").toString()
    val returned = KW.inline { text.center }
    assertEquals(expected, returned)
  }

  @Test
  fun right() {
    val expected = Style(TEXT_ALIGN, "right").toString()
    val returned = KW.inline { text.right }
    assertEquals(expected, returned)
  }

  @Test
  fun justify() {
    val expected = Style(TEXT_ALIGN, "justify").toString()
    val returned = KW.inline { text.justify }
    assertEquals(expected, returned)
  }

  @Test
  fun start() {
    val expected = Style(TEXT_ALIGN, "start").toString()
    val returned = KW.inline { text.start }
    assertEquals(expected, returned)
  }

  @Test
  fun end() {
    val expected = Style(TEXT_ALIGN, "end").toString()
    val returned = KW.inline { text.end }
    assertEquals(expected, returned)
  }

}
