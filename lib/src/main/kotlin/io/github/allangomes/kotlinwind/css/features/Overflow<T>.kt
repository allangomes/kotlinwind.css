package io.github.allangomes.kotlinwind.css.features

import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.core.OVERFLOW
import io.github.allangomes.kotlinwind.css.core.OVERFLOW_X
import io.github.allangomes.kotlinwind.css.core.OVERFLOW_Y
import io.github.allangomes.kotlinwind.css.core.StyleValueMarker

@Suppress("PropertyName")
interface Overflow<T> : KWScope<T> {

    /** overflow: auto; */
    @StyleValueMarker
    val overflow_auto get() = OVERFLOW value "auto"

    /** overflow: hidden; */
    @StyleValueMarker
    val overflow_hidden get() = OVERFLOW value "hidden"

    /** overflow: clip; */
    @StyleValueMarker
    val overflow_clip get() = OVERFLOW value "clip"

    /** overflow: visible; */
    @StyleValueMarker
    val overflow_visible get() = OVERFLOW value "visible"

    /** overflow: scroll; */
    @StyleValueMarker
    val overflow_scroll get() = OVERFLOW value "scroll"

    /** overflow-x: auto; */
    @StyleValueMarker
    val overflow_x_auto get() = OVERFLOW_X value "auto"

    /** overflow-x: hidden; */
    @StyleValueMarker
    val overflow_x_hidden get() = OVERFLOW_X value "hidden"

    /** overflow-x: clip; */
    @StyleValueMarker
    val overflow_x_clip get() = OVERFLOW_X value "clip"

    /** overflow-x: visible; */
    @StyleValueMarker
    val overflow_x_visible get() = OVERFLOW_X value "visible"

    /** overflow-x: scroll; */
    @StyleValueMarker
    val overflow_x_scroll get() = OVERFLOW_X value "scroll"

    /** overflow-y: auto; */
    @StyleValueMarker
    val overflow_y_auto get() = OVERFLOW_Y value "auto"

    /** overflow-y: hidden; */
    @StyleValueMarker
    val overflow_y_hidden get() = OVERFLOW_Y value "hidden"

    /** overflow-y: clip; */
    @StyleValueMarker
    val overflow_y_clip get() = OVERFLOW_Y value "clip"

    /** overflow-y: visible; */
    @StyleValueMarker
    val overflow_y_visible get() = OVERFLOW_Y value "visible"

    /** overflow-y: scroll; */
    @StyleValueMarker
    val overflow_y_scroll get() = OVERFLOW_Y value "scroll"
}