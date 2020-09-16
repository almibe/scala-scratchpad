package scalascratchpad.zio

//import zio.ZIO
//import zio.Runtime
//import zio.stream.ZStream
//
//object Main {
//  def main(args: Array[String]) = {
//    val z = ZStream.range(0, 10000).zip(ZStream.fromIterator(List(1,2).iterator).forever).runCollect
//    println(Runtime.default.unsafeRun(z))
//    val start = System.currentTimeMillis()
//    val zz = ZStream.range(0, 10000).zip(ZStream.fromIterator(List(0,1).iterator).forever).runCollect
//    //  println(Runtime.default.unsafeRun(zz))
//    Runtime.default.unsafeRun(zz)
//    val stop = System.currentTimeMillis()
//    println(s"*** ${stop - start}")
//    val start2 = System.currentTimeMillis()
//    val zz2 = ZStream.range(0, 10000).zip(ZStream.fromIterator(List(0,1).iterator).forever).runCollect
//    //  println(Runtime.default.unsafeRun(zz))
//    Runtime.default.unsafeRun(zz2)
//    val stop2 = System.currentTimeMillis()
//    println(s"*** ${stop2 - start2}")
//  }
//}
