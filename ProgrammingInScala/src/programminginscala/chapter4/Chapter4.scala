/*
 * Chapter4.scala
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package programminginscala.chapter4
import ChecksumAccumulator.calculate
object Chapter4 extends Application {

     for(arg <- List("fall", "winter", "spring"))
      println(arg +": "+calculate(arg))
  

}
