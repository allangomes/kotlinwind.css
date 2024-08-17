package io.github.allangomessl.kotlinwind.css.core.tokens

import io.github.allangomessl.kotlinwind.css.config.Theme

typealias TokenInit<T> = Theme.(T) -> Unit

@Suppress("UNCHECKED_CAST", "LeakingThis")
abstract class Token<T>(init: TokenInit<T>) {
  init {
    Theme.init(this as T)
  }

//  interface BackdropBlur
//  interface Blur
//  interface BorderSize
  interface BorderRadius
//  interface BoxShadow

//  interface Columns
  interface Color


//  interface DropShadow
//
  interface FontFamily
  interface FontSize

  interface LineHeight

//
  interface Margin
//  interface MaxWidth
//  interface MaxWidthScreen
//
  interface Padding
}
