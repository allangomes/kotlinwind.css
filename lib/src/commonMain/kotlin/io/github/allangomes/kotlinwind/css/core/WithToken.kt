package io.github.allangomes.kotlinwind.css.core

class WithToken<T, S1>(
  private val block: Function1<S1, T>
) {
  operator fun get(value: S1): T {
    return block(value)
  }
}
