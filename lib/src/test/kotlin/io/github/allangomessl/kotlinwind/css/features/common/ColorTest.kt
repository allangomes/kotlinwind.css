package io.github.allangomessl.kotlinwind.css.features.common

import io.github.allangomessl.kotlinwind.css.*
import io.github.allangomessl.kotlinwind.css.api.Style
import io.github.allangomessl.kotlinwind.css.config.Theme
import io.github.allangomessl.kotlinwind.css.core.COLOR
import kotlin.test.Test
import kotlin.test.assertEquals

class ColorTest {

  @Test
  fun slate_50() {
    val expected = Style(COLOR, Theme.color[SLATE.I50]).toString()
    val returned = KW.inline {text.slate[I50]}
    assertEquals(expected, returned)
  }

  @Test
  fun slate_100() {
    val expected = Style(COLOR, Theme.color[SLATE.I100]).toString()
    val returned = KW.inline {text.slate[I100]}
    assertEquals(expected, returned)
  }

  @Test
  fun slate_200() {
    val expected = Style(COLOR, Theme.color[SLATE.I200]).toString()
    val returned = KW.inline {text.slate[I200]}
    assertEquals(expected, returned)
  }

  @Test
  fun slate_300() {
    val expected = Style(COLOR, Theme.color[SLATE.I300]).toString()
    val returned = KW.inline {text.slate[I300]}
    assertEquals(expected, returned)
  }

  @Test
  fun slate_400() {
    val expected = Style(COLOR, Theme.color[SLATE.I400]).toString()
    val returned = KW.inline {text.slate[I400]}
    assertEquals(expected, returned)
  }

  @Test
  fun slate_500() {
    val expected = Style(COLOR, Theme.color[SLATE.I500]).toString()
    val returned = KW.inline {text.slate[I500]}
    assertEquals(expected, returned)
  }

  @Test
  fun slate_600() {
    val expected = Style(COLOR, Theme.color[SLATE.I600]).toString()
    val returned = KW.inline {text.slate[I600]}
    assertEquals(expected, returned)
  }

  @Test
  fun slate_700() {
    val expected = Style(COLOR, Theme.color[SLATE.I700]).toString()
    val returned = KW.inline {text.slate[I700]}
    assertEquals(expected, returned)
  }

  @Test
  fun slate_800() {
    val expected = Style(COLOR, Theme.color[SLATE.I800]).toString()
    val returned = KW.inline {text.slate[I800]}
    assertEquals(expected, returned)
  }

  @Test
  fun slate_900() {
    val expected = Style(COLOR, Theme.color[SLATE.I900]).toString()
    val returned = KW.inline {text.slate[I900]}
    assertEquals(expected, returned)
  }

  @Test
  fun slate_950() {
    val expected = Style(COLOR, Theme.color[SLATE.I950]).toString()
    val returned = KW.inline {text.slate[I950]}
    assertEquals(expected, returned)
  }

  //gray
  @Test
  fun gray_50() {
    val expected = Style(COLOR, Theme.color[GRAY.I50]).toString()
    val returned = KW.inline {text.gray[I50]}
    assertEquals(expected, returned)
  }

  @Test
  fun gray_100() {
    val expected = Style(COLOR, Theme.color[GRAY.I100]).toString()
    val returned = KW.inline {text.gray[I100]}
    assertEquals(expected, returned)
  }

  @Test
  fun gray_200() {
    val expected = Style(COLOR, Theme.color[GRAY.I200]).toString()
    val returned = KW.inline {text.gray[I200]}
    assertEquals(expected, returned)
  }

  @Test
  fun gray_300() {
    val expected = Style(COLOR, Theme.color[GRAY.I300]).toString()
    val returned = KW.inline {text.gray[I300]}
    assertEquals(expected, returned)
  }

  @Test
  fun gray_400() {
    val expected = Style(COLOR, Theme.color[GRAY.I400]).toString()
    val returned = KW.inline {text.gray[I400]}
    assertEquals(expected, returned)
  }

  @Test
  fun gray_500() {
    val expected = Style(COLOR, Theme.color[GRAY.I500]).toString()
    val returned = KW.inline {text.gray[I500]}
    assertEquals(expected, returned)
  }

  @Test
  fun gray_600() {
    val expected = Style(COLOR, Theme.color[GRAY.I600]).toString()
    val returned = KW.inline {text.gray[I600]}
    assertEquals(expected, returned)
  }

  @Test
  fun gray_700() {
    val expected = Style(COLOR, Theme.color[GRAY.I700]).toString()
    val returned = KW.inline {text.gray[I700]}
    assertEquals(expected, returned)
  }

  @Test
  fun gray_800() {
    val expected = Style(COLOR, Theme.color[GRAY.I800]).toString()
    val returned = KW.inline {text.gray[I800]}
    assertEquals(expected, returned)
  }

  @Test
  fun gray_900() {
    val expected = Style(COLOR, Theme.color[GRAY.I900]).toString()
    val returned = KW.inline {text.gray[I900]}
    assertEquals(expected, returned)
  }

  @Test
  fun gray_950() {
    val expected = Style(COLOR, Theme.color[GRAY.I950]).toString()
    val returned = KW.inline {text.gray[I950]}
    assertEquals(expected, returned)
  }

  //zync
  @Test
  fun zinc_50() {
    val expected = Style(COLOR, Theme.color[ZINC.I50]).toString()
    val returned = KW.inline {text.zinc[I50]}
    assertEquals(expected, returned)
  }

  @Test
  fun zinc_100() {
    val expected = Style(COLOR, Theme.color[ZINC.I100]).toString()
    val returned = KW.inline {text.zinc[I100]}
    assertEquals(expected, returned)
  }

  @Test
  fun zinc_200() {
    val expected = Style(COLOR, Theme.color[ZINC.I200]).toString()
    val returned = KW.inline {text.zinc[I200]}
    assertEquals(expected, returned)
  }

  @Test
  fun zinc_300() {
    val expected = Style(COLOR, Theme.color[ZINC.I300]).toString()
    val returned = KW.inline {text.zinc[I300]}
    assertEquals(expected, returned)
  }

  @Test
  fun zinc_400() {
    val expected = Style(COLOR, Theme.color[ZINC.I400]).toString()
    val returned = KW.inline {text.zinc[I400]}
    assertEquals(expected, returned)
  }

  @Test
  fun zinc_500() {
    val expected = Style(COLOR, Theme.color[ZINC.I500]).toString()
    val returned = KW.inline {text.zinc[I500]}
    assertEquals(expected, returned)
  }

