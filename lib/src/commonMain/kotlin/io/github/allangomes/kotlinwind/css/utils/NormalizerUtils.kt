package io.github.allangomes.kotlinwind.css.utils

import kotlin.math.pow
import kotlin.math.ceil
import kotlin.math.floor

/**
 * Normalize the decimal value to a string and round it to the nearest integer to avoid inconsistencies
 * between different platforms.
 * @see https://youtrack.jetbrains.com/issue/KT-57189
 */
fun normalizeDecimal(value: Float): String {
    val roundedValue = value.roundToDecimalPlaces()
    return if (roundedValue % 1.0f == 0.0f) {
        roundedValue.toInt().toString()
    } else {
        roundedValue.toString().trimEnd('0').trimEnd('.')
    }
}

/**
 * Rounds a Float to a specific number of decimal places.
 * Ensure rounding behaves consistently across platforms.
 */
fun Float.roundToDecimalPlaces(decimalPlaces: Int = 5): Float {
    val factor = 10.0.pow(decimalPlaces).toFloat()
    return (this * factor).roundToNearest() / factor
}

fun Float.roundToNearest(): Float {
    return if (this >= 0) floor(this + 0.5f) else ceil(this - 0.5f)
}
