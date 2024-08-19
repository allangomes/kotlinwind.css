package io.github.allangomes.kotlinwind.css.features

import io.github.allangomes.kotlinwind.css.KW
import io.github.allangomes.kotlinwind.css.api.Style
import io.github.allangomes.kotlinwind.css.core.OBJECT_FIT
import kotlin.test.Test
import kotlin.test.assertEquals

class ObjectFitTest {


  @Test
  fun object_contain() {
    val expected = Style(OBJECT_FIT, "contain").toString()
    val returned = KW.inline { object_contain }
    assertEquals(expected, returned)
  }

  @Test
  fun object_cover() {
    val expected = Style(OBJECT_FIT, "cover").toString()
    val returned = KW.inline { object_cover }
    assertEquals(expected, returned)
  }

  @Test
  fun object_fill() {
    val expected = Style(OBJECT_FIT, "fill").toString()
    val returned = KW.inline { object_fill }
    assertEquals(expected, returned)
  }

  @Test
  fun object_none() {
    val expected = Style(OBJECT_FIT, "none").toString()
    val returned = KW.inline { object_none }
    assertEquals(expected, returned)
  }

  @Test
  fun object_scale_down() {
    val expected = Style(OBJECT_FIT, "scale-down").toString()
    val returned = KW.inline { object_scale_down }
    assertEquals(expected, returned)
  }

}
