package io.github.allangomessl.kotlinwind.css.features

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.LEFT
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker
import io.github.allangomessl.kotlinwind.css.core.WithFloatAndInt
import io.github.allangomessl.kotlinwind.css.core.WithPercentual

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
