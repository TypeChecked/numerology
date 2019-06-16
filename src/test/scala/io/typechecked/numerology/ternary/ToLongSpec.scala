package io.typechecked
package numerology
package ternary

import org.scalatest._
import TNat._

class ToLongSpec extends FlatSpec with Matchers {

  def toLongTest[A <: TNat](implicit l: ToLong[A]): Long = l.value

  "ToLong" should "turn TNat into Longs" in {
    toLongTest[t199] shouldBe 199L
    toLongTest[t0] shouldBe 0L
    toLongTest[t1] shouldBe 1L
    toLongTest[t200] shouldBe 200L
    toLongTest[t27] shouldBe 27L
  }

  it should "turn very large numbers into longs" in {

    toLongTest[TNat.MaxInt] shouldBe 2147483647L

    type t77219132141850587 = Two[Two[Zero[One[Zero[Two[One[Zero[Zero[Zero[One[Zero[One[Zero[Two[Two[Two[Zero[One[Two[Two[Zero[Two[Zero[Two[Two[Zero[One[Zero[Zero[Zero[Two[Two[One[One[One[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
    toLongTest[t77219132141850587] shouldBe 77219132141850587L
  }

}
