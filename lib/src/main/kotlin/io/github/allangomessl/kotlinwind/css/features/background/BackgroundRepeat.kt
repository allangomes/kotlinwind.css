package io.github.allangomessl.kotlinwind.css.features.background

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.BACKGROUND_REPEAT
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker

@Suppress("PropertyName")
interface BackgroundRepeat<T> : KWScope<T> {

  /** background-repeat: repeat; */
  @StyleValueMarker
  val repeat get() = BACKGROUND_REPEAT value "repeat"
  /** background-repeat: no-repeat; */
  @StyleValueMarker
  val no_repeat get() = BACKGROUND_REPEAT value "no-repeat"
  /** background-repeat: repeat-x; */
  @StyleValueMarker
  val repeat_x get() = BACKGROUND_REPEAT value "repeat-x"
  /** background-repeat: repeat-y; */
  @StyleValueMarker
  val repeat_y get() = BACKGROUND_REPEAT value "repeat-y"
  /** background-repeat: round; */
  @StyleValueMarker
  val repeat_round get() = BACKGROUND_REPEAT value "round"
  /** background-repeat: space; */
  @StyleValueMarker
  val repeat_space get() = BACKGROUND_REPEAT value "space"

}
