package io.github.allangomessl.kotlinwind.css.features.commom

import io.github.allangomessl.kotlinwind.css.*
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker
import io.github.allangomessl.kotlinwind.css.core.tokens.Token

@Suppress("PropertyName", "unused")
interface Size<T> {
  val SizeWrap: (Token<*>) -> T

  @StyleValueMarker
  val xs get() = SizeWrap(XS)

  @StyleValueMarker
  val sm get() = SizeWrap(SM)

  @StyleValueMarker
  val base get() = SizeWrap(BASE)

  @StyleValueMarker
  val lg get() = SizeWrap(LG)

  @StyleValueMarker
  val xl get() = SizeWrap(XL)

  @StyleValueMarker
  val xl2 get() = SizeWrap(XL2)

  @StyleValueMarker
  val xl3 get() = SizeWrap(XL3)

  @StyleValueMarker
  val xl4 get() = SizeWrap(XL4)

  @StyleValueMarker
  val xl5 get() = SizeWrap(XL5)

  @StyleValueMarker
  val xl6 get() = SizeWrap(XL6)

  @StyleValueMarker
  val xl7 get() = SizeWrap(XL7)

  @StyleValueMarker
  val xl8 get() = SizeWrap(XL8)

  @StyleValueMarker
  val xl9 get() = SizeWrap(XL9)

}