  @Test
  fun zinc_600() {
    val expected = Style(COLOR, Theme.color[ZINC.I600]).toString()
    val returned = KW.inline {text.zinc[I600]}
    assertEquals(expected, returned)
  }

  @Test
  fun zinc_700() {
    val expected = Style(COLOR, Theme.color[ZINC.I700]).toString()
    val returned = KW.inline {text.zinc[I700]}
    assertEquals(expected, returned)
  }

  @Test
  fun zinc_800() {
    val expected = Style(COLOR, Theme.color[ZINC.I800]).toString()
    val returned = KW.inline {text.zinc[I800]}
    assertEquals(expected, returned)
  }

  @Test
  fun zinc_900() {
    val expected = Style(COLOR, Theme.color[ZINC.I900]).toString()
    val returned = KW.inline {text.zinc[I900]}
    assertEquals(expected, returned)
  }

  @Test
  fun zinc_950() {
    val expected = Style(COLOR, Theme.color[ZINC.I950]).toString()
    val returned = KW.inline {text.zinc[I950]}
    assertEquals(expected, returned)
  }

  //neutral
  @Test
  fun neutral_50() {
    val expected = Style(COLOR, Theme.color[NEUTRAL.I50]).toString()
    val returned = KW.inline {text.neutral[I50]}
    assertEquals(expected, returned)
  }

  @Test
  fun neutral_100() {
    val expected = Style(COLOR, Theme.color[NEUTRAL.I100]).toString()
    val returned = KW.inline {text.neutral[I100]}
    assertEquals(expected, returned)
  }

  @Test
  fun neutral_200() {
    val expected = Style(COLOR, Theme.color[NEUTRAL.I200]).toString()
    val returned = KW.inline {text.neutral[I200]}
    assertEquals(expected, returned)
  }

  @Test
  fun neutral_300() {
    val expected = Style(COLOR, Theme.color[NEUTRAL.I300]).toString()
    val returned = KW.inline {text.neutral[I300]}
    assertEquals(expected, returned)
  }

  @Test
  fun neutral_400() {
    val expected = Style(COLOR, Theme.color[NEUTRAL.I400]).toString()
    val returned = KW.inline {text.neutral[I400]}
    assertEquals(expected, returned)
  }

  @Test
  fun neutral_500() {
    val expected = Style(COLOR, Theme.color[NEUTRAL.I500]).toString()
    val returned = KW.inline {text.neutral[I500]}
    assertEquals(expected, returned)
  }

  @Test
  fun neutral_600() {
    val expected = Style(COLOR, Theme.color[NEUTRAL.I600]).toString()
    val returned = KW.inline {text.neutral[I600]}
    assertEquals(expected, returned)
  }

  @Test
  fun neutral_700() {
    val expected = Style(COLOR, Theme.color[NEUTRAL.I700]).toString()
    val returned = KW.inline {text.neutral[I700]}
    assertEquals(expected, returned)
  }

  @Test
  fun neutral_800() {
    val expected = Style(COLOR, Theme.color[NEUTRAL.I800]).toString()
    val returned = KW.inline {text.neutral[I800]}
    assertEquals(expected, returned)
  }

  @Test
  fun neutral_900() {
    val expected = Style(COLOR, Theme.color[NEUTRAL.I900]).toString()
    val returned = KW.inline {text.neutral[I900]}
    assertEquals(expected, returned)
  }

  @Test
  fun neutral_950() {
    val expected = Style(COLOR, Theme.color[NEUTRAL.I950]).toString()
    val returned = KW.inline {text.neutral[I950]}
    assertEquals(expected, returned)
  }

  //stone
  @Test
  fun stone_50() {
    val expected = Style(COLOR, Theme.color[STONE.I50]).toString()
    val returned = KW.inline {text.stone[I50]}
    assertEquals(expected, returned)
  }

  @Test
  fun stone_100() {
    val expected = Style(COLOR, Theme.color[STONE.I100]).toString()
    val returned = KW.inline {text.stone[I100]}
    assertEquals(expected, returned)
  }

  @Test
  fun stone_200() {
    val expected = Style(COLOR, Theme.color[STONE.I200]).toString()
    val returned = KW.inline {text.stone[I200]}
    assertEquals(expected, returned)
  }

  @Test
  fun stone_300() {
    val expected = Style(COLOR, Theme.color[STONE.I300]).toString()
    val returned = KW.inline {text.stone[I300]}
    assertEquals(expected, returned)
  }

  @Test
  fun stone_400() {
    val expected = Style(COLOR, Theme.color[STONE.I400]).toString()
    val returned = KW.inline {text.stone[I400]}
    assertEquals(expected, returned)
  }

  @Test
  fun stone_500() {
    val expected = Style(COLOR, Theme.color[STONE.I500]).toString()
    val returned = KW.inline {text.stone[I500]}
    assertEquals(expected, returned)
  }

  @Test
  fun stone_600() {
    val expected = Style(COLOR, Theme.color[STONE.I600]).toString()
    val returned = KW.inline {text.stone[I600]}
    assertEquals(expected, returned)
  }

  @Test
  fun stone_700() {
    val expected = Style(COLOR, Theme.color[STONE.I700]).toString()
    val returned = KW.inline {text.stone[I700]}
    assertEquals(expected, returned)
  }

  @Test
  fun stone_800() {
    val expected = Style(COLOR, Theme.color[STONE.I800]).toString()
    val returned = KW.inline {text.stone[I800]}
    assertEquals(expected, returned)
  }

  @Test
  fun stone_900() {
    val expected = Style(COLOR, Theme.color[STONE.I900]).toString()
    val returned = KW.inline {text.stone[I900]}
    assertEquals(expected, returned)
  }

  @Test
  fun stone_950() {
    val expected = Style(COLOR, Theme.color[STONE.I950]).toString()
    val returned = KW.inline {text.stone[I950]}
    assertEquals(expected, returned)
  }

  //red
  @Test
  fun red_50() {
    val expected = Style(COLOR, Theme.color[RED.I50]).toString()
    val returned = KW.inline {text.red[I50]}
    assertEquals(expected, returned)
  }

  @Test
  fun red_100() {
    val expected = Style(COLOR, Theme.color[RED.I100]).toString()
    val returned = KW.inline {text.red[I100]}
    assertEquals(expected, returned)
  }

  @Test
  fun red_200() {
    val expected = Style(COLOR, Theme.color[RED.I200]).toString()
    val returned = KW.inline {text.red[I200]}
    assertEquals(expected, returned)
  }

  @Test
  fun red_300() {
    val expected = Style(COLOR, Theme.color[RED.I300]).toString()
    val returned = KW.inline {text.red[I300]}
    assertEquals(expected, returned)
  }

