package io.github.allangomessl.kotlinwind.css.features.box

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.BOX_DECORATION_BREAK
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker

@Suppress("PropertyName")
interface BoxDecoration<T> : KWScope<T> {

  /** box-decoration-break: clone; */
  @StyleValueMarker
  val decoration_clone get() = BOX_DECORATION_BREAK value "clone"
  /** box-decoration-break: slice; */
  @StyleValueMarker
  val decoration_slice get() = BOX_DECORATION_BREAK value "slice"

}
