package io.typechecked
package numerology
package ternary

import org.scalatest._
import shapeless.test.illTyped

class DivModSpec extends FlatSpec with Matchers {

  import TNat._

  // Option is a hack because there are no values of type s.Out
  def divMod[A <: TNat, B <: TNat](implicit s: DivMod[A, B]): Option[(s.DivOut, s.ModOut)] = Option.empty[(s.DivOut, s.ModOut)]

  "DivMod" should "divModide numbers correctly" in {
    divMod[t0, t1]: Option[(t0, t0)]
    divMod[t0, t2]: Option[(t0, t0)]
    divMod[t0, t3]: Option[(t0, t0)]
    divMod[t0, t212]: Option[(t0, t0)]
    divMod[t3, t3]: Option[(t1, t0)]
    divMod[t3, t9]: Option[(t0, t3)]
    divMod[t9, t3]: Option[(t3, t0)]
    divMod[t9, t4]: Option[(t2, t1)]
    divMod[t7, t7]: Option[(t1, t0)]
    divMod[t19, t17]: Option[(t1, t2)]
    divMod[t4, t5]: Option[(t0, t4)]
    divMod[t4, t3]: Option[(t1, t1)]
    divMod[t24, t3]: Option[(t8, t0)]
    divMod[t24, t5]: Option[(t4, t4)]
    divMod[t24, t13]: Option[(t1, t11)]
    divMod[t24, t9]: Option[(t2, t6)]
    divMod[t24, t1]: Option[(t24, t0)]
    divMod[t1, t99]: Option[(t0, t1)]
    divMod[t99, t5]: Option[(t19, t4)]
    divMod[t68, t5]: Option[(t13, t3)]
    divMod[t184, t21]: Option[(t8, t16)]
  }

  it should "not divModide illegal calculations" in {
    illTyped("divMod[t0, t0]", "diverging.*")
    illTyped("divMod[t1, t0]", "diverging.*")
    illTyped("divMod[t100, t0]", "diverging.*")
  }
}
