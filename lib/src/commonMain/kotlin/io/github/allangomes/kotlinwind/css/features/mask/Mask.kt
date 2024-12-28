package io.github.allangomes.kotlinwind.css.features.mask

import io.github.allangomes.kotlinwind.css.api.KWRoot
import io.github.allangomes.kotlinwind.css.api.KWScope

class Mask(kw: KWRoot) :
  KWScope.Scoped<Mask>(kw),
  MaskImage<Mask>,
  MaskOrigin<Mask>,
  MaskPosition<Mask>,
  MaskRepeat<Mask>,
  MaskSize<Mask>
