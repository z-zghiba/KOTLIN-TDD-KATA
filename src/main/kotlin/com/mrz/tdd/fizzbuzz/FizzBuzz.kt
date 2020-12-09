package com.mrz.tdd.fizzbuzz

class FizzBuzz {
    
    fun printValue(enter: Int): String = when{
        enter % 15 == 0 -> "FizzBuzz"
        enter % 3 == 0  -> "Fizz"
        enter % 5 == 0  -> "Buzz"
        else ->  enter.toString()
    }
}
