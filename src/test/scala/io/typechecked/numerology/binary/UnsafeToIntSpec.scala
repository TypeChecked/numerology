package io.typechecked
package numerology
package binary

import org.scalatest._
import BNat._

class UnsafeToIntSpec extends FlatSpec with Matchers {

  def unsafeToIntTest[A <: BNat](implicit i: UnsafeToInt[A]): Int = i.value

  "UnsafeToInt" should "turn BNat into ints" in {
    unsafeToIntTest[b199] shouldBe 199
    unsafeToIntTest[b0] shouldBe 0
    unsafeToIntTest[b1] shouldBe 1
    unsafeToIntTest[b200] shouldBe 200
    unsafeToIntTest[b27] shouldBe 27
    unsafeToIntTest[BNat.MaxInt] shouldBe 2147483647
  }

  it should "turn very large numbers into overflowed ints" in {

    // WARNING: These are obviously the wrong values!
    unsafeToIntTest[BNat.b2147483648] shouldBe -2147483648

    type b7635143657 = One[Zero[Zero[One[Zero[One[One[One[One[One[Zero[One[Zero[Zero[Zero[Zero[One[One[One[Zero[One[Zero[Zero[Zero[One[One[One[Zero[Zero[Zero[One[One[One[b0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
    unsafeToIntTest[b7635143657] shouldBe -954790935
  }

}