  @Test
  fun red_400() {
    val expected = Style(COLOR, Theme.color[RED.I400]).toString()
    val returned = KW.inline {text.red[I400]}
    assertEquals(expected, returned)
  }

  @Test
  fun red_500() {
    val expected = Style(COLOR, Theme.color[RED.I500]).toString()
    val returned = KW.inline {text.red[I500]}
    assertEquals(expected, returned)
  }

  @Test
  fun red_600() {
    val expected = Style(COLOR, Theme.color[RED.I600]).toString()
    val returned = KW.inline {text.red[I600]}
    assertEquals(expected, returned)
  }

  @Test
  fun red_700() {
    val expected = Style(COLOR, Theme.color[RED.I700]).toString()
    val returned = KW.inline {text.red[I700]}
    assertEquals(expected, returned)
  }

  @Test
  fun red_800() {
    val expected = Style(COLOR, Theme.color[RED.I800]).toString()
    val returned = KW.inline {text.red[I800]}
    assertEquals(expected, returned)
  }

  @Test
  fun red_900() {
    val expected = Style(COLOR, Theme.color[RED.I900]).toString()
    val returned = KW.inline {text.red[I900]}
    assertEquals(expected, returned)
  }

  @Test
  fun red_950() {
    val expected = Style(COLOR, Theme.color[RED.I950]).toString()
    val returned = KW.inline {text.red[I950]}
    assertEquals(expected, returned)
  }

  //orange
  @Test
  fun orange_50() {
    val expected = Style(COLOR, Theme.color[ORANGE.I50]).toString()
    val returned = KW.inline {text.orange[I50]}
    assertEquals(expected, returned)
  }

  @Test
  fun orange_100() {
    val expected = Style(COLOR, Theme.color[ORANGE.I100]).toString()
    val returned = KW.inline {text.orange[I100]}
    assertEquals(expected, returned)
  }

  @Test
  fun orange_200() {
    val expected = Style(COLOR, Theme.color[ORANGE.I200]).toString()
    val returned = KW.inline {text.orange[I200]}
    assertEquals(expected, returned)
  }

  @Test
  fun orange_300() {
    val expected = Style(COLOR, Theme.color[ORANGE.I300]).toString()
    val returned = KW.inline {text.orange[I300]}
    assertEquals(expected, returned)
  }

  @Test
  fun orange_400() {
    val expected = Style(COLOR, Theme.color[ORANGE.I400]).toString()
    val returned = KW.inline {text.orange[I400]}
    assertEquals(expected, returned)
  }

  @Test
  fun orange_500() {
    val expected = Style(COLOR, Theme.color[ORANGE.I500]).toString()
    val returned = KW.inline {text.orange[I500]}
    assertEquals(expected, returned)
  }

  @Test
  fun orange_600() {
    val expected = Style(COLOR, Theme.color[ORANGE.I600]).toString()
    val returned = KW.inline {text.orange[I600]}
    assertEquals(expected, returned)
  }

  @Test
  fun orange_700() {
    val expected = Style(COLOR, Theme.color[ORANGE.I700]).toString()
    val returned = KW.inline {text.orange[I700]}
    assertEquals(expected, returned)
  }

  @Test
  fun orange_800() {
    val expected = Style(COLOR, Theme.color[ORANGE.I800]).toString()
    val returned = KW.inline {text.orange[I800]}
    assertEquals(expected, returned)
  }

  @Test
  fun orange_900() {
    val expected = Style(COLOR, Theme.color[ORANGE.I900]).toString()
    val returned = KW.inline {text.orange[I900]}
    assertEquals(expected, returned)
  }

  @Test
  fun orange_950() {
    val expected = Style(COLOR, Theme.color[ORANGE.I950]).toString()
    val returned = KW.inline {text.orange[I950]}
    assertEquals(expected, returned)
  }

  //amber
  @Test
  fun amber_50() {
    val expected = Style(COLOR, Theme.color[AMBER.I50]).toString()
    val returned = KW.inline {text.amber[I50]}
    assertEquals(expected, returned)
  }

  @Test
  fun amber_100() {
    val expected = Style(COLOR, Theme.color[AMBER.I100]).toString()
    val returned = KW.inline {text.amber[I100]}
    assertEquals(expected, returned)
  }

  @Test
  fun amber_200() {
    val expected = Style(COLOR, Theme.color[AMBER.I200]).toString()
    val returned = KW.inline {text.amber[I200]}
    assertEquals(expected, returned)
  }

  @Test
  fun amber_300() {
    val expected = Style(COLOR, Theme.color[AMBER.I300]).toString()
    val returned = KW.inline {text.amber[I300]}
    assertEquals(expected, returned)
  }

  @Test
  fun amber_400() {
    val expected = Style(COLOR, Theme.color[AMBER.I400]).toString()
    val returned = KW.inline {text.amber[I400]}
    assertEquals(expected, returned)
  }

  @Test
  fun amber_500() {
    val expected = Style(COLOR, Theme.color[AMBER.I500]).toString()
    val returned = KW.inline {text.amber[I500]}
    assertEquals(expected, returned)
  }

  @Test
  fun amber_600() {
    val expected = Style(COLOR, Theme.color[AMBER.I600]).toString()
    val returned = KW.inline {text.amber[I600]}
    assertEquals(expected, returned)
  }

  @Test
  fun amber_700() {
    val expected = Style(COLOR, Theme.color[AMBER.I700]).toString()
    val returned = KW.inline {text.amber[I700]}
    assertEquals(expected, returned)
  }

  @Test
  fun amber_800() {
    val expected = Style(COLOR, Theme.color[AMBER.I800]).toString()
    val returned = KW.inline {text.amber[I800]}
    assertEquals(expected, returned)
  }

  @Test
  fun amber_900() {
    val expected = Style(COLOR, Theme.color[AMBER.I900]).toString()
    val returned = KW.inline {text.amber[I900]}
    assertEquals(expected, returned)
  }

  @Test
  fun amber_950() {
    val expected = Style(COLOR, Theme.color[AMBER.I950]).toString()
    val returned = KW.inline {text.amber[I950]}
    assertEquals(expected, returned)
  }

  //yellow
  @Test
  fun yellow_50() {
    val expected = Style(COLOR, Theme.color[YELLOW.I50]).toString()
    val returned = KW.inline {text.yellow[I50]}
    assertEquals(expected, returned)
  }

  @Test
  fun yellow_100() {
    val expected = Style(COLOR, Theme.color[YELLOW.I100]).toString()
    val returned = KW.inline {text.yellow[I100]}
    assertEquals(expected, returned)
  }

