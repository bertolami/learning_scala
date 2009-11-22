/*
 * Chapter6.scala
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package programminginscala.chapter6


object Chapter6 {
    implicit def intToRational(x: Int) = new Rational(x)

    /**
     * @param args the command line arguments
     */
    def main(args: Array[String]) :Unit = {
        val oneHalf = new Rational(1,2)
        val twoThird = new Rational(2,3)
        val three = new Rational(3)
        val two = 2
        println(three)
        println(oneHalf + twoThird)
        println(oneHalf < twoThird)
        println(oneHalf max twoThird)
        println(oneHalf * twoThird)

        val elevenSeven = new Rational(66, 42)
        println(elevenSeven)
        println(elevenSeven + 1)

        println(oneHalf + three * twoThird)

        println(three / oneHalf)

        println(three / two)
        println(two / three)
    }


}
