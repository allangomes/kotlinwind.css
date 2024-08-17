package io.github.allangomessl.kotlinwind.css.features

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.POSITION
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker

interface Position<T> : KWScope<T> {

  /** position: static; */
  @StyleValueMarker
  val static get() = POSITION value "static"
  /** position: fixed; */
  @StyleValueMarker
  val fixed get() = POSITION value "fixed"
  /** position: absolute; */
  @StyleValueMarker
  val absolute get() = POSITION value "absolute"
  /** position: relative; */
  @StyleValueMarker
  val relative get() = POSITION value "relative"
  /** position: sticky; */
  @StyleValueMarker
  val sticky get() = POSITION value "sticky"

}
