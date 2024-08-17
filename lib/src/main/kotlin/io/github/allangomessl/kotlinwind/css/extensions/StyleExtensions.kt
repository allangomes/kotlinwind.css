package io.github.allangomessl.kotlinwind.css.extensions

import io.github.allangomessl.kotlinwind.css.api.Style

fun List<Style>.inline(): String {
  return this.joinToString("; ")
}

fun List<Style>.block(): String {
  return this.joinToString(";\n  ") + ";"
}
