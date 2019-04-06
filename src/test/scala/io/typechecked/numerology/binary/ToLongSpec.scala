package io.typechecked
package numerology
package binary

import org.scalatest._
import BNat._

class ToLongSpec extends FlatSpec with Matchers {

  def toLongTest[A <: BNat](implicit l: ToLong[A]): Long = l.value

  "ToLong" should "turn BNat into Longs" in {
    toLongTest[b199] shouldBe 199l
    toLongTest[b0] shouldBe 0l
    toLongTest[b1] shouldBe 1l
    toLongTest[b200] shouldBe 200l
    toLongTest[b27] shouldBe 27l
  }

  it should "turn very large numbers into longs" in {
    toLongTest[BNat.MaxInt] shouldBe 2147483647l
    toLongTest[b2147483648] shouldBe 2147483648l
  }

}
