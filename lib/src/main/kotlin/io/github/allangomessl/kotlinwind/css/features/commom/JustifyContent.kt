package io.github.allangomessl.kotlinwind.css.features.commom

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.JUSTIFY_CONTENT
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker

@Suppress("PropertyName")
interface JustifyContent<T> : KWScope<T> {

  @StyleValueMarker
  /** justify-content: normal;
   * - [documentation](https://tailwindcss.com/docs/justify-content#normal)
   * */
  val justify_normal get() = JUSTIFY_CONTENT value "justify-normal"

  @StyleValueMarker
  /** justify-content: flex-start;
   * - [documentation](https://tailwindcss.com/docs/justify-content#start)
   * */
  val justify_start get() = JUSTIFY_CONTENT value "justify-start"

  @StyleValueMarker
  /** justify-content: flex-end;
   * - [documentation](https://tailwindcss.com/docs/justify-content#end)
   * */
  val justify_end get() = JUSTIFY_CONTENT value "justify-end"

  @StyleValueMarker
  /** justify-content: center;
   * - [documentation](https://tailwindcss.com/docs/justify-content#center)
   * */
  val justify_center get() = JUSTIFY_CONTENT value "justify-center"

  @StyleValueMarker
  /** justify-content: space-between;
   * - [documentation](https://tailwindcss.com/docs/justify-content#space-between)
   * */
  val justify_between get() = JUSTIFY_CONTENT value "justify-between"

  @StyleValueMarker
  /** justify-content: space-around;
   * - [documentation](https://tailwindcss.com/docs/justify-content#space-around)
   * */
  val justify_around get() = JUSTIFY_CONTENT value "justify-around"

  @StyleValueMarker
  /** justify-content: space-evenly;
   * - [documentation](https://tailwindcss.com/docs/justify-content#space-evenly)
   * */
  val justify_evenly get() = JUSTIFY_CONTENT value "justify-evenly"

  @StyleValueMarker
  /** justify-content: stretch;
   * - [documentation](https://tailwindcss.com/docs/justify-content#stretch)
   * */
  val justify_stretch get() = JUSTIFY_CONTENT value "justify-stretch"

}
