/*
 * Chapter9.scala
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package programminginscala.chapter9

import WithPrintWriter.withPrintWriter
import java.io.File
import java.util.Date
import MyAssert.myAssert

import MyAssert.byNameAssert

object Chapter9 {

    /**
     * @param args the command line arguments
     */
    def main(args: Array[String]) :Unit = {
        println("ending")
        val scalaFiles = FileMatcher.filesEnding("scala")
        scalaFiles.foreach(println)

        println("containing")
        val matcherFiles = FileMatcher.filesContaining("Matcher")
        matcherFiles.foreach(println)

        println("regex")
        val regexFiles = FileMatcher.filesRegex(".*Ch.*pter.*");
        regexFiles.foreach(println)

        ContainsChecker.process

        println(Currying.plainOldSum(2, 3))

        println(Currying.curriedSum(2)(3))

        val onePlus = Currying.curriedSum(1)_
        println(onePlus(3))

        println(ControlStructures.twice(_ + 1, 5))

        withPrintWriter(new File("src/programminginscala/chapter9/date.txt")) {
            writer => writer.println(new Date())
        }

        myAssert(() => 5 > 3)

        byNameAssert(5 > 3)
    }

}
