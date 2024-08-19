package io.github.allangomes.kotlinwind.css.features.common

import io.github.allangomes.kotlinwind.css.KW
import io.github.allangomes.kotlinwind.css.api.Style
import io.github.allangomes.kotlinwind.css.core.JUSTIFY_ITEMS
import kotlin.test.Test
import kotlin.test.assertEquals

class JustifyItemsTest {

  @Test
  fun justify_items_start() {
    val expected = Style(JUSTIFY_ITEMS, "start").toString()
    val returned = KW.inline { grid.justify_items_start }
    assertEquals(expected, returned)
  }

  @Test
  fun justify_items_end() {
    val expected = Style(JUSTIFY_ITEMS, "end").toString()
    val returned = KW.inline { grid.justify_items_end }
    assertEquals(expected, returned, )
  }

  @Test
  fun justify_items_center() {
    val expected = Style(JUSTIFY_ITEMS, "center").toString()
    val returned = KW.inline { grid.justify_items_center }
    assertEquals(expected, returned, )
  }

  @Test
  fun justify_items_stretch() {
    val expected = Style(JUSTIFY_ITEMS, "stretch").toString()
    val returned = KW.inline { grid.justify_items_stretch }
    assertEquals(expected, returned, )
  }

}
