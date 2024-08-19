package io.github.allangomes.kotlinwind.css.features.common

import io.github.allangomes.kotlinwind.css.KW
import io.github.allangomes.kotlinwind.css.api.Style
import io.github.allangomes.kotlinwind.css.core.JUSTIFY_CONTENT
import kotlin.test.Test
import kotlin.test.assertEquals

class JustifyContentTest {

  @Test
  fun justify_normal() {
    val expected = Style(JUSTIFY_CONTENT,"normal").toString()
    val returned = KW.inline { grid.justify_normal }
    assertEquals(expected, returned)
  }

  @Test
  fun justify_start() {
    val expected = Style(JUSTIFY_CONTENT,"flex-start").toString()
    val returned = KW.inline { grid.justify_start }
    assertEquals(expected, returned)
  }

  @Test
  fun justify_end() {
    val expected = Style(JUSTIFY_CONTENT,"flex-end").toString()
    val returned = KW.inline { grid.justify_end }
    assertEquals(expected, returned)
  }

  @Test
  fun justify_center() {
    val expected = Style(JUSTIFY_CONTENT,"center").toString()
    val returned = KW.inline { grid.justify_center }
    assertEquals(expected, returned)
  }

  @Test
  fun justify_between() {
    val expected = Style(JUSTIFY_CONTENT,"space-between").toString()
    val returned = KW.inline { grid.justify_between }
    assertEquals(expected, returned)
  }

  @Test
  fun justify_around() {
    val expected = Style(JUSTIFY_CONTENT,"space-around").toString()
    val returned = KW.inline { grid.justify_around }
    assertEquals(expected, returned)
  }

  @Test
  fun justify_evenly() {
    val expected = Style(JUSTIFY_CONTENT,"space-evenly").toString()
    val returned = KW.inline { grid.justify_evenly }
    assertEquals(expected, returned)
  }

  @Test
  fun justify_stretch() {
    val expected = Style(JUSTIFY_CONTENT,"stretch").toString()
    val returned = KW.inline { grid.justify_stretch }
    assertEquals(expected, returned)
  }

  @Test
  fun flex_support() {
    val expected = Style(JUSTIFY_CONTENT,"normal").toString()
    val returned = KW.inline { flex.justify_normal }
    assertEquals(expected, returned)
  }

}
