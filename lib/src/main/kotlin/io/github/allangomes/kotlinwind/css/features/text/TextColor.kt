package io.github.allangomes.kotlinwind.css.features.text

import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.core.COLOR
import io.github.allangomes.kotlinwind.css.features.commom.Color

interface TextColor<T> : KWScope<T>, Color<T> {

  override val ColorWrap: (String?) -> T get() = {
    COLOR value (it ?: "inherit")
  }

}
