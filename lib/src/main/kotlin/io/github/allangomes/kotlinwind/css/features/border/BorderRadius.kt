package io.github.allangomes.kotlinwind.css.features.border

import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.config.Theme
import io.github.allangomes.kotlinwind.css.core.*
import io.github.allangomes.kotlinwind.css.core.tokens.Token

interface BorderRadius<T> : KWScope<T> {
  companion object {
    const val NONE = "0px"
  }

  val rounded: WithTokenAndInt<T, Token.BorderRadius> get() = WithTokenAndInt(
    { BORDER_RADIUS value (Theme.border_radius[it] ?: NONE) },
    { BORDER_RADIUS value "${it}px" }
  )

  val rounded_s: WithTokenAndInt<T, Token.BorderRadius> get() = WithTokenAndInt({
    BORDER_START_START_RADIUS value (Theme.border_radius[it] ?: NONE)
    BORDER_END_START_RADIUS value (Theme.border_radius[it] ?: NONE)
  }, {
    BORDER_START_START_RADIUS value "${it}px"
    BORDER_END_START_RADIUS value "${it}px"
  })

  val rounded_e: WithTokenAndNumber<T, Token.BorderRadius> get() = WithTokenAndNumber({
    BORDER_START_END_RADIUS value (Theme.border_radius[it] ?: NONE)
    BORDER_END_END_RADIUS value (Theme.border_radius[it] ?: NONE)
  }, {
    BORDER_START_END_RADIUS value "${it}px"
    BORDER_END_END_RADIUS value "${it}px"
  })

  val rounded_t: WithTokenAndNumber<T, Token.BorderRadius> get() = WithTokenAndNumber({
    BORDER_TOP_LEFT_RADIUS value (Theme.border_radius[it] ?: NONE)
    BORDER_TOP_RIGHT_RADIUS value (Theme.border_radius[it] ?: NONE)
  }, {
    BORDER_TOP_LEFT_RADIUS value "${it}px"
    BORDER_TOP_RIGHT_RADIUS value "${it}px"
  })

  val rounded_r: WithTokenAndNumber<T, Token.BorderRadius> get() = WithTokenAndNumber({
    BORDER_TOP_RIGHT_RADIUS value (Theme.border_radius[it] ?: NONE)
    BORDER_BOTTOM_RIGHT_RADIUS value (Theme.border_radius[it] ?: NONE)
  }, {
    BORDER_TOP_RIGHT_RADIUS value "${it}px"
    BORDER_BOTTOM_RIGHT_RADIUS value "${it}px"
  })

  val rounded_b: WithTokenAndNumber<T, Token.BorderRadius> get() = WithTokenAndNumber({
    BORDER_BOTTOM_RIGHT_RADIUS value (Theme.border_radius[it] ?: NONE)
    BORDER_BOTTOM_LEFT_RADIUS value (Theme.border_radius[it] ?: NONE)
  }, {
    BORDER_BOTTOM_RIGHT_RADIUS value "${it}px"
    BORDER_BOTTOM_LEFT_RADIUS value "${it}px"
  })

  val rounded_l: WithTokenAndNumber<T, Token.BorderRadius> get() = WithTokenAndNumber({
    BORDER_TOP_LEFT_RADIUS value (Theme.border_radius[it] ?: NONE)
    BORDER_BOTTOM_LEFT_RADIUS value (Theme.border_radius[it] ?: NONE)
  }, {
    BORDER_TOP_LEFT_RADIUS value "${it}px"
    BORDER_BOTTOM_LEFT_RADIUS value "${it}px"
  })

  val rounded_ss: WithTokenAndNumber<T, Token.BorderRadius> get() = WithTokenAndNumber({
    BORDER_START_START_RADIUS value (Theme.border_radius[it] ?: NONE)
  }, {
    BORDER_START_START_RADIUS value "${it}px"
  })

  val rounded_se: WithTokenAndNumber<T, Token.BorderRadius> get() = WithTokenAndNumber({
    BORDER_START_END_RADIUS value (Theme.border_radius[it] ?: NONE)
  }, {
    BORDER_START_END_RADIUS value "${it}px"
  })

  val rounded_ee: WithTokenAndNumber<T, Token.BorderRadius> get() = WithTokenAndNumber({
    BORDER_END_END_RADIUS value (Theme.border_radius[it] ?: NONE)
  }, {
    BORDER_END_END_RADIUS value "${it}px"
  })

  val rounded_es: WithTokenAndNumber<T, Token.BorderRadius> get() = WithTokenAndNumber({
    BORDER_END_START_RADIUS value (Theme.border_radius[it] ?: NONE)
  }, {
    BORDER_END_START_RADIUS value "${it}px"
  })

  val rounded_tl: WithTokenAndNumber<T, Token.BorderRadius> get() = WithTokenAndNumber({
    BORDER_TOP_LEFT_RADIUS value (Theme.border_radius[it] ?: NONE)
  }, {
    BORDER_TOP_LEFT_RADIUS value "${it}px"
  })

  val rounded_tr: WithTokenAndNumber<T, Token.BorderRadius> get() = WithTokenAndNumber({
    BORDER_TOP_RIGHT_RADIUS value (Theme.border_radius[it] ?: NONE)
  }, {
    BORDER_TOP_RIGHT_RADIUS value "${it}px"
  })

  val rounded_br: WithTokenAndNumber<T, Token.BorderRadius> get() = WithTokenAndNumber({
    BORDER_BOTTOM_RIGHT_RADIUS value (Theme.border_radius[it] ?: NONE)
  }, {
    BORDER_BOTTOM_RIGHT_RADIUS value "${it}px"
  })

  val rounded_bl: WithTokenAndNumber<T, Token.BorderRadius> get() = WithTokenAndNumber({
    BORDER_BOTTOM_LEFT_RADIUS value (Theme.border_radius[it] ?: NONE)
  }, {
    BORDER_BOTTOM_LEFT_RADIUS value "${it}px"
  })

}
