package io.github.allangomes.kotlinwind.css.features.text_decoration

import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.core.StyleValueMarker
import io.github.allangomes.kotlinwind.css.core.TEXT_DECORATION_STYLE


interface TextDecorationStyle<T> : KWScope<T> {

  /** text-decoration-inline: solid; */
  @StyleValueMarker
  val solid get() = TEXT_DECORATION_STYLE value "solid"
  /** text-decoration-inline: double; */
  @StyleValueMarker
  val double get() = TEXT_DECORATION_STYLE value "double"
  /** text-decoration-inline: dotted; */
  @StyleValueMarker
  val dotted get() = TEXT_DECORATION_STYLE value "dotted"
  /** text-decoration-inline: dashed; */
  @StyleValueMarker
  val dashed get() = TEXT_DECORATION_STYLE value "dashed"
  /** text-decoration-inline: wavy; */
  @StyleValueMarker
  val wavy get() = TEXT_DECORATION_STYLE value "wavy"

}
