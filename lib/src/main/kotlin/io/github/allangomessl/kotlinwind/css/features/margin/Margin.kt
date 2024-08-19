package io.github.allangomessl.kotlinwind.css.features.margin

import io.github.allangomessl.kotlinwind.css.api.KWRoot
import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.config.Theme
import io.github.allangomessl.kotlinwind.css.core.*
import io.github.allangomessl.kotlinwind.css.core.tokens.Token

class Margin(kw: KWRoot) :
  KWScope.Scoped<Margin>(kw),
  KWScope<Margin>
{

  private fun getToken(token: Token.Margin): String {
    return Theme.margin[token] ?: "none"
  }

  private fun getValue(float: Float): String {
    val value = float * 0.25
    return "${value}rem"
  }

  /** margin: `number` * 0.25rem; */
  @StyleValueMarker
  val all: WithTokenAndNumber<Margin, Token.Margin> get() = WithTokenAndNumber({
    MARGIN value getToken(it)
  }, {
    MARGIN value getValue(it)
  })

  /** margin-left: `number` * 0.25rem; margin-right: `number` * 0.25rem; */
  @StyleValueMarker
  val x: WithTokenAndNumber<Margin, Token.Margin> get() = WithTokenAndNumber({
    val value = getToken(it)
    MARGIN_LEFT value value
    MARGIN_RIGHT value value
  }, {
    val value = getValue(it)
    MARGIN_LEFT value value
    MARGIN_RIGHT value value
  })

  /** margin-top: `number` * 0.25rem; margin-bottom: `number`rem; */
  @StyleValueMarker
  val y: WithTokenAndNumber<Margin, Token.Margin> get() = WithTokenAndNumber({
    val value = getToken(it)
    MARGIN_TOP value value
    MARGIN_BOTTOM value value
  }, {
    val value = getValue(it)
    MARGIN_TOP value value
    MARGIN_BOTTOM value value
  })

  /** margin-inline-start: `number` * 0.25rem; */
  @StyleValueMarker
  val start: WithTokenAndNumber<Margin, Token.Margin> get() = WithTokenAndNumber({
    MARGIN_INLINE_START value getToken(it)
  }, {
    MARGIN_INLINE_START value getValue(it)
  })

  /** margin-inline-end: `number` * 0.25rem; */
  @StyleValueMarker
  val end: WithTokenAndNumber<Margin, Token.Margin> get() = WithTokenAndNumber({
    MARGIN_INLINE_END value getToken(it)
  }, {
    MARGIN_INLINE_END value getValue(it)
  })

  /** margin-top: `number` * 0.25rem; */
  @StyleValueMarker
  val top: WithTokenAndNumber<Margin, Token.Margin> get() = WithTokenAndNumber({
    MARGIN_TOP value getToken(it)
  }, {
    MARGIN_TOP value getValue(it)
  })

  /** margin-right: `number` * 0.25rem; */
  @StyleValueMarker
  val right: WithTokenAndNumber<Margin, Token.Margin> get() = WithTokenAndNumber({
    MARGIN_RIGHT value getToken(it)
  }, {
    MARGIN_RIGHT value getValue(it)
  })

  /** margin-bottom: `number` * 0.25rem; */
  @StyleValueMarker
  val bottom: WithTokenAndNumber<Margin, Token.Margin> get() = WithTokenAndNumber({
    MARGIN_BOTTOM value getToken(it)
  }, {
    MARGIN_BOTTOM value getValue(it)
  })

  /** margin-left: `number` * 0.25rem; */
  @StyleValueMarker
  val left: WithTokenAndNumber<Margin, Token.Margin> get() = WithTokenAndNumber({
    MARGIN_LEFT value getToken(it)
  }, {
    MARGIN_LEFT value getValue(it)
  })

  operator fun get(value: Token.Margin) = all[value]
  operator fun get(value: Float) = all[value]
  operator fun get(value: Int) = all[value]
}
