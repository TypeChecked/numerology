package io.typechecked
package numerology
package ternary

import org.scalatest._
import TNat._

class UnsafeToIntSpec extends FlatSpec with Matchers {

  def unsafeToIntTest[A <: TNat](implicit i: UnsafeToInt[A]): Int = i.value

  "UnsafeToInt" should "turn TNat into ints" in {
    unsafeToIntTest[t199] shouldBe 199
    unsafeToIntTest[t0] shouldBe 0
    unsafeToIntTest[t1] shouldBe 1
    unsafeToIntTest[t200] shouldBe 200
    unsafeToIntTest[t27] shouldBe 27
    unsafeToIntTest[TNat.MaxInt] shouldBe 2147483647
  }

  it should "turn very large numbers into overflowed ints" in {

    // WARNING: These are obviously the wrong values!
    unsafeToIntTest[TNat.t2147483648] shouldBe -2147483648

    type t77219132141850587 = Two[Two[Zero[One[Zero[Two[One[Zero[Zero[Zero[One[Zero[One[Zero[Two[Two[Two[Zero[One[Two[Two[Zero[Two[Zero[Two[Two[Zero[One[Zero[Zero[Zero[Two[Two[One[One[One[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
    unsafeToIntTest[t77219132141850587] shouldBe 1026412507
  }

}
