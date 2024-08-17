package io.github.allangomessl.kotlinwind.css.features.common

import io.github.allangomessl.kotlinwind.css.KW
import io.github.allangomessl.kotlinwind.css.api.Style
import io.github.allangomessl.kotlinwind.css.core.ORDER
import kotlin.test.Test
import kotlin.test.assertEquals

class OrderTest {

  @Test
  fun order() {
    val expected = Style(ORDER, "25").toString()
    val returned = KW.inline { grid.order[25] }
    assertEquals(expected, returned)
  }

  @Test
  fun order_first() {
    val expected = Style(ORDER, "-9999").toString()
    val returned = KW.inline { grid.order_first }
    assertEquals(expected, returned)
  }

  @Test
  fun order_last() {
    val expected = Style(ORDER, "9999").toString()
    val returned = KW.inline { grid.order_last }
    assertEquals(expected, returned)
  }

  @Test
  fun order_none() {
    val expected = Style(ORDER, "0").toString()
    val returned = KW.inline { grid.order_none }
    assertEquals(expected, returned)
  }

  @Test
  fun flex_support() {
    val expected = Style(ORDER, "0").toString()
    val returned = KW.inline { flex.order_none }
    assertEquals(expected, returned)
  }

}
