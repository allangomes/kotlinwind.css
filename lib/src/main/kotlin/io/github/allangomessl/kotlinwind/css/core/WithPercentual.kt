package io.github.allangomessl.kotlinwind.css.core

class WithPercentual<T>(
  private val block: Function1<Float, T>
) {

  operator fun get(value: Int): T {
    return block(value.toFloat())
  }

  /**
   * Fractions {dividend} / {divisor}
   */
  operator fun get(dividend: Int, divisor: Int): T {
    val value = dividend.toFloat() / divisor.toFloat()
    return block(value * 100)
  }

}
