@file:Suppress("unused")

package io.github.allangomes.kotlinwind.css

import io.github.allangomes.kotlinwind.css.core.StyleValueMarker
import io.github.allangomes.kotlinwind.css.core.tokens.ColorTokens
import io.github.allangomes.kotlinwind.css.core.tokens.Token

sealed interface ColorIndex

@StyleValueMarker
data object I50 : ColorIndex
@StyleValueMarker
data object I100: ColorIndex
@StyleValueMarker
data object I200: ColorIndex
@StyleValueMarker
data object I300: ColorIndex
@StyleValueMarker
data object I400: ColorIndex
@StyleValueMarker
data object I500: ColorIndex
@StyleValueMarker
data object I600: ColorIndex
@StyleValueMarker
data object I700: ColorIndex
@StyleValueMarker
data object I800: ColorIndex
@StyleValueMarker
data object I900: ColorIndex
@StyleValueMarker
data object I950: ColorIndex

@StyleValueMarker
object SLATE : ColorTokens({
  color[it] = "#64748B"
  color[it.I50] = "#F8FAFC"
  color[it.I100] = "#F1F5F9"
  color[it.I200] = "#E2E8F0"
  color[it.I300] = "#CBD5E1"
  color[it.I400] = "#94A3B8"
  color[it.I500] = "#64748B"
  color[it.I600] = "#475569"
  color[it.I700] = "#1E293B"
  color[it.I800] = "#0F172A"
  color[it.I900] = "#020617"
  color[it.I950] = "#334155"
})

@StyleValueMarker
object GRAY : ColorTokens({
  color[it] = "#6B7280"
  color[it.I50]  = "#F9FAFB"
  color[it.I100] = "#F3F4F6"
  color[it.I200] = "#E5E7EB"
  color[it.I300] = "#D1D5DB"
  color[it.I400] = "#9CA3AF"
  color[it.I500] = "#6B7280"
  color[it.I600] = "#4B5563"
  color[it.I700] = "#374151"
  color[it.I800] = "#1F2937"
  color[it.I900] = "#111827"
  color[it.I950] = "#030712"
})

@StyleValueMarker
object ZINC : ColorTokens({
  color[it] = "#71717A"
  color[it.I50] = "#FAFAFA"
  color[it.I100] = "#F4F4F5"
  color[it.I200] = "#E4E4E7"
  color[it.I300] = "#D4D4D8"
  color[it.I400] = "#A1A1AA"
  color[it.I500] = "#71717A"
  color[it.I600] = "#52525B"
  color[it.I700] = "#3F3F46"
  color[it.I800] = "#27272A"
  color[it.I900] = "#18181B"
  color[it.I950] = "#09090B"
})

@StyleValueMarker
object NEUTRAL : ColorTokens({
  color[it.I50] = "#FAFAFA"
  color[it.I100] = "#F5F5F5"
  color[it.I200] = "#E5E5E5"
  color[it.I300] = "#D4D4D4"
  color[it.I400] = "#A3A3A3"
  color[it.I500] = "#737373"
  color[it.I600] = "#525252"
  color[it.I700] = "#404040"
  color[it.I800] = "#262626"
  color[it.I900] = "#171717"
  color[it.I950] = "#0A0A0A"
})

@StyleValueMarker
object STONE : ColorTokens({
  color[it.I50] = "#FAFAF9"
  color[it.I100] = "#F5F5F4"
  color[it.I200] = "#E7E5E4"
  color[it.I300] = "#D6D3D1"
  color[it.I400] = "#A8A29E"
  color[it.I500] = "#78716C"
  color[it.I600] = "#57534E"
  color[it.I700] = "#44403C"
  color[it.I800] = "#292524"
  color[it.I900] = "#1C1917"
  color[it.I950] = "#0C0A09"
})

@StyleValueMarker
object RED : ColorTokens({
  color[it.I50] = "#FEF2F2"
  color[it.I100] = "#FEE2E2"
  color[it.I200] = "#FECACA"
  color[it.I300] = "#FCA5A5"
  color[it.I400] = "#F87171"
  color[it.I500] = "#EF4444"
  color[it.I600] = "#DC2626"
  color[it.I700] = "#B91C1C"
  color[it.I800] = "#991B1B"
  color[it.I900] = "#7F1D1D"
  color[it.I950] = "#450A0A"
})

