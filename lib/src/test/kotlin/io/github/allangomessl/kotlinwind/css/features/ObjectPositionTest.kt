package io.github.allangomessl.kotlinwind.css.features

import io.github.allangomessl.kotlinwind.css.KW
import io.github.allangomessl.kotlinwind.css.api.Style
import io.github.allangomessl.kotlinwind.css.core.OBJECT_POSITION
import kotlin.test.Test
import kotlin.test.assertEquals

class ObjectPositionTest {

  @Test
  fun object_bottom() {
    val expected = Style(OBJECT_POSITION, "bottom").toString()
    val returned = KW.inline { object_bottom }
    assertEquals(expected, returned)
  }

  @Test
  fun object_center() {
    val expected = Style(OBJECT_POSITION, "center").toString()
    val returned = KW.inline { object_center }
    assertEquals(expected, returned)
  }

  @Test
  fun object_left() {
    val expected = Style(OBJECT_POSITION, "left").toString()
    val returned = KW.inline { object_left }
    assertEquals(expected, returned)
  }

  @Test
  fun object_left_bottom() {
    val expected = Style(OBJECT_POSITION, "left bottom").toString()
    val returned = KW.inline { object_left_bottom }
    assertEquals(expected, returned)
  }

  @Test
  fun object_left_top() {
    val expected = Style(OBJECT_POSITION, "left top").toString()
    val returned = KW.inline { object_left_top }
    assertEquals(expected, returned)
  }

  @Test
  fun object_right() {
    val expected = Style(OBJECT_POSITION, "right").toString()
    val returned = KW.inline { object_right }
    assertEquals(expected, returned)
  }

  @Test
  fun object_right_bottom() {
    val expected = Style(OBJECT_POSITION, "right bottom").toString()
    val returned = KW.inline { object_right_bottom }
    assertEquals(expected, returned)
  }

  @Test
  fun object_right_top() {
    val expected = Style(OBJECT_POSITION, "right top").toString()
    val returned = KW.inline { object_right_top }
    assertEquals(expected, returned)
  }

  @Test
  fun object_top() {
    val expected = Style(OBJECT_POSITION, "top").toString()
    val returned = KW.inline { object_top }
    assertEquals(expected, returned)
  }

}
