@file:Suppress("FunctionName", "unused")

package io.github.allangomessl.kotlinwind.css

import io.github.allangomessl.kotlinwind.css.core.StyleMarker
import io.github.allangomessl.kotlinwind.css.features.Root

object KW {
  @StyleMarker
  fun inline(block: Root.() -> Unit): String {
    return Root().apply(block).toCSSInline()
  }
}

@StyleMarker
val kw = KW
