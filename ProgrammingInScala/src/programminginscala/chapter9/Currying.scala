/*
 * Currying.scala
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package programminginscala.chapter9

object Currying {
    def plainOldSum(x: Int, y: Int) = x+y

    def curriedSum(x:Int)(y: Int) = x+y
}
