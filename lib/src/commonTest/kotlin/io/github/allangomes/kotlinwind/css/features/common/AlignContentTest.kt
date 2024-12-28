package io.github.allangomes.kotlinwind.css.features.common

import io.github.allangomes.kotlinwind.css.KW
import io.github.allangomes.kotlinwind.css.api.Style
import io.github.allangomes.kotlinwind.css.core.ALIGN_CONTENT
import kotlin.test.Test
import kotlin.test.assertEquals

class AlignContentTest {

  @Test
  fun content_normal() {
    val expected = Style(ALIGN_CONTENT, "normal").toString()
    val returned = KW.inline { grid.content_normal }
    assertEquals(expected, returned)
  }

  @Test
  fun content_center() {
    val expected = Style(ALIGN_CONTENT, "center").toString()
    val returned = KW.inline { grid.content_center }
    assertEquals(expected, returned)
  }

  @Test
  fun content_start() {
    val expected = Style(ALIGN_CONTENT, "flex-start").toString()
    val returned = KW.inline { grid.content_start }
    assertEquals(expected, returned)
  }

  @Test
  fun content_end() {
    val expected = Style(ALIGN_CONTENT, "flex-end").toString()
    val returned = KW.inline { grid.content_end }
    assertEquals(expected, returned)
  }

  @Test
  fun content_between() {
    val expected = Style(ALIGN_CONTENT, "space-between").toString()
    val returned = KW.inline { grid.content_between }
    assertEquals(expected, returned)
  }

  @Test
  fun content_around() {
    val expected = Style(ALIGN_CONTENT, "space-around").toString()
    val returned = KW.inline { grid.content_around }
    assertEquals(expected, returned)
  }

  @Test
  fun content_evenly() {
    val expected = Style(ALIGN_CONTENT, "space-evenly").toString()
    val returned = KW.inline { grid.content_evenly }
    assertEquals(expected, returned)
  }

  @Test
  fun content_baseline() {
    val expected = Style(ALIGN_CONTENT, "baseline").toString()
    val returned = KW.inline { grid.content_baseline }
    assertEquals(expected, returned)
  }

  @Test
  fun content_stretch() {
    val expected = Style(ALIGN_CONTENT, "stretch").toString()
    val returned = KW.inline { grid.content_stretch }
    assertEquals(expected, returned)
  }


}
