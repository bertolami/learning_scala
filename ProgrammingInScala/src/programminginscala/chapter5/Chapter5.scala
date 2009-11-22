/*
 * Chapter5.scala
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package programminginscala.chapter5

object Chapter5 {

    /**
     * @param args the command line arguments
     */
    def main(args: Array[String]) :Unit = {
        val oct = 035
        println(oct)
        println("""|Welcome to Ultamix 3000
               |Type "Help" for help. """.stripMargin)
        val symbol = 'aSymbol
        println(symbol.name)
        val s = "a Nice String"
        println(s toLowerCase)
        println(null == null)
        println(2 << 2 + 2)
    }

}
