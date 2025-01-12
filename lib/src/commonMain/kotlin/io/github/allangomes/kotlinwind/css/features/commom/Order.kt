package io.github.allangomes.kotlinwind.css.features.commom

import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.core.ORDER
import io.github.allangomes.kotlinwind.css.core.StyleValueMarker
import io.github.allangomes.kotlinwind.css.core.WithToken

@Suppress("PropertyName")
interface Order<T> : KWScope<T> {

  /**
   * `order: {number};`
   * - [documentation](https://tailwindcss.com/docs/order)
   * */
  @StyleValueMarker
  val order: WithToken<T, Int> get() = WithToken {
    ORDER value it.toString()
  }

  /**
   * `order: -9999;`
   * - [documentation](https://tailwindcss.com/docs/order)
   * */
  @StyleValueMarker
  val order_first get() = ORDER value "-9999"
  /**
   * `order: 9999;`
   * - [documentation](https://tailwindcss.com/docs/order)
   * */
  @StyleValueMarker
  val order_last get() = ORDER value "9999"
  /**
   * `order: 0;`
   * - [documentation](https://tailwindcss.com/docs/order)
   * */
  @StyleValueMarker
  val order_none get() = ORDER value "0"

}
