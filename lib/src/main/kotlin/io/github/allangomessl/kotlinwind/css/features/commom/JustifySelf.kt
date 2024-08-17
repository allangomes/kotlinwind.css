package io.github.allangomessl.kotlinwind.css.features.commom

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.JUSTIFY_SELF
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker

@Suppress("PropertyName")
interface JustifySelf<T> : KWScope<T> {

  /**
   * justify-self: auto;
   * - [documentation](https://tailwindcss.com/docs/justify-self#auto)
   * */
  @StyleValueMarker
  val justify_self_auto get() = JUSTIFY_SELF value "auto"

  /**
   * justify-self: start;
   * - [documentation](https://tailwindcss.com/docs/justify-self#start)
   * */
  @StyleValueMarker
  val justify_self_start get() = JUSTIFY_SELF value "start"
  /**
   * justify-self: end;
   * - [documentation](https://tailwindcss.com/docs/justify-self#end)
   * */
  @StyleValueMarker
  val justify_self_end get() = JUSTIFY_SELF value "end"
  /**
   * justify-self: center;
   * - [documentation](https://tailwindcss.com/docs/justify-self#center)
   * */
  @StyleValueMarker
  val justify_self_center get() = JUSTIFY_SELF value "center"
  /**
   * justify-self: stretch;
   * - [documentation](https://tailwindcss.com/docs/justify-self#stretch)
   * */
  @StyleValueMarker
  val justify_self_stretch get() = JUSTIFY_SELF value "stretch"

}
