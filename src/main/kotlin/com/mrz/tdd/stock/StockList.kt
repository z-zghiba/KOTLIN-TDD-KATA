package com.mrz.tdd.stock


object StockList {
    fun stockSummary(lstOfArt: Array<String>, lstOf1stLetter: Array<String>): String {
        return  (lstOfArt
            .filter { lstOf1stLetter.contains(it.first().toString()) }
            .groupBy { it.first() }
            .map {
                Pair(
                    it.key.toString(),
                    it.value.map { item -> item.split(" ").toTypedArray()[1].toInt() }.sum()
                )
            }.toMap()
            .asSequence() + lstOf1stLetter
            .map { Pair(it, 0) }
            .toMap()
            .asSequence()
                )
            .distinct()
            .groupBy({ it.key }, { it.value })
            .mapValues { it.value.sum() }
            .toSortedMap()
            .map { "(${it.key} : ${it.value})" }.toList().joinToString(" - ") { it }

    }
}
