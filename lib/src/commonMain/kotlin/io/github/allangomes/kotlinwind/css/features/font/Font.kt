package io.github.allangomes.kotlinwind.css.features.font

import io.github.allangomes.kotlinwind.css.api.KWRoot
import io.github.allangomes.kotlinwind.css.api.KWScope

class Font(kw: KWRoot) :
  KWScope.Scoped<Font>(kw),
  FontFamily<Font>,
  FontStyle<Font>,
  FontVariantNumeric<Font>,
  FontWeight<Font>,
  FontSize<Font>
