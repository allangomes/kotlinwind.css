package io.github.allangomes.kotlinwind.css.features.font

import io.github.allangomes.kotlinwind.css.MONO
import io.github.allangomes.kotlinwind.css.SANS
import io.github.allangomes.kotlinwind.css.SERIF
import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.config.Theme
import io.github.allangomes.kotlinwind.css.core.FONT_FAMILY
import io.github.allangomes.kotlinwind.css.core.StyleValueMarker

interface FontFamily<T> : KWScope<T> {
  /**
   * ```
   * font-family: ui-sans-serif, system-ui, sans-serif,
   *   "Apple Color Emoji", "Segoe UI Emoji",
   *   "Segoe UI Symbol", "Noto Color Emoji";
   * ```
   *  - [documentation](https://tailwindcss.com/docs/font-family)
   */
  @StyleValueMarker
  val sans get() = FONT_FAMILY value (Theme.font_family[SANS] ?: "system-ui")

  /**
   * ```
   *  font-family: ui-serif, Georgia, Cambria, "Times New Roman", Times, serif;
   * ```
   *  - [documentation](https://tailwindcss.com/docs/font-family)
   *  */
  @StyleValueMarker
  val serif get() = FONT_FAMILY value (Theme.font_family[SERIF] ?: "system-ui")

  /**
   * ```
   * font-family: ui-monospace, SFMono-Regular, Menlo, Monaco,
   *   Consolas, "Liberation Mono", "Courier New", monospace;
   * ```
   * - [documentation](https://tailwindcss.com/docs/font-family)
   * */
  @StyleValueMarker
  val mono get() = FONT_FAMILY value (Theme.font_family[MONO] ?: "ui-monospace")
}
