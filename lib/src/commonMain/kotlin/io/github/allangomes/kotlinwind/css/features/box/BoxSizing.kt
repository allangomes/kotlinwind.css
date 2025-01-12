package io.github.allangomes.kotlinwind.css.features.box

import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.core.BOX_SIZING
import io.github.allangomes.kotlinwind.css.core.StyleValueMarker

interface BoxSizing<T> : KWScope<T> {

  /** box-sizing: border-box; */
  @StyleValueMarker
  val border get() = BOX_SIZING value "border-box"
  /** box-sizing: content-box; */
  @StyleValueMarker
  val content get() = BOX_SIZING value "content-box"

}
