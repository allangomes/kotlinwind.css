package io.github.allangomes.kotlinwind.css.features.background

import io.github.allangomes.kotlinwind.css.KW
import io.github.allangomes.kotlinwind.css.api.Style
import io.github.allangomes.kotlinwind.css.core.BACKGROUND_SIZE
import kotlin.test.Test
import kotlin.test.assertEquals

class BackgroundSizeTest {

  @Test
  fun auto() {
    val expected = Style(BACKGROUND_SIZE, "auto").toString()
    val returned = KW.inline { background.auto }
    assertEquals(expected, returned)
  }

  @Test
  fun cover() {
    val expected = Style(BACKGROUND_SIZE, "cover").toString()
    val returned = KW.inline { background.cover }
    assertEquals(expected, returned)
  }

  @Test
  fun contain() {
    val expected = Style(BACKGROUND_SIZE, "contain").toString()
    val returned = KW.inline { background.contain }
    assertEquals(expected, returned)
  }

}
