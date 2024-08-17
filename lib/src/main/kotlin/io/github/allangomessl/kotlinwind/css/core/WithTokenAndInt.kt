package io.github.allangomessl.kotlinwind.css.core

class WithTokenAndInt<T, S1>(
  private val block1: Function1<S1, T>,
  private val block2: Function1<Int, T>
) {
  operator fun get(value: S1): T {
    return block1(value)
  }

  operator fun get(value: Int): T {
    return block2(value)
  }

}
