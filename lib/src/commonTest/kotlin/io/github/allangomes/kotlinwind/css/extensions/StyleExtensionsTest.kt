package io.github.allangomes.kotlinwind.css.extensions

import io.github.allangomes.kotlinwind.css.api.Style
import kotlin.test.Test
import kotlin.test.assertEquals

class StyleExtensionsTest {

  @Test
  fun inline() {
    val expected = "key-a: value-a; key-b: value-b"
    val returned = listOf(
      Style("key-a", "value-a"),
      Style("key-b", "value-b")
    ).inline()
    assertEquals(expected, returned)
  }

  @Test
  fun block() {
    val expected = "key-a: value-a;\n  key-b: value-b;"
    val returned = listOf(
      Style("key-a", "value-a"),
      Style("key-b", "value-b")
    ).block()
    assertEquals(expected, returned)
  }


}
