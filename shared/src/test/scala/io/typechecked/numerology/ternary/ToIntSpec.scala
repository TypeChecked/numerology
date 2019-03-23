package io.typechecked
package numerology
package ternary

import org.scalatest._
import shapeless.test.illTyped
import TNat._

class ToIntSpec extends FlatSpec with Matchers {

  def toIntTest[A <: TNat](implicit i: ToInt[A]): Int = i.value

  "ToInt" should "turn TNat into Ints" in {
    toIntTest[t199] shouldBe 199
    toIntTest[t0] shouldBe 0
    toIntTest[t1] shouldBe 1
    toIntTest[t200] shouldBe 200
    toIntTest[t27] shouldBe 27
  }

  it should "turn large numbers into ints" in {
    toIntTest[TNat.MaxInt] shouldBe 2147483647
  }

  it should "fail to compile for numbers > MaxInt" in {

    illTyped("toIntTest[t2147483648]")

    type t77219132141850587 = Two[Two[Zero[One[Zero[Two[One[Zero[Zero[Zero[One[Zero[One[Zero[Two[Two[Two[Zero[One[Two[Two[Zero[Two[Zero[Two[Two[Zero[One[Zero[Zero[Zero[Two[Two[One[One[One[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
    illTyped("toIntTest[t77219132141850587]")
  }

}
