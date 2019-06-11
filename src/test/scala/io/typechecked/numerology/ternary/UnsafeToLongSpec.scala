package io.typechecked
package numerology
package ternary

import org.scalatest._
import TNat._

class UnsafeToLongSpec extends FlatSpec with Matchers {

  def unsafeToLongTest[A <: TNat](implicit i: UnsafeToLong[A]): Long = i.value

  "UnsafeToLong" should "turn TNat into longs" in {
    unsafeToLongTest[t199] shouldBe 199L
    unsafeToLongTest[t0] shouldBe 0L
    unsafeToLongTest[t1] shouldBe 1L
    unsafeToLongTest[t200] shouldBe 200L
    unsafeToLongTest[t27] shouldBe 27L
    unsafeToLongTest[TNat.MaxInt] shouldBe 2147483647L
    unsafeToLongTest[TNat.MaxLong] shouldBe 9223372036854775807L
  }

  it should "turn very large numbers into overflowed longs" in {

    unsafeToLongTest[TNat.t9223372036854775808] shouldBe -9223372036854775808L

  }

}
