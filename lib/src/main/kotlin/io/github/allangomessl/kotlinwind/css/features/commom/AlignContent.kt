package io.github.allangomessl.kotlinwind.css.features.commom

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.ALIGN_CONTENT
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker

@Suppress("PropertyName")
interface AlignContent<T> : KWScope<T> {

  /**
   * align-content: normal;
   * - [documentation](https://tailwindcss.com/docs/align-content#normal)
   */
  @StyleValueMarker
  val content_normal get() = ALIGN_CONTENT value "normal"

  /**
   * align-content: center;
   * - [documentation](https://tailwindcss.com/docs/align-content#center)
   */
  @StyleValueMarker
  val content_center get() = ALIGN_CONTENT value "center"

  /**
   * align-content: flex-start;
   * - [documentation](https://tailwindcss.com/docs/align-content#start)
   */
  @StyleValueMarker
  val content_start get() = ALIGN_CONTENT value "flex-start"

  /**
   * align-content: flex-end;
   * - [documentation](https://tailwindcss.com/docs/align-content#end)
   */
  @StyleValueMarker
  val content_end get() = ALIGN_CONTENT value "flex-end"

  /**
   * align-content: space-between;
   * - [documentation](https://tailwindcss.com/docs/align-content#space-between)
   */
  @StyleValueMarker
  val content_between get() = ALIGN_CONTENT value "space-between"

  /**
   * align-content: space-around;
   * - [documentation](https://tailwindcss.com/docs/align-content#space-around)
   */
  @StyleValueMarker
  val content_around get() = ALIGN_CONTENT value "space-around"

  /**
   * align-content: space-evenly;
   * - [documentation](https://tailwindcss.com/docs/align-content#space-evenly)
   */
  @StyleValueMarker
  val content_evenly get() = ALIGN_CONTENT value "space-evenly"

  /**
   * align-content: baseline;
   * - [documentation](https://tailwindcss.com/docs/align-content)
   */
  @StyleValueMarker
  val content_baseline get() = ALIGN_CONTENT value "baseline"

  /**
   * align-content: stretch;
   * - [documentation](https://tailwindcss.com/docs/align-content#stretch)
   */
  @StyleValueMarker
  val content_stretch get() = ALIGN_CONTENT value "stretch"
}
