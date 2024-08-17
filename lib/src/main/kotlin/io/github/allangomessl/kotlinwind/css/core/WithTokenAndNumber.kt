package io.github.allangomessl.kotlinwind.css.core

class WithTokenAndNumber<T, S1>(
  private val block1: Function1<S1, T>,
  private val block2: Function1<Float, T>
) {
  operator fun get(value: S1): T {
    return block1(value)
  }

  operator fun get(value: Number): T {
    return block2(value.toFloat())
  }

}
