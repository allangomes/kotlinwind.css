package io.github.allangomes.kotlinwind.css.features.grid

import io.github.allangomes.kotlinwind.css.api.KWRoot
import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.features.commom.*

class Grid(kw: KWRoot) :
  KWScope.Scoped<Grid>(kw),
  AlignContent<Grid>,
  AlignItems<Grid>,
  Gap<Grid>,
  JustifyContent<Grid>,
  JustifyItems<Grid>,
  JustifySelf<Grid>,
  Order<Grid>
