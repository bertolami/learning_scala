/*
 * Frog.scala
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package programminginscala.chapter12

class Animal
trait HasLegs

class Frog extends Animal with Philosophical with HasLegs {
    override def toString = "green"
    override def philosophize() {
        println("It ain't easy being "+ toString+"!")
    }
}
