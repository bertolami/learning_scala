/*
 * Element.scala
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package programminginscala.chapter10

abstract class Element {
    def contents: Array[String]
    def height = contents.length
    def width = if(height == 0) 0 else contents(0).length
}
