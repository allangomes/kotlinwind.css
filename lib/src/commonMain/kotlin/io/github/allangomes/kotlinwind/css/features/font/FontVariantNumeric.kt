package io.github.allangomes.kotlinwind.css.features.font

import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.core.FONT_VARIANT_NUMERIC
import io.github.allangomes.kotlinwind.css.core.StyleValueMarker

@Suppress("PropertyName")
interface FontVariantNumeric<T> : KWScope<T> {

  /**
   * font-variant-numeric: normal;
   * - [documentation](https://tailwindcss.com/docs/font-variant-numeric)
   * */
  @StyleValueMarker
  val numeric_normal get() = FONT_VARIANT_NUMERIC value "normal"

  /**
   * font-variant-numeric: ordinal;
   * - [documentation](https://tailwindcss.com/docs/font-variant-numeric#ordinal)
   * */
  @StyleValueMarker
  val numeric_ordinal get() = FONT_VARIANT_NUMERIC value "ordinal"

  /**
   * font-variant-numeric: slashed-zero;
   * - [documentation](https://tailwindcss.com/docs/font-variant-numeric#slashed-zero)
   * */
  @StyleValueMarker
  val numeric_slashed get() = FONT_VARIANT_NUMERIC value "slashed-zero"

  /**
   * font-variant-numeric: lining-nums;
   * - [documentation](https://tailwindcss.com/docs/font-variant-numeric#lining-figures)
   * */
  @StyleValueMarker
  val numeric_lining get() = FONT_VARIANT_NUMERIC value "lining-nums"

  /**
   * font-variant-numeric: oldstyle-nums;
   * - [documentation](https://tailwindcss.com/docs/font-variant-numeric#oldstyle-figures)
   * */
  @StyleValueMarker
  val numeric_oldstyle get() = FONT_VARIANT_NUMERIC value "oldstyle-nums"

  /**
   * font-variant-numeric: proportional-nums;
   * - [documentation](https://tailwindcss.com/docs/font-variant-numeric#proportional-figures)
   * */
  @StyleValueMarker
  val numeric_proportional get() = FONT_VARIANT_NUMERIC value "proportional-nums"

  /**
   * font-variant-numeric: tabular-nums;
   * - [documentation](https://tailwindcss.com/docs/font-variant-numeric#tabular-figures)
   * */
  @StyleValueMarker
  val numeric_tabular get() = FONT_VARIANT_NUMERIC value "tabular-nums"

  /**
   * font-variant-numeric: diagonal-fractions;
   * - [documentation](https://tailwindcss.com/docs/font-variant-numeric#diagonal-fractions)
   * */
  @StyleValueMarker
  val numeric_diagonal_fractions get() = FONT_VARIANT_NUMERIC value "diagonal-fractions"

  /**
   * font-variant-numeric: stacked-fractions;
   * - [documentation](https://tailwindcss.com/docs/font-variant-numeric#diagonal-fractions)
   * */
  @StyleValueMarker
  val numeric_stacked_fractions get() = FONT_VARIANT_NUMERIC value "stacked-fractions"
}
