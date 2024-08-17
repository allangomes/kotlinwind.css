package io.github.allangomessl.kotlinwind.css.features.background

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.BACKGROUND_COLOR
import io.github.allangomessl.kotlinwind.css.features.commom.Color

interface BackgroundColor<T> : KWScope<T>, Color<T> {

  override val ColorWrap: (String?) -> T get() = {
    BACKGROUND_COLOR value (it ?: "inherit")
  }

}
