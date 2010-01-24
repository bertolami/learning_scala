/*
 * Element.scala
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package programminginscala.chapter10
import Element.elem

object Element {
    def elem(contents: Array[String]) : Element =
        new ArrayElement(contents)
    def elem(chr: Char, width: Int, height: Int) : Element =
        new UniformElement(chr, width, height)
    def elem(line: String):Element =
        new LineElement(line)
}

abstract class Element {
    def contents: Array[String]

    def height = contents.length

    def width = if(height == 0) 0 else contents(0).length
    
    def above(that: Element) : Element = elem(this.contents ++ that.contents)

    def beside(that: Element): Element = {
        elem(
            for((line1, line2) <- this.contents zip that.contents)
                yield line1 + line2
        )
    }

    override def toString = contents mkString "\n"
    
 }
