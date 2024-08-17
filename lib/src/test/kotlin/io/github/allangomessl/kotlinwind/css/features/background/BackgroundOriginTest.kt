package io.github.allangomessl.kotlinwind.css.features.background

import io.github.allangomessl.kotlinwind.css.KW
import io.github.allangomessl.kotlinwind.css.api.Style
import io.github.allangomessl.kotlinwind.css.core.BACKGROUND_ORIGIN
import kotlin.test.Test
import kotlin.test.assertEquals

class BackgroundOriginTest {

  @Test
  fun origin_border() {
    val expected = Style(BACKGROUND_ORIGIN, "border-box").toString()
    val returned = KW.inline { background.origin_border }
    assertEquals(expected, returned)
  }

  @Test
  fun origin_padding() {
    val expected = Style(BACKGROUND_ORIGIN, "padding-box").toString()
    val returned = KW.inline { background.origin_padding }
    assertEquals(expected, returned)
  }

  @Test
  fun origin_content() {
    val expected = Style(BACKGROUND_ORIGIN, "content-box").toString()
    val returned = KW.inline { background.origin_content }
    assertEquals(expected, returned)
  }

}
