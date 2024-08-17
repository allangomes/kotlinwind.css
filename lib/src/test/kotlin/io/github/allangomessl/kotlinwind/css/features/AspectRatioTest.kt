package io.github.allangomessl.kotlinwind.css.features

import io.github.allangomessl.kotlinwind.css.KW
import io.github.allangomessl.kotlinwind.css.api.Style
import io.github.allangomessl.kotlinwind.css.core.ASPECT_RATIO
import kotlin.test.Test
import kotlin.test.assertEquals

class AspectRatioTest {

  @Test
  fun aspect_auto() {
    val expected = Style(ASPECT_RATIO, "auto").toString()
    val returned = KW.inline { aspect_auto }
    assertEquals(expected, returned)
  }

  @Test
  fun aspect_square() {
    val expected = Style(ASPECT_RATIO, "1 / 1").toString()
    val returned = KW.inline { aspect_square }
    assertEquals(expected, returned)
  }

  @Test
  fun aspect_4_3() {
    val expected = Style(ASPECT_RATIO, "4 / 3").toString()
    val returned = KW.inline { aspect_4_3 }
    assertEquals(expected, returned)
  }

  @Test
  fun aspect_3_4() {
    val expected = Style(ASPECT_RATIO, "3 / 4").toString()
    val returned = KW.inline { aspect_3_4 }
    assertEquals(expected, returned)
  }

  @Test
  fun aspect_16_9() {
    val expected = Style(ASPECT_RATIO, "16 / 9").toString()
    val returned = KW.inline { aspect_16_9 }
    assertEquals(expected, returned)
  }

  @Test
  fun aspect_9_16() {
    val expected = Style(ASPECT_RATIO, "9 / 16").toString()
    val returned = KW.inline { aspect_9_16 }
    assertEquals(expected, returned)
  }

}
