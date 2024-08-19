package io.github.allangomes.kotlinwind.css.features.common

import io.github.allangomes.kotlinwind.css.KW
import io.github.allangomes.kotlinwind.css.api.Style
import io.github.allangomes.kotlinwind.css.core.ALIGN_ITEMS
import kotlin.test.Test
import kotlin.test.assertEquals

class AlignItemsTest {


  @Test
  fun items_start() {
    val expected = Style(ALIGN_ITEMS, "flex-start").toString()
    val returned = KW.inline { grid.items_start }
    assertEquals(expected, returned)
  }

  @Test
  fun items_end() {
    val expected = Style(ALIGN_ITEMS, "flex-end").toString()
    val returned = KW.inline { grid.items_end }
    assertEquals(expected, returned)
  }

  @Test
  fun items_center() {
    val expected = Style(ALIGN_ITEMS, "center").toString()
    val returned = KW.inline { grid.items_center }
    assertEquals(expected, returned)
  }

  @Test
  fun items_baseline() {
    val expected = Style(ALIGN_ITEMS, "baseline").toString()
    val returned = KW.inline { grid.items_baseline }
    assertEquals(expected, returned)
  }

  @Test
  fun items_stretch() {
    val expected = Style(ALIGN_ITEMS, "stretch").toString()
    val returned = KW.inline { grid.items_stretch }
    assertEquals(expected, returned)
  }

  @Test
  fun flex_support() {
    val expected = Style(ALIGN_ITEMS, "stretch").toString()
    val returned = KW.inline { flex.items_stretch }
    assertEquals(expected, returned)
  }

}
