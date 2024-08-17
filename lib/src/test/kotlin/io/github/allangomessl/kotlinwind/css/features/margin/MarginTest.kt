package io.github.allangomessl.kotlinwind.css.features.margin

import io.github.allangomessl.kotlinwind.css.*
import io.github.allangomessl.kotlinwind.css.api.Style
import io.github.allangomessl.kotlinwind.css.core.*
import io.github.allangomessl.kotlinwind.css.core.tokens.Token
import io.github.allangomessl.kotlinwind.css.extensions.inline
import kotlin.test.Test
import kotlin.test.assertEquals

class MarginTest {


  @Test
  fun all() {
    val expected = Style(MARGIN, "2.5rem").toString()
    val returned = KW.inline { margin.all[10f] }
    assertEquals(expected, returned)
  }

  @Test
  fun x() {
    val expected = listOf(
      Style(MARGIN_LEFT, "2.5rem"),
      Style(MARGIN_RIGHT, "2.5rem")
    ).inline()
    val returned = KW.inline { margin.x[10.0f] }
    assertEquals(expected, returned)
  }

  @Test
  fun y() {
    val expected = listOf(
      Style(MARGIN_TOP, "2.5rem"),
      Style(MARGIN_BOTTOM, "2.5rem")
    ).inline()
    val returned = KW.inline { margin.y[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun start() {
    val expected = Style(MARGIN_INLINE_START, "2.5rem").toString()
    val returned = KW.inline { margin.start[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun end() {
    val expected = Style(MARGIN_INLINE_END, "2.5rem").toString()
    val returned = KW.inline { margin.end[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun top() {
    val expected = Style(MARGIN_TOP, "2.5rem").toString()
    val returned = KW.inline { margin.top[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun right() {
    val expected = Style(MARGIN_RIGHT, "2.5rem").toString()
    val returned = KW.inline { margin.right[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun bottom() {
    val expected = Style(MARGIN_BOTTOM, "2.5rem").toString()
    val returned = KW.inline { margin.bottom[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun left() {
    val expected = Style(MARGIN_LEFT, "2.5rem").toString()
    val returned = KW.inline { margin.left[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun left_x() {
    val expected = listOf(
      Style(MARGIN_LEFT, "0.125rem"),
      Style(MARGIN_RIGHT, "0.125rem")
    ).inline()
    val returned = KW.inline { margin.x[XS] }
    assertEquals(expected, returned)
  }

  @Test
  fun xs() {
    val expected = Style(MARGIN, "0.125rem").toString()
    val returned = KW.inline { margin.all[XS] }
    assertEquals(expected, returned)
  }

  @Test
  fun sm() {
    val expected = Style(MARGIN_LEFT, "0.250rem").toString()
    val returned = KW.inline { margin.left[SM] }
    assertEquals(expected, returned)
  }

  @Test
  fun base() {
    val expected = Style(MARGIN_RIGHT, "0.500rem").toString()
    val returned = KW.inline { margin.right[BASE] }
    assertEquals(expected, returned)
  }

  @Test
  fun lg() {
    val expected = listOf(
      Style(MARGIN_LEFT, "1rem"),
      Style(MARGIN_RIGHT, "1rem")
    ).inline()
    val returned = KW.inline { margin.x[LG] }
    assertEquals(expected, returned)
  }

  @Test
  fun xl() {
    val expected = listOf(
      Style(MARGIN_TOP, "1.5rem"),
      Style(MARGIN_BOTTOM, "1.5rem")
    ).inline()
    val returned = KW.inline { margin.y[XL] }
    assertEquals(expected, returned)
  }

  @Test
  fun xl2() {
    val expected = Style(MARGIN_INLINE_START, "2rem").toString()
    val returned = KW.inline { margin.start[XL2] }
    assertEquals(expected, returned)
  }

  @Test
  fun xl3() {
    val expected = Style(MARGIN_INLINE_END, "2.5rem").toString()
    val returned = KW.inline { margin.end[XL3] }
    assertEquals(expected, returned)
  }

  @Test
  fun xl4() {
    val expected = Style(MARGIN_TOP, "3rem").toString()
    val returned = KW.inline { margin.top[XL4] }
    assertEquals(expected, returned)
  }

  @Test
  fun xl5() {
    val expected = Style(MARGIN_BOTTOM, "3.5rem").toString()
    val returned = KW.inline { margin.bottom[XL5] }
    assertEquals(expected, returned)
  }

  @Test
  fun xl6() {
    val expected = Style(MARGIN_RIGHT, "4rem").toString()
    val returned = KW.inline { margin.right[XL6] }
    assertEquals(expected, returned)
  }

  @Test
  fun xl7() {
    val expected = Style(MARGIN_LEFT, "4.5rem").toString()
    val returned = KW.inline { margin.left[XL7] }
    assertEquals(expected, returned)
  }

  @Test
  fun xl8() {
    val expected = Style(MARGIN, "5rem").toString()
    val returned = KW.inline { margin.all[XL8] }
    assertEquals(expected, returned)
  }

  @Test
  fun xl9() {
    val expected = Style(MARGIN, "5.5rem").toString()
    val returned = KW.inline { margin.all[XL9] }
    assertEquals(expected, returned)
  }

  @Test
  fun xl_custom() {
    val obj = object : Token.Margin {}
    val expected = Style(MARGIN, "none").toString()
    val returned = KW.inline { margin.all[obj] }
    assertEquals(expected, returned)
  }

}
