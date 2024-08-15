package iceKotlin.Alon

import mindustry.type.Item

class KtItems {
    companion object {
        lateinit var crystallineSpore: Item
        lateinit var pyroSpore: Item
        lateinit var lonelyHeatSoreSpore: Item
        fun load() {
            /** 晶状孢芽 */
            crystallineSpore = object : Item("crystallineSpore") {
                init {
                    flammability = 0.2f
                }
            }
            /** 灼热孢团 */
            pyroSpore = object : Item("pyroSpora") {
                init {
                    explosiveness = 0.1f
                }
            }
            /** 寂温疮体 */
            lonelyHeatSoreSpore = object : Item("lonelyHeatSoreSpore") {
            }
        }
    }
}