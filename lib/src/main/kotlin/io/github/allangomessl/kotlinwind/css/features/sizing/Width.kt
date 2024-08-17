package io.github.allangomessl.kotlinwind.css.features.sizing

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.*

interface Width<T> : KWScope<T> {

  /** width: `number` * 0.25rem; */
  @StyleValueMarker
  val width: WithTokenAndNumber<T, String> get() = WithTokenAndNumber({
    WIDTH value it
  }, {
    WIDTH value "${it * 0.25}rem"
  })

  /** min-width: `number` * 0.25rem; */
  @StyleValueMarker
  val min_width: WithTokenAndNumber<T, String> get() = WithTokenAndNumber({
    MIN_WIDTH value it
  }, {
    MIN_WIDTH value "${it * 0.25}rem"
  })

  /** max-width: `number` * 0.25rem; */
  @StyleValueMarker
  val max_width: WithTokenAndNumber<T, String> get() = WithTokenAndNumber({
    MAX_WIDTH value it
  }, {
    MAX_WIDTH value "${it * 0.25}rem"
  })

}
