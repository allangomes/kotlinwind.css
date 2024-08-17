package io.github.allangomessl.kotlinwind.css.features.text

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.COLOR
import io.github.allangomessl.kotlinwind.css.features.commom.Color

interface TextColor<T> : KWScope<T>, Color<T> {

  override val ColorWrap: (String?) -> T get() = {
    COLOR value (it ?: "inherit")
  }

}
