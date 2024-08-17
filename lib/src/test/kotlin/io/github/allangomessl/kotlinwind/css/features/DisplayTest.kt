package io.github.allangomessl.kotlinwind.css.features

import io.github.allangomessl.kotlinwind.css.KW
import io.github.allangomessl.kotlinwind.css.api.Style
import io.github.allangomessl.kotlinwind.css.core.DISPLAY
import kotlin.test.Test
import kotlin.test.assertEquals

class DisplayTest {


  @Test
  fun block() {
    val expected = Style(DISPLAY, "block").toString()
    val returned = KW.inline { block }
    assertEquals(expected, returned)
  }

  @Test
  fun inline_block() {
    val expected = Style(DISPLAY, "inline-block").toString()
    val returned = KW.inline { inline_block }
    assertEquals(expected, returned)
  }

  @Test
  fun inline() {
    val expected = Style(DISPLAY, "inline").toString()
    val returned = KW.inline { inline }
    assertEquals(expected, returned)
  }

  @Test
  fun inline_flex() {
    val expected = Style(DISPLAY, "inline-flex").toString()
    val returned = KW.inline { inline_flex }
    assertEquals(expected, returned)
  }

  @Test
  fun table() {
    val expected = Style(DISPLAY, "table").toString()
    val returned = KW.inline { table }
    assertEquals(expected, returned)
  }

  @Test
  fun inline_table() {
    val expected = Style(DISPLAY, "inline-table").toString()
    val returned = KW.inline { inline_table }
    assertEquals(expected, returned)
  }

  @Test
  fun table_caption() {
    val expected = Style(DISPLAY, "table-caption").toString()
    val returned = KW.inline { table_caption }
    assertEquals(expected, returned)
  }

  @Test
  fun table_cell() {
    val expected = Style(DISPLAY, "table-cell").toString()
    val returned = KW.inline { table_cell }
    assertEquals(expected, returned)
  }

  @Test
  fun table_column() {
    val expected = Style(DISPLAY, "table-column").toString()
    val returned = KW.inline { table_column }
    assertEquals(expected, returned)
  }

  @Test
  fun table_column_group() {
    val expected = Style(DISPLAY, "table-column-group").toString()
    val returned = KW.inline { table_column_group }
    assertEquals(expected, returned)
  }

  @Test
  fun table_footer_group() {
    val expected = Style(DISPLAY, "table-footer-group").toString()
    val returned = KW.inline { table_footer_group }
    assertEquals(expected, returned)
  }

  @Test
  fun table_header_group() {
    val expected = Style(DISPLAY, "table-header-group").toString()
    val returned = KW.inline { table_header_group }
    assertEquals(expected, returned)
  }

  @Test
  fun table_row_group() {
    val expected = Style(DISPLAY, "table-row-group").toString()
    val returned = KW.inline { table_row_group }
    assertEquals(expected, returned)
  }

  @Test
  fun table_row() {
    val expected = Style(DISPLAY, "table-row").toString()
    val returned = KW.inline { table_row }
    assertEquals(expected, returned)
  }

  @Test
  fun flow_root() {
    val expected = Style(DISPLAY, "flow-root").toString()
    val returned = KW.inline { flow_root }
    assertEquals(expected, returned)
  }

  @Test
  fun inline_grid() {
    val expected = Style(DISPLAY, "inline-grid").toString()
    val returned = KW.inline { inline_grid }
    assertEquals(expected, returned)
  }

  @Test
  fun contents() {
    val expected = Style(DISPLAY, "contents").toString()
    val returned = KW.inline { contents }
    assertEquals(expected, returned)
  }

  @Test
  fun list_item() {
    val expected = Style(DISPLAY, "list-item").toString()
    val returned = KW.inline { list_item }
    assertEquals(expected, returned)
  }

  @Test
  fun hidden() {
    val expected = Style(DISPLAY, "none").toString()
    val returned = KW.inline { hidden }
    assertEquals(expected, returned)
  }

}