  @Test
  fun yellow_200() {
    val expected = Style(COLOR, Theme.color[YELLOW.I200]).toString()
    val returned = KW.inline {text.yellow[I200]}
    assertEquals(expected, returned)
  }

  @Test
  fun yellow_300() {
    val expected = Style(COLOR, Theme.color[YELLOW.I300]).toString()
    val returned = KW.inline {text.yellow[I300]}
    assertEquals(expected, returned)
  }

  @Test
  fun yellow_400() {
    val expected = Style(COLOR, Theme.color[YELLOW.I400]).toString()
    val returned = KW.inline {text.yellow[I400]}
    assertEquals(expected, returned)
  }

  @Test
  fun yellow_500() {
    val expected = Style(COLOR, Theme.color[YELLOW.I500]).toString()
    val returned = KW.inline {text.yellow[I500]}
    assertEquals(expected, returned)
  }

  @Test
  fun yellow_600() {
    val expected = Style(COLOR, Theme.color[YELLOW.I600]).toString()
    val returned = KW.inline {text.yellow[I600]}
    assertEquals(expected, returned)
  }

  @Test
  fun yellow_700() {
    val expected = Style(COLOR, Theme.color[YELLOW.I700]).toString()
    val returned = KW.inline {text.yellow[I700]}
    assertEquals(expected, returned)
  }

  @Test
  fun yellow_800() {
    val expected = Style(COLOR, Theme.color[YELLOW.I800]).toString()
    val returned = KW.inline {text.yellow[I800]}
    assertEquals(expected, returned)
  }

  @Test
  fun yellow_900() {
    val expected = Style(COLOR, Theme.color[YELLOW.I900]).toString()
    val returned = KW.inline {text.yellow[I900]}
    assertEquals(expected, returned)
  }

  @Test
  fun yellow_950() {
    val expected = Style(COLOR, Theme.color[YELLOW.I950]).toString()
    val returned = KW.inline {text.yellow[I950]}
    assertEquals(expected, returned)
  }

  //lime
  @Test
  fun lime_50() {
    val expected = Style(COLOR, Theme.color[LIME.I50]).toString()
    val returned = KW.inline {text.lime[I50]}
    assertEquals(expected, returned)
  }

  @Test
  fun lime_100() {
    val expected = Style(COLOR, Theme.color[LIME.I100]).toString()
    val returned = KW.inline {text.lime[I100]}
    assertEquals(expected, returned)
  }

  @Test
  fun lime_200() {
    val expected = Style(COLOR, Theme.color[LIME.I200]).toString()
    val returned = KW.inline {text.lime[I200]}
    assertEquals(expected, returned)
  }

  @Test
  fun lime_300() {
    val expected = Style(COLOR, Theme.color[LIME.I300]).toString()
    val returned = KW.inline {text.lime[I300]}
    assertEquals(expected, returned)
  }

  @Test
  fun lime_400() {
    val expected = Style(COLOR, Theme.color[LIME.I400]).toString()
    val returned = KW.inline {text.lime[I400]}
    assertEquals(expected, returned)
  }

  @Test
  fun lime_500() {
    val expected = Style(COLOR, Theme.color[LIME.I500]).toString()
    val returned = KW.inline {text.lime[I500]}
    assertEquals(expected, returned)
  }

  @Test
  fun lime_600() {
    val expected = Style(COLOR, Theme.color[LIME.I600]).toString()
    val returned = KW.inline {text.lime[I600]}
    assertEquals(expected, returned)
  }

  @Test
  fun lime_700() {
    val expected = Style(COLOR, Theme.color[LIME.I700]).toString()
    val returned = KW.inline {text.lime[I700]}
    assertEquals(expected, returned)
  }

  @Test
  fun lime_800() {
    val expected = Style(COLOR, Theme.color[LIME.I800]).toString()
    val returned = KW.inline {text.lime[I800]}
    assertEquals(expected, returned)
  }

  @Test
  fun lime_900() {
    val expected = Style(COLOR, Theme.color[LIME.I900]).toString()
    val returned = KW.inline {text.lime[I900]}
    assertEquals(expected, returned)
  }

  @Test
  fun lime_950() {
    val expected = Style(COLOR, Theme.color[LIME.I950]).toString()
    val returned = KW.inline {text.lime[I950]}
    assertEquals(expected, returned)
  }

  //green
  @Test
  fun green_50() {
    val expected = Style(COLOR, Theme.color[GREEN.I50]).toString()
    val returned = KW.inline {text.green[I50]}
    assertEquals(expected, returned)
  }

  @Test
  fun green_100() {
    val expected = Style(COLOR, Theme.color[GREEN.I100]).toString()
    val returned = KW.inline {text.green[I100]}
    assertEquals(expected, returned)
  }

  @Test
  fun green_200() {
    val expected = Style(COLOR, Theme.color[GREEN.I200]).toString()
    val returned = KW.inline {text.green[I200]}
    assertEquals(expected, returned)
  }

  @Test
  fun green_300() {
    val expected = Style(COLOR, Theme.color[GREEN.I300]).toString()
    val returned = KW.inline {text.green[I300]}
    assertEquals(expected, returned)
  }

  @Test
  fun green_400() {
    val expected = Style(COLOR, Theme.color[GREEN.I400]).toString()
    val returned = KW.inline {text.green[I400]}
    assertEquals(expected, returned)
  }

  @Test
  fun green_500() {
    val expected = Style(COLOR, Theme.color[GREEN.I500]).toString()
    val returned = KW.inline {text.green[I500]}
    assertEquals(expected, returned)
  }

  @Test
  fun green_600() {
    val expected = Style(COLOR, Theme.color[GREEN.I600]).toString()
    val returned = KW.inline {text.green[I600]}
    assertEquals(expected, returned)
  }

  @Test
  fun green_700() {
    val expected = Style(COLOR, Theme.color[GREEN.I700]).toString()
    val returned = KW.inline {text.green[I700]}
    assertEquals(expected, returned)
  }

  @Test
  fun green_800() {
    val expected = Style(COLOR, Theme.color[GREEN.I800]).toString()
    val returned = KW.inline {text.green[I800]}
    assertEquals(expected, returned)
  }

  @Test
  fun green_900() {
    val expected = Style(COLOR, Theme.color[GREEN.I900]).toString()
    val returned = KW.inline {text.green[I900]}
    assertEquals(expected, returned)
  }

  @Test
  fun green_950() {
    val expected = Style(COLOR, Theme.color[GREEN.I950]).toString()
    val returned = KW.inline {text.green[I950]}
    assertEquals(expected, returned)
  }

  //emerald
  @Test
  fun emerald_50() {
    val expected = Style(COLOR, Theme.color[EMERALD.I50]).toString()
    val returned = KW.inline {text.emerald[I50]}
    assertEquals(expected, returned)
  }

