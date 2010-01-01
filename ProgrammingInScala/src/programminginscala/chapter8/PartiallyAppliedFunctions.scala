/*
 * PartiallyAppliedFunctions.scala
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package programminginscala.chapter8

object PartiallyAppliedFunctions {
    def process() {
        val someNumbers = List(-11, -10, -5, 0, 5,10)
        someNumbers.foreach(println _)
        println(sum(1,2,3))
        val a = sum _
        println(a(3,4,5))
        println(a.apply(3,4,5))
        val b = sum(1,_: Int, 3)
        println(b(2))

        someNumbers.foreach(println);
        
    }

    def sum(a: Int, b: Int, c:Int) = a+b+c
}
