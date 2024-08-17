package io.github.allangomessl.kotlinwind.css.features

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.ASPECT_RATIO
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker

@Suppress("PropertyName")
interface AspectRatio<T> : KWScope<T> {

  /** aspect-ratio: auto; */
  @StyleValueMarker
  val aspect_auto get() = ASPECT_RATIO value "auto"

  /** aspect-ratio: 1 / 1; */
  @StyleValueMarker
  val aspect_square get() = ASPECT_RATIO value "1 / 1"

  /**
   * aspect-ratio: 4 / 3;
   * ```
   * . . 4
   * .
   * 3
   * ```
   * */
  @StyleValueMarker
  val aspect_4_3 get() = ASPECT_RATIO value "4 / 3"

  /**
   * aspect-ratio: 3 / 4;
   * ```
   * . . 3
   * .
   * 4
   * ```
   * */
  @StyleValueMarker
  val aspect_3_4 get() = ASPECT_RATIO value "3 / 4"

  /**
   * aspect-ratio: 16 / 9;
   * ```
   * . . 16
   * .
   * 9
   * ```
   * */
  @StyleValueMarker
  val aspect_16_9 get() = ASPECT_RATIO value "16 / 9"

  /**
   * aspect-ratio: 9 / 16;
   * ```
   *  . . 9
   *  .
   * 16
   * ```
   * */
  @StyleValueMarker
  val aspect_9_16 get() = ASPECT_RATIO value "9 / 16"
}
