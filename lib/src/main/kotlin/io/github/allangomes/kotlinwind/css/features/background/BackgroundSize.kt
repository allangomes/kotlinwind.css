package io.github.allangomes.kotlinwind.css.features.background

import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.core.BACKGROUND_SIZE
import io.github.allangomes.kotlinwind.css.core.StyleValueMarker

interface BackgroundSize<T> : KWScope<T> {

  /** background-size: auto; */
  @StyleValueMarker
  val auto get() = BACKGROUND_SIZE value "auto"
  /** background-size: cover; */
  @StyleValueMarker
  val cover get() = BACKGROUND_SIZE value "cover"
  /** background-size: contain; */
  @StyleValueMarker
  val contain get() = BACKGROUND_SIZE value "contain"

}
