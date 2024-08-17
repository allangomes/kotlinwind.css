package io.github.allangomessl.kotlinwind.css.features.background

import io.github.allangomessl.kotlinwind.css.KW
import io.github.allangomessl.kotlinwind.css.api.Style
import io.github.allangomessl.kotlinwind.css.core.BACKGROUND_REPEAT
import kotlin.test.Test
import kotlin.test.assertEquals

class BackgroundRepeatTest {


  @Test
  fun repeat() {
    val expected = Style(BACKGROUND_REPEAT, "repeat").toString()
    val returned = KW.inline { background.repeat }
    assertEquals(expected, returned)
  }

  @Test
  fun no_repeat() {
    val expected = Style(BACKGROUND_REPEAT, "no-repeat").toString()
    val returned = KW.inline { background.no_repeat }
    assertEquals(expected, returned)
  }

  @Test
  fun repeat_x() {
    val expected = Style(BACKGROUND_REPEAT, "repeat-x").toString()
    val returned = KW.inline { background.repeat_x }
    assertEquals(expected, returned)
  }

  @Test
  fun repeat_y() {
    val expected = Style(BACKGROUND_REPEAT, "repeat-y").toString()
    val returned = KW.inline { background.repeat_y }
    assertEquals(expected, returned)
  }

  @Test
  fun repeat_round() {
    val expected = Style(BACKGROUND_REPEAT, "round").toString()
    val returned = KW.inline { background.repeat_round }
    assertEquals(expected, returned)
  }

  @Test
  fun repeat_space() {
    val expected = Style(BACKGROUND_REPEAT, "space").toString()
    val returned = KW.inline { background.repeat_space }
    assertEquals(expected, returned)
  }

}
