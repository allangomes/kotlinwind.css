package io.github.allangomes.kotlinwind.css.features

import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.core.OPACITY
import io.github.allangomes.kotlinwind.css.core.WithInt

interface Opacity<T> : KWScope<T> {

    val opacity: WithInt<T> get() = WithInt {
        OPACITY value "${it.toFloat() / 100f}"
    }

}