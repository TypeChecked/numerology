package io.typechecked
package numerology
package binary

import org.scalatest._
import shapeless.test.illTyped

class SumSpec extends FlatSpec with Matchers {

  import BNat._

  // Option is a hack because there are no values of type s.Out
  def sum[A <: BNat, B <: BNat](implicit s: Sum[A, B]): Option[s.Out] = Option.empty[s.Out]

  "Sum" should "add small numbers together correctly" in {

    sum[b0, b0]: Option[b0]
    sum[b0, b1]: Option[b1]
    sum[b1, b0]: Option[b1]
    sum[b0, b2]: Option[b2]
    sum[b0, b3]: Option[b3]
    sum[b0, b4]: Option[b4]
    sum[b1, b1]: Option[b2]
    sum[b1, b2]: Option[b3]
    sum[b1, b3]: Option[b4]
    sum[b1, b4]: Option[b5]
    sum[b2, b1]: Option[b3]
    sum[b2, b2]: Option[b4]
    sum[b2, b3]: Option[b5]
    sum[b2, b4]: Option[b6]
    sum[b2, b5]: Option[b7]
    sum[b2, b6]: Option[b8]
    sum[b2, b7]: Option[b9]
    sum[b2, b8]: Option[b10]
    sum[b3, b7]: Option[b10]
    sum[b8, b5]: Option[b13]
    sum[b4, b4]: Option[b8]
    sum[b6, b3]: Option[b9]

    sum[b103, b54]: Option[b157]

    illTyped("sum[b94, b76]: Option[b171]")
  }

  it should "add large numbers together correctly" in {

    // 800 million-ish
    type b796864573 = One[Zero[One[One[One[One[Zero[Zero[Zero[Zero[Zero[Zero[One[One[Zero[Zero[One[One[One[One[One[One[One[Zero[One[One[One[One[Zero[One[b0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]

    // 13 million-ish
    type b12746243 = One[One[Zero[Zero[Zero[Zero[Zero[Zero[Zero[One[One[One[One[One[One[Zero[Zero[One[Zero[Zero[Zero[Zero[One[One[b0]]]]]]]]]]]]]]]]]]]]]]]]

    // Their sum
    type b809610816 = Zero[Zero[Zero[Zero[Zero[Zero[One[Zero[Zero[One[One[One[Zero[One[Zero[One[One[Zero[Zero[Zero[Zero[Zero[One[Zero[Zero[Zero[Zero[Zero[One[One[b0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]

    // Prove the numbers add up in real life
    796864573 + 12746243 shouldBe 809610816

    // Compiles in < 1s
    sum[b796864573, b12746243]: Option[b809610816]
  }
}
