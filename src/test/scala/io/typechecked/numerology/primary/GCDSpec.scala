package io.typechecked
package numerology
package primary

import org.scalatest._

class GCDSpec extends FlatSpec with Matchers {

  import MNat._

  // Option is a hack because there are no values of type s.Out
  def gcd[A <: MNat, B <: MNat](implicit s: GCD[A, B]): Option[s.Out] = Option.empty[s.Out]

  "gcd" should "gcd-iply small numbers together correctly" in {

    gcd[m1, m1]: Option[m1]
    gcd[m1, m2]: Option[m1]
    gcd[m1, m3]: Option[m1]
    gcd[m1, m4]: Option[m1]
    gcd[m2, m1]: Option[m1]
    gcd[m2, m2]: Option[m2]
    gcd[m2, m3]: Option[m1]
    gcd[m2, m4]: Option[m2]
    gcd[m2, m5]: Option[m1]
    gcd[m2, m6]: Option[m2]
    gcd[m2, m7]: Option[m1]
    gcd[m2, m8]: Option[m2]
    gcd[m3, m7]: Option[m1]
    gcd[m8, m5]: Option[m1]
    gcd[m4, m4]: Option[m4]
    gcd[m6, m3]: Option[m3]
    gcd[m10, m10]: Option[m10]
    gcd[m11, m15]: Option[m1]
    gcd[m5, m21]: Option[m1]
    gcd[m64, m32]: Option[m32]
    gcd[m100, m60]: Option[m20]
    gcd[m84, m35]: Option[m7]

  }

  it should "gcd-iply very large numbers together correctly" in {

    gcd[m1823909224137000, m131941772149]: Option[m11]

    import Prime._
    import ternary.TNat._

    type b2 = (p61 ^ t1) *: (p53 ^ t1) *: (p43 ^ t1) *: (p37 ^ t1) *: (p29 ^ t1) *: (p19 ^ t1) *: (p13 ^ t1) *: (p7 ^ t1) *: (p3 ^ t1) *: m1
    type b3 = (p67 ^ t1) *: (p61 ^ t2) *: (p59 ^ t1) *: (p53 ^ t2) *: (p47 ^ t1) *: (p43 ^ t2) *: (p41 ^ t1) *: (p37 ^ t2) *: (p31 ^ t1) *: (p29 ^ t2) *: (p23 ^ t1) *: (p19 ^ t2) *: (p17 ^ t1) *: (p13 ^ t2) *: (p11 ^ t1) *: (p7 ^ t2) *: (p5 ^ t1) *: (p3 ^ t2) *: (p2 ^ t1) *: m1
    gcd[b2, b3]: Option[b2]
    gcd[b3, b2]: Option[b2]
  }
}
