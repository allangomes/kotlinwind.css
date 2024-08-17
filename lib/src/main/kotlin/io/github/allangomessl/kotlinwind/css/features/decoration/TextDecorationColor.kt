package io.github.allangomessl.kotlinwind.css.features.decoration

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.TEXT_DECORATION_COLOR
import io.github.allangomessl.kotlinwind.css.features.commom.Color

interface TextDecorationColor<T> : KWScope<T>, Color<T> {

  override val ColorWrap: (String?) -> T get() = {
    TEXT_DECORATION_COLOR value (it ?: "inherit")
  }

}
