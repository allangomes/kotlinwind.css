package io.github.allangomessl.kotlinwind.css.features.text

import io.github.allangomessl.kotlinwind.css.api.KWRoot
import io.github.allangomessl.kotlinwind.css.api.KWScope

class Text(kw: KWRoot)
  : KWScope.Scoped<Text>(kw),
  TextAlign<Text>,
  TextAlignVertical<Text>,
  TextColor<Text>
