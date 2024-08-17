package io.github.allangomessl.kotlinwind.css.features

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.BREAK_AFTER
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker

@Suppress("PropertyName")
interface BreakAfter<T> : KWScope<T> {

  /** break-after: auto; */
  @StyleValueMarker
  val break_after_auto get() = BREAK_AFTER value "auto"
  /** break-after: avoid; */
  @StyleValueMarker
  val break_after_avoid get() = BREAK_AFTER value "avoid"
  /** break-after: all; */
  @StyleValueMarker
  val break_after_all get() = BREAK_AFTER value "all"
  /** break-after: avoid-page; */
  @StyleValueMarker
  val break_after_avoid_page get() = BREAK_AFTER value "avoid-page"
  /** break-after: page; */
  @StyleValueMarker
  val break_after_page get() = BREAK_AFTER value "page"
  /** break-after: left; */
  @StyleValueMarker
  val break_after_left get() = BREAK_AFTER value "left"
  /** break-after: right; */
  @StyleValueMarker
  val break_after_right get() = BREAK_AFTER value "right"
  /** break-after: column; */
  @StyleValueMarker
  val break_after_column get() = BREAK_AFTER value "column"

}
