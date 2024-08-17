package io.github.allangomessl.kotlinwind.css.config

import io.github.allangomessl.kotlinwind.css.RED
import kotlin.test.Test
import kotlin.test.assertEquals

class ColorsTest {

  @Test
  fun `Change color`() {
    val expected = "RED_ALTER"
    Theme.color[RED.I50] = expected
    assertEquals(expected, Theme.color[RED.I50])
  }

}
