package io.github.allangomes.kotlinwind.css.features.text

import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.core.StyleValueMarker
import io.github.allangomes.kotlinwind.css.core.WHITE_SPACE

@Suppress("PropertyName")
interface TextWhitespace<T> : KWScope<T> {

    /** white-space: normal; */
    @StyleValueMarker
    val space_normal get() = run {
        WHITE_SPACE value "normal"
    }

    /** white-space: nowrap; */
    @StyleValueMarker
    val space_nowrap get() = run {
        WHITE_SPACE value "nowrap"
    }

    /** white-space: pre; */
    @StyleValueMarker
    val space_pre get() = run {
        WHITE_SPACE value "pre"
    }

    /** white-space: pre-line; */
    @StyleValueMarker
    val space_pre_line get() = run {
        WHITE_SPACE value "pre-line"
    }

    /** white-space: pre-wrap; */
    @StyleValueMarker
    val space_pre_wrap get() = run {
        WHITE_SPACE value "pre-wrap"
    }

    /** white-space: break-spaces; */
    @StyleValueMarker
    val space_break_spaces get() = run {
        WHITE_SPACE value "break-spaces"
    }
}
