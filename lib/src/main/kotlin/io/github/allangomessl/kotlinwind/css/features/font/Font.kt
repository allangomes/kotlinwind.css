package io.github.allangomessl.kotlinwind.css.features.font

import io.github.allangomessl.kotlinwind.css.api.KWRoot
import io.github.allangomessl.kotlinwind.css.api.KWScope

class Font(kw: KWRoot) :
  KWScope.Scoped<Font>(kw),
  FontFamily<Font>,
  FontStyle<Font>,
  FontVariantNumeric<Font>,
  FontWeight<Font>,
  FontSize<Font>
