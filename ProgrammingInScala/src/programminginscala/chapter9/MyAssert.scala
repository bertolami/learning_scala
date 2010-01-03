/*
 * MyAssert.scala
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package programminginscala.chapter9

object MyAssert {
    var assertionsEnabled = true

    def myAssert(predicate: () => Boolean) = {
        if(assertionsEnabled && ! predicate())
            throw new AssertionError
    }

    def byNameAssert(predicate: => Boolean) =
        if(assertionsEnabled && ! predicate)
            throw new AssertionError
}
