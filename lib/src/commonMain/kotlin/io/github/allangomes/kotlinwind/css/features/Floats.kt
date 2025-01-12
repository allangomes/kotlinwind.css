package io.github.allangomes.kotlinwind.css.features

import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.core.FLOAT
import io.github.allangomes.kotlinwind.css.core.StyleValueMarker

@Suppress("PropertyName")
interface Floats<T> : KWScope<T> {

  /** float: inline-start; */
  @StyleValueMarker
  val float_start get() = FLOAT value "inline-start"
  /** float: inline-end; */
  @StyleValueMarker
  val float_end get() = FLOAT value "inline-end"
  /** float: right; */
  @StyleValueMarker
  val float_right get() = FLOAT value "right"
  /** float: left; */
  @StyleValueMarker
  val float_left get() = FLOAT value "left"
  /** float: none; */
  @StyleValueMarker
  val float_none get() = FLOAT value "none"

}
