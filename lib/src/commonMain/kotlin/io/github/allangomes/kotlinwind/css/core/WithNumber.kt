package io.github.allangomes.kotlinwind.css.core

class WithNumber<T>(
  private val block: Function1<Float, T>
) {
  operator fun get(value: Number): T {
    return block(value.toFloat())
  }

}
