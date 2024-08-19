package io.github.allangomes.kotlinwind.css.features.commom

import io.github.allangomes.kotlinwind.css.ColorIndex

fun interface ColorIndex<T> {
  operator fun get(index: ColorIndex): T
}
