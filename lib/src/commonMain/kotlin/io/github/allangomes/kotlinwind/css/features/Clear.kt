package io.github.allangomes.kotlinwind.css.features

import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.core.CLEAR
import io.github.allangomes.kotlinwind.css.core.StyleValueMarker

@Suppress("PropertyName")
interface Clear<T> : KWScope<T> {

  /** clear: inline-start; */
  @StyleValueMarker
  val clear_start get() = CLEAR value "inline-start"
  /** clear: inline-end; */
  @StyleValueMarker
  val clear_end get() = CLEAR value "inline-end"
  /** clear: left; */
  @StyleValueMarker
  val clear_left get() = CLEAR value "left"
  /** clear: right; */
  @StyleValueMarker
  val clear_right get() = CLEAR value "right"
  /** clear: both; */
  @StyleValueMarker
  val clear_both get() = CLEAR value "both"
  /** clear: none; */
  @StyleValueMarker
  val clear_none get() = CLEAR value "none"

}
