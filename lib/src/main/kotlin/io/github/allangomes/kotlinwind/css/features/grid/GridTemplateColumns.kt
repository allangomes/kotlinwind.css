package io.github.allangomes.kotlinwind.css.features.grid

import io.github.allangomes.kotlinwind.css.api.KWScope
import io.github.allangomes.kotlinwind.css.core.DISPLAY
import io.github.allangomes.kotlinwind.css.core.GRID
import io.github.allangomes.kotlinwind.css.core.GRID_TEMPLATE_COLUMNS
import io.github.allangomes.kotlinwind.css.core.WithInt

@Suppress("PropertyName")
interface GridTemplateColumns<T> : KWScope<T> {

    val cols: WithInt<T> get() = WithInt {
        DISPLAY value GRID
        GRID_TEMPLATE_COLUMNS value "repeat($it, minmax(0, 1fr))"
    }

    val cols_none: WithInt<T> get() = WithInt {
        GRID_TEMPLATE_COLUMNS value "none"
    }

    val cols_subgrid: WithInt<T> get() = WithInt {
        DISPLAY value GRID
        GRID_TEMPLATE_COLUMNS value "subgrid"
    }

}
