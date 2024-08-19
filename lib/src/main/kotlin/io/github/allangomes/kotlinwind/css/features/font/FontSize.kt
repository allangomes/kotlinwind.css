package io.github.allangomes.kotlinwind.css.features.font

import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.config.Theme
import io.github.allangomes.kotlinwind.css.core.FONT_SIZE
import io.github.allangomes.kotlinwind.css.core.LINE_HEIGHT
import io.github.allangomes.kotlinwind.css.core.StyleValueMarker
import io.github.allangomes.kotlinwind.css.core.WithTokenAndNumber
import io.github.allangomes.kotlinwind.css.core.tokens.Token
import io.github.allangomes.kotlinwind.css.features.commom.Size

interface FontSize<T> : KWScope<T>, Size<T> {

  override val SizeWrap: (Token<*>) -> T get() = {
    FONT_SIZE value (Theme.font_size[it as Token.FontSize] ?: "1rem")
    LINE_HEIGHT value (Theme.line_height[it as Token.LineHeight] ?: "1")
  }


  /**
   * ```
   * font-size: 0.375 + ([number] * 0.125)
   * line-height: 0.375 + ([number] * 0.125)
   * ```
   * - [documentation](https://tailwindcss.com/docs/font-size)
   */
  @StyleValueMarker
  val size: WithTokenAndNumber<T, Token.FontSize> get() = WithTokenAndNumber({
    FONT_SIZE value Theme.font_size[it].toString()
    LINE_HEIGHT value Theme.line_height[it as Token.LineHeight].toString()
  }, {
    val base = 0.375
    val size = base + (it * 0.125)
    FONT_SIZE value "${size}rem"
    LINE_HEIGHT value "${size}rem"
  })

  @StyleValueMarker
  operator fun get(value: Token.FontSize): T {
    return size[value]
  }

  @StyleValueMarker
  operator fun get(value: Float): T {
    return size[value]
  }

  @StyleValueMarker
  operator fun get(value: Int): T {
    return size[value]
  }

}
