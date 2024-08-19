package io.github.allangomes.kotlinwind.css.features.padding

import io.github.allangomes.kotlinwind.css.*
import io.github.allangomes.kotlinwind.css.api.Style
import io.github.allangomes.kotlinwind.css.core.*
import io.github.allangomes.kotlinwind.css.core.tokens.Token
import io.github.allangomes.kotlinwind.css.extensions.inline
import kotlin.test.Test
import kotlin.test.assertEquals


class PaddingTest {


  @Test
  fun all() {
    val expected = Style(PADDING, "2.5rem").toString()
    val returned = KW.inline { padding.all[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun x() {
    val expected = listOf(
      Style(PADDING_LEFT, "2.5rem"),
      Style(PADDING_RIGHT, "2.5rem")
    ).inline()
    val returned = KW.inline { padding.x[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun y() {
    val expected = listOf(
      Style(PADDING_TOP, "2.5rem"),
      Style(PADDING_BOTTOM, "2.5rem")
    ).inline()
    val returned = KW.inline { padding.y[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun start() {
    val expected = Style(PADDING_INLINE_START, "2.5rem").toString()
    val returned = KW.inline { padding.start[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun end() {
    val expected = Style(PADDING_INLINE_END, "2.5rem").toString()
    val returned = KW.inline { padding.end[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun top() {
    val expected = Style(PADDING_TOP, "2.5rem").toString()
    val returned = KW.inline { padding.top[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun right() {
    val expected = Style(PADDING_RIGHT, "2.5rem").toString()
    val returned = KW.inline { padding.right[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun bottom() {
    val expected = Style(PADDING_BOTTOM, "2.5rem").toString()
    val returned = KW.inline { padding.bottom[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun left() {
    val expected = Style(PADDING_LEFT, "2.5rem").toString()
    val returned = KW.inline { padding.left[10] }
    assertEquals(expected, returned)
  }

  @Test
  fun xs() {
    val expected = Style(PADDING, "0.125rem").toString()
    val returned = KW.inline { padding.all[XS] }
    assertEquals(expected, returned)
  }

  @Test
  fun sm() {
    val expected = Style(PADDING_LEFT, "0.250rem").toString()
    val returned = KW.inline { padding.left[SM] }
    assertEquals(expected, returned)
  }

  @Test
  fun base() {
    val expected = Style(PADDING_RIGHT, "0.500rem").toString()
    val returned = KW.inline { padding.right[BASE] }
    assertEquals(expected, returned)
  }

  @Test
  fun lg() {
    val expected = listOf(
      Style(PADDING_LEFT, "1rem"),
      Style(PADDING_RIGHT, "1rem")
    ).inline()
    val returned = KW.inline { padding.x[LG] }
    assertEquals(expected, returned)
  }

  @Test
  fun xl() {
    val expected = listOf(
      Style(PADDING_TOP, "1.5rem"),
      Style(PADDING_BOTTOM, "1.5rem")
    ).inline()
    val returned = KW.inline { padding.y[XL] }
    assertEquals(expected, returned)
  }

  @Test
  fun xl2() {
    val expected = Style(PADDING_INLINE_START, "2rem").toString()
    val returned = KW.inline { padding.start[XL2] }
    assertEquals(expected, returned)
  }

  @Test
  fun xl3() {
    val expected = Style(PADDING_INLINE_END, "2.5rem").toString()
    val returned = KW.inline { padding.end[XL3] }
    assertEquals(expected, returned)
  }

  @Test
  fun xl4() {
    val expected = Style(PADDING_TOP, "3rem").toString()
    val returned = KW.inline { padding.top[XL4] }
    assertEquals(expected, returned)
  }

  @Test
  fun xl5() {
    val expected = Style(PADDING_BOTTOM, "3.5rem").toString()
    val returned = KW.inline { padding.bottom[XL5] }
    assertEquals(expected, returned)
  }

  @Test
  fun xl6() {
    val expected = Style(PADDING_RIGHT, "4rem").toString()
    val returned = KW.inline { padding.right[XL6] }
    assertEquals(expected, returned)
  }

  @Test
  fun xl7() {
    val expected = Style(PADDING_LEFT, "4.5rem").toString()
    val returned = KW.inline { padding.left[XL7] }
    assertEquals(expected, returned)
  }

  @Test
  fun xl8() {
    val expected = Style(PADDING, "5rem").toString()
    val returned = KW.inline { padding.all[XL8] }
    assertEquals(expected, returned)
  }

  @Test
  fun xl9() {
    val expected = Style(PADDING, "5.5rem").toString()
    val returned = KW.inline { padding.all[XL9] }
    assertEquals(expected, returned)
  }

  @Test
  fun xl_custom() {
    val obj = object : Token.Padding {}
    val expected = Style(PADDING, "none").toString()
    val returned = KW.inline { padding.all[obj] }
    assertEquals(expected, returned)
  }

}
