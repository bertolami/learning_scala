/*
 * LongLines.scala
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package programminginscala.chapter8
import scala.io.Source
import java.io.File

object LongLines {
    def processFile(filename: File, width: Int) {
        def processLine(line: String) {
            if(line.length > width) {
                println(filename.getName+" " + line.trim);
            }
        }
        val source = Source.fromFile(filename)
        for(line <- source.getLines) {
            processLine(line)
        }
    }


    
}
