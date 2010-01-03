/*
 * ContainsChecker.scala
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package programminginscala.chapter9

object ContainsChecker {
    def process() {
     
        println(containsNeg(List(1,2,3,4)));
        println(containsNeg(List(1,2,-3,4)));
        println(containsOdd(List(1,-3,3,5)));
        println(containsOdd(List(1,2,-3,4)));

    }

    def containsNeg(nums : List[Int]) : Boolean = nums.exists(_ < 0)

    def containsOdd(nums : List[Int]) : Boolean = nums.exists(_ % 2 == 0)
}
