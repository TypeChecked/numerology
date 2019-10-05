package io.typechecked
package numerology
package binary

import org.scalatest.{FlatSpec, Matchers}

class MinusSpec extends FlatSpec with Matchers {

  import BNat._

  // Option is a hack because there are no values of type s.Out
  def minus[A <: BNat, B <: BNat](implicit s: Minus[A, B]): Option[s.Out] = Option.empty[s.Out]

  "Minus" should "subtract small numbers correctly" in {

    minus[b0, b0]: Option[b0]
    minus[b1, b0]: Option[b1]
    minus[b2, b2]: Option[b0]
    minus[b4, b2]: Option[b2]
    minus[b5, b4]: Option[b1]
    minus[b5, b3]: Option[b2]
  }
}
