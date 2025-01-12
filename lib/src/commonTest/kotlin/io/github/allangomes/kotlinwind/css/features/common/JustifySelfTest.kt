package io.github.allangomes.kotlinwind.css.features.common

import io.github.allangomes.kotlinwind.css.KW
import io.github.allangomes.kotlinwind.css.api.Style
import io.github.allangomes.kotlinwind.css.core.JUSTIFY_SELF
import kotlin.test.Test
import kotlin.test.assertEquals

class JustifySelfTest {


  @Test
  fun justify_self_auto() {
    val expected = Style(JUSTIFY_SELF, "auto").toString()
    val returned = KW.inline { grid.justify_self_auto }
    assertEquals(expected, returned)
  }

  @Test
  fun justify_self_start() {
    val expected = Style(JUSTIFY_SELF, "start").toString()
    val returned = KW.inline { grid.justify_self_start }
    assertEquals(expected, returned)
  }

  @Test
  fun justify_self_end() {
    val expected = Style(JUSTIFY_SELF, "end").toString()
    val returned = KW.inline { grid.justify_self_end }
    assertEquals(expected, returned)
  }

  @Test
  fun justify_self_center() {
    val expected = Style(JUSTIFY_SELF, "center").toString()
    val returned = KW.inline { grid.justify_self_center }
    assertEquals(expected, returned)
  }

  @Test
  fun justify_self_stretch() {
    val expected = Style(JUSTIFY_SELF, "stretch").toString()
    val returned = KW.inline { grid.justify_self_stretch }
    assertEquals(expected, returned)
  }

}
