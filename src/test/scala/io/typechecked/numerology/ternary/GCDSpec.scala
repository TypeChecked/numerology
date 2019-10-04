package io.typechecked.numerology.ternary

import org.scalatest.{FlatSpec, Matchers}

class GCDSpec extends FlatSpec with Matchers {

  import TNat._

  def gcd[A <: TNat, B <: TNat](implicit s: GCD[A, B]): Option[s.Out] = Option.empty[s.Out]

  "gcd" should "gcd-iply small numbers together correctly" in {

    gcd[t1, t1]: Option[t1]
    gcd[t1, t2]: Option[t1]
    gcd[t3, t1]: Option[t1]
    gcd[t1, t4]: Option[t1]
    gcd[t2, t1]: Option[t1]
    gcd[t2, t2]: Option[t2]
    gcd[t2, t3]: Option[t1]
    gcd[t2, t4]: Option[t2]
    gcd[t2, t5]: Option[t1]
    gcd[t2, t6]: Option[t2]
    gcd[t2, t7]: Option[t1]
    gcd[t2, t8]: Option[t2]
    gcd[t3, t7]: Option[t1]
    gcd[t8, t5]: Option[t1]
    gcd[t4, t4]: Option[t4]
    gcd[t6, t3]: Option[t3]
    gcd[t10, t10]: Option[t10]
    gcd[t11, t15]: Option[t1]
    gcd[t5, t21]: Option[t1]
    gcd[t64, t32]: Option[t32]
    gcd[t100, t60]: Option[t20]
    gcd[t84, t35]: Option[t7]

  }
}
