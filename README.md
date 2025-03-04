# KOTLIN-TDD-KATA

## Roman Numerals Kata

### Your Task

Write a method String convert(int) that takes a number and converts it to the according String representation.

### Examples

        1 | I
        2 | II
        3 | III
        4 | IV
        5 | V
        9 | IX
       21 | XXI
       50 | L
      100 | C
      500 | D
     1000 | M


## Bowling game Kata

The game consists of 10 frames. In each frame the player has two rolls to knock down 10 pins. The score for the frame is the total number of pins knocked down, plus bonuses for strikes and spares.
A spare is when the player knocks down all 10 pins in two rolls. The bonus for that frame is the number of pins knocked down by the next roll.
A strike is when the player knocks down all 10 pins on his first roll. The frame is then completed with a single roll. The bonus for that frame is the value of the next two rolls.
In the tenth frame a player who rolls a spare or strike is allowed to roll the extra balls to complete the frame. However no more than three balls can be rolled in tenth frame.

### Requirements
Write a class Game that has two methods
1. void roll(int) is called each time the player rolls a ball. The argument is the number of pins knocked down.
2. int score() returns the total score for that game.


## Christmas Lights Kata

### Probably a Fire Hazard

Because your neighbors keep defeating you in the holiday house decorating contest year after year, you’ve decided to deploy one million lights in a 1000x1000 grid. Furthermore, because you’ve been especially nice this year, Santa has mailed you instructions on how to display the ideal lighting configuration. Lights in your grid are numbered from 0 to 999 in each direction; the lights at each corner are at 0,0, 0,999, 999,999, and 999,0. The instructions include whether to turn on, turn off, or toggle various inclusive ranges given as coordinate pairs. Each coordinate pair represents opposite corners of a rectangle, inclusive; a coordinate pair like 0,0 through 2,2 therefore refers to 9 lights in a 3x3 square. The lights all start turned off. To defeat your neighbors this year, all you have to do is set up your lights by doing the instructions Santa sent you in order.

1. turn on 0,0 through 999,999 would turn on (or leave on) every light.
2. toggle 0,0 through 999,0 would toggle the first line of 1000 lights, turning off the ones that were on, and turning on the ones that were off.
3. turn off 499,499 through 500,500 would turn off (or leave off) the middle four lights.
After following the instructions, how many lights are lit?

### Part Two

You just finish implementing your winning light pattern when you realize you mistranslated Santa’s message from Ancient Nordic Elvish. The light grid you bought actually has individual brightness controls; each light can have a brightness of zero or more. The lights all start at zero.
The phrase turn on actually means that you should increase the brightness of those lights by 1.
The phrase turn off actually means that you should decrease the brightness of those lights by 1, to a minimum of zero.
The phrase toggle actually means that you should increase the brightness of those lights by 2.
What is the total brightness of all lights combined after following Santa’s instructions?
For example:
1. turn on 0,0 through 0,0 would increase the total brightness by 1
2. toggle 0,0 through 999,999 would increase the total brightness by 2000000.


## Fizz Buzz Kata
Write a program that prints one line for each number from 1 to 100

1. For multiples of three print Fizz instead of the number
2. For the multiples of five print Buzz instead of the number
3. For numbers which are multiples of both three and five print FizzBuzz instead of the number


## Manhattan Distance

Manhattan distance is the distance between two points in a grid (like the grid-like street geography of the New York borough of Manhattan) calculated by only taking a vertical and/or horizontal path.

Write a function int manhattanDistance(Point, Point) that returns the Manhattan Distance between the two points.


## Row Sum Odd Numbers
    
    Given the triangle of consecutive odd numbers:
                 1
              3     5
           7     9    11
       13    15    17    19
    21    23    25    27    29
    ...
    Calculate the row sums of this triangle from the row index (starting at index 1) e.g.:
    rowSumOddNumbers(1); // 1
    rowSumOddNumbers(2); // 3 + 5 = 8

## Integers: Recreation One

Divisors of 42 are : 1, 2, 3, 6, 7, 14, 21, 42. These divisors squared are: 1, 4, 9, 36, 49, 196, 441, 1764. The sum of the squared divisors is 2500 which is 50 * 50, a square!

Given two integers m, n (1 <= m <= n) we want to find all integers between m and n whose sum of squared divisors is itself a square. 42 is such a number.

The result will be an array of arrays or of tuples (in C an array of Pair) or a string, each subarray having two elements, first the number whose squared divisors is a square and then the sum of the squared divisors. 