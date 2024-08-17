package io.github.allangomessl.kotlinwind.css.features.commom

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.*


@Suppress("PropertyName")
interface Gap<T> : KWScope<T> {

  @StyleValueMarker
  /** gap: {number} * 0.25rem
   * - [documentation](https://tailwindcss.com/docs/gap)
   * */
  val gap: WithFloatAndInt<T> get() = WithFloatAndInt {
    GAP value "${(it * 0.25f)}rem"
  }

  @StyleValueMarker
  /** column-gap: {number} * 0.25rem
   * - [documentation](https://tailwindcss.com/docs/gap)
   * */
  val gap_x: WithFloatAndInt<T> get() = WithFloatAndInt {
    GAP_COLUMN value "${(it * 0.25f)}rem"
  }

  @StyleValueMarker
  /** row-gap: {number} * 0.25rem
   * - [documentation](https://tailwindcss.com/docs/gap)
   * */
  val gap_y: WithFloatAndInt<T> get() = WithFloatAndInt {
    GAP_ROW value "${(it * 0.25f)}rem"
  }

}
