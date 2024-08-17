package io.github.allangomessl.kotlinwind.css.features.commom

import io.github.allangomessl.kotlinwind.css.*
import io.github.allangomessl.kotlinwind.css.config.Theme
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker
import io.github.allangomessl.kotlinwind.css.core.WithToken

@Suppress("PropertyName", "unused")
interface Color<T> {
  companion object {
    const val DEFAULT = "inherit"
  }

  val ColorWrap: (String?) -> T

  @StyleValueMarker
  val color: WithToken<T, String> get() = WithToken { ColorWrap(it) }

  /** ```
   * color: inherit;
  ```*/
  @StyleValueMarker
  val color_inherit get() = ColorWrap("inherit")

  /** ```
   * color: current;
  ```*/
  @StyleValueMarker
  val color_current get() = ColorWrap("current")

  /** ```
   * color: transparent;
  ```*/
  @StyleValueMarker
  val transparent get() = ColorWrap("transparent")

  /** ```
   * color: rgb(0 0 0);
  ```*/
  @StyleValueMarker
  val black get() = ColorWrap("#000")

  /** ```
   * color: rgb(255 255 255);
  ```*/
  @StyleValueMarker
  val white get() = ColorWrap("#FFF")

  @StyleValueMarker
  val slate get() = ColorIndex {
    ColorWrap(Theme.color[SLATE[it]])
  }

  @StyleValueMarker
  val gray get() = ColorIndex {
    ColorWrap(Theme.color[GRAY[it]])
  }

  @StyleValueMarker
  val zinc get() = ColorIndex {
    ColorWrap(Theme.color[ZINC[it]])
  }

  @StyleValueMarker
  val neutral get() = ColorIndex {
    ColorWrap(Theme.color[NEUTRAL[it]])
  }

  @StyleValueMarker
  val stone get() = ColorIndex {
    ColorWrap(Theme.color[STONE[it]])
  }

  @StyleValueMarker
  val red get() = ColorIndex {
    ColorWrap(Theme.color[RED[it]])
  }

  @StyleValueMarker
  val orange get() = ColorIndex {
    ColorWrap(Theme.color[ORANGE[it]])
  }

  @StyleValueMarker
  val amber get() = ColorIndex {
    ColorWrap(Theme.color[AMBER[it]])
  }

  @StyleValueMarker
  val yellow get() = ColorIndex {
    ColorWrap(Theme.color[YELLOW[it]])
  }

  @StyleValueMarker
  val lime get() = ColorIndex {
    ColorWrap(Theme.color[LIME[it]])
  }

  @StyleValueMarker
  val green get() = ColorIndex {
    ColorWrap(Theme.color[GREEN[it]])
  }

  @StyleValueMarker
  val emerald get() = ColorIndex {
    ColorWrap(Theme.color[EMERALD[it]])
  }

  @StyleValueMarker
  val teal get() = ColorIndex {
    ColorWrap(Theme.color[TEAL[it]])
  }

  @StyleValueMarker
  val cyan get() = ColorIndex {
    ColorWrap(Theme.color[CYAN[it]])
  }

  @StyleValueMarker
  val sky get() = ColorIndex {
    ColorWrap(Theme.color[SKY[it]])
  }

  @StyleValueMarker
  val blue get() = ColorIndex {
    ColorWrap(Theme.color[BLUE[it]])
  }

  @StyleValueMarker
  val indigo get() = ColorIndex {
    ColorWrap(Theme.color[INDIGO[it]])
  }

  @StyleValueMarker
  val violet get() = ColorIndex {
    ColorWrap(Theme.color[VIOLET[it]])
  }

  @StyleValueMarker
  val purple get() = ColorIndex {
    ColorWrap(Theme.color[PURPLE[it]])
  }

  @StyleValueMarker
  val fuchsia get() = ColorIndex {
    ColorWrap(Theme.color[FUCHSIA[it]])
  }

  @StyleValueMarker
  val pink get() = ColorIndex {
    ColorWrap(Theme.color[PINK[it]])
  }

  @StyleValueMarker
  val rose get() = ColorIndex {
    ColorWrap(Theme.color[ROSE[it]])
  }
}
