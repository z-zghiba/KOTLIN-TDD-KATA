package com.mrz.tdd.squareddivisors

import kotlin.math.floor
import kotlin.math.sqrt



fun Int.factors() = (1..this).asSequence().filter { this%it == 0 }.map { it*it }.sum()

fun  Int.isPerfectSquare(): Boolean {
    val sr = sqrt(this.toDouble())
    return sr - floor(sr) == 0.0
}

class SumSquaredDivisors {
    fun listSquared(m: Long, n: Long): String {
        var listToReturn =  arrayListOf<String>()
        for (i in m..n){
            val factors = i.toInt().factors()
            if (factors.isPerfectSquare()){
                listToReturn.add("[$i, $factors]")
            }
        }

        return listToReturn.joinToString(", ", "[", "]") { it }
    }


}
