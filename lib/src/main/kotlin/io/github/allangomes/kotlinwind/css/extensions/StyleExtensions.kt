package io.github.allangomes.kotlinwind.css.extensions

import io.github.allangomes.kotlinwind.css.api.Style

fun List<Style>.inline(): String {
  return this.joinToString("; ")
}

fun List<Style>.block(): String {
  return this.joinToString(";\n  ") + ";"
}
