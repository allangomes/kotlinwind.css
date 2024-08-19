package io.github.allangomes.kotlinwind.css.core

class WithFloatAndInt<T>(
  private val block: Function1<Float, T>
) {
  operator fun get(value: Float): T {
    return block(value)
  }

  operator fun get(value: Int): T {
    return block(value.toFloat())
  }

}
