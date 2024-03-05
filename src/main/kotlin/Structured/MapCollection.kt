package Structured

class MapCollection {
    fun printMap(valor: Int): String {

        val map = mutableMapOf<Int, String>(
            1 to "Muito Ruim",
            2 to "Ruim",
            3 to "Razoável",
            4 to "Bom",
            5 to "Muito Bom",
            6 to "Excelente"
        )

        for (key in map.keys) {
            val x = map.containsKey(valor)
            if (x == true) return map.getValue(valor)
        }

        return "Opção inválida. Tente novamente!"
    }
}