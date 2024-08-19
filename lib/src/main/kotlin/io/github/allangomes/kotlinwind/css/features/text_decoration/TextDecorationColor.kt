package io.github.allangomes.kotlinwind.css.features.text_decoration

import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.core.TEXT_DECORATION_COLOR
import io.github.allangomes.kotlinwind.css.features.commom.Color

interface TextDecorationColor<T> : KWScope<T>, Color<T> {

  override val ColorWrap: (String?) -> T get() = {
    TEXT_DECORATION_COLOR value (it ?: "inherit")
  }

}
