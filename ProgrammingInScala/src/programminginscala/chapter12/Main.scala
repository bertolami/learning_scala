/*
 * Main.scala
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package programminginscala.chapter12

object Main {

  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]) :Unit = {
    val phrog: Philosophical = new Frog
    phrog philosophize
    val rect = new Rectangle(new Point(1,1), new Point(10,10))
    println(rect.left)
    println(rect.right)
  }
}
