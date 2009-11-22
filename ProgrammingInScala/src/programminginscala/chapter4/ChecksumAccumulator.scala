/*
 * ChecksumAccumulator.scala
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package programminginscala.chapter4

import scala.collection.mutable.Map

object ChecksumAccumulator {
    private val cache = Map[String, Int]()
    
    def calculate(s: String): Int = {
        if(cache.contains(s))
            cache(s)
        else {
            val acc = new ChecksumAccumulator
            for (c <- s) acc.add(c.toByte)
            val cs = acc.checksum
            cache += (s -> cs)
            cs
        }
    }
}

class ChecksumAccumulator {
    private var sum = 0
    
    def add(b: Byte):Unit =  sum += b
   
    def checksum() =  ~(sum & 0xFF)+1
}
