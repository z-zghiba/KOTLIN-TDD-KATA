package com.mrz.tdd.manhattan

import kotlin.math.abs

class ManhattanDistance {
    fun distance(pointA: Point, pointB: Point): Double {
        return abs(pointA.x-pointB.x)+ abs(pointA.y-pointB.y)
    }
}
