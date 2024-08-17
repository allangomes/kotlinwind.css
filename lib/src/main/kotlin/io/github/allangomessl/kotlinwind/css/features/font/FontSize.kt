package io.github.allangomessl.kotlinwind.css.features.font

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.config.Theme
import io.github.allangomessl.kotlinwind.css.core.FONT_SIZE
import io.github.allangomessl.kotlinwind.css.core.LINE_HEIGHT
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker
import io.github.allangomessl.kotlinwind.css.core.WithFloatAndInt
import io.github.allangomessl.kotlinwind.css.core.tokens.Token
import io.github.allangomessl.kotlinwind.css.features.commom.Size

interface FontSize<T> : KWScope<T>, Size<T> {

  override val SizeWrap: (Token<*>) -> T get() = {
    FONT_SIZE value (Theme.font_size[it as Token.FontSize] ?: "1rem")
    LINE_HEIGHT value (Theme.line_height[it as Token.LineHeight] ?: "1")
  }

  @StyleValueMarker
  /**
   * ```
   * font-size: 0.375 + ([number] * 0.125)
   * line-height: 0.375 + ([number] * 0.125)
   * ```
   * - [documentation](https://tailwindcss.com/docs/font-size)
   */
  val size get() = WithFloatAndInt {
    val base = 0.375
    val size = base + (it * 0.125)
    FONT_SIZE value "${size}rem"
    LINE_HEIGHT value "${size}rem"
  }

}
