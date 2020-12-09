package com.mrz.tdd.christmas


class LightsGrid() {
    lateinit var grid: Array<IntArray>

    constructor(width: Int, height: Int) : this() {
        grid = Array(width) { IntArray(height) { 0 } }
    }

    fun totalBrightness(): Int = grid.map { it.sum() }.sum()
    fun turnON(pointA: Pair<Int, Int>, pointB: Pair<Int, Int>) = execute(LightAction.ON, pointA ,pointB)
    fun toggle(pointA: Pair<Int, Int>, pointB: Pair<Int, Int>) = execute(LightAction.TOGGLE, pointA ,pointB)
    fun turnOFF(pointA: Pair<Int, Int>, pointB: Pair<Int, Int>)= execute(LightAction.OFF, pointA ,pointB)

    private fun execute(action: LightAction, pointA:  Pair<Int, Int> , pointB:  Pair<Int, Int>) {

        val xA = if (pointA.first > pointB.first) pointB.first else pointA.first
        val xB = if (pointA.first > pointB.first) pointA.first else pointB.first
        val yA = if (pointA.second > pointB.second) pointB.second else pointA.second
        val yB = if (pointA.second > pointB.second) pointA.second else pointB.second

        for (i in xA..xB) {
            for (j in yA..yB) {
                grid[i][j] += action.brightness
            }
        }
    }

    fun printGridLight(){
        for (row in grid) {
            for (col in row) print("$col ")
            println()
        }
    }

    enum class LightAction(val brightness: Int) {
        ON(1), OFF(-1), TOGGLE(2)
    }
}