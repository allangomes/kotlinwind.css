package io.github.allangomessl.kotlinwind.css.features.box

import io.github.allangomessl.kotlinwind.css.api.KWRoot
import io.github.allangomessl.kotlinwind.css.api.KWScope

class Box(kw: KWRoot) :
  KWScope.Scoped<Box>(kw),
  BoxDecoration<Box>,
  BoxSizing<Box>
