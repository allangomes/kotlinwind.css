package io.github.allangomessl.kotlinwind.css.features.flex

import io.github.allangomessl.kotlinwind.css.api.KWRoot
import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.FLEX
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker
import io.github.allangomessl.kotlinwind.css.features.commom.AlignItems
import io.github.allangomessl.kotlinwind.css.features.commom.Gap
import io.github.allangomessl.kotlinwind.css.features.commom.JustifyContent
import io.github.allangomessl.kotlinwind.css.features.commom.Order

class Flex(kw: KWRoot) :
  KWScope.Scoped<Flex>(kw),
  FlexDirection<Flex>,
  FlexGrow<Flex>,
  FlexShrink<Flex>,
  FlexWrap<Flex>,
  AlignItems<Flex>,
  Gap<Flex>,
  JustifyContent<Flex>,
  Order<Flex>
{

  /** flex: 1 1 0%; */
  @StyleValueMarker
  val fill get() = FLEX value "1 1 0%"
  /** flex: 1 1 auto; */
  @StyleValueMarker
  val auto get() = FLEX value "1 1 auto"
  /** flex: 0 1 auto; */
  @StyleValueMarker
  val initial get() = FLEX value "0 1 auto"
  /** flex: none; */
  @StyleValueMarker
  val none get() = FLEX value "none"
}
