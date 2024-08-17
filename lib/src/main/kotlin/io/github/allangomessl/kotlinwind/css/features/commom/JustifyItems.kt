package io.github.allangomessl.kotlinwind.css.features.commom

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.JUSTIFY_ITEMS
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker

@Suppress("PropertyName")
interface JustifyItems<T> : KWScope<T> {

  @StyleValueMarker
  /** justify-items: start;
   * - [documentation](https://tailwindcss.com/docs/justify-items#start)
   * */
  val justify_items_start get() = JUSTIFY_ITEMS value "start"

  @StyleValueMarker
  /** justify-items: end;
   * - [documentation](https://tailwindcss.com/docs/justify-items#end)
   * */
  val justify_items_end get() = JUSTIFY_ITEMS value "end"

  @StyleValueMarker
  /** justify-items: center;
   * - [documentation](https://tailwindcss.com/docs/justify-items#center)
   * */
  val justify_items_center get() = JUSTIFY_ITEMS value "center"

  @StyleValueMarker
  /** justify-items: stretch;
   * - [documentation](https://tailwindcss.com/docs/justify-items#stretch)
   * */
  val justify_items_stretch get() = JUSTIFY_ITEMS value "stretch"

}
