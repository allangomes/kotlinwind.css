@file:Suppress("unused")

package io.github.allangomessl.kotlinwind.css

import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker
import io.github.allangomessl.kotlinwind.css.core.tokens.Token

@StyleValueMarker
object XS : Token<XS>({
  border_radius[it] = "0.125rem"
  font_size[it] = "0.75rem"
  line_height[it] = "1rem"
  margin[it] = "0.125rem"
  padding[it] = "0.125rem"
}), Token.BorderRadius, Token.FontSize, Token.LineHeight, Token.Margin, Token.Padding

@StyleValueMarker
object SM : Token<SM>({
  border_radius[it] = "0.25rem"
  font_size[it] = "0.875rem"
  line_height[it] = "1.25rem"
  margin[it] = "0.250rem"
  padding[it] = "0.250rem"
}), Token.BorderRadius, Token.FontSize, Token.LineHeight, Token.Margin, Token.Padding

@StyleValueMarker
object BASE : Token<BASE>({
  border_radius[it] = "0.375rem"
  font_size[it] = "1rem"
  line_height[it] = "1.5rem"
  margin[it] = "0.500rem"
  padding[it] = "0.500rem"
}), Token.BorderRadius, Token.FontSize, Token.LineHeight, Token.Margin, Token.Padding

@StyleValueMarker
object LG : Token<LG>({
  border_radius[it] = "0.5rem"
  font_size[it] = "1.125rem"
  line_height[it] = "1.75rem"
  margin[it] = "1rem"
  padding[it] = "1rem"
}), Token.BorderRadius, Token.FontSize, Token.LineHeight, Token.Margin, Token.Padding

@StyleValueMarker
object XL : Token<XL>({
  border_radius[it] = "0.75rem"
  font_size[it] = "1.25rem"
  line_height[it] = "1.75rem"
  margin[it] = "1.5rem"
  padding[it] = "1.5rem"
}), Token.BorderRadius, Token.FontSize, Token.LineHeight, Token.Margin, Token.Padding

@StyleValueMarker
object XL2 : Token<XL2>({
  border_radius[it] = "1rem"
  font_size[it] = "1.5rem"
  line_height[it] = "2rem"
  margin[it] = "2rem"
  padding[it] = "2rem"
}), Token.BorderRadius, Token.FontSize, Token.LineHeight, Token.Margin, Token.Padding

@StyleValueMarker
object XL3 : Token<XL3>({
  border_radius[it] = "1.5rem"
  font_size[it] = "1.875rem"
  line_height[it] = "2.25rem"
  margin[it] = "2.5rem"
  padding[it] = "2.5rem"
}), Token.BorderRadius, Token.FontSize, Token.LineHeight, Token.Margin, Token.Padding

@StyleValueMarker
object XL4 : Token<XL4>({
  border_radius[it] = "2rem"
  font_size[it] = "2.25rem"
  line_height[it] = "2.5rem"
  margin[it] = "3rem"
  padding[it] = "3rem"
}), Token.BorderRadius, Token.FontSize, Token.LineHeight, Token.Margin, Token.Padding

@StyleValueMarker
object XL5 : Token<XL5>({
  border_radius[it] = "2.5rem"
  font_size[it] = "3rem"
  line_height[it] = "1"
  margin[it] = "3.5rem"
  padding[it] = "3.5rem"
}), Token.BorderRadius, Token.FontSize, Token.LineHeight, Token.Margin, Token.Padding

@StyleValueMarker
object XL6 : Token<XL6>({
  border_radius[it] = "3rem"
  font_size[it] = "3.75rem"
  line_height[it] = "1"
  margin[it] = "4rem"
  padding[it] = "4rem"
}), Token.BorderRadius, Token.FontSize, Token.LineHeight, Token.Margin, Token.Padding

@StyleValueMarker
object XL7 : Token<XL7>({
  border_radius[it] = "3.5rem"
  font_size[it] = "4.5rem"
  line_height[it] = "1"
  margin[it] = "4.5rem"
  padding[it] = "4.5rem"
}), Token.BorderRadius, Token.FontSize, Token.LineHeight, Token.Margin, Token.Padding

@StyleValueMarker
object XL8 : Token<XL8>({
  border_radius[it] = "4rem"
  font_size[it] = "6rem"
  line_height[it] = "1"
  margin[it] = "5rem"
  padding[it] = "5rem"
}), Token.BorderRadius, Token.FontSize, Token.LineHeight, Token.Margin, Token.Padding

@StyleValueMarker
object XL9 : Token<XL9>({
  border_radius[it] = "5rem"
  font_size[it] = "8rem"
  line_height[it] = "1"
  margin[it] = "5.5rem"
  padding[it] = "5.5rem"
}), Token.BorderRadius, Token.FontSize, Token.LineHeight, Token.Margin, Token.Padding

@StyleValueMarker
object FULL : Token<FULL>({
  border_radius[it] = "9999px"
}), Token.BorderRadius
