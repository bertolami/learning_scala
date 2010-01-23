/*
 * Chapter10.scala
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package programminginscala.chapter10

object Chapter10 {

  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]) :Unit = {
     val array = new ArrayElement(Array("hello", "world"))
     println(array)
     println(array.width)
  }

}
