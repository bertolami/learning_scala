/*
 * Chapter9.scala
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package programminginscala.chapter9

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
    }

}
