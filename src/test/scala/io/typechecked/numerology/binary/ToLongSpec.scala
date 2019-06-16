package io.typechecked
package numerology
package binary

import org.scalatest._
import BNat._

class ToLongSpec extends FlatSpec with Matchers {

  def toLongTest[A <: BNat](implicit l: ToLong[A]): Long = l.value

  "ToLong" should "turn BNat into Longs" in {
    toLongTest[b199] shouldBe 199L
    toLongTest[b0] shouldBe 0L
    toLongTest[b1] shouldBe 1L
    toLongTest[b200] shouldBe 200L
    toLongTest[b27] shouldBe 27L
  }

  it should "turn very large numbers into longs" in {
    toLongTest[BNat.MaxInt] shouldBe 2147483647L
    toLongTest[b2147483648] shouldBe 2147483648L
  }

}
