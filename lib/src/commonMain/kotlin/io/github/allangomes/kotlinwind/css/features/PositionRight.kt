package io.github.allangomes.kotlinwind.css.features

import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.core.RIGHT
import io.github.allangomes.kotlinwind.css.core.StyleValueMarker
import io.github.allangomes.kotlinwind.css.core.WithNumber
import io.github.allangomes.kotlinwind.css.core.WithPercentual

@Suppress("PropertyName")
interface PositionRight<T> : KWScope<T> {

  /**
   * right: {number} * 0.25rem;
   */
  @StyleValueMarker
  val right: WithNumber<T>
    get() = WithNumber {
      val value = it * 0.25
      RIGHT value "${value}rem"
    }

  /**
   * right: {number} * 0.25%;
   */
  @StyleValueMarker
  val right_pct: WithPercentual<T>
    get() = WithPercentual {
      RIGHT value "$it%"
    }

  /**
   * right: auto;
   */
  @StyleValueMarker
  val right_auto get() = RIGHT value "auto"

  /**
   * right: 100%;
   */
  @StyleValueMarker
  val right_full get() = RIGHT value "100%"

}
