package io.github.allangomes.kotlinwind.css.features

import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.core.StyleValueMarker
import io.github.allangomes.kotlinwind.css.core.TOP
import io.github.allangomes.kotlinwind.css.core.WithNumber
import io.github.allangomes.kotlinwind.css.core.WithPercentual

@Suppress("PropertyName")
interface PositionTop<T> : KWScope<T> {

  /**
   * top: {number} * 0.25rem;
   */
  @StyleValueMarker
  val top: WithNumber<T>
    get() = WithNumber {
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
