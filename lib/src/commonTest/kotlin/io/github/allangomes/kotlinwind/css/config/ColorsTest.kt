package io.github.allangomes.kotlinwind.css.config

import io.github.allangomes.kotlinwind.css.RED
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
