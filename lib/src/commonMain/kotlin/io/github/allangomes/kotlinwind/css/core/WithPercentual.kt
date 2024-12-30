package io.github.allangomes.kotlinwind.css.core

import io.github.allangomes.kotlinwind.css.utils.roundToDecimalPlaces

class WithPercentual<T>(
  private val block: Function1<Float, T>
) {

  operator fun get(value: Int): T {
    return block(value.toFloat().roundToDecimalPlaces())
  }

  /**
   * Fractions {dividend} / {divisor}
   */
  operator fun get(dividend: Int, divisor: Int): T {
    val value = dividend.toFloat() / divisor.toFloat()
    return block(value.roundToDecimalPlaces() * 100)
  }

}
