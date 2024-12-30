package io.github.allangomes.kotlinwind.css.features

import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.core.LEFT
import io.github.allangomes.kotlinwind.css.core.StyleValueMarker
import io.github.allangomes.kotlinwind.css.core.WithNumber
import io.github.allangomes.kotlinwind.css.core.WithPercentual
import io.github.allangomes.kotlinwind.css.utils.normalizeDecimal

@Suppress("PropertyName")
interface PositionLeft<T> : KWScope<T> {

  /**
   * left: {number} * 0.25rem;
   */
  @StyleValueMarker
  val left: WithNumber<T>
    get() = WithNumber {
    val value = normalizeDecimal(it * 0.25f)
    LEFT value "${value}rem"
  }

  /**
   * left: {number} * 0.25%;
   */
  @StyleValueMarker
  val left_pct: WithPercentual<T>
    get() = WithPercentual {
      LEFT value "${normalizeDecimal(it)}%"
    }

  /**
   * left: auto;
   */
  @StyleValueMarker
  val left_auto get() = LEFT value "auto"

  /**
   * left: 100%;
   */
  @StyleValueMarker
  val left_full get() = LEFT value "100%"

}
