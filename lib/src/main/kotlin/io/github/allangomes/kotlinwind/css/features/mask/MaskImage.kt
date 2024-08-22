package io.github.allangomes.kotlinwind.css.features.mask

import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.core.*

@Suppress("PropertyName")
interface MaskImage<T> : KWScope<T> {

  @StyleValueMarker
  val image: WithToken<T, String> get() = WithToken {
    WEBKIT+MASK_IMAGE value "url('$it')"
    MASK_IMAGE value "url('$it')"
  }

  @StyleValueMarker
  val image_none get() = run {
    WEBKIT+MASK_IMAGE value "none"
    MASK_IMAGE value "none"
  }

}
