package io.typechecked
package numerology
package primary

import org.scalatest._

class MultSpec extends FlatSpec with Matchers {

  import MNat._

  // Option is a hack because there are no values of type s.Out
  def mult[A <: MNat, B <: MNat](implicit s: Mult[A, B]): Option[s.Out] = Option.empty[s.Out]

  "mult" should "multiply small numbers together correctly" in {

    mult[m1, m1]: Option[m1]
    mult[m1, m2]: Option[m2]
    mult[m1, m3]: Option[m3]
    mult[m1, m4]: Option[m4]
    mult[m2, m1]: Option[m2]
    mult[m2, m2]: Option[m4]
    mult[m2, m3]: Option[m6]
    mult[m2, m4]: Option[m8]
    mult[m2, m5]: Option[m10]
    mult[m2, m6]: Option[m12]
    mult[m2, m7]: Option[m14]
    mult[m2, m8]: Option[m16]
    mult[m3, m7]: Option[m21]
    mult[m8, m5]: Option[m40]
    mult[m4, m4]: Option[m16]
    mult[m6, m3]: Option[m18]
    mult[m10, m10]: Option[m100]
    mult[m11, m15]: Option[m165]
    mult[m5, m21]: Option[m105]
    mult[m64, m3]: Option[m192]

  }

  it should "multiply very large numbers together correctly" in {
    mult[m1823909224137000, m131941772149]: Option[m240649815271543425160413000]
  }
}
