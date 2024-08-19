package io.github.allangomes.kotlinwind.css.config

import io.github.allangomes.kotlinwind.css.core.tokens.Token

object Theme {

  val border_radius: MutableMap<Token.BorderRadius, String> = mutableMapOf()
//  val box_shadow: MutableMap<Token.BoxShadow, String> = mutableMapOf()

  val color: MutableMap<Token.Color, String> = mutableMapOf()

  val font_family: MutableMap<Token.FontFamily, String> = mutableMapOf()
  val font_size: MutableMap<Token.FontSize, String> = mutableMapOf()

  val line_height: MutableMap<Token.LineHeight, String> = mutableMapOf()

  val margin: MutableMap<Token.Margin, String> = mutableMapOf()

  val padding: MutableMap<Token.Padding, String> = mutableMapOf()
}
