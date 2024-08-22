package io.github.allangomes.kotlinwind.css.features.text

import io.github.allangomes.kotlinwind.css.api.KWRoot
import io.github.allangomes.kotlinwind.css.api.KWScope

class Text(kw: KWRoot)
  : KWScope.Scoped<Text>(kw),
  TextAlign<Text>,
  TextAlignVertical<Text>,
  TextColor<Text>,
  TextWhitespace<Text>
