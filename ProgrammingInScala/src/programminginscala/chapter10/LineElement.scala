/*
 * LineElement.scala
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package programminginscala.chapter10

class LineElement(s: String) extends Element  {
    val contents = Array(s)
    override def width = s.length
    override def height = 1
}
