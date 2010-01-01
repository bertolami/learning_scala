/*
 * Chapter8.scala
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package programminginscala.chapter8

object Chapter8 {

  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]) :Unit = {
      for(file <- filesHere)
        LongLines.processFile(file, 25)
      FirstClassFunctions.process
      PartiallyAppliedFunctions.process
      Closures.process

      val arr = Array("What's", "up", "doc?")
      echo(arr: _*)
  }

  def echo(args: String*) = for(arg <- args) println(arg)
  
  def filesHere = (new java.io.File("src/programminginscala/chapter8")).listFiles


}
