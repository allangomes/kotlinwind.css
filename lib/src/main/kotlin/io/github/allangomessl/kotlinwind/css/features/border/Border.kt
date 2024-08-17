package io.github.allangomessl.kotlinwind.css.features.border

import io.github.allangomessl.kotlinwind.css.api.KWRoot
import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.BORDER_STYLE
import io.github.allangomessl.kotlinwind.css.core.BORDER_WIDTH

class Border(kw: KWRoot) :
  KWScope.Scoped<Border>(kw),
  BorderColor<Border>,
  BorderRadius<Border>,
  BorderWidth<Border> {

  init {
    BORDER_WIDTH value "0px"
    BORDER_STYLE value "solid"
  }

}
