package io.github.allangomes.kotlinwind.css.features.mask

import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.core.BACKGROUND_ORIGIN
import io.github.allangomes.kotlinwind.css.core.MASK_ORIGIN
import io.github.allangomes.kotlinwind.css.core.StyleValueMarker
import io.github.allangomes.kotlinwind.css.core.WEBKIT

@Suppress("PropertyName")
interface MaskOrigin<T> : KWScope<T> {

  /**
   * mask-origin: fill-box;
   * */
  @StyleValueMarker
  val origin_fill get() = run {
    WEBKIT+MASK_ORIGIN value "fill-box"
    MASK_ORIGIN value "fill-box"
  }

  /**
   * mask-origin: margin-box;
   * */
  @StyleValueMarker
  val origin_margin get() = run {
    WEBKIT+MASK_ORIGIN value "margin-box"
    MASK_ORIGIN value "margin-box"
  }

  /**
   * mask-origin: stroke-box;
   * */
  @StyleValueMarker
  val origin_stroke get() = run {
    WEBKIT+MASK_ORIGIN value "stroke-box"
    MASK_ORIGIN value "stroke-box"
  }

  /**
   * mask-origin: view-box;
   * */
  @StyleValueMarker
  val origin_view get() = run {
    WEBKIT+MASK_ORIGIN value "view-box"
    MASK_ORIGIN value "view-box"
  }
}
