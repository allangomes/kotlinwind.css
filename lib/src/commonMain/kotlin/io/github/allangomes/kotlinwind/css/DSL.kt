@file:Suppress("FunctionName", "unused")

package io.github.allangomes.kotlinwind.css

import io.github.allangomes.kotlinwind.css.core.StyleMarker
import io.github.allangomes.kotlinwind.css.features.Root

object KW {
  @StyleMarker
  fun inline(block: Root.() -> Unit): String {
    return Root().apply(block).toCSSInline()
  }
}

@StyleMarker
val kw = KW
