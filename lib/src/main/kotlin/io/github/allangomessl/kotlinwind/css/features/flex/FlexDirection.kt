package io.github.allangomessl.kotlinwind.css.features.flex

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.DISPLAY
import io.github.allangomessl.kotlinwind.css.core.FLEX
import io.github.allangomessl.kotlinwind.css.core.FLEX_DIRECTION
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker

@Suppress("PropertyName")
interface FlexDirection<T> : KWScope<T> {

  @StyleValueMarker
  val row get() = run {
    DISPLAY value FLEX
    FLEX_DIRECTION value "row"
  }
  @StyleValueMarker
  val col get() = run {
    DISPLAY value FLEX
    FLEX_DIRECTION value "column"
  }

  @StyleValueMarker
  val row_reverse get() = FLEX_DIRECTION value "row-reverse"
  @StyleValueMarker
  val col_reverse get() = FLEX_DIRECTION value "column-reverse"

}
