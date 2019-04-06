package io.typechecked
package numerology
package binary

import org.scalatest._
import shapeless.test.illTyped

class MultSpec extends FlatSpec with Matchers {

  import BNat._

  // Option is a hack because there are no values of type s.Out
  def mult[A <: BNat, B <: BNat](implicit s: Mult[A, B]): Option[s.Out] = Option.empty[s.Out]

  "Mult" should "add small numbers together correctly" in {

    mult[b0, b0]: Option[b0]
    mult[b0, b1]: Option[b0]
    mult[b1, b0]: Option[b0]
    mult[b0, b2]: Option[b0]
    mult[b0, b3]: Option[b0]
    mult[b0, b4]: Option[b0]
    mult[b1, b1]: Option[b1]
    mult[b1, b2]: Option[b2]
    mult[b1, b3]: Option[b3]
    mult[b1, b4]: Option[b4]
    mult[b2, b1]: Option[b2]
    mult[b2, b2]: Option[b4]
    mult[b2, b3]: Option[b6]
    mult[b2, b4]: Option[b8]
    mult[b2, b5]: Option[b10]
    mult[b2, b6]: Option[b12]
    mult[b2, b7]: Option[b14]
    mult[b4, b4]: Option[b16]
    mult[b2, b8]: Option[b16]
    mult[b6, b3]: Option[b18]
    mult[b3, b6]: Option[b18]
    mult[b4, b5]: Option[b20]
    mult[b3, b7]: Option[b21]
    mult[b8, b5]: Option[b40]
    mult[b8, b8]: Option[b64]
    mult[b11, b11]: Option[b121]
    mult[b100, b2]: Option[b200]

    type b327 = One[One[One[Zero[Zero[Zero[One[Zero[One[b0]]]]]]]]]
    type b1344 = Zero[Zero[Zero[Zero[Zero[Zero[One[Zero[One[Zero[One[b0]]]]]]]]]]]
    type b5562 = Zero[One[Zero[One[One[One[Zero[One[One[Zero[One[Zero[One[b0]]]]]]]]]]]]]
    type b20628 = Zero[Zero[One[Zero[One[Zero[Zero[One[Zero[Zero[Zero[Zero[One[Zero[One[b0]]]]]]]]]]]]]]]

    mult[b109, b3]: Option[b327]
    mult[b96, b14]: Option[b1344]
    mult[b103, b54]: Option[b5562]
    mult[b108, b191]: Option[b20628]

    illTyped("mult[b103, b54]: Option[b5563]")
  }

  it should "multiply large numbers together correctly" in {

    type b1743 = One[One[One[One[Zero[Zero[One[One[Zero[One[One[b0]]]]]]]]]]]
    type b20628 = Zero[Zero[One[Zero[One[Zero[Zero[One[Zero[Zero[Zero[Zero[One[Zero[One[b0]]]]]]]]]]]]]]]
    type b35954604 = Zero[Zero[One[One[Zero[One[Zero[One[One[One[One[One[One[Zero[Zero[One[Zero[Zero[One[Zero[Zero[One[Zero[Zero[Zero[One[b0]]]]]]]]]]]]]]]]]]]]]]]]]]

    1743 * 20628 shouldBe 35954604
    mult[b1743, b20628]: Option[b35954604]
  }
}
