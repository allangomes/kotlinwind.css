package io.github.allangomessl.kotlinwind.css.features.font

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.FONT_WEIGHT
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker

interface FontWeight<T> : KWScope<T> {

  /** font-weight: 100; `thin`  */
  @StyleValueMarker
  val thin get() = FONT_WEIGHT value "100"
  @StyleValueMarker
  val normal get() = FONT_WEIGHT value "400"
  @StyleValueMarker
  val bold get() = FONT_WEIGHT value "700"

  /** font-weight: 100; `thin`  */
  @StyleValueMarker
  val weight_100 get() = FONT_WEIGHT value "100"
  /** font-weight: 200; `extralight`  */
  @StyleValueMarker
  val weight_200 get() = FONT_WEIGHT value "200"
  /** font-weight: 300; `light`  */
  @StyleValueMarker
  val weight_300 get() = FONT_WEIGHT value "300"
  /** font-weight: 400; `normal`  */
  @StyleValueMarker
  val weight_400 get() = FONT_WEIGHT value "400"
  /** font-weight: 500; `medium`  */
  @StyleValueMarker
  val weight_500 get() = FONT_WEIGHT value "500"
  /** font-weight: 600; `semibold`  */
  @StyleValueMarker
  val weight_600 get() = FONT_WEIGHT value "600"
  /** font-weight: 700; `bold`  */
  @StyleValueMarker
  val weight_700 get() = FONT_WEIGHT value "700"
  /** font-weight: 800; `extrabold`  */
  @StyleValueMarker
  val weight_800 get() = FONT_WEIGHT value "800"
  /** font-weight: 900; `black`  */
  @StyleValueMarker
  val weight_900 get() = FONT_WEIGHT value "900"
}
