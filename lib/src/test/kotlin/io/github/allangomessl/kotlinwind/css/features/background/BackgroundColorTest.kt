package io.github.allangomessl.kotlinwind.css.features.background

import io.github.allangomessl.kotlinwind.css.KW
import io.github.allangomessl.kotlinwind.css.api.Style
import io.github.allangomessl.kotlinwind.css.core.BACKGROUND_COLOR
import kotlin.test.Test
import kotlin.test.assertEquals

class BackgroundColorTest {

  @Test
  fun color_inherit() {
    val expected = Style(BACKGROUND_COLOR, "inherit").toString()
    val returned = KW.inline { background.color_inherit }
    assertEquals(expected, returned)
  }

  @Test
  fun color_current() {
    val expected = Style(BACKGROUND_COLOR, "current").toString()
    val returned = KW.inline { background.color_current }
    assertEquals(expected, returned)
  }

  @Test
  fun transparent() {
    val expected = Style(BACKGROUND_COLOR, "transparent").toString()
    val returned = KW.inline { background.transparent }
    assertEquals(expected, returned)
  }

  @Test
  fun black() {
    val expected = Style(BACKGROUND_COLOR, "#000").toString()
    val returned = KW.inline { background.black }
    assertEquals(expected, returned)
  }

  @Test
  fun custom() {
    val expected = Style(BACKGROUND_COLOR, "#123").toString()
    val returned = KW.inline { background.color["#123"] }
    assertEquals(expected, returned)
  }

}
