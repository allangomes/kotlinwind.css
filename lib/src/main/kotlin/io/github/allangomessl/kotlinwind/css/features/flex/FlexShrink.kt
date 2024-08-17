@file:Suppress("PropertyName")
package io.github.allangomessl.kotlinwind.css.features.flex

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.FLEX_SHRINK
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker

interface FlexShrink<T> : KWScope<T> {

  /** flex-shrink: 1; */
  @StyleValueMarker
  val shrink get() = FLEX_SHRINK value "1"

  /** flex-shrink: 0; */
  @StyleValueMarker
  val shrink_0 get() = FLEX_SHRINK value "0"

}
