package io.github.allangomessl.kotlinwind.css.features.commom

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.ALIGN_ITEMS
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker

@Suppress("PropertyName")
interface AlignItems<T> : KWScope<T> {

  /**
   * align-items: flex-start;
   * - [documentation](https://tailwindcss.com/docs/align-items#start)
   * */
  @StyleValueMarker
  val items_start get() = ALIGN_ITEMS value "flex-start"

  /**
   * align-items: flex-end;
   * - [documentation](https://tailwindcss.com/docs/align-items#end)
   * */
  @StyleValueMarker
  val items_end get() = ALIGN_ITEMS value "flex-end"

  /**
   * align-items: center;
   * - [documentation](https://tailwindcss.com/docs/align-items#center)
   * */
  @StyleValueMarker
  val items_center get() = ALIGN_ITEMS value "center"

  /**
   * align-items: baseline;
   * - [documentation](https://tailwindcss.com/docs/align-items#baseline)
   * */
  @StyleValueMarker
  val items_baseline get() = ALIGN_ITEMS value "baseline"

  /**
   * align-items: stretch;
   * - [documentation](https://tailwindcss.com/docs/align-items#stretch)
   * */
  @StyleValueMarker
  val items_stretch get() = ALIGN_ITEMS value "stretch"

}
