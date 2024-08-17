package io.github.allangomessl.kotlinwind.css.features

import io.github.allangomessl.kotlinwind.css.api.KWScope
import io.github.allangomessl.kotlinwind.css.core.DISPLAY
import io.github.allangomessl.kotlinwind.css.core.StyleValueMarker

@Suppress("PropertyName")
interface Display<T> : KWScope<T> {

  /** display: block; */
  @StyleValueMarker
  val block get() = DISPLAY value "block"
  /** display: inline-block; */
  @StyleValueMarker
  val inline_block get() = DISPLAY value "inline-block"
  /** display: inline; */
  @StyleValueMarker
  val inline get() = DISPLAY value "inline"
//  /** display: flex; */
//  @StyleValueMarker
//  val flex get() = DISPLAY value "flex"
  /** display: inline-flex; */
  @StyleValueMarker
  val inline_flex get() = DISPLAY value "inline-flex"
  /** display: table; */
  @StyleValueMarker
  val table get() = DISPLAY value "table"
  /** display: inline-table; */
  @StyleValueMarker
  val inline_table get() = DISPLAY value "inline-table"
  /** display: table-caption; */
  @StyleValueMarker
  val table_caption get() = DISPLAY value "table-caption"
  /** display: table-cell; */
  @StyleValueMarker
  val table_cell get() = DISPLAY value "table-cell"
  /** display: table-column; */
  @StyleValueMarker
  val table_column get() = DISPLAY value "table-column"
  /** display: table-column-group; */
  @StyleValueMarker
  val table_column_group get() = DISPLAY value "table-column-group"
  /** display: table-footer-group; */
  @StyleValueMarker
  val table_footer_group get() = DISPLAY value "table-footer-group"
  /** display: table-header-group; */
  @StyleValueMarker
  val table_header_group get() = DISPLAY value "table-header-group"
  /** display: table-row-group; */
  @StyleValueMarker
  val table_row_group get() = DISPLAY value "table-row-group"
  /** display: table-row; */
  @StyleValueMarker
  val table_row get() = DISPLAY value "table-row"
  /** display: flow-root; */
  @StyleValueMarker
  val flow_root get() = DISPLAY value "flow-root"
//  /** display: grid; */
//  @StyleValueMarker
//  val grid get() = DISPLAY value "grid"
  /** display: inline-grid; */
  @StyleValueMarker
  val inline_grid get() = DISPLAY value "inline-grid"
  /** display: contents; */
  @StyleValueMarker
  val contents get() = DISPLAY value "contents"
  /** display: list-item; */
  @StyleValueMarker
  val list_item get() = DISPLAY value "list-item"
  /** display: none; */
  @StyleValueMarker
  val hidden get() = DISPLAY value "none"

}
