/*
 * Chapter7.scala
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package programminginscala.chapter7

object Chapter7 {

    /**
     * @param args the command line arguments
     */
    def main(args: Array[String]) :Unit = {
        println(gcdLoop(12, 8))
        println(gcdLoop(8, 12))

        println(gcd(12, 8))
        println(gcd(8, 12))

        simpleForLoop

        fileForLoop

        grep(".*gcd.*")

        exceptions(4)
       val result = try {
            exceptions(3)
        } catch {
            case ex: RuntimeException =>  "catched runtime exception"
        } finally {
            println("done")
        }
        println(result)

        val table = new MultiplicationTable
        println(table.multiTable)

    }

    def exceptions(n: Int)  = {
        if(n %2 == 0) n/2 else throw new RuntimeException("n must be even")
    }

    def scalaFiles = {
        for {file <- filesHere
            if(file.getName.endsWith(".scala"))
        } yield file
    }
    
    def grep(pattern: String) = {
        for {file <- scalaFiles
             line <- fileLines(file)
             trimmed = line.trim
             if(trimmed.matches(pattern))} {
            println(file +": "+ line.trim)
        }
    }
    
    def fileLines(file: java.io.File) = scala.io.Source.fromFile(file).getLines.toList

    def fileForLoop {
        for (file <- filesHere
             if file.isFile;
             if file.getName.endsWith(".scala")) {
            println(file)
        }

    }

   

    def filesHere = (new java.io.File("src/programminginscala/chapter7")).listFiles

    def simpleForLoop {
        for (i <- 1 to 4)
        println("Iteration "+i)
        for (i <- 1 until 4)
        println("Iteration "+i)
    }

    def gcdLoop(x: Long, y: Long) : Long = {
        var a = x
        var b = y
        while (a != 0) {
            val temp = a
            a = b % a
            b = temp
        }
        b
    }

    def gcd(x: Long, y: Long) : Long = if(y == 0) x else gcd(y, x % y)

}
