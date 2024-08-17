package io.github.allangomessl.kotlinwind.css

import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker
import io.github.allangomessl.kotlinwind.css.core.tokens.Token

@StyleValueMarker
object SANS : Token<SANS>({
  font_family[it] = "ui-sans-serif, system-ui, sans-serif, 'Apple Color Emoji', 'Segoe UI Emoji', 'Segoe UI Symbol', 'Noto Color Emoji'"
}), Token.FontFamily

@StyleValueMarker
object SERIF : Token<SERIF>({
  font_family[it] = "ui-serif, Georgia, Cambria, 'Times New Roman', Times, serif"
}), Token.FontFamily

@StyleValueMarker
object MONO : Token<MONO>({
  font_family[it] = "ui-monospace, SFMono-Regular, Menlo, Monaco, Consolas, 'Liberation Mono', 'Courier New', monospace"
}), Token.FontFamily
