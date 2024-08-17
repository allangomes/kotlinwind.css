package io.github.allangomessl.kotlinwind.css.features.commom

import io.github.allangomessl.kotlinwind.css.ColorIndex

fun interface ColorIndex<T> {
  operator fun get(index: ColorIndex): T
}
