package io.github.allangomes.kotlinwind.css.features.background

import io.github.allangomes.kotlinwind.css.KW
import io.github.allangomes.kotlinwind.css.api.Style
import io.github.allangomes.kotlinwind.css.core.BACKGROUND_POSITION
import kotlin.test.Test
import kotlin.test.assertEquals

class BackgroundPositionTest {


  @Test
  fun bottom() {
    val expected = Style(BACKGROUND_POSITION, "bottom").toString()
    val returned = KW.inline { background.bottom }
    assertEquals(expected, returned)
  }

  @Test
  fun center() {
    val expected = Style(BACKGROUND_POSITION, "center").toString()
    val returned = KW.inline { background.center }
    assertEquals(expected, returned)
  }

  @Test
  fun left() {
    val expected = Style(BACKGROUND_POSITION, "left").toString()
    val returned = KW.inline { background.left }
    assertEquals(expected, returned)
  }

  @Test
  fun left_bottom() {
    val expected = Style(BACKGROUND_POSITION, "left bottom").toString()
    val returned = KW.inline { background.left_bottom }
    assertEquals(expected, returned)
  }

  @Test
  fun left_top() {
    val expected = Style(BACKGROUND_POSITION, "left top").toString()
    val returned = KW.inline { background.left_top }
    assertEquals(expected, returned)
  }

  @Test
  fun right() {
    val expected = Style(BACKGROUND_POSITION, "right").toString()
    val returned = KW.inline { background.right }
    assertEquals(expected, returned)
  }

  @Test
  fun right_bottom() {
    val expected = Style(BACKGROUND_POSITION, "right bottom").toString()
    val returned = KW.inline { background.right_bottom }
    assertEquals(expected, returned)
  }

  @Test
  fun right_top() {
    val expected = Style(BACKGROUND_POSITION, "right top").toString()
    val returned = KW.inline { background.right_top }
    assertEquals(expected, returned)
  }

  @Test
  fun top() {
    val expected = Style(BACKGROUND_POSITION, "top").toString()
    val returned = KW.inline { background.top }
    assertEquals(expected, returned)
  }

}
