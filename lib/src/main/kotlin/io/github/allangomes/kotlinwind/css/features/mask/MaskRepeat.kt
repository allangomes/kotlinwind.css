package io.github.allangomes.kotlinwind.css.features.mask

import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.core.MASK_REPEAT
import io.github.allangomes.kotlinwind.css.core.StyleValueMarker

@Suppress("PropertyName")
interface MaskRepeat<T> : KWScope<T> {

  /** background-repeat: repeat; */
  @StyleValueMarker
  val repeat get() = MASK_REPEAT value "repeat"
  /** background-repeat: no-repeat; */
  @StyleValueMarker
  val no_repeat get() = MASK_REPEAT value "no-repeat"
  /** background-repeat: repeat-x; */
  @StyleValueMarker
  val repeat_x get() = MASK_REPEAT value "repeat-x"
  /** background-repeat: repeat-y; */
  @StyleValueMarker
  val repeat_y get() = MASK_REPEAT value "repeat-y"
  /** background-repeat: round; */
  @StyleValueMarker
  val repeat_round get() = MASK_REPEAT value "round"
  /** background-repeat: space; */
  @StyleValueMarker
  val repeat_space get() = MASK_REPEAT value "space"

}
