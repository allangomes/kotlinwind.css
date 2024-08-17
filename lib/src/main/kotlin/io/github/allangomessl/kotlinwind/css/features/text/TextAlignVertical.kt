package io.github.allangomessl.kotlinwind.css.features.text

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker
import io.github.allangomessl.kotlinwind.css.core.VERTICAL_ALIGN

interface TextAlignVertical<T> : KWScope<T> {

  /** vertical-align: top */
  @StyleValueMarker
  val top get() = VERTICAL_ALIGN value "top"
  /** vertical-align: middle */
  @StyleValueMarker
  val middle get() = VERTICAL_ALIGN value "middle"
  /** vertical-align: bottom */
  @StyleValueMarker
  val bottom get() = VERTICAL_ALIGN value "bottom"
}
