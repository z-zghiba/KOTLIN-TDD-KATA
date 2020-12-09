package com.mrz.tdd

import java.util.*
import java.util.stream.Collectors


class RomanConverter {

    private val romanNumber  = mapOf(
        1 to "I",
        4 to "IV",
        5 to "V",
        9 to "IX",
        10 to "X",
        40 to "XL",
        50 to "L",
        90 to "XC",
        100 to "C",
        400 to "CD",
        500 to "D",
        900 to "CM",
        1000 to "M",
        5000 to "v",
        10000 to "x",
        50000 to "l",
        100000 to "c",
        500000 to "d",
        1000000 to "m"
    )

    fun convert(numberToConvert: Int): String {
        var number = numberToConvert
        require(number > 0) { "$number  not in accepted "}
        var i = 0
        val sb = StringBuilder()
        val listRomanNumber  = romanNumber.toList().sortedByDescending {  it.first }
        while (number > 0 && i < listRomanNumber.size) {
            val currentRomanNumber = listRomanNumber[i]
            if (currentRomanNumber.first <= number) {
                sb.append(currentRomanNumber.second)
                number -= currentRomanNumber.first
            } else {
                i++
            }
        }
        return sb.toString()
    }

}


