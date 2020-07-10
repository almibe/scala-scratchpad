package scalascratchpad

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class MainSpec extends AnyFlatSpec with Matchers {
  it should "test true" in {
    true shouldEqual true
  }
}
