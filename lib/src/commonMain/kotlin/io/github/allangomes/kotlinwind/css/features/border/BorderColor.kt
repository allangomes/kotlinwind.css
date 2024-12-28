package io.github.allangomes.kotlinwind.css.features.border

import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.core.BORDER_COLOR
import io.github.allangomes.kotlinwind.css.features.commom.Color

interface BorderColor<T> : KWScope<T>, Color<T> {

  override val ColorWrap: (String?) -> T get() = {
    BORDER_COLOR value (it ?: "inherit")
  }

}
