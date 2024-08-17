package io.github.allangomessl.kotlinwind.css.features.common

import io.github.allangomessl.kotlinwind.css.KW
import io.github.allangomessl.kotlinwind.css.api.Style
import io.github.allangomessl.kotlinwind.css.core.JUSTIFY_CONTENT
import kotlin.test.Test
import kotlin.test.assertEquals

class JustifyContentTest {

  @Test
  fun justify_normal() {
    val expected = Style(JUSTIFY_CONTENT,"justify-normal").toString()
    val returned = KW.inline { grid.justify_normal }
    assertEquals(expected, returned)
  }

  @Test
  fun justify_start() {
    val expected = Style(JUSTIFY_CONTENT,"justify-start").toString()
    val returned = KW.inline { grid.justify_start }
    assertEquals(expected, returned)
  }

  @Test
  fun justify_end() {
    val expected = Style(JUSTIFY_CONTENT,"justify-end").toString()
    val returned = KW.inline { grid.justify_end }
    assertEquals(expected, returned)
  }

  @Test
  fun justify_center() {
    val expected = Style(JUSTIFY_CONTENT,"justify-center").toString()
    val returned = KW.inline { grid.justify_center }
    assertEquals(expected, returned)
  }

  @Test
  fun justify_between() {
    val expected = Style(JUSTIFY_CONTENT,"justify-between").toString()
    val returned = KW.inline { grid.justify_between }
    assertEquals(expected, returned)
  }

  @Test
  fun justify_around() {
    val expected = Style(JUSTIFY_CONTENT,"justify-around").toString()
    val returned = KW.inline { grid.justify_around }
    assertEquals(expected, returned)
  }

  @Test
  fun justify_evenly() {
    val expected = Style(JUSTIFY_CONTENT,"justify-evenly").toString()
    val returned = KW.inline { grid.justify_evenly }
    assertEquals(expected, returned)
  }

  @Test
  fun justify_stretch() {
    val expected = Style(JUSTIFY_CONTENT,"justify-stretch").toString()
    val returned = KW.inline { grid.justify_stretch }
    assertEquals(expected, returned)
  }

  @Test
  fun flex_support() {
    val expected = Style(JUSTIFY_CONTENT,"justify-normal").toString()
    val returned = KW.inline { flex.justify_normal }
    assertEquals(expected, returned)
  }

}
