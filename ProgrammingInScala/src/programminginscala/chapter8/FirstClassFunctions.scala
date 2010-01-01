/*
 * FirstClassFunctions.scala
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package programminginscala.chapter8

object FirstClassFunctions {
    def process() {
        println("First Class Functions")
        var increase = (x: Int) => x + 1;
        println("increase 1 "+increase(1));
        println("increase 4 "+increase(4));

        increase = (x: Int) => x + 9999;
        println("redefined increase 1 "+increase(1));
        println("redefined increase 4 "+increase(4));

        increase = (x: Int) => {
            println("We")
            println("are")
            println("here")
            x+1
        }
        println("increase 1 "+increase(1));
        println("increase 4 "+increase(4));

        val someNumbers = List(-11, -10, -5, 0, 5,10)

        someNumbers.foreach((x: Int) => println(x))

        println(someNumbers.filter((x:Int) => x > 0))

        println(someNumbers.filter(x => x >= 0))


        println(someNumbers.filter(_ > -6))

        val f = (_ : Int) + ( _ : Int);
        println(f(4,5))
    }
}
