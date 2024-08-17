package io.github.allangomessl.kotlinwind.css.features.sizing

import io.github.allangomessl.kotlinwind.css.KW
import io.github.allangomessl.kotlinwind.css.api.Style
import io.github.allangomessl.kotlinwind.css.core.MAX_WIDTH
import io.github.allangomessl.kotlinwind.css.core.MIN_WIDTH
import io.github.allangomessl.kotlinwind.css.core.WIDTH
import kotlin.test.Test
import kotlin.test.assertEquals

class WidthTest {

  @Test
  fun width() {
    val expected = Style(WIDTH, "2.5rem").toString()
    val returned = KW.inline { width[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun width_px() {
    val expected = Style(WIDTH, "25px").toString()
    val returned = KW.inline { width["25px"] }
    assertEquals(expected, returned)
  }

  @Test
  fun max_width() {
    val expected = Style(MAX_WIDTH, "2.5rem").toString()
    val returned = KW.inline { max_width[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun max_width_px() {
    val expected = Style(MAX_WIDTH, "25px").toString()
    val returned = KW.inline { max_width["25px"] }
    assertEquals(expected, returned)
  }

  @Test
  fun min_width() {
    val expected = Style(MIN_WIDTH, "2.5rem").toString()
    val returned = KW.inline { min_width[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun min_width_px() {
    val expected = Style(MIN_WIDTH, "25px").toString()
    val returned = KW.inline { min_width["25px"] }
    assertEquals(expected, returned)
  }

}
