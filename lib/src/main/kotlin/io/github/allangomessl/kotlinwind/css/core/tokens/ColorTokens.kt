package io.github.allangomessl.kotlinwind.css.core.tokens

import io.github.allangomessl.kotlinwind.css.*
import io.github.allangomessl.kotlinwind.css.config.Theme
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker
import io.github.allangomessl.kotlinwind.css.core.tokens.Token.Color

@Suppress("LeakingThis")
abstract class ColorTokens(init: TokenInit<ColorTokens>): Color {

  @StyleValueMarker
  val I50  = object : Color {}
  @StyleValueMarker
  val I100 = object : Color {}
  @StyleValueMarker
  val I200 = object : Color {}
  @StyleValueMarker
  val I300 = object : Color {}
  @StyleValueMarker
  val I400 = object : Color {}
  @StyleValueMarker
  val I500 = object : Color {}
  @StyleValueMarker
  val I600 = object : Color {}
  @StyleValueMarker
  val I700 = object : Color {}
  @StyleValueMarker
  val I800 = object : Color {}
  @StyleValueMarker
  val I900 = object : Color {}
  @StyleValueMarker
  val I950 = object : Color {}

  operator fun get(index: ColorIndex) = when(index) {
    is I50 -> I50
    is I100 -> I100
    is I200 -> I200
    is I300 -> I300
    is I400 -> I400
    is I500 -> I500
    is I600 -> I600
    is I700 -> I700
    is I800 -> I800
    is I900 -> I900
    is I950 -> I950
  }

  init {
    Theme.init(this)
  }
}
