/*
 * WithPrintWriter.scala
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package programminginscala.chapter9

import java.io.PrintWriter
import java.io.File

object WithPrintWriter {
    def withPrintWriter(file: File)(op: PrintWriter => Unit) {
        val writer = new PrintWriter(file)
        try {
            op(writer)
        } finally {
            writer.close
        }
    }
}
