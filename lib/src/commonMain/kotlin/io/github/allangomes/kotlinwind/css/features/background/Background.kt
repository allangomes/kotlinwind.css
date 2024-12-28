package io.github.allangomes.kotlinwind.css.features.background

import io.github.allangomes.kotlinwind.css.api.KWRoot
import io.github.allangomes.kotlinwind.css.api.KWScope

class Background(kw: KWRoot) :
  KWScope.Scoped<Background>(kw),
  BackgroundColor<Background>,
  BackgroundImage<Background>,
  BackgroundOrigin<Background>,
  BackgroundPosition<Background>,
  BackgroundRepeat<Background>,
  BackgroundSize<Background>
