package io.github.allangomessl.kotlinwind.css.features.flex

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.FLEX_GROW
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker

@Suppress("PropertyName")
interface FlexGrow<T> : KWScope<T> {

  /** flex-grow: 1; */
  @StyleValueMarker
  val grow get() = FLEX_GROW value "1"

  /** flex-grow: 0; */
  @StyleValueMarker
  val grow_0 get() = FLEX_GROW value "0"

}
