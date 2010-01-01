/*
 * PartiallyAppliedFunctions.scala
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package programminginscala.chapter8

object Closures {
    def process() {
        var more = 1
        val addMore = (x:Int) => x + more
        println( addMore(10))
        more = 20
        println(addMore(10))

        val someNumbers = List(-11, -10, -5, 0, 5,10)
        var sum  = 0
        someNumbers.foreach(sum += _)
        println(sum)

        val inc1 = makeIncreaser(1)
        val inc2 = makeIncreaser(2)
        println(inc1(10))
        println(inc2(10))
    }

    def makeIncreaser(more : Int) = (x:Int) => x + more

}