  @Test
  fun emerald_100() {
    val expected = Style(COLOR, Theme.color[EMERALD.I100]).toString()
    val returned = KW.inline {text.emerald[I100]}
    assertEquals(expected, returned)
  }

  @Test
  fun emerald_200() {
    val expected = Style(COLOR, Theme.color[EMERALD.I200]).toString()
    val returned = KW.inline {text.emerald[I200]}
    assertEquals(expected, returned)
  }

  @Test
  fun emerald_300() {
    val expected = Style(COLOR, Theme.color[EMERALD.I300]).toString()
    val returned = KW.inline {text.emerald[I300]}
    assertEquals(expected, returned)
  }

  @Test
  fun emerald_400() {
    val expected = Style(COLOR, Theme.color[EMERALD.I400]).toString()
    val returned = KW.inline {text.emerald[I400]}
    assertEquals(expected, returned)
  }

  @Test
  fun emerald_500() {
    val expected = Style(COLOR, Theme.color[EMERALD.I500]).toString()
    val returned = KW.inline {text.emerald[I500]}
    assertEquals(expected, returned)
  }

  @Test
  fun emerald_600() {
    val expected = Style(COLOR, Theme.color[EMERALD.I600]).toString()
    val returned = KW.inline {text.emerald[I600]}
    assertEquals(expected, returned)
  }

  @Test
  fun emerald_700() {
    val expected = Style(COLOR, Theme.color[EMERALD.I700]).toString()
    val returned = KW.inline {text.emerald[I700]}
    assertEquals(expected, returned)
  }

  @Test
  fun emerald_800() {
    val expected = Style(COLOR, Theme.color[EMERALD.I800]).toString()
    val returned = KW.inline {text.emerald[I800]}
    assertEquals(expected, returned)
  }

  @Test
  fun emerald_900() {
    val expected = Style(COLOR, Theme.color[EMERALD.I900]).toString()
    val returned = KW.inline {text.emerald[I900]}
    assertEquals(expected, returned)
  }

  @Test
  fun emerald_950() {
    val expected = Style(COLOR, Theme.color[EMERALD.I950]).toString()
    val returned = KW.inline {text.emerald[I950]}
    assertEquals(expected, returned)
  }

  //teal
  @Test
  fun teal_50() {
    val expected = Style(COLOR, Theme.color[TEAL.I50]).toString()
    val returned = KW.inline {text.teal[I50]}
    assertEquals(expected, returned)
  }

  @Test
  fun teal_100() {
    val expected = Style(COLOR, Theme.color[TEAL.I100]).toString()
    val returned = KW.inline {text.teal[I100]}
    assertEquals(expected, returned)
  }

  @Test
  fun teal_200() {
    val expected = Style(COLOR, Theme.color[TEAL.I200]).toString()
    val returned = KW.inline {text.teal[I200]}
    assertEquals(expected, returned)
  }

  @Test
  fun teal_300() {
    val expected = Style(COLOR, Theme.color[TEAL.I300]).toString()
    val returned = KW.inline {text.teal[I300]}
    assertEquals(expected, returned)
  }

  @Test
  fun teal_400() {
    val expected = Style(COLOR, Theme.color[TEAL.I400]).toString()
    val returned = KW.inline {text.teal[I400]}
    assertEquals(expected, returned)
  }

  @Test
  fun teal_500() {
    val expected = Style(COLOR, Theme.color[TEAL.I500]).toString()
    val returned = KW.inline {text.teal[I500]}
    assertEquals(expected, returned)
  }

  @Test
  fun teal_600() {
    val expected = Style(COLOR, Theme.color[TEAL.I600]).toString()
    val returned = KW.inline {text.teal[I600]}
    assertEquals(expected, returned)
  }

  @Test
  fun teal_700() {
    val expected = Style(COLOR, Theme.color[TEAL.I700]).toString()
    val returned = KW.inline {text.teal[I700]}
    assertEquals(expected, returned)
  }

  @Test
  fun teal_800() {
    val expected = Style(COLOR, Theme.color[TEAL.I800]).toString()
    val returned = KW.inline {text.teal[I800]}
    assertEquals(expected, returned)
  }

  @Test
  fun teal_900() {
    val expected = Style(COLOR, Theme.color[TEAL.I900]).toString()
    val returned = KW.inline {text.teal[I900]}
    assertEquals(expected, returned)
  }

  @Test
  fun teal_950() {
    val expected = Style(COLOR, Theme.color[TEAL.I950]).toString()
    val returned = KW.inline {text.teal[I950]}
    assertEquals(expected, returned)
  }

  //cyan
  @Test
  fun cyan_50() {
    val expected = Style(COLOR, Theme.color[CYAN.I50]).toString()
    val returned = KW.inline {text.cyan[I50]}
    assertEquals(expected, returned)
  }

  @Test
  fun cyan_100() {
    val expected = Style(COLOR, Theme.color[CYAN.I100]).toString()
    val returned = KW.inline {text.cyan[I100]}
    assertEquals(expected, returned)
  }

  @Test
  fun cyan_200() {
    val expected = Style(COLOR, Theme.color[CYAN.I200]).toString()
    val returned = KW.inline {text.cyan[I200]}
    assertEquals(expected, returned)
  }

  @Test
  fun cyan_300() {
    val expected = Style(COLOR, Theme.color[CYAN.I300]).toString()
    val returned = KW.inline {text.cyan[I300]}
    assertEquals(expected, returned)
  }

  @Test
  fun cyan_400() {
    val expected = Style(COLOR, Theme.color[CYAN.I400]).toString()
    val returned = KW.inline {text.cyan[I400]}
    assertEquals(expected, returned)
  }

  @Test
  fun cyan_500() {
    val expected = Style(COLOR, Theme.color[CYAN.I500]).toString()
    val returned = KW.inline {text.cyan[I500]}
    assertEquals(expected, returned)
  }

  @Test
  fun cyan_600() {
    val expected = Style(COLOR, Theme.color[CYAN.I600]).toString()
    val returned = KW.inline {text.cyan[I600]}
    assertEquals(expected, returned)
  }

  @Test
  fun cyan_700() {
    val expected = Style(COLOR, Theme.color[CYAN.I700]).toString()
    val returned = KW.inline {text.cyan[I700]}
    assertEquals(expected, returned)
  }

  @Test
  fun cyan_800() {
    val expected = Style(COLOR, Theme.color[CYAN.I800]).toString()
    val returned = KW.inline {text.cyan[I800]}
    assertEquals(expected, returned)
  }

