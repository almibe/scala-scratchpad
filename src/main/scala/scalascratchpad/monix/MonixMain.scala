package scalascratchpad.monix

@main def main() = println("monix")

//import java.nio.ByteBuffer
//
//import cats.effect.Resource
//import monix.eval.Task
//import monix.reactive.Observable
//import org.rocksdb.RocksDB
//import org.rocksdb.Options
//
//import scala.util.Random
//import monix.execution.Scheduler.Implicits.global
//
//object Hello extends App {
//
//  println("Start")
//  val r = createResource()
//  val u = r.use { x =>
//    val t = Task { x }
//    println("end of use")
//    t
//  }.runSyncUnsafe()
//
//  u.foreach { t =>
//    println(t)
//  }
//
//  println("End")
//
//  def createResource(): Resource[Task, Observable[String]] = {
//    Resource.make(
//      Task {
//        println("In create")
//        Observable.fromIterable(List("Yes", "No", "Maybe"))
//     }
//    ) ( obs =>
//      Task { println("In release")}
//    )
//  }
//
//  //  val start = System.currentTimeMillis()
//  //  RocksDB.loadLibrary()
//  //
//  //  val options: Options = new Options().setCreateIfMissing(true)
//  //
//  //  try {
//  //    val db = RocksDB.open(options, "/home/alex/rocksdbtmp")
//  //    try {
//  ////      for (x <- 0 to 1000000) {
//  ////        writeRandomValue(db)
//  ////      }
//  //      val average = findAverage(db)
//  //      println(average)
//  //    } finally
//  //    db.close()
//  //  } finally {
//  //    options.close()
//  //    println(s"***${System.currentTimeMillis() - start}")
//  //  }
//  //
//  //  def findAverage(db: RocksDB): BigInt = {
//  //    val scanner = new DBScanner(db)
//  //    var cnt = 0L
//  //    var total = BigInt("0")
//  //    scanner.foreach((value) => {
//  //      cnt += 1
//  //      total += BigInt(value.toString)
//  //    })
//  //    scanner.close()
//  //    (total / BigInt(cnt.toString))
//  //  }
//  //
//  //  class DBScanner(private val db: RocksDB) extends Iterable[Long] with AutoCloseable {
//  //    private val iter = db.newIterator()
//  //    iter.seekToFirst()
//  //
//  //    override def iterator: Iterator[Long] = {
//  //      object II extends Iterator[Long] {
//  //        override def hasNext: Boolean = {
//  //          iter.isValid
//  //        }
//  //
//  //        override def next(): Long = {
//  //          val result = ByteUtils.bytesToLong(iter.key())
//  //          iter.next()
//  //          result
//  //        }
//  //      }
//  //      II
//  //    }
//  //
//  //    override def close(): Unit = {
//  //      iter.close()
//  //    }
//  //  }
//  //
//  //  def writeRandomValue(db: RocksDB): Unit =
//  //    db.put(ByteUtils.longToBytes(Random.nextLong()),
//  //      ByteUtils.longToBytes(Random.nextLong()))
//  //
//  ////  def readAllDb(db: RocksDB): Iterable[Long] = {
//  ////    new DBScanner(db)
//  ////  }
//  //}
//  //
//  //object ByteUtils {
//  //  private val buffer = ByteBuffer.allocate(java.lang.Long.BYTES)
//  //  def longToBytes(x: Long): Array[Byte] = {
//  //    buffer.clear()
//  //    buffer.putLong(0, x)
//  //    buffer.array()
//  //  }
//  //
//  //  def bytesToLong(bytes: Array[Byte]): Long = {
//  //    buffer.clear()
//  //    buffer.put(bytes, 0, bytes.size)
//  //    buffer.flip() //need flip
//  //    buffer.getLong()
//  //  }
//  //}
//}
