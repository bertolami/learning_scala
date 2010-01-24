/*
 * UniformElement.scala
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package programminginscala.chapter10

class UniformElement(
    ch: Char,
    override val width: Int,
    override val height: Int)
    extends Element {
    private val line = ch.toString * width
    def contents = Array.make(height, line)

}
