package io.github.allangomessl.kotlinwind.css.features.background

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.BACKGROUND_POSITION
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker

@Suppress("PropertyName")
interface BackgroundPosition<T> : KWScope<T> {

  /** background-position: bottom; */
  @StyleValueMarker
  val bottom get() = BACKGROUND_POSITION value "bottom"
  /** background-position: center; */
  @StyleValueMarker
  val center get() = BACKGROUND_POSITION value "center"
  /** background-position: left; */
  @StyleValueMarker
  val left get() = BACKGROUND_POSITION value "left"
  /** background-position: left bottom; */
  @StyleValueMarker
  val left_bottom get() = BACKGROUND_POSITION value "left bottom"
  /** background-position: left top; */
  @StyleValueMarker
  val left_top get() = BACKGROUND_POSITION value "left top"
  /** background-position: right; */
  @StyleValueMarker
  val right get() = BACKGROUND_POSITION value "right"
  /** background-position: right bottom; */
  @StyleValueMarker
  val right_bottom get() = BACKGROUND_POSITION value "right bottom"
  /** background-position: right top; */
  @StyleValueMarker
  val right_top get() = BACKGROUND_POSITION value "right top"
  /** background-position: top; */
  @StyleValueMarker
  val top get() = BACKGROUND_POSITION value "top"

}
