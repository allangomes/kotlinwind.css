package io.github.allangomessl.kotlinwind.css.features.decoration

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker
import io.github.allangomessl.kotlinwind.css.core.TEXT_DECORATION_THICKNESS
import io.github.allangomessl.kotlinwind.css.core.WithTokenAndInt

@Suppress("PropertyName")
interface TextDecorationThickness<T> : KWScope<T> {

  @StyleValueMarker
  val size: WithTokenAndInt<T, String> get() = WithTokenAndInt({
    TEXT_DECORATION_THICKNESS value it
  }, {
    TEXT_DECORATION_THICKNESS value "${it}px"
  })

  /** text-decoration-thickness: auto; */
  @StyleValueMarker
  val auto get() = TEXT_DECORATION_THICKNESS value "auto"
  /** text-decoration-thickness: from-font; */
  @StyleValueMarker
  val from_font get() = TEXT_DECORATION_THICKNESS value "from-font"
  /** text-decoration-thickness: 0px; */
  @StyleValueMarker
  val size_0 get() = TEXT_DECORATION_THICKNESS value "0px"
  /** text-decoration-thickness: 1px; */
  @StyleValueMarker
  val size_1 get() = TEXT_DECORATION_THICKNESS value "1px"
  /** text-decoration-thickness: 2px; */
  @StyleValueMarker
  val size_2 get() = TEXT_DECORATION_THICKNESS value "2px"
  /** text-decoration-thickness: 4px; */
  @StyleValueMarker
  val size_4 get() = TEXT_DECORATION_THICKNESS value "4px"
  /** text-decoration-thickness: 8px; */
  @StyleValueMarker
  val size_8 get() = TEXT_DECORATION_THICKNESS value "8px"

}
