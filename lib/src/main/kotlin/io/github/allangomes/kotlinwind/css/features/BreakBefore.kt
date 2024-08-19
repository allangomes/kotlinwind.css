package io.github.allangomes.kotlinwind.css.features

import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.core.BREAK_BEFORE
import io.github.allangomes.kotlinwind.css.core.StyleValueMarker

@Suppress("PropertyName")
interface BreakBefore<T> : KWScope<T> {

  /** break-before: auto; */
  @StyleValueMarker
  val break_before_auto get() = BREAK_BEFORE value "auto"
  /** break-before: avoid; */
  @StyleValueMarker
  val break_before_avoid get() = BREAK_BEFORE value "avoid"
  /** break-before: all; */
  @StyleValueMarker
  val break_before_all get() = BREAK_BEFORE value "all"
  /** break-before: avoid-page; */
  @StyleValueMarker
  val break_before_avoid_page get() = BREAK_BEFORE value "avoid-page"
  /** break-before: page; */
  @StyleValueMarker
  val break_before_page get() = BREAK_BEFORE value "page"
  /** break-before: left; */
  @StyleValueMarker
  val break_before_left get() = BREAK_BEFORE value "left"
  /** break-before: right; */
  @StyleValueMarker
  val break_before_right get() = BREAK_BEFORE value "right"
  /** break-before: column; */
  @StyleValueMarker
  val break_before_column get() = BREAK_BEFORE value "column"

}
