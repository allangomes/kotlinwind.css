package io.github.allangomes.kotlinwind.css.features

import io.github.allangomes.kotlinwind.css.api.KWRoot
import io.github.allangomes.kotlinwind.css.api.Style
import io.github.allangomes.kotlinwind.css.core.StyleKeyMarker
import io.github.allangomes.kotlinwind.css.extensions.inline
import io.github.allangomes.kotlinwind.css.features.background.Background
import io.github.allangomes.kotlinwind.css.features.box.Box
import io.github.allangomes.kotlinwind.css.features.flex.Flex
import io.github.allangomes.kotlinwind.css.features.font.Font
import io.github.allangomes.kotlinwind.css.features.grid.Grid
import io.github.allangomes.kotlinwind.css.features.margin.Margin
import io.github.allangomes.kotlinwind.css.features.mask.Mask
import io.github.allangomes.kotlinwind.css.features.padding.Padding
import io.github.allangomes.kotlinwind.css.features.sizing.Sizing
import io.github.allangomes.kotlinwind.css.features.text.Text
import io.github.allangomes.kotlinwind.css.features.text_decoration.TextDecoration

typealias StyleBuilder = Root.() -> Unit

class Root : KWRoot,
  AspectRatio<Root>,
  BreakAfter<Root>,
  BreakBefore<Root>,
  Clear<Root>,
  Display<Root>,
  Floats<Root>,
  ObjectFit<Root>,
  ObjectPosition<Root>,
  Opacity<Root>,
  Position<Root>,
  PositionBottom<Root>,
  PositionInset<Root>,
  PositionLeft<Root>,
  PositionRight<Root>,
  PositionTop<Root>,
  Sizing<Root>
{
  private val styles: MutableList<Style> = mutableListOf()

  override fun String.value(value: String): Root {
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
  val mask: Mask get() = Mask(this)

  @StyleKeyMarker
  val border: io.github.allangomes.kotlinwind.css.features.border.Border
    get() = io.github.allangomes.kotlinwind.css.features.border.Border(
      this
    )

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

  operator fun StyleBuilder?.unaryPlus() {
    this?.invoke(this@Root)
  }

}
