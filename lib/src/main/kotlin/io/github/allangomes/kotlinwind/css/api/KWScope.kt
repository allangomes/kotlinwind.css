package io.github.allangomes.kotlinwind.css.api

interface KWScope<T> {
  infix fun String.value(value: String): T

  @Suppress("UNCHECKED_CAST")
  abstract class Scoped<T>(private val kw: KWRoot) : KWScope<T> {
    override fun String.value(value: String): T  {
      kw.append(Style(this, value))
      return this@Scoped as T
    }
  }
}
