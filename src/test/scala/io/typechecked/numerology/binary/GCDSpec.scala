package io.typechecked
package numerology
package binary

import org.scalatest.{FlatSpec, Matchers}

class GCDSpec extends FlatSpec with Matchers {

  import BNat._

  // Option is a hack because there are no values of type s.Out
  def gcd[A <: BNat, B <: BNat](implicit s: GCD[A, B]): Option[s.Out] = Option.empty[s.Out]

  "gcd" should "gcd-iply small numbers together correctly" in {

    gcd[b1, b1]: Option[b1]
    gcd[b1, b2]: Option[b1]
    gcd[b3, b1]: Option[b1]
    gcd[b1, b4]: Option[b1]
    gcd[b2, b1]: Option[b1]
    gcd[b2, b2]: Option[b2]
    gcd[b2, b3]: Option[b1]
    gcd[b2, b4]: Option[b2]
    gcd[b2, b5]: Option[b1]
    gcd[b2, b6]: Option[b2]
    gcd[b2, b7]: Option[b1]
    gcd[b2, b8]: Option[b2]
    gcd[b3, b7]: Option[b1]
    gcd[b8, b5]: Option[b1]
    gcd[b4, b4]: Option[b4]
    gcd[b6, b3]: Option[b3]
    gcd[b10, b10]: Option[b10]
    gcd[b11, b15]: Option[b1]
    gcd[b5, b21]: Option[b1]
    gcd[b64, b32]: Option[b32]
    gcd[b100, b60]: Option[b20]
    gcd[b84, b35]: Option[b7]

  }
}
