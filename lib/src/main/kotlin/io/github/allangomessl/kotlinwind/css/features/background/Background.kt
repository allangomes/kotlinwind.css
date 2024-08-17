package io.github.allangomessl.kotlinwind.css.features.background

import io.github.allangomessl.kotlinwind.css.api.KWRoot
import io.github.allangomessl.kotlinwind.css.api.KWScope

class Background(kw: KWRoot) :
  KWScope.Scoped<Background>(kw),
  BackgroundColor<Background>,
  BackgroundImage<Background>,
  BackgroundOrigin<Background>,
  BackgroundPosition<Background>,
  BackgroundRepeat<Background>,
  BackgroundSize<Background>
