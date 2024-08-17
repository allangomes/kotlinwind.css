package io.github.allangomessl.kotlinwind.css.features.text

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker
import io.github.allangomessl.kotlinwind.css.core.TEXT_ALIGN

interface TextAlign<T> : KWScope<T> {

  /** text-align: left; */
  @StyleValueMarker
  val left get() = TEXT_ALIGN value "left"
  /** text-align: center; */
  @StyleValueMarker
  val center get() = TEXT_ALIGN value "center"
  /** text-align: right; */
  @StyleValueMarker
  val right get() = TEXT_ALIGN value "right"
  /** text-align: justify; */
  @StyleValueMarker
  val justify get() = TEXT_ALIGN value "justify"
  /** text-align: start; */
  @StyleValueMarker
  val start get() = TEXT_ALIGN value "start"
  /** text-align: end; */
  @StyleValueMarker
  val end get() = TEXT_ALIGN value "end"

}
