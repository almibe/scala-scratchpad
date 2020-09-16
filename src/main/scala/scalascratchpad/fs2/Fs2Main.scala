package scalascratchpad.fs2

//import fs2._

//object Main {
//  def main(args: Array[String]) = {
//    val i = Stream.range(0,10000, 1).zip(Stream.range(0,10000, 1).take(2).repeat).compile.toList
//    println(i)
//    val start = System.currentTimeMillis()
//    val ii = Stream.range(0,10000, 1).zip(Stream.range(0,10000, 1).take(2).repeat).compile.toList
//    //println(ii)
//    val stop = System.currentTimeMillis()
//    println(s"*** ${stop - start}")
//    val start2 = System.currentTimeMillis()
//    val ii2 = Stream.range(0,10000, 1).zip(Stream.range(0,10000, 1).take(2).repeat).compile.toList
//    //println(ii)
//    val stop2 = System.currentTimeMillis()
//    println(s"*** ${stop2 - start2}")
//  }  
//}
