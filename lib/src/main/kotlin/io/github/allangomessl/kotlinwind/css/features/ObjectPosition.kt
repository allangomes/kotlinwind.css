package io.github.allangomessl.kotlinwind.css.features

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.OBJECT_POSITION
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker

@Suppress("PropertyName")
interface ObjectPosition<T> : KWScope<T> {

  /** object-position: bottom; */
  @StyleValueMarker
  val object_bottom get() = OBJECT_POSITION value "bottom"
  /** object-position: center; */
  @StyleValueMarker
  val object_center get() = OBJECT_POSITION value "center"
  /** object-position: left; */
  @StyleValueMarker
  val object_left get() = OBJECT_POSITION value "left"
  /** object-position: left bottom; */
  @StyleValueMarker
  val object_left_bottom get() = OBJECT_POSITION value "left bottom"
  /** object-position: left top; */
  @StyleValueMarker
  val object_left_top get() = OBJECT_POSITION value "left top"
  /** object-position: right; */
  @StyleValueMarker
  val object_right get() = OBJECT_POSITION value "right"
  /** object-position: right bottom; */
  @StyleValueMarker
  val object_right_bottom get() = OBJECT_POSITION value "right bottom"
  /** object-position: right top; */
  @StyleValueMarker
  val object_right_top get() = OBJECT_POSITION value "right top"
  /** object-position: top; */
  @StyleValueMarker
  val object_top get() = OBJECT_POSITION value "top"

}
