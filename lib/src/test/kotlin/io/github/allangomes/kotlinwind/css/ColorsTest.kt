package io.github.allangomes.kotlinwind.css//package io.github.allangomes.kotlinwind.css
//
//import kotlin.test.Test
//import kotlin.test.assertEquals
//
//class ColorsTest {
//
//  @Test
//  fun slate_50() {
//    val expected = "#F8FAFC"
//    val returned =  slate_50.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun slate_100() {
//    val expected = "#F1F5F9"
//    val returned =  slate_100.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun slate_200() {
//    val expected = "#E2E8F0"
//    val returned = slate_200.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun slate_300() {
//    val expected = "#CBD5E1"
//    val returned = slate_300.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun slate_400() {
//    val expected = "#94A3B8"
//    val returned = slate_400.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun slate_500() {
//    val expected = "#64748B"
//    val returned =  slate_500.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun slate_600() {
//    val expected = "#475569"
//    val returned =  slate_600.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun slate_700() {
//    val expected = "#334155"
//    val returned =  slate_700.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun slate_800() {
//    val expected = "#1E293B"
//    val returned =  slate_800.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun slate_900() {
//    val expected = "#0F172A"
//    val returned =  slate_900.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun slate_950() {
//    val expected = "#020617"
//    val returned =  slate_950.value
//    assertEquals(expected, returned)
//  }
//
//  //gray
//  @Test
//  fun gray_50() {
//    val expected = "#F9FAFB"
//    val returned =  gray_50.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun gray_100() {
//    val expected = "#F3F4F6"
//    val returned =  gray_100.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun gray_200() {
//    val expected = "#E5E7EB"
//    val returned =  gray_200.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun gray_300() {
//    val expected = "#D1D5DB"
//    val returned =  gray_300.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun gray_400() {
//    val expected = "#9CA3AF"
//    val returned =  gray_400.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun gray_500() {
//    val expected = "#6B7280"
//    val returned =  gray_500.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun gray_600() {
//    val expected = "#4B5563"
//    val returned =  gray_600.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun gray_700() {
//    val expected = "#374151"
//    val returned =  gray_700.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun gray_800() {
//    val expected = "#1F2937"
//    val returned =  gray_800.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun gray_900() {
//    val expected = "#111827"
//    val returned =  gray_900.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun gray_950() {
//    val expected = "#030712"
//    val returned =  gray_950.value
//    assertEquals(expected, returned)
//  }
//
//  //zync
//  @Test
//  fun zinc_50() {
//    val expected = "#FAFAFA"
//    val returned =  zinc_50.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun zinc_100() {
//    val expected = "#F4F4F5"
//    val returned =  zinc_100.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun zinc_200() {
//    val expected = "#E4E4E7"
//    val returned =  zinc_200.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun zinc_300() {
//    val expected = "#D4D4D8"
//    val returned =  zinc_300.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun zinc_400() {
//    val expected = "#A1A1AA"
//    val returned =  zinc_400.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun zinc_500() {
//    val expected = "#71717A"
//    val returned =  zinc_500.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun zinc_600() {
//    val expected = "#52525B"
//    val returned =  zinc_600.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun zinc_700() {
//    val expected = "#3F3F46"
//    val returned =  zinc_700.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun zinc_800() {
//    val expected = "#27272A"
//    val returned =  zinc_800.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun zinc_900() {
//    val expected = "#18181B"
//    val returned =  zinc_900.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun zinc_950() {
//    val expected = "#09090B"
//    val returned =  zinc_950.value
//    assertEquals(expected, returned)
//  }
//
//  //neutral
//  @Test
//  fun neutral_50() {
//    val expected = "#FAFAFA"
//    val returned =  neutral_50.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun neutral_100() {
//    val expected = "#F5F5F5"
//    val returned =  neutral_100.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun neutral_200() {
//    val expected = "#E5E5E5"
//    val returned =  neutral_200.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun neutral_300() {
//    val expected = "#D4D4D4"
//    val returned =  neutral_300.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun neutral_400() {
//    val expected = "#A3A3A3"
//    val returned =  neutral_400.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun neutral_500() {
//    val expected = "#737373"
//    val returned =  neutral_500.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun neutral_600() {
//    val expected = "#525252"
//    val returned =  neutral_600.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun neutral_700() {
//    val expected = "#404040"
//    val returned =  neutral_700.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun neutral_800() {
//    val expected = "#262626"
//    val returned =  neutral_800.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun neutral_900() {
//    val expected = "#171717"
//    val returned =  neutral_900.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun neutral_950() {
//    val expected = "#0A0A0A"
//    val returned =  neutral_950.value
//    assertEquals(expected, returned)
//  }
//
//  //stone
//  @Test
//  fun stone_50() {
//    val expected = "#FAFAF9"
//    val returned =  stone_50.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun stone_100() {
//    val expected = "#F5F5F4"
//    val returned =  stone_100.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun stone_200() {
//    val expected = "#E7E5E4"
//    val returned =  stone_200.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun stone_300() {
//    val expected = "#D6D3D1"
//    val returned =  stone_300.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun stone_400() {
//    val expected = "#A8A29E"
//    val returned =  stone_400.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun stone_500() {
//    val expected = "#78716C"
//    val returned =  stone_500.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun stone_600() {
//    val expected = "#57534E"
//    val returned =  stone_600.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun stone_700() {
//    val expected = "#44403C"
//    val returned =  stone_700.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun stone_800() {
//    val expected = "#292524"
//    val returned =  stone_800.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun stone_900() {
//    val expected = "#1C1917"
//    val returned =  stone_900.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun stone_950() {
//    val expected = "#0C0A09"
//    val returned =  stone_950.value
//    assertEquals(expected, returned)
//  }
//
//  //red
//  @Test
//  fun red_50() {
//    val expected = "#FEF2F2"
//    val returned =  red_50.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun red_100() {
//    val expected = "#FEE2E2"
//    val returned =  red_100.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun red_200() {
//    val expected = "#FECACA"
//    val returned =  red_200.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun red_300() {
//    val expected = "#FCA5A5"
//    val returned =  red_300.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun red_400() {
//    val expected = "#F87171"
//    val returned =  red_400.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun red_500() {
//    val expected = "#EF4444"
//    val returned =  red_500.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun red_600() {
//    val expected = "#DC2626"
//    val returned =  red_600.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun red_700() {
//    val expected = "#B91C1C"
//    val returned =  red_700.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun red_800() {
//    val expected = "#991B1B"
//    val returned =  red_800.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun red_900() {
//    val expected = "#7F1D1D"
//    val returned =  red_900.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun red_950() {
//    val expected = "#450A0A"
//    val returned =  red_950.value
//    assertEquals(expected, returned)
//  }
//
//  //orange
//  @Test
//  fun orange_50() {
//    val expected = "#FFF7ED"
//    val returned =  orange_50.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun orange_100() {
//    val expected = "#FFEDD5"
//    val returned =  orange_100.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun orange_200() {
//    val expected = "#FED7AA"
//    val returned =  orange_200.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun orange_300() {
//    val expected = "#FDBA74"
//    val returned =  orange_300.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun orange_400() {
//    val expected = "#FB923C"
//    val returned =  orange_400.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun orange_500() {
//    val expected = "#F97316"
//    val returned =  orange_500.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun orange_600() {
//    val expected = "#EA580C"
//    val returned =  orange_600.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun orange_700() {
//    val expected = "#C2410C"
//    val returned =  orange_700.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun orange_800() {
//    val expected = "#9A3412"
//    val returned =  orange_800.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun orange_900() {
//    val expected = "#7C2D12"
//    val returned =  orange_900.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun orange_950() {
//    val expected = "#431407"
//    val returned =  orange_950.value
//    assertEquals(expected, returned)
//  }
//
//  //amber
//  @Test
//  fun amber_50() {
//    val expected = "#FFFBEB"
//    val returned =  amber_50.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun amber_100() {
//    val expected = "#FEF3C7"
//    val returned =  amber_100.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun amber_200() {
//    val expected = "#FDE68A"
//    val returned =  amber_200.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun amber_300() {
//    val expected = "#FCD34D"
//    val returned =  amber_300.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun amber_400() {
//    val expected = "#FBBF24"
//    val returned =  amber_400.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun amber_500() {
//    val expected = "#F59E0B"
//    val returned =  amber_500.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun amber_600() {
//    val expected = "#D97706"
//    val returned =  amber_600.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun amber_700() {
//    val expected = "#B45309"
//    val returned =  amber_700.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun amber_800() {
//    val expected = "#92400E"
//    val returned =  amber_800.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun amber_900() {
//    val expected = "#78350F"
//    val returned =  amber_900.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun amber_950() {
//    val expected = "#451A03"
//    val returned =  amber_950.value
//    assertEquals(expected, returned)
//  }
//
//  //yellow
//  @Test
//  fun yellow_50() {
//    val expected = "#FEFCE8"
//    val returned =  yellow_50.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun yellow_100() {
//    val expected = "#FEF9C3"
//    val returned =  yellow_100.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun yellow_200() {
//    val expected = "#FEF08A"
//    val returned =  yellow_200.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun yellow_300() {
//    val expected = "#FDE047"
//    val returned =  yellow_300.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun yellow_400() {
//    val expected = "#FACC15"
//    val returned =  yellow_400.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun yellow_500() {
//    val expected = "#EAB308"
//    val returned =  yellow_500.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun yellow_600() {
//    val expected = "#CA8A04"
//    val returned =  yellow_600.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun yellow_700() {
//    val expected = "#A16207"
//    val returned =  yellow_700.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun yellow_800() {
//    val expected = "#854D0E"
//    val returned =  yellow_800.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun yellow_900() {
//    val expected = "#713F12"
//    val returned =  yellow_900.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun yellow_950() {
//    val expected = "#422006"
//    val returned =  yellow_950.value
//    assertEquals(expected, returned)
//  }
//
//  //lime
//  @Test
//  fun lime_50() {
//    val expected = "#F7FEE7"
//    val returned =  lime_50.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun lime_100() {
//    val expected = "#ECFCCB"
//    val returned =  lime_100.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun lime_200() {
//    val expected = "#D9F99D"
//    val returned =  lime_200.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun lime_300() {
//    val expected = "#BEF264"
//    val returned =  lime_300.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun lime_400() {
//    val expected = "#A3E635"
//    val returned =  lime_400.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun lime_500() {
//    val expected = "#84CC16"
//    val returned =  lime_500.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun lime_600() {
//    val expected = "#65A30D"
//    val returned =  lime_600.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun lime_700() {
//    val expected = "#4D7C0F"
//    val returned =  lime_700.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun lime_800() {
//    val expected = "#3F6212"
//    val returned =  lime_800.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun lime_900() {
//    val expected = "#365314"
//    val returned =  lime_900.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun lime_950() {
//    val expected = "#1A2E05"
//    val returned =  lime_950.value
//    assertEquals(expected, returned)
//  }
//
//  //green
//  @Test
//  fun green_50() {
//    val expected = "#F0FDF4"
//    val returned =  green_50.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun green_100() {
//    val expected = "#DCFCE7"
//    val returned =  green_100.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun green_200() {
//    val expected = "#BBF7D0"
//    val returned =  green_200.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun green_300() {
//    val expected = "#86EFAC"
//    val returned =  green_300.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun green_400() {
//    val expected = "#4ADE80"
//    val returned =  green_400.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun green_500() {
//    val expected = "#22C55E"
//    val returned =  green_500.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun green_600() {
//    val expected = "#16A34A"
//    val returned =  green_600.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun green_700() {
//    val expected = "#15803D"
//    val returned =  green_700.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun green_800() {
//    val expected = "#166534"
//    val returned =  green_800.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun green_900() {
//    val expected = "#14532D"
//    val returned =  green_900.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun green_950() {
//    val expected = "#052E16"
//    val returned =  green_950.value
//    assertEquals(expected, returned)
//  }
//
//  //emerald
//  @Test
//  fun emerald_50() {
//    val expected = "#ECFDF5"
//    val returned =  emerald_50.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun emerald_100() {
//    val expected = "#D1FAE5"
//    val returned =  emerald_100.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun emerald_200() {
//    val expected = "#A7F3D0"
//    val returned =  emerald_200.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun emerald_300() {
//    val expected = "#6EE7B7"
//    val returned =  emerald_300.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun emerald_400() {
//    val expected = "#34D399"
//    val returned =  emerald_400.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun emerald_500() {
//    val expected = "#10B981"
//    val returned =  emerald_500.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun emerald_600() {
//    val expected = "#059669"
//    val returned =  emerald_600.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun emerald_700() {
//    val expected = "#047857"
//    val returned =  emerald_700.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun emerald_800() {
//    val expected = "#065F46"
//    val returned =  emerald_800.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun emerald_900() {
//    val expected = "#064E3B"
//    val returned =  emerald_900.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun emerald_950() {
//    val expected = "#022C22"
//    val returned =  emerald_950.value
//    assertEquals(expected, returned)
//  }
//
//  //teal
//  @Test
//  fun teal_50() {
//    val expected = "#F0FDFA"
//    val returned =  teal_50.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun teal_100() {
//    val expected = "#CCFBF1"
//    val returned =  teal_100.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun teal_200() {
//    val expected = "#99F6E4"
//    val returned =  teal_200.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun teal_300() {
//    val expected = "#5EEAD4"
//    val returned =  teal_300.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun teal_400() {
//    val expected = "#2DD4BF"
//    val returned =  teal_400.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun teal_500() {
//    val expected = "#14B8A6"
//    val returned =  teal_500.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun teal_600() {
//    val expected = "#0D9488"
//    val returned =  teal_600.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun teal_700() {
//    val expected = "#0F766E"
//    val returned =  teal_700.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun teal_800() {
//    val expected = "#115E59"
//    val returned =  teal_800.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun teal_900() {
//    val expected = "#134E4A"
//    val returned =  teal_900.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun teal_950() {
//    val expected = "#042F2E"
//    val returned =  teal_950.value
//    assertEquals(expected, returned)
//  }
//
//  //cyan
//  @Test
//  fun cyan_50() {
//    val expected = "#ECFEFF"
//    val returned =  cyan_50.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun cyan_100() {
//    val expected = "#CFFAFE"
//    val returned =  cyan_100.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun cyan_200() {
//    val expected = "#A5F3FC"
//    val returned =  cyan_200.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun cyan_300() {
//    val expected = "#67E8F9"
//    val returned =  cyan_300.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun cyan_400() {
//    val expected = "#22D3EE"
//    val returned =  cyan_400.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun cyan_500() {
//    val expected = "#06B6D4"
//    val returned =  cyan_500.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun cyan_600() {
//    val expected = "#0891B2"
//    val returned =  cyan_600.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun cyan_700() {
//    val expected = "#0E7490"
//    val returned =  cyan_700.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun cyan_800() {
//    val expected = "#155E75"
//    val returned =  cyan_800.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun cyan_900() {
//    val expected = "#164E63"
//    val returned =  cyan_900.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun cyan_950() {
//    val expected = "#083344"
//    val returned =  cyan_950.value
//    assertEquals(expected, returned)
//  }
//
//  //sky
//  @Test
//  fun sky_50() {
//    val expected = "#F0F9FF"
//    val returned =  sky_50.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun sky_100() {
//    val expected = "#E0F2FE"
//    val returned =  sky_100.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun sky_200() {
//    val expected = "#BAE6FD"
//    val returned =  sky_200.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun sky_300() {
//    val expected = "#7DD3FC"
//    val returned =  sky_300.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun sky_400() {
//    val expected = "#38BDF8"
//    val returned =  sky_400.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun sky_500() {
//    val expected = "#0EA5E9"
//    val returned =  sky_500.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun sky_600() {
//    val expected = "#0284C7"
//    val returned =  sky_600.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun sky_700() {
//    val expected = "#0369A1"
//    val returned =  sky_700.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun sky_800() {
//    val expected = "#075985"
//    val returned =  sky_800.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun sky_900() {
//    val expected = "#0C4A6E"
//    val returned =  sky_900.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun sky_950() {
//    val expected = "#082F49"
//    val returned =  sky_950.value
//    assertEquals(expected, returned)
//  }
//
//  //blue
//  @Test
//  fun blue_50() {
//    val expected = "#EFF6FF"
//    val returned =  blue_50.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun blue_100() {
//    val expected = "#DBEAFE"
//    val returned =  blue_100.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun blue_200() {
//    val expected = "#BFDBFE"
//    val returned =  blue_200.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun blue_300() {
//    val expected = "#93C5FD"
//    val returned =  blue_300.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun blue_400() {
//    val expected = "#60A5FA"
//    val returned =  blue_400.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun blue_500() {
//    val expected = "#3B82F6"
//    val returned =  blue_500.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun blue_600() {
//    val expected = "#2563EB"
//    val returned =  blue_600.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun blue_700() {
//    val expected = "#1D4ED8"
//    val returned =  blue_700.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun blue_800() {
//    val expected = "#1E40AF"
//    val returned =  blue_800.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun blue_900() {
//    val expected = "#1E3A8A"
//    val returned =  blue_900.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun blue_950() {
//    val expected = "#172554"
//    val returned =  blue_950.value
//    assertEquals(expected, returned)
//  }
//
//  //indigo
//  @Test
//  fun indigo_50() {
//    val expected = "#EEF2FF"
//    val returned =  indigo_50.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun indigo_100() {
//    val expected = "#E0E7FF"
//    val returned =  indigo_100.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun indigo_200() {
//    val expected = "#C7D2FE"
//    val returned =  indigo_200.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun indigo_300() {
//    val expected = "#A5B4FC"
//    val returned =  indigo_300.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun indigo_400() {
//    val expected = "#818CF8"
//    val returned =  indigo_400.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun indigo_500() {
//    val expected = "#6366F1"
//    val returned =  indigo_500.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun indigo_600() {
//    val expected = "#4F46E5"
//    val returned =  indigo_600.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun indigo_700() {
//    val expected = "#4338CA"
//    val returned =  indigo_700.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun indigo_800() {
//    val expected = "#3730A3"
//    val returned =  indigo_800.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun indigo_900() {
//    val expected = "#312E81"
//    val returned =  indigo_900.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun indigo_950() {
//    val expected = "#1E1B4B"
//    val returned =  indigo_950.value
//    assertEquals(expected, returned)
//  }
//
//  //violet
//  @Test
//  fun violet_50() {
//    val expected = "#F5F3FF"
//    val returned =  violet_50.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun violet_100() {
//    val expected = "#EDE9FE"
//    val returned =  violet_100.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun violet_200() {
//    val expected = "#DDD6FE"
//    val returned =  violet_200.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun violet_300() {
//    val expected = "#C4B5FD"
//    val returned =  violet_300.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun violet_400() {
//    val expected = "#A78BFA"
//    val returned =  violet_400.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun violet_500() {
//    val expected = "#8B5CF6"
//    val returned =  violet_500.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun violet_600() {
//    val expected = "#7C3AED"
//    val returned =  violet_600.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun violet_700() {
//    val expected = "#6D28D9"
//    val returned =  violet_700.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun violet_800() {
//    val expected = "#5B21B6"
//    val returned =  violet_800.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun violet_900() {
//    val expected = "#4C1D95"
//    val returned =  violet_900.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun violet_950() {
//    val expected = "#2E1065"
//    val returned =  violet_950.value
//    assertEquals(expected, returned)
//  }
//
//  //purple
//  @Test
//  fun purple_50() {
//    val expected = "#FAF5FF"
//    val returned =  purple_50.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun purple_100() {
//    val expected = "#F3E8FF"
//    val returned =  purple_100.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun purple_200() {
//    val expected = "#E9D5FF"
//    val returned =  purple_200.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun purple_300() {
//    val expected = "#D8B4FE"
//    val returned =  purple_300.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun purple_400() {
//    val expected = "#C084FC"
//    val returned =  purple_400.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun purple_500() {
//    val expected = "#A855F7"
//    val returned =  purple_500.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun purple_600() {
//    val expected = "#9333EA"
//    val returned =  purple_600.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun purple_700() {
//    val expected = "#7E22CE"
//    val returned =  purple_700.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun purple_800() {
//    val expected = "#6B21A8"
//    val returned =  purple_800.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun purple_900() {
//    val expected = "#581C87"
//    val returned =  purple_900.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun purple_950() {
//    val expected = "#3B0764"
//    val returned =  purple_950.value
//    assertEquals(expected, returned)
//  }
//
//  //fuchsia
//  @Test
//  fun fuchsia_50() {
//    val expected = "#FDF4FF"
//    val returned =  fuchsia_50.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun fuchsia_100() {
//    val expected = "#FAE8FF"
//    val returned =  fuchsia_100.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun fuchsia_200() {
//    val expected = "#F5D0FE"
//    val returned =  fuchsia_200.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun fuchsia_300() {
//    val expected = "#F0ABFC"
//    val returned =  fuchsia_300.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun fuchsia_400() {
//    val expected = "#E879F9"
//    val returned =  fuchsia_400.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun fuchsia_500() {
//    val expected = "#D946EF"
//    val returned =  fuchsia_500.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun fuchsia_600() {
//    val expected = "#C026D3"
//    val returned =  fuchsia_600.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun fuchsia_700() {
//    val expected = "#A21CAF"
//    val returned =  fuchsia_700.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun fuchsia_800() {
//    val expected = "#86198F"
//    val returned =  fuchsia_800.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun fuchsia_900() {
//    val expected = "#701A75"
//    val returned =  fuchsia_900.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun fuchsia_950() {
//    val expected = "#4A044E"
//    val returned =  fuchsia_950.value
//    assertEquals(expected, returned)
//  }
//
//  //pink
//  @Test
//  fun pink_50() {
//    val expected = "#FDF2F8"
//    val returned =  pink_50.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun pink_100() {
//    val expected = "#FCE7F3"
//    val returned =  pink_100.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun pink_200() {
//    val expected = "#FBCFE8"
//    val returned =  pink_200.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun pink_300() {
//    val expected = "#F9A8D4"
//    val returned =  pink_300.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun pink_400() {
//    val expected = "#F472B6"
//    val returned =  pink_400.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun pink_500() {
//    val expected = "#EC4899"
//    val returned =  pink_500.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun pink_600() {
//    val expected = "#DB2777"
//    val returned =  pink_600.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun pink_700() {
//    val expected = "#BE185D"
//    val returned =  pink_700.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun pink_800() {
//    val expected = "#9D174D"
//    val returned =  pink_800.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun pink_900() {
//    val expected = "#831843"
//    val returned =  pink_900.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun pink_950() {
//    val expected = "#500724"
//    val returned =  pink_950.value
//    assertEquals(expected, returned)
//  }
//
//  //rose
//  @Test
//  fun rose_50() {
//    val expected = "#FFF1F2"
//    val returned =  rose_50.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun rose_100() {
//    val expected = "#FFE4E6"
//    val returned =  rose_100.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun rose_200() {
//    val expected = "#FECDD3"
//    val returned =  rose_200.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun rose_300() {
//    val expected = "#FDA4AF"
//    val returned =  rose_300.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun rose_400() {
//    val expected = "#FB7185"
//    val returned =  rose_400.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun rose_500() {
//    val expected = "#F43F5E"
//    val returned =  rose_500.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun rose_600() {
//    val expected = "#E11D48"
//    val returned =  rose_600.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun rose_700() {
//    val expected = "#BE123C"
//    val returned =  rose_700.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun rose_800() {
//    val expected = "#9F1239"
//    val returned =  rose_800.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun rose_900() {
//    val expected = "#881337"
//    val returned =  rose_900.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun rose_950() {
//    val expected = "#4C0519"
//    val returned =  rose_950.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun black() {
//    val expected = "#000"
//    val returned = black.value
//    assertEquals(expected, returned)
//  }
//
//  @Test
//  fun white() {
//    val expected = "#FFF"
//    val returned = white.value
//    assertEquals(expected, returned)
//  }
//
//
//}
