package io.github.allangomes.kotlinwind.css.features

import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.core.*

@Suppress("PropertyName")
interface PositionInset<T> : KWScope<T> {

  /**
   * inset: {number} * 0.25rem;
   */
  @StyleValueMarker
  val inset: WithNumber<T> get() = WithNumber {
    val value = it * 0.25
    INSET value "${value}rem"
  }

  /**
   * inset: auto;
   */
  @StyleValueMarker
  val inset_auto get() = INSET value "auto"

  /**
   * inset: 100%;
   */
  @StyleValueMarker
  val inset_full get() = INSET value "100%"


  /**
   * left: {number} * 0.25rem;
   * right: {number} * 0.25rem;
   */
  @StyleValueMarker
  val inset_x: WithNumber<T> get() = WithNumber {
    val value = it * 0.25
    LEFT value "${value}rem"
    RIGHT value "${value}rem"
  }

  /**
   * left: auto;
   * right: auto;
   */
  @StyleValueMarker
  val inset_x_auto get() = run {
    LEFT value "auto"
    RIGHT value "auto"
  }

  /**
   * left: 100%;
   * right: 100%;
   */
  @StyleValueMarker
  val inset_x_full get() = run {
    LEFT value "100%"
    RIGHT value "100%"
  }

  /**
   * top: {number} * 0.25rem;
   * bottom: {number} * 0.25rem;
   */
  @StyleValueMarker
  val inset_y: WithNumber<T>
    get() = WithNumber {
    val value = it * 0.25
    TOP value "${value}rem"
    BOTTOM value "${value}rem"
  }

  /**
   * top: auto;
   * bottom: auto;
   */
  @StyleValueMarker
  val inset_y_auto get() = run {
    TOP value "auto"
    BOTTOM value "auto"
  }

  /**
   * top: 100%;
   * bottom: 100%;
   */
  @StyleValueMarker
  val inset_y_full get() = run {
    TOP value "100%"
    BOTTOM value "100%"
  }

  /**
   * inset-inline-start: {number} * 0.25rem;
   */
  @StyleValueMarker
  val start: WithNumber<T> get() = WithNumber {
    val value = it * 0.25
    INSET_INLINE_START value "${value}rem"
  }

  /**
   * inset-inline-end: {number} * 0.25rem;
   */
  @StyleValueMarker
  val end: WithNumber<T> get() = WithNumber {
    val value = it * 0.25
    INSET_INLINE_END value "${value}rem"
  }

}
