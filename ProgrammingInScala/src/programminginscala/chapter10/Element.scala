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
    
    def above(that: Element): Element = {
        val this1 = this widen that.width
        val that1 = that widen this.width
        elem(this1.contents ++ that1.contents)
    }

    def beside(that: Element) = {
        val this1 = this heighten that.height
        val that1 = that heighten this.height
        elem(
            for((line1, line2) <- this1.contents zip that1.contents)
                yield line1 + line2
        )
    }

    def heighten(h: Int) = {
        if(h <= this.height) this
        else {
            val top = elem(' ', width, (h-height) / 2)
            val bot = elem(' ', width, (h-height - top.height))
            top above this above bot
        }
    }

    def widen(w: Int) = {
        if(w <= width) this
        else {
            val left = elem(' ', (w - width) / 2, height)
            val right = elem(' ', w - width - left.width, height)
            left beside this beside right
        }
    }

    override def toString = contents mkString "\n"
    
 }
