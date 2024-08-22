package io.github.allangomes.kotlinwind.css.features.mask

import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.core.BACKGROUND_POSITION
import io.github.allangomes.kotlinwind.css.core.MASK_POSITION
import io.github.allangomes.kotlinwind.css.core.StyleValueMarker
import io.github.allangomes.kotlinwind.css.core.WEBKIT

@Suppress("PropertyName")
interface MaskPosition<T> : KWScope<T> {

  /** mask-position: bottom; */
  @StyleValueMarker
  val bottom get() = run {
    WEBKIT+MASK_POSITION value "bottom"
    MASK_POSITION value "bottom"
  }

  /** mask-position: center; */
  @StyleValueMarker
  val center get() = run {
    WEBKIT+MASK_POSITION value "center"
    MASK_POSITION value "center"
  }

  /** mask-position: left; */
  @StyleValueMarker
  val left get() = run {
    WEBKIT+MASK_POSITION value "left"
    MASK_POSITION value "left"
  }

  /** mask-position: left bottom; */
  @StyleValueMarker
  val left_bottom get() = run {
    WEBKIT+MASK_POSITION value "left bottom"
    MASK_POSITION value "left bottom"
  }

  /** mask-position: left top; */
  @StyleValueMarker
  val left_top get() = run {
    WEBKIT+MASK_POSITION value "left top"
    MASK_POSITION value "left top"
  }

  /** mask-position: right; */
  @StyleValueMarker
  val right get() = run {
    WEBKIT+MASK_POSITION value "right"
    MASK_POSITION value "right"
  }

  /** mask-position: right bottom; */
  @StyleValueMarker
  val right_bottom get() = run {
    WEBKIT+MASK_POSITION value "right bottom"
    MASK_POSITION value "right bottom"
  }

  /** mask-position: right top; */
  @StyleValueMarker
  val right_top get() = run {
    WEBKIT+MASK_POSITION value "right top"
    MASK_POSITION value "right top"
  }

  /** mask-position: top; */
  @StyleValueMarker
  val top get() = run {
    WEBKIT+MASK_POSITION value "top"
    MASK_POSITION value "top"
  }


}
