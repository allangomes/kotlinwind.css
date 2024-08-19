package io.github.allangomes.kotlinwind.css.features.sizing

import io.github.allangomes.kotlinwind.css.KW
import io.github.allangomes.kotlinwind.css.api.Style
import io.github.allangomes.kotlinwind.css.core.*
import io.github.allangomes.kotlinwind.css.extensions.inline
import kotlin.test.Test
import kotlin.test.assertEquals

class SizeTest {

  @Test
  fun size() {
    val expected = listOf(
      Style(HEIGHT, "2.5rem"),
      Style(WIDTH, "2.5rem")
    ).inline()
    val returned = KW.inline { size[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun size_px() {
    val expected = listOf(
      Style(HEIGHT, "25px"),
      Style(WIDTH, "25px")
    ).inline()
    val returned = KW.inline { size["25px"] }
    assertEquals(expected, returned)
  }

  @Test
  fun max_size() {
    val expected = listOf(
      Style(MAX_HEIGHT, "2.5rem"),
      Style(MAX_WIDTH, "2.5rem")
    ).inline()
    val returned = KW.inline { max_size[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun max_size_px() {
    val expected = listOf(
      Style(MAX_HEIGHT, "25px"),
      Style(MAX_WIDTH, "25px")
    ).inline()
    val returned = KW.inline { max_size["25px"] }
    assertEquals(expected, returned)
  }

  @Test
  fun min_size() {
    val expected = listOf(
      Style(MIN_HEIGHT, "2.5rem"),
      Style(MIN_WIDTH, "2.5rem")
    ).inline()
    val returned = KW.inline { min_size[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun min_size_px() {
    val expected = listOf(
      Style(MIN_HEIGHT, "25px"),
      Style(MIN_WIDTH, "25px")
    ).inline()
    val returned = KW.inline { min_size["25px"] }
    assertEquals(expected, returned)
  }

}