  @Test
  fun cyan_900() {
    val expected = Style(COLOR, Theme.color[CYAN.I900]).toString()
    val returned = KW.inline {text.cyan[I900]}
    assertEquals(expected, returned)
  }

  @Test
  fun cyan_950() {
    val expected = Style(COLOR, Theme.color[CYAN.I950]).toString()
    val returned = KW.inline {text.cyan[I950]}
    assertEquals(expected, returned)
  }

  //sky
  @Test
  fun sky_50() {
    val expected = Style(COLOR, Theme.color[SKY.I50]).toString()
    val returned = KW.inline {text.sky[I50]}
    assertEquals(expected, returned)
  }

  @Test
  fun sky_100() {
    val expected = Style(COLOR, Theme.color[SKY.I100]).toString()
    val returned = KW.inline {text.sky[I100]}
    assertEquals(expected, returned)
  }

  @Test
  fun sky_200() {
    val expected = Style(COLOR, Theme.color[SKY.I200]).toString()
    val returned = KW.inline {text.sky[I200]}
    assertEquals(expected, returned)
  }

  @Test
  fun sky_300() {
    val expected = Style(COLOR, Theme.color[SKY.I300]).toString()
    val returned = KW.inline {text.sky[I300]}
    assertEquals(expected, returned)
  }

  @Test
  fun sky_400() {
    val expected = Style(COLOR, Theme.color[SKY.I400]).toString()
    val returned = KW.inline {text.sky[I400]}
    assertEquals(expected, returned)
  }

  @Test
  fun sky_500() {
    val expected = Style(COLOR, Theme.color[SKY.I500]).toString()
    val returned = KW.inline {text.sky[I500]}
    assertEquals(expected, returned)
  }

  @Test
  fun sky_600() {
    val expected = Style(COLOR, Theme.color[SKY.I600]).toString()
    val returned = KW.inline {text.sky[I600]}
    assertEquals(expected, returned)
  }

  @Test
  fun sky_700() {
    val expected = Style(COLOR, Theme.color[SKY.I700]).toString()
    val returned = KW.inline {text.sky[I700]}
    assertEquals(expected, returned)
  }

  @Test
  fun sky_800() {
    val expected = Style(COLOR, Theme.color[SKY.I800]).toString()
    val returned = KW.inline {text.sky[I800]}
    assertEquals(expected, returned)
  }

  @Test
  fun sky_900() {
    val expected = Style(COLOR, Theme.color[SKY.I900]).toString()
    val returned = KW.inline {text.sky[I900]}
    assertEquals(expected, returned)
  }

  @Test
  fun sky_950() {
    val expected = Style(COLOR, Theme.color[SKY.I950]).toString()
    val returned = KW.inline {text.sky[I950]}
    assertEquals(expected, returned)
  }

  //blue
  @Test
  fun blue_50() {
    val expected = Style(COLOR, Theme.color[BLUE.I50]).toString()
    val returned = KW.inline {text.blue[I50]}
    assertEquals(expected, returned)
  }

  @Test
  fun blue_100() {
    val expected = Style(COLOR, Theme.color[BLUE.I100]).toString()
    val returned = KW.inline {text.blue[I100]}
    assertEquals(expected, returned)
  }

  @Test
  fun blue_200() {
    val expected = Style(COLOR, Theme.color[BLUE.I200]).toString()
    val returned = KW.inline {text.blue[I200]}
    assertEquals(expected, returned)
  }

  @Test
  fun blue_300() {
    val expected = Style(COLOR, Theme.color[BLUE.I300]).toString()
    val returned = KW.inline {text.blue[I300]}
    assertEquals(expected, returned)
  }

  @Test
  fun blue_400() {
    val expected = Style(COLOR, Theme.color[BLUE.I400]).toString()
    val returned = KW.inline {text.blue[I400]}
    assertEquals(expected, returned)
  }

  @Test
  fun blue_500() {
    val expected = Style(COLOR, Theme.color[BLUE.I500]).toString()
    val returned = KW.inline {text.blue[I500]}
    assertEquals(expected, returned)
  }

  @Test
  fun blue_600() {
    val expected = Style(COLOR, Theme.color[BLUE.I600]).toString()
    val returned = KW.inline {text.blue[I600]}
    assertEquals(expected, returned)
  }

  @Test
  fun blue_700() {
    val expected = Style(COLOR, Theme.color[BLUE.I700]).toString()
    val returned = KW.inline {text.blue[I700]}
    assertEquals(expected, returned)
  }

  @Test
  fun blue_800() {
    val expected = Style(COLOR, Theme.color[BLUE.I800]).toString()
    val returned = KW.inline {text.blue[I800]}
    assertEquals(expected, returned)
  }

  @Test
  fun blue_900() {
    val expected = Style(COLOR, Theme.color[BLUE.I900]).toString()
    val returned = KW.inline {text.blue[I900]}
    assertEquals(expected, returned)
  }

  @Test
  fun blue_950() {
    val expected = Style(COLOR, Theme.color[BLUE.I950]).toString()
    val returned = KW.inline {text.blue[I950]}
    assertEquals(expected, returned)
  }

  //indigo
  @Test
  fun indigo_50() {
    val expected = Style(COLOR, Theme.color[INDIGO.I50]).toString()
    val returned = KW.inline {text.indigo[I50]}
    assertEquals(expected, returned)
  }

  @Test
  fun indigo_100() {
    val expected = Style(COLOR, Theme.color[INDIGO.I100]).toString()
    val returned = KW.inline {text.indigo[I100]}
    assertEquals(expected, returned)
  }

  @Test
  fun indigo_200() {
    val expected = Style(COLOR, Theme.color[INDIGO.I200]).toString()
    val returned = KW.inline {text.indigo[I200]}
    assertEquals(expected, returned)
  }

  @Test
  fun indigo_300() {
    val expected = Style(COLOR, Theme.color[INDIGO.I300]).toString()
    val returned = KW.inline {text.indigo[I300]}
    assertEquals(expected, returned)
  }

  @Test
  fun indigo_400() {
    val expected = Style(COLOR, Theme.color[INDIGO.I400]).toString()
    val returned = KW.inline {text.indigo[I400]}
    assertEquals(expected, returned)
  }

  @Test
  fun indigo_500() {
    val expected = Style(COLOR, Theme.color[INDIGO.I500]).toString()
    val returned = KW.inline {text.indigo[I500]}
    assertEquals(expected, returned)
  }

  @Test
  fun indigo_600() {
    val expected = Style(COLOR, Theme.color[INDIGO.I600]).toString()
    val returned = KW.inline {text.indigo[I600]}
    assertEquals(expected, returned)
  }

