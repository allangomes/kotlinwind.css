package io.github.allangomes.kotlinwind.css.features.text_decoration

import io.github.allangomes.kotlinwind.css.api.KWRoot
import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.core.TEXT_DECORATION_LINE

class TextDecoration(kw: KWRoot, kind: String) :
  KWScope.Scoped<TextDecoration>(kw),
  TextDecorationStyle<TextDecoration>,
  TextDecorationThickness<TextDecoration>,
  TextUnderlineOffset<TextDecoration>,
  TextDecorationColor<TextDecoration>
{

  init {
    TEXT_DECORATION_LINE value kind
  }

}
