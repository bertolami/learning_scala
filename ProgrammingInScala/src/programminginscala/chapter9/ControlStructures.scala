/*
 * ControlStructures.scala
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package programminginscala.chapter9

object ControlStructures {
    def twice(op : Double => Double, x: Double) = op(op(x))
}
