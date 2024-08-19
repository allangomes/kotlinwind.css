package io.github.allangomes.kotlinwind.css.features.flex

import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.core.FLEX_WRAP
import io.github.allangomes.kotlinwind.css.core.StyleValueMarker

@Suppress("PropertyName")
interface FlexWrap<T> : KWScope<T> {

  /** flex-wrap: wrap; */
  @StyleValueMarker
  val wrap get() = FLEX_WRAP value "wrap"
  /** flex-wrap: wrap-reverse; */
  @StyleValueMarker
  val wrap_reverse get() = FLEX_WRAP value "wrap-reverse"
  /** flex-wrap: nowrap; */
  @StyleValueMarker
  val nowrap get() = FLEX_WRAP value "nowrap"

}