  @Test
  fun indigo_700() {
    val expected = Style(COLOR, Theme.color[INDIGO.I700]).toString()
    val returned = KW.inline {text.indigo[I700]}
    assertEquals(expected, returned)
  }

  @Test
  fun indigo_800() {
    val expected = Style(COLOR, Theme.color[INDIGO.I800]).toString()
    val returned = KW.inline {text.indigo[I800]}
    assertEquals(expected, returned)
  }

  @Test
  fun indigo_900() {
    val expected = Style(COLOR, Theme.color[INDIGO.I900]).toString()
    val returned = KW.inline {text.indigo[I900]}
    assertEquals(expected, returned)
  }

  @Test
  fun indigo_950() {
    val expected = Style(COLOR, Theme.color[INDIGO.I950]).toString()
    val returned = KW.inline {text.indigo[I950]}
    assertEquals(expected, returned)
  }

  //violet
  @Test
  fun violet_50() {
    val expected = Style(COLOR, Theme.color[VIOLET.I50]).toString()
    val returned = KW.inline {text.violet[I50]}
    assertEquals(expected, returned)
  }

  @Test
  fun violet_100() {
    val expected = Style(COLOR, Theme.color[VIOLET.I100]).toString()
    val returned = KW.inline {text.violet[I100]}
    assertEquals(expected, returned)
  }

  @Test
  fun violet_200() {
    val expected = Style(COLOR, Theme.color[VIOLET.I200]).toString()
    val returned = KW.inline {text.violet[I200]}
    assertEquals(expected, returned)
  }

  @Test
  fun violet_300() {
    val expected = Style(COLOR, Theme.color[VIOLET.I300]).toString()
    val returned = KW.inline {text.violet[I300]}
    assertEquals(expected, returned)
  }

  @Test
  fun violet_400() {
    val expected = Style(COLOR, Theme.color[VIOLET.I400]).toString()
    val returned = KW.inline {text.violet[I400]}
    assertEquals(expected, returned)
  }

  @Test
  fun violet_500() {
    val expected = Style(COLOR, Theme.color[VIOLET.I500]).toString()
    val returned = KW.inline {text.violet[I500]}
    assertEquals(expected, returned)
  }

  @Test
  fun violet_600() {
    val expected = Style(COLOR, Theme.color[VIOLET.I600]).toString()
    val returned = KW.inline {text.violet[I600]}
    assertEquals(expected, returned)
  }

  @Test
  fun violet_700() {
    val expected = Style(COLOR, Theme.color[VIOLET.I700]).toString()
    val returned = KW.inline {text.violet[I700]}
    assertEquals(expected, returned)
  }

  @Test
  fun violet_800() {
    val expected = Style(COLOR, Theme.color[VIOLET.I800]).toString()
    val returned = KW.inline {text.violet[I800]}
    assertEquals(expected, returned)
  }

  @Test
  fun violet_900() {
    val expected = Style(COLOR, Theme.color[VIOLET.I900]).toString()
    val returned = KW.inline {text.violet[I900]}
    assertEquals(expected, returned)
  }

  @Test
  fun violet_950() {
    val expected = Style(COLOR, Theme.color[VIOLET.I950]).toString()
    val returned = KW.inline {text.violet[I950]}
    assertEquals(expected, returned)
  }

  //purple
  @Test
  fun purple_50() {
    val expected = Style(COLOR, Theme.color[PURPLE.I50]).toString()
    val returned = KW.inline {text.purple[I50]}
    assertEquals(expected, returned)
  }

  @Test
  fun purple_100() {
    val expected = Style(COLOR, Theme.color[PURPLE.I100]).toString()
    val returned = KW.inline {text.purple[I100]}
    assertEquals(expected, returned)
  }

  @Test
  fun purple_200() {
    val expected = Style(COLOR, Theme.color[PURPLE.I200]).toString()
    val returned = KW.inline {text.purple[I200]}
    assertEquals(expected, returned)
  }

  @Test
  fun purple_300() {
    val expected = Style(COLOR, Theme.color[PURPLE.I300]).toString()
    val returned = KW.inline {text.purple[I300]}
    assertEquals(expected, returned)
  }

  @Test
  fun purple_400() {
    val expected = Style(COLOR, Theme.color[PURPLE.I400]).toString()
    val returned = KW.inline {text.purple[I400]}
    assertEquals(expected, returned)
  }

  @Test
  fun purple_500() {
    val expected = Style(COLOR, Theme.color[PURPLE.I500]).toString()
    val returned = KW.inline {text.purple[I500]}
    assertEquals(expected, returned)
  }

  @Test
  fun purple_600() {
    val expected = Style(COLOR, Theme.color[PURPLE.I600]).toString()
    val returned = KW.inline {text.purple[I600]}
    assertEquals(expected, returned)
  }

  @Test
  fun purple_700() {
    val expected = Style(COLOR, Theme.color[PURPLE.I700]).toString()
    val returned = KW.inline {text.purple[I700]}
    assertEquals(expected, returned)
  }

  @Test
  fun purple_800() {
    val expected = Style(COLOR, Theme.color[PURPLE.I800]).toString()
    val returned = KW.inline {text.purple[I800]}
    assertEquals(expected, returned)
  }

  @Test
  fun purple_900() {
    val expected = Style(COLOR, Theme.color[PURPLE.I900]).toString()
    val returned = KW.inline {text.purple[I900]}
    assertEquals(expected, returned)
  }

  @Test
  fun purple_950() {
    val expected = Style(COLOR, Theme.color[PURPLE.I950]).toString()
    val returned = KW.inline {text.purple[I950]}
    assertEquals(expected, returned)
  }

  //fuchsia
  @Test
  fun fuchsia_50() {
    val expected = Style(COLOR, Theme.color[FUCHSIA.I50]).toString()
    val returned = KW.inline {text.fuchsia[I50]}
    assertEquals(expected, returned)
  }

  @Test
  fun fuchsia_100() {
    val expected = Style(COLOR, Theme.color[FUCHSIA.I100]).toString()
    val returned = KW.inline {text.fuchsia[I100]}
    assertEquals(expected, returned)
  }

  @Test
  fun fuchsia_200() {
    val expected = Style(COLOR, Theme.color[FUCHSIA.I200]).toString()
    val returned = KW.inline {text.fuchsia[I200]}
    assertEquals(expected, returned)
  }

  @Test
  fun fuchsia_300() {
    val expected = Style(COLOR, Theme.color[FUCHSIA.I300]).toString()
    val returned = KW.inline {text.fuchsia[I300]}
    assertEquals(expected, returned)
  }

