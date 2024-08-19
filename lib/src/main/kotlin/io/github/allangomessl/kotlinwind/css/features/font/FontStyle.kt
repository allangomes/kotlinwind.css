@file:Suppress("PropertyName")

package io.github.allangomessl.kotlinwind.css.features.font

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.FONT_STYLE
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker

interface FontStyle<T> : KWScope<T> {
  /** font-style: italic; */
  @StyleValueMarker
  val italic get() = FONT_STYLE value "italic"
  /** font-style: normal; */
  @StyleValueMarker
  val not_italic get() = FONT_STYLE value "normal"
}
