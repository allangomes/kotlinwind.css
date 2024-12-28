package io.github.allangomes.kotlinwind.css.features.commom

import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.core.*


@Suppress("PropertyName")
interface Gap<T> : KWScope<T> {

  @StyleValueMarker
  /** gap: {number} * 0.25rem
   * - [documentation](https://tailwindcss.com/docs/gap)
   * */
  val gap: WithNumber<T> get() = WithNumber {
    GAP value "${(it * 0.25f)}rem"
  }

  @StyleValueMarker
  /** column-gap: {number} * 0.25rem
   * - [documentation](https://tailwindcss.com/docs/gap)
   * */
  val gap_x: WithNumber<T> get() = WithNumber {
    GAP_COLUMN value "${(it * 0.25f)}rem"
  }

  @StyleValueMarker
  /** row-gap: {number} * 0.25rem
   * - [documentation](https://tailwindcss.com/docs/gap)
   * */
  val gap_y: WithNumber<T> get() = WithNumber {
    GAP_ROW value "${(it * 0.25f)}rem"
  }

}
