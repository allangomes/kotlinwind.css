package io.github.allangomessl.kotlinwind.css.features.text_decoration

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker
import io.github.allangomessl.kotlinwind.css.core.TEXT_UNDERLINE_OFFSET
import io.github.allangomessl.kotlinwind.css.core.WithTokenAndInt

@Suppress("PropertyName")
interface TextUnderlineOffset<T> : KWScope<T> {

  @StyleValueMarker
  val offset: WithTokenAndInt<T, String>
    get() = WithTokenAndInt({
    TEXT_UNDERLINE_OFFSET value it
  }, {
    TEXT_UNDERLINE_OFFSET value "${it}px"
  })

  /** text-underline-offset: auto; */
  @StyleValueMarker
  val offset_auto get() = TEXT_UNDERLINE_OFFSET value "auto"
  /** text-underline-offset: 0px; */
  @StyleValueMarker
  val offset_0 get() = TEXT_UNDERLINE_OFFSET value "0px"
  /** text-underline-offset: 1px; */
  @StyleValueMarker
  val offset_1 get() = TEXT_UNDERLINE_OFFSET value "1px"
  /** text-underline-offset: 2px; */
  @StyleValueMarker
  val offset_2 get() = TEXT_UNDERLINE_OFFSET value "2px"
  /** text-underline-offset: 4px; */
  @StyleValueMarker
  val offset_4 get() = TEXT_UNDERLINE_OFFSET value "4px"
  /** text-underline-offset: 8px; */
  @StyleValueMarker
  val offset_8 get() = TEXT_UNDERLINE_OFFSET value "8px"

}
