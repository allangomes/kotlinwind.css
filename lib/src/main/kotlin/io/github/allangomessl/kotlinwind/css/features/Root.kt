package io.github.allangomessl.kotlinwind.css.features

import io.github.allangomessl.kotlinwind.css.api.KWRoot
import io.github.allangomessl.kotlinwind.css.api.Style
import io.github.allangomessl.kotlinwind.css.core.StyleKeyMarker
import io.github.allangomessl.kotlinwind.css.extensions.inline
import io.github.allangomessl.kotlinwind.css.features.background.Background
import io.github.allangomessl.kotlinwind.css.features.border.Border
import io.github.allangomessl.kotlinwind.css.features.box.Box
import io.github.allangomessl.kotlinwind.css.features.decoration.TextDecoration
import io.github.allangomessl.kotlinwind.css.features.flex.Flex
import io.github.allangomessl.kotlinwind.css.features.font.Font
import io.github.allangomessl.kotlinwind.css.features.grid.Grid
import io.github.allangomessl.kotlinwind.css.features.margin.Margin
import io.github.allangomessl.kotlinwind.css.features.padding.Padding
import io.github.allangomessl.kotlinwind.css.features.sizing.Sizing
import io.github.allangomessl.kotlinwind.css.features.text.Text


class Root : KWRoot,
  AspectRatio<KWRoot>,
  BreakAfter<KWRoot>,
  BreakBefore<KWRoot>,
  Clear<KWRoot>,
  Display<KWRoot>,
  Floats<KWRoot>,
  ObjectFit<KWRoot>,
  ObjectPosition<KWRoot>,
  Position<KWRoot>,
  PositionBottom<KWRoot>,
  PositionInset<KWRoot>,
  PositionLeft<KWRoot>,
  PositionRight<KWRoot>,
  PositionTop<KWRoot>,
  Sizing<KWRoot>
{
  private val styles: MutableList<Style> = mutableListOf()

  override fun String.value(value: String): KWRoot {
    append(Style(this, value))
    return this@Root
  }

  override fun append(style: Style) {
    styles += style
  }

  internal fun toCSSInline(): String {
    return styles.inline()
  }

  @StyleKeyMarker
  val background: Background get() = Background(this)

  @StyleKeyMarker
  val border: Border get() = Border(this)

  @StyleKeyMarker
  val box: Box get() = Box(this)

  @StyleKeyMarker
  val font: Font get() = Font(this)

  @StyleKeyMarker
  val text: Text get() = Text(this)

  @StyleKeyMarker
  val grid: Grid get() = Grid(this)

  @StyleKeyMarker
  val flex: Flex get() = Flex(this)

  @StyleKeyMarker
  val padding: Padding get() = Padding(this)

  @StyleKeyMarker
  val margin: Margin get() = Margin(this)

  @StyleKeyMarker
  val underline: TextDecoration get() = TextDecoration(this, "underline")

  @StyleKeyMarker
  val overline: TextDecoration get() = TextDecoration(this, "overline")

  @StyleKeyMarker
  val line_through: TextDecoration get() = TextDecoration(this, "line-through")

  @StyleKeyMarker
  val no_decoration: Unit get() {
    TextDecoration(this, "none")
  }

}
