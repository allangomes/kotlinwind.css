package io.github.allangomes.kotlinwind.css.features

import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.core.BOTTOM
import io.github.allangomes.kotlinwind.css.core.StyleValueMarker
import io.github.allangomes.kotlinwind.css.core.WithNumber
import io.github.allangomes.kotlinwind.css.core.WithPercentual

@Suppress("PropertyName")
interface PositionBottom<T> : KWScope<T> {

  /**
   * bottom: {number} * 0.25rem;
   */
  @StyleValueMarker
  val bottom: WithNumber<T>
    get() = WithNumber {
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
