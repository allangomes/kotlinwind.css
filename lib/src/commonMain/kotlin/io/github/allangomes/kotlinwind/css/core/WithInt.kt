package io.github.allangomes.kotlinwind.css.core

class WithInt<T>(
  private val block: Function1<Int, T>
) {
  operator fun get(value: Int): T {
    return block(value)
  }

}
