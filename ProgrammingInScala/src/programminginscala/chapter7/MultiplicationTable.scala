/*
 * MultiplicationTable.scala
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package programminginscala.chapter7

class MultiplicationTable {
    def makeRowSeq(row: Int) =
    for(col <- 1 to 10) yield {
        val prod = (row * col).toString
        val padding = " " * (4 - prod.length)
        padding + prod
    }

    def makeRow(row: Int) = makeRowSeq(row).mkString

    def multiTable() = {
        val tableSeq = for(row <- 1 to 10) yield makeRow(row)
        tableSeq.mkString("\n")
    }
}
