package io.github.allangomessl.kotlinwind.css.features

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker
import io.github.allangomessl.kotlinwind.css.core.TOP
import io.github.allangomessl.kotlinwind.css.core.WithFloatAndInt
import io.github.allangomessl.kotlinwind.css.core.WithPercentual

@Suppress("PropertyName")
interface PositionTop<T> : KWScope<T> {

  /**
   * top: {number} * 0.25rem;
   */
  @StyleValueMarker
  val top: WithFloatAndInt<T>
    get() = WithFloatAndInt {
      val value = it * 0.25
      TOP value "${value}rem"
    }

  /**
   * top: {number} * 0.25%;
   */
  @StyleValueMarker
  val top_pct: WithPercentual<T>
    get() = WithPercentual {
      TOP value "$it%"
    }

  /**
   * top: auto;
   */
  @StyleValueMarker
  val top_auto get() = TOP value "auto"

  /**
   * top: 100%;
   */
  @StyleValueMarker
  val top_full get() = TOP value "100%"

}