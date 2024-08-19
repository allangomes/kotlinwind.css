package io.github.allangomes.kotlinwind.css.features.background

import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.core.BACKGROUND_COLOR
import io.github.allangomes.kotlinwind.css.features.commom.Color

interface BackgroundColor<T> : KWScope<T>, Color<T> {

  override val ColorWrap: (String?) -> T get() = {
    BACKGROUND_COLOR value (it ?: "inherit")
  }

}
