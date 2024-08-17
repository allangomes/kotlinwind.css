package io.github.allangomessl.kotlinwind.css.api

data class Style(
  val key: String,
  val value: String? = null,
  val scope: String? = null
) {
  override fun toString() = "$key: $value"
}
