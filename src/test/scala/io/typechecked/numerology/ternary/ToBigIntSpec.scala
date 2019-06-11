package io.typechecked
package numerology
package ternary

import org.scalatest._
import TNat._

class ToBigIntSpec extends FlatSpec with Matchers {

  def ToBigIntTest[A <: TNat](implicit i: ToBigInt[A]): BigInt = i.value

  "ToBigInt" should "turn TNat into BigInts" in {
    ToBigIntTest[t199] shouldBe BigInt(199)
    ToBigIntTest[t0] shouldBe BigInt(0)
    ToBigIntTest[t1] shouldBe BigInt(1)
    ToBigIntTest[t200] shouldBe BigInt(200)
    ToBigIntTest[t27] shouldBe BigInt(27)
    ToBigIntTest[TNat.MaxInt] shouldBe BigInt(Int.MaxValue)
    ToBigIntTest[TNat.MaxLong] shouldBe BigInt(Long.MaxValue)
  }

  it should "turn very large numbers into BigInt" in {

    ToBigIntTest[TNat.t9223372036854775808] shouldBe BigInt(Long.MaxValue) + 1

  }

}
