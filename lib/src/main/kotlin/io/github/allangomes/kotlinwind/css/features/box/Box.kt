package io.github.allangomes.kotlinwind.css.features.box

import io.github.allangomes.kotlinwind.css.api.KWRoot
import io.github.allangomes.kotlinwind.css.api.KWScope

class Box(kw: KWRoot) :
  KWScope.Scoped<Box>(kw),
  BoxDecoration<Box>,
  BoxSizing<Box>
