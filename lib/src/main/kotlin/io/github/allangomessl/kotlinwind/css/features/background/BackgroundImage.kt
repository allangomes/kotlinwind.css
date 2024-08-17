package io.github.allangomessl.kotlinwind.css.features.background

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.BACKGROUND_IMAGE
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker
import io.github.allangomessl.kotlinwind.css.core.WithToken

@Suppress("PropertyName")
interface BackgroundImage<T> : KWScope<T> {

  @StyleValueMarker
  val image: WithToken<T, String> get() = WithToken {
    BACKGROUND_IMAGE value "url('$it')"
  }

  @StyleValueMarker
  val image_none get() = BACKGROUND_IMAGE value "none"

}