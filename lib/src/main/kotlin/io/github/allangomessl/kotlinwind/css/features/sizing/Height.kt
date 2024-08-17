package io.github.allangomessl.kotlinwind.css.features.sizing

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.*

interface Height<T> : KWScope<T> {

  /** height: `number` * 0.25rem; */
  @StyleValueMarker
  val height: WithTokenAndNumber<T, String> get() = WithTokenAndNumber({
    HEIGHT value it
  }, {
    HEIGHT value "${it * 0.25}rem"
  })

  /** min-height: `number` * 0.25rem; */
  @StyleValueMarker
  val min_height: WithTokenAndNumber<T, String> get() = WithTokenAndNumber({
    MIN_HEIGHT value it
  }, {
    MIN_HEIGHT value "${it * 0.25}rem"
  })

  /** max-height: `number` * 0.25rem; */
  @StyleValueMarker
  val max_height: WithTokenAndNumber<T, String> get() = WithTokenAndNumber({
    MAX_HEIGHT value it
  }, {
    MAX_HEIGHT value "${it * 0.25}rem"
  })

}
