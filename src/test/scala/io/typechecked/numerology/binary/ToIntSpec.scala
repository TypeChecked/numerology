package io.typechecked
package numerology
package binary

import org.scalatest._
import shapeless.test.illTyped
import BNat._

class ToIntSpec extends FlatSpec with Matchers {

  def toIntTest[A <: BNat](implicit i: ToInt[A]): Int = i.value

  "ToInt" should "turn BNat into Ints" in {
    toIntTest[b199] shouldBe 199
    toIntTest[b0] shouldBe 0
    toIntTest[b1] shouldBe 1
    toIntTest[b200] shouldBe 200
    toIntTest[b27] shouldBe 27
  }

  it should "turn large numbers into ints" in {
    toIntTest[BNat.MaxInt] shouldBe 2147483647
  }

  it should "fail to compile for numbers > MaxInt" in {
    illTyped("toIntTest[b2147483648]")
  }

}
