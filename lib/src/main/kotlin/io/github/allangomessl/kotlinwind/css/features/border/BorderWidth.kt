package io.github.allangomessl.kotlinwind.css.features.border

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.*

interface BorderWidth<T> : KWScope<T> {

  @StyleValueMarker
  val all get() = WithTokenAndInt<T, String>(
    { BORDER_WIDTH value it },
    { BORDER_WIDTH value "${it}px" }
  )

  operator fun get(value: String) = all[value]
  operator fun get(value: Int) = all[value]

  @StyleValueMarker
  val x get() = WithTokenAndInt<T, String>(
    {
      BORDER_LEFT_WIDTH value it
      BORDER_RIGHT_WIDTH value it
    },
    {
      BORDER_LEFT_WIDTH value "${it}px"
      BORDER_RIGHT_WIDTH value "${it}px"
    }
  )

  @StyleValueMarker
  val y get() = WithTokenAndInt<T, String>(
    {
      BORDER_TOP_WIDTH value it
      BORDER_BOTTOM_WIDTH value it
    },
    {
      BORDER_TOP_WIDTH value "${it}px"
      BORDER_BOTTOM_WIDTH value "${it}px"
    }
  )

  @StyleValueMarker
  val start get() = WithTokenAndInt<T, String>(
    { BORDER_INLINE_START_WIDTH value it },
    { BORDER_INLINE_START_WIDTH value "${it}px" }
  )

  @StyleValueMarker
  val end get() = WithTokenAndInt<T, String>(
    { BORDER_INLINE_END_WIDTH value it },
    { BORDER_INLINE_END_WIDTH value "${it}px" }
  )

  @StyleValueMarker
  val top get() = WithTokenAndInt<T, String>(
    { BORDER_TOP_WIDTH value it },
    { BORDER_TOP_WIDTH value "${it}px" }
  )

  @StyleValueMarker
  val right get() = WithTokenAndInt<T, String>(
    { BORDER_RIGHT_WIDTH value it },
    { BORDER_RIGHT_WIDTH value "${it}px" }
  )

  @StyleValueMarker
  val bottom get() = WithTokenAndInt<T, String>(
    { BORDER_BOTTOM_WIDTH value it },
    { BORDER_BOTTOM_WIDTH value "${it}px" }
  )

  @StyleValueMarker
  val left get() = WithTokenAndInt<T, String>(
    { BORDER_LEFT_WIDTH value it },
    { BORDER_LEFT_WIDTH value "${it}px" }
  )

}
