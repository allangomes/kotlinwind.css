package io.github.allangomessl.kotlinwind.css.features

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.BOTTOM
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker
import io.github.allangomessl.kotlinwind.css.core.WithFloatAndInt
import io.github.allangomessl.kotlinwind.css.core.WithPercentual

@Suppress("PropertyName")
interface PositionBottom<T> : KWScope<T> {

  /**
   * bottom: {number} * 0.25rem;
   */
  @StyleValueMarker
  val bottom: WithFloatAndInt<T>
    get() = WithFloatAndInt {
      val value = it * 0.25
      BOTTOM value "${value}rem"
    }

  /**
   * bottom: {number} * 0.25%;
   */
  @StyleValueMarker
  val bottom_pct: WithPercentual<T>
    get() = WithPercentual {
      BOTTOM value "$it%"
    }

  /**
   * bottom: auto;
   */
  @StyleValueMarker
  val bottom_auto get() = BOTTOM value "auto"

  /**
   * bottom: 100%;
   */
  @StyleValueMarker
  val bottom_full get() = BOTTOM value "100%"

}
