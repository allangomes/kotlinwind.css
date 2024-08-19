package io.github.allangomes.kotlinwind.css.features

import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.core.LEFT
import io.github.allangomes.kotlinwind.css.core.StyleValueMarker
import io.github.allangomes.kotlinwind.css.core.WithFloatAndInt
import io.github.allangomes.kotlinwind.css.core.WithPercentual

@Suppress("PropertyName")
interface PositionLeft<T> : KWScope<T> {

  /**
   * left: {number} * 0.25rem;
   */
  @StyleValueMarker
  val left: WithFloatAndInt<T>
    get() = WithFloatAndInt {
    val value = it * 0.25
    LEFT value "${value}rem"
  }

  /**
   * left: {number} * 0.25%;
   */
  @StyleValueMarker
  val left_pct: WithPercentual<T>
    get() = WithPercentual {
      LEFT value "$it%"
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
