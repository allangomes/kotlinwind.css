package io.github.allangomes.kotlinwind.css.features.padding

import io.github.allangomes.kotlinwind.css.api.KWRoot
import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.config.Theme
import io.github.allangomes.kotlinwind.css.core.*
import io.github.allangomes.kotlinwind.css.core.tokens.Token

class Padding(kw: KWRoot) :
  KWScope.Scoped<Padding>(kw),
  KWScope<Padding> {

  private fun getToken(token: Token.Padding): String {
    return Theme.padding[token] ?: "none"
  }

  private fun getValue(float: Float): String {
    val value = float * 0.25
    return "${value}rem"
  }

  /** padding: `number` * 0.25rem; */
  @StyleValueMarker
  val all: WithTokenAndNumber<Padding, Token.Padding> get() = WithTokenAndNumber({
    PADDING value getToken(it)
  }, {
    PADDING value getValue(it)
  })

  operator fun get(value: Token.Padding) = all[value]
  operator fun get(value: Float) = all[value]
  operator fun get(value: Int) = all[value]

  /** padding-left: `number` * 0.25rem; padding-right: `number` * 0.25rem; */
  @StyleValueMarker
  val x: WithTokenAndNumber<Padding, Token.Padding> get() = WithTokenAndNumber({
    val value = getToken(it)
    PADDING_LEFT value value
    PADDING_RIGHT value value
  }, {
    val value = getValue(it)
    PADDING_LEFT value value
    PADDING_RIGHT value value
  })

  /** padding-top: `number` * 0.25rem; padding-bottom: `number` * 0.25rem; */
  @StyleValueMarker
  val y: WithTokenAndNumber<Padding, Token.Padding> get() = WithTokenAndNumber({
    val value = getToken(it)
    PADDING_TOP value value
    PADDING_BOTTOM value value
  }, {
    val value = getValue(it)
    PADDING_TOP value value
    PADDING_BOTTOM value value
  })

  /** padding-inline-start: `number` * 0.25rem; */
  @StyleValueMarker
  val start: WithTokenAndNumber<Padding, Token.Padding> get() = WithTokenAndNumber({
    val value = getToken(it)
    PADDING_INLINE_START value value
  }, {
    PADDING_INLINE_START value getValue(it)
  })

  /** padding-inline-end: `number` * 0.25rem; */
  @StyleValueMarker
  val end: WithTokenAndNumber<Padding, Token.Padding> get() = WithTokenAndNumber({
    val value = getToken(it)
    PADDING_INLINE_END value value
  }, {
    PADDING_INLINE_END value getValue(it)
  })

  /** padding-top: `number` * 0.25rem; */
  @StyleValueMarker
  val top: WithTokenAndNumber<Padding, Token.Padding> get() = WithTokenAndNumber({
    val value = getToken(it)
    PADDING_TOP value value
  }, {
    PADDING_TOP value getValue(it)
  })

  /** padding-right: `number` * 0.25rem; */
  @StyleValueMarker
  val right: WithTokenAndNumber<Padding, Token.Padding> get() = WithTokenAndNumber({
    val value = getToken(it)
    PADDING_RIGHT value value
  }, {
    PADDING_RIGHT value getValue(it)
  })

  /** padding-bottom: `number` * 0.25rem; */
  @StyleValueMarker
  val bottom: WithTokenAndNumber<Padding, Token.Padding> get() = WithTokenAndNumber({
    val value = getToken(it)
    PADDING_BOTTOM value value
  }, {
    PADDING_BOTTOM value getValue(it)
  })

  /** padding-left: `number` * 0.25rem; */
  @StyleValueMarker
  val left: WithTokenAndNumber<Padding, Token.Padding> get() = WithTokenAndNumber({
    val value = getToken(it)
    PADDING_LEFT value value
  }, {
    PADDING_LEFT value getValue(it)
  })

}