@StyleValueMarker
object ORANGE : ColorTokens({
  color[it.I50] = "#FFF7ED"
  color[it.I100] = "#FFEDD5"
  color[it.I200] = "#FED7AA"
  color[it.I300] = "#FDBA74"
  color[it.I400] = "#FB923C"
  color[it.I500] = "#F97316"
  color[it.I600] = "#EA580C"
  color[it.I700] = "#C2410C"
  color[it.I800] = "#9A3412"
  color[it.I900] = "#7C2D12"
  color[it.I950] = "#431407"
})

@StyleValueMarker
object AMBER : ColorTokens({
  color[it.I50] = "#FFFBEB"
  color[it.I100] = "#FEF3C7"
  color[it.I200] = "#FDE68A"
  color[it.I300] = "#FCD34D"
  color[it.I400] = "#FBBF24"
  color[it.I500] = "#F59E0B"
  color[it.I600] = "#D97706"
  color[it.I700] = "#B45309"
  color[it.I800] = "#92400E"
  color[it.I900] = "#78350F"
  color[it.I950] = "#451A03"
})

@StyleValueMarker
object YELLOW : ColorTokens({
  color[it.I50] = "#FEFCE8"
  color[it.I100] = "#FEF9C3"
  color[it.I200] = "#FEF08A"
  color[it.I300] = "#FDE047"
  color[it.I400] = "#FACC15"
  color[it.I500] = "#EAB308"
  color[it.I600] = "#CA8A04"
  color[it.I700] = "#A16207"
  color[it.I800] = "#854D0E"
  color[it.I900] = "#713F12"
  color[it.I950] = "#422006"
})

@StyleValueMarker
object LIME : ColorTokens({
  color[it.I50] = "#F7FEE7"
  color[it.I100] = "#ECFCCB"
  color[it.I200] = "#D9F99D"
  color[it.I300] = "#BEF264"
  color[it.I400] = "#A3E635"
  color[it.I500] = "#84CC16"
  color[it.I600] = "#65A30D"
  color[it.I700] = "#4D7C0F"
  color[it.I800] = "#3F6212"
  color[it.I900] = "#365314"
  color[it.I950] = "#1A2E05"
})

@StyleValueMarker
object GREEN : ColorTokens({
  color[it.I50] = "#F0FDF4"
  color[it.I100] = "#DCFCE7"
  color[it.I200] = "#BBF7D0"
  color[it.I300] = "#86EFAC"
  color[it.I400] = "#4ADE80"
  color[it.I500] = "#22C55E"
  color[it.I600] = "#16A34A"
  color[it.I700] = "#15803D"
  color[it.I800] = "#166534"
  color[it.I900] = "#14532D"
  color[it.I950] = "#052E16"
})

@StyleValueMarker
object EMERALD : ColorTokens({
  color[it.I50] = "#ECFDF5"
  color[it.I100] = "#D1FAE5"
  color[it.I200] = "#A7F3D0"
  color[it.I300] = "#6EE7B7"
  color[it.I400] = "#34D399"
  color[it.I500] = "#10B981"
  color[it.I600] = "#059669"
  color[it.I700] = "#047857"
  color[it.I800] = "#065F46"
  color[it.I900] = "#064E3B"
  color[it.I950] = "#022C22"
})

@StyleValueMarker
object TEAL : ColorTokens({
  color[it.I50] = "#F0FDFA"
  color[it.I100] = "#CCFBF1"
  color[it.I200] = "#99F6E4"
  color[it.I300] = "#5EEAD4"
  color[it.I400] = "#2DD4BF"
  color[it.I500] = "#14B8A6"
  color[it.I600] = "#0D9488"
  color[it.I700] = "#0F766E"
  color[it.I800] = "#115E59"
  color[it.I900] = "#134E4A"
  color[it.I950] = "#042F2E"
})

@StyleValueMarker
object CYAN : ColorTokens({
  color[it.I50] = "#ECFEFF"
  color[it.I100] = "#CFFAFE"
  color[it.I200] = "#A5F3FC"
  color[it.I300] = "#67E8F9"
  color[it.I400] = "#22D3EE"
  color[it.I500] = "#06B6D4"
  color[it.I600] = "#0891B2"
  color[it.I700] = "#0E7490"
  color[it.I800] = "#155E75"
  color[it.I900] = "#164E63"
  color[it.I950] = "#083344"
})

