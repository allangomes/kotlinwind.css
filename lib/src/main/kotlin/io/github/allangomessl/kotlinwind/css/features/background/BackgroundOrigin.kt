package io.github.allangomessl.kotlinwind.css.features.background

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.BACKGROUND_ORIGIN
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker

@Suppress("PropertyName")
interface BackgroundOrigin<T> : KWScope<T> {

  /**
   * background-origin: border-box;
   * * [Documentation](https://tailwindcss.com/docs/background-origin)
   * */
  @StyleValueMarker
  val origin_border get() = BACKGROUND_ORIGIN value "border-box"

  /**
   * background-origin: padding-box;
   * * [Documentation](https://tailwindcss.com/docs/background-origin)
   * */
  @StyleValueMarker
  val origin_padding get() = BACKGROUND_ORIGIN value "padding-box"
  /**
   * background-origin: content-box;
   * * [Documentation](https://tailwindcss.com/docs/background-origin)
   * */
  @StyleValueMarker
  val origin_content get() = BACKGROUND_ORIGIN value "content-box"

}
