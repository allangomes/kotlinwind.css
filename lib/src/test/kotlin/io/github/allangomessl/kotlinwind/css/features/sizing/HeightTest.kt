package io.github.allangomessl.kotlinwind.css.features.sizing

import io.github.allangomessl.kotlinwind.css.KW
import io.github.allangomessl.kotlinwind.css.api.Style
import io.github.allangomessl.kotlinwind.css.core.HEIGHT
import io.github.allangomessl.kotlinwind.css.core.MAX_HEIGHT
import io.github.allangomessl.kotlinwind.css.core.MIN_HEIGHT
import kotlin.test.Test
import kotlin.test.assertEquals

class HeightTest {

  @Test
  fun height() {
    val expected = Style(HEIGHT, "2.5rem").toString()
    val returned = KW.inline { height[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun height_px() {
    val expected = Style(HEIGHT, "25px").toString()
    val returned = KW.inline { height["25px"] }
    assertEquals(expected, returned)
  }

  @Test
  fun max_height() {
    val expected = Style(MAX_HEIGHT, "2.5rem").toString()
    val returned = KW.inline { max_height[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun max_height_px() {
    val expected = Style(MAX_HEIGHT, "25px").toString()
    val returned = KW.inline { max_height["25px"] }
    assertEquals(expected, returned)
  }

  @Test
  fun min_height() {
    val expected = Style(MIN_HEIGHT, "2.5rem").toString()
    val returned = KW.inline { min_height[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun min_height_px() {
    val expected = Style(MIN_HEIGHT, "25px").toString()
    val returned = KW.inline { min_height["25px"] }
    assertEquals(expected, returned)
  }

}
