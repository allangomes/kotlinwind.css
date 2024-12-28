package io.github.allangomes.kotlinwind.css.features.mask

import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.core.*

interface MaskSize<T> : KWScope<T> {

  val size: WithToken<T, String> get() = WithToken {
    WEBKIT+MASK_SIZE value it
    MASK_SIZE value it
  }

  /** mask-size: auto; */
  @StyleValueMarker
  val auto get() = run {
    WEBKIT+MASK_SIZE value "auto"
    MASK_SIZE value "auto"
  }
  /** mask-size: cover; */
  @StyleValueMarker
  val cover get() = run {
    WEBKIT+MASK_SIZE value "cover"
    MASK_SIZE value "cover"
  }
  /** mask-size: contain; */
  @StyleValueMarker
  val contain get() = run {
    WEBKIT+MASK_SIZE value "contain"
    MASK_SIZE value "contain"
  }

}
