package io.github.allangomessl.kotlinwind.css.features

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.OBJECT_FIT
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker

@Suppress("PropertyName")
interface ObjectFit<T> : KWScope<T> {

  /** object-fit: contain; */
  @StyleValueMarker
  val object_contain get() = OBJECT_FIT value "contain"
  /** object-fit: cover; */
  @StyleValueMarker
  val object_cover get() = OBJECT_FIT value "cover"
  /** object-fit: fill; */
  @StyleValueMarker
  val object_fill get() = OBJECT_FIT value "fill"
  /** object-fit: none; */
  @StyleValueMarker
  val object_none get() = OBJECT_FIT value "none"
  /** object-fit: scale-down; */
  @StyleValueMarker
  val object_scale_down get() = OBJECT_FIT value "scale-down"

}