  @Test
  fun fuchsia_400() {
    val expected = Style(COLOR, Theme.color[FUCHSIA.I400]).toString()
    val returned = KW.inline {text.fuchsia[I400]}
    assertEquals(expected, returned)
  }

  @Test
  fun fuchsia_500() {
    val expected = Style(COLOR, Theme.color[FUCHSIA.I500]).toString()
    val returned = KW.inline {text.fuchsia[I500]}
    assertEquals(expected, returned)
  }

  @Test
  fun fuchsia_600() {
    val expected = Style(COLOR, Theme.color[FUCHSIA.I600]).toString()
    val returned = KW.inline {text.fuchsia[I600]}
    assertEquals(expected, returned)
  }

  @Test
  fun fuchsia_700() {
    val expected = Style(COLOR, Theme.color[FUCHSIA.I700]).toString()
    val returned = KW.inline {text.fuchsia[I700]}
    assertEquals(expected, returned)
  }

  @Test
  fun fuchsia_800() {
    val expected = Style(COLOR, Theme.color[FUCHSIA.I800]).toString()
    val returned = KW.inline {text.fuchsia[I800]}
    assertEquals(expected, returned)
  }

  @Test
  fun fuchsia_900() {
    val expected = Style(COLOR, Theme.color[FUCHSIA.I900]).toString()
    val returned = KW.inline {text.fuchsia[I900]}
    assertEquals(expected, returned)
  }

  @Test
  fun fuchsia_950() {
    val expected = Style(COLOR, Theme.color[FUCHSIA.I950]).toString()
    val returned = KW.inline {text.fuchsia[I950]}
    assertEquals(expected, returned)
  }

  //pink
  @Test
  fun pink_50() {
    val expected = Style(COLOR, Theme.color[PINK.I50]).toString()
    val returned = KW.inline {text.pink[I50]}
    assertEquals(expected, returned)
  }

  @Test
  fun pink_100() {
    val expected = Style(COLOR, Theme.color[PINK.I100]).toString()
    val returned = KW.inline {text.pink[I100]}
    assertEquals(expected, returned)
  }

  @Test
  fun pink_200() {
    val expected = Style(COLOR, Theme.color[PINK.I200]).toString()
    val returned = KW.inline {text.pink[I200]}
    assertEquals(expected, returned)
  }

  @Test
  fun pink_300() {
    val expected = Style(COLOR, Theme.color[PINK.I300]).toString()
    val returned = KW.inline {text.pink[I300]}
    assertEquals(expected, returned)
  }

  @Test
  fun pink_400() {
    val expected = Style(COLOR, Theme.color[PINK.I400]).toString()
    val returned = KW.inline {text.pink[I400]}
    assertEquals(expected, returned)
  }

  @Test
  fun pink_500() {
    val expected = Style(COLOR, Theme.color[PINK.I500]).toString()
    val returned = KW.inline {text.pink[I500]}
    assertEquals(expected, returned)
  }

  @Test
  fun pink_600() {
    val expected = Style(COLOR, Theme.color[PINK.I600]).toString()
    val returned = KW.inline {text.pink[I600]}
    assertEquals(expected, returned)
  }

  @Test
  fun pink_700() {
    val expected = Style(COLOR, Theme.color[PINK.I700]).toString()
    val returned = KW.inline {text.pink[I700]}
    assertEquals(expected, returned)
  }

  @Test
  fun pink_800() {
    val expected = Style(COLOR, Theme.color[PINK.I800]).toString()
    val returned = KW.inline {text.pink[I800]}
    assertEquals(expected, returned)
  }

  @Test
  fun pink_900() {
    val expected = Style(COLOR, Theme.color[PINK.I900]).toString()
    val returned = KW.inline {text.pink[I900]}
    assertEquals(expected, returned)
  }

  @Test
  fun pink_950() {
    val expected = Style(COLOR, Theme.color[PINK.I950]).toString()
    val returned = KW.inline {text.pink[I950]}
    assertEquals(expected, returned)
  }

  //rose
  @Test
  fun rose_50() {
    val expected = Style(COLOR, Theme.color[ROSE.I50]).toString()
    val returned = KW.inline {text.rose[I50]}
    assertEquals(expected, returned)
  }

  @Test
  fun rose_100() {
    val expected = Style(COLOR, Theme.color[ROSE.I100]).toString()
    val returned = KW.inline {text.rose[I100]}
    assertEquals(expected, returned)
  }

  @Test
  fun rose_200() {
    val expected = Style(COLOR, Theme.color[ROSE.I200]).toString()
    val returned = KW.inline {text.rose[I200]}
    assertEquals(expected, returned)
  }

  @Test
  fun rose_300() {
    val expected = Style(COLOR, Theme.color[ROSE.I300]).toString()
    val returned = KW.inline {text.rose[I300]}
    assertEquals(expected, returned)
  }

  @Test
  fun rose_400() {
    val expected = Style(COLOR, Theme.color[ROSE.I400]).toString()
    val returned = KW.inline {text.rose[I400]}
    assertEquals(expected, returned)
  }

  @Test
  fun rose_500() {
    val expected = Style(COLOR, Theme.color[ROSE.I500]).toString()
    val returned = KW.inline {text.rose[I500]}
    assertEquals(expected, returned)
  }

  @Test
  fun rose_600() {
    val expected = Style(COLOR, Theme.color[ROSE.I600]).toString()
    val returned = KW.inline {text.rose[I600]}
    assertEquals(expected, returned)
  }

  @Test
  fun rose_700() {
    val expected = Style(COLOR, Theme.color[ROSE.I700]).toString()
    val returned = KW.inline {text.rose[I700]}
    assertEquals(expected, returned)
  }

  @Test
  fun rose_800() {
    val expected = Style(COLOR, Theme.color[ROSE.I800]).toString()
    val returned = KW.inline {text.rose[I800]}
    assertEquals(expected, returned)
  }

  @Test
  fun rose_900() {
    val expected = Style(COLOR, Theme.color[ROSE.I900]).toString()
    val returned = KW.inline {text.rose[I900]}
    assertEquals(expected, returned)
  }

  @Test
  fun rose_950() {
    val expected = Style(COLOR, Theme.color[ROSE.I950]).toString()
    val returned = KW.inline {text.rose[I950]}
    assertEquals(expected, returned)
  }

  @Test
  fun black() {
    val expected = Style(COLOR, Theme.color[BLACK]).toString()
    val returned = KW.inline {text.black}
    assertEquals(expected, returned)
  }

  @Test
  fun white() {
    val expected = Style(COLOR, Theme.color[WHITE]).toString()
    val returned = KW.inline {text.white}
    assertEquals(expected, returned)
  }

}
