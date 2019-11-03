package io.typechecked
package numerology
package ternary

import org.scalatest._
import shapeless.test.illTyped

class ModSpec extends FlatSpec with Matchers {

  import TNat._

  // Option is a hack because there are no values of type s.Out
  def mod[A <: TNat, B <: TNat](implicit s: Mod[A, B]): Option[s.Out] = Option.empty[s.Out]

  "Mod" should "modulo numbers correctly" in {
    mod[t0, t1]: Option[t0]
    mod[t0, t2]: Option[t0]
    mod[t0, t3]: Option[t0]
    mod[t0, t212]: Option[t0]
    mod[t3, t3]: Option[t0]
    mod[t3, t9]: Option[t3]
    mod[t9, t3]: Option[t0]
    mod[t9, t4]: Option[t1]
    mod[t7, t7]: Option[t0]
    mod[t19, t17]: Option[t2]
    mod[t4, t5]: Option[t4]
    mod[t4, t3]: Option[t1]
    mod[t24, t3]: Option[t0]
    mod[t24, t5]: Option[t4]
    mod[t24, t13]: Option[t11]
    mod[t24, t1]: Option[t0]
    mod[t1, t99]: Option[t1]
    mod[t99, t5]: Option[t4]
    mod[t68, t5]: Option[t3]
    mod[t184, t21]: Option[t16]
  }

  it should "not modulo illegal calculations" in {
    illTyped("mod[t0, t0]", "diverging.*")
    illTyped("mod[t1, t0]", "diverging.*")
    illTyped("mod[t100, t0]", "diverging.*")
  }
}