@StyleValueMarker
object SKY : ColorTokens({
  color[it.I50] = "#F0F9FF"
  color[it.I100] = "#E0F2FE"
  color[it.I200] = "#BAE6FD"
  color[it.I300] = "#7DD3FC"
  color[it.I400] = "#38BDF8"
  color[it.I500] = "#0EA5E9"
  color[it.I600] = "#0284C7"
  color[it.I700] = "#0369A1"
  color[it.I800] = "#075985"
  color[it.I900] = "#0C4A6E"
  color[it.I950] = "#082F49"
})

@StyleValueMarker
object BLUE : ColorTokens({
  color[it.I50] = "#EFF6FF"
  color[it.I100] = "#DBEAFE"
  color[it.I200] = "#BFDBFE"
  color[it.I300] = "#93C5FD"
  color[it.I400] = "#60A5FA"
  color[it.I500] = "#3B82F6"
  color[it.I600] = "#2563EB"
  color[it.I700] = "#1D4ED8"
  color[it.I800] = "#1E40AF"
  color[it.I900] = "#1E3A8A"
  color[it.I950] = "#172554"
})

@StyleValueMarker
object INDIGO : ColorTokens({
  color[it.I50] = "#EEF2FF"
  color[it.I100] = "#E0E7FF"
  color[it.I200] = "#C7D2FE"
  color[it.I300] = "#A5B4FC"
  color[it.I400] = "#818CF8"
  color[it.I500] = "#6366F1"
  color[it.I600] = "#4F46E5"
  color[it.I700] = "#4338CA"
  color[it.I800] = "#3730A3"
  color[it.I900] = "#312E81"
  color[it.I950] = "#1E1B4B"
})

@StyleValueMarker
object VIOLET : ColorTokens({
  color[it.I50] = "#F5F3FF"
  color[it.I100] = "#EDE9FE"
  color[it.I200] = "#DDD6FE"
  color[it.I300] = "#C4B5FD"
  color[it.I400] = "#A78BFA"
  color[it.I500] = "#8B5CF6"
  color[it.I600] = "#7C3AED"
  color[it.I700] = "#6D28D9"
  color[it.I800] = "#5B21B6"
  color[it.I900] = "#4C1D95"
  color[it.I950] = "#2E1065"
})

@StyleValueMarker
object PURPLE : ColorTokens({
  color[it.I50] = "#FAF5FF"
  color[it.I100] = "#F3E8FF"
  color[it.I200] = "#E9D5FF"
  color[it.I300] = "#D8B4FE"
  color[it.I400] = "#C084FC"
  color[it.I500] = "#A855F7"
  color[it.I600] = "#9333EA"
  color[it.I700] = "#7E22CE"
  color[it.I800] = "#6B21A8"
  color[it.I900] = "#581C87"
  color[it.I950] = "#3B0764"
})

@StyleValueMarker
object FUCHSIA : ColorTokens({
  color[it.I50] = "#FDF4FF"
  color[it.I100] = "#FAE8FF"
  color[it.I200] = "#F5D0FE"
  color[it.I300] = "#F0ABFC"
  color[it.I400] = "#E879F9"
  color[it.I500] = "#D946EF"
  color[it.I600] = "#C026D3"
  color[it.I700] = "#A21CAF"
  color[it.I800] = "#86198F"
  color[it.I900] = "#701A75"
  color[it.I950] = "#4A044E"
})

@StyleValueMarker
object PINK : ColorTokens({
  color[it.I50] = "#FDF2F8"
  color[it.I100] = "#FCE7F3"
  color[it.I200] = "#FBCFE8"
  color[it.I300] = "#F9A8D4"
  color[it.I400] = "#F472B6"
  color[it.I500] = "#EC4899"
  color[it.I600] = "#DB2777"
  color[it.I700] = "#BE185D"
  color[it.I800] = "#9D174D"
  color[it.I900] = "#831843"
  color[it.I950] = "#500724"
})

@StyleValueMarker
object ROSE : ColorTokens({
  color[it.I50] = "#FFF1F2"
  color[it.I100] = "#FFE4E6"
  color[it.I200] = "#FECDD3"
  color[it.I300] = "#FDA4AF"
  color[it.I400] = "#FB7185"
  color[it.I500] = "#F43F5E"
  color[it.I600] = "#E11D48"
  color[it.I700] = "#BE123C"
  color[it.I800] = "#9F1239"
  color[it.I900] = "#881337"
  color[it.I950] = "#4C0519"
})

@StyleValueMarker
object BLACK : Token<BLACK>({
  color[it] = "#000"
}), Token.Color

@StyleValueMarker
object WHITE : Token<WHITE>({
  color[it] = "#FFF"
}), Token.Color
