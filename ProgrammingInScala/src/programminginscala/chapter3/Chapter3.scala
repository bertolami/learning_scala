/*
 * Chapter3.scala
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package programminginscala.chapter3

object Chapter3 {

    /**
     * @param args the command line arguments
     */
    def main(args: Array[String]) :Unit = {
        arrays
        lists
        tuples
        sets
        maps
    }

    def maps() {
        val treasureMap = scala.collection.mutable.Map[Int, String]()
        treasureMap += (1 -> "Go to island")
        treasureMap += (2 -> "Find big X on ground.")
        treasureMap += (3 -> "Dig.")
        println(treasureMap(2))

        val romanNumeral = Map(1 -> "I", 2 -> "II", 3 -> "III", 4-> "IV", 5 -> "V")
        println(romanNumeral(4))
    }

    def  sets(){
        var jetSet = Set("Boeing", "Airbus")
        jetSet += "Lear"
        println(jetSet.contains("Cessna"))
        val movieSet = scala.collection.mutable.Set("Hitsch", "Poltergeist")
        movieSet += "Shrek"
        println(movieSet)
    }

    def tuples() {
        val pair = (99, "Luftballons")
        println(pair._1)
        println(pair._2)
    }
    def lists() {
        val oneTwo = List(1,2)
        val threeFour = List(3,4)
        val oneTwoThreeFour = oneTwo ::: threeFour
        println(""+ oneTwo+" and "+ threeFour +" were not mutated.")
        println("Thus, "+oneTwoThreeFour+" is a new list")
        val twoThree = List(2,3)
        val oneTwoThree = 1 :: twoThree
        println(oneTwoThree)
    }

    def arrays() {
        val greetStrings = new Array[String](3)
        greetStrings.update(0, "Hello")
        greetStrings(1) = ", "
        greetStrings(2) = "world\n"
        for(i <- 0 to 2)
        print(greetStrings.apply(i))
    }
}
