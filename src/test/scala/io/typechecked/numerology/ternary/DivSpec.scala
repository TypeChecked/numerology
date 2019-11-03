package io.typechecked
package numerology
package ternary

import org.scalatest._
import shapeless.test.illTyped

class DivSpec extends FlatSpec with Matchers {

  import TNat._

  // Option is a hack because there are no values of type s.Out
  def div[A <: TNat, B <: TNat](implicit s: Div[A, B]): Option[s.Out] = Option.empty[s.Out]

  "Div" should "divide numbers correctly" in {
    div[t0, t1]: Option[t0]
    div[t0, t2]: Option[t0]
    div[t0, t3]: Option[t0]
    div[t3, t3]: Option[t1]
    div[t3, t9]: Option[t0]
    div[t9, t3]: Option[t3]
    div[t7, t7]: Option[t1]
    div[t19, t17]: Option[t1]
    div[t4, t5]: Option[t0]
    div[t24, t3]: Option[t8]
    div[t24, t1]: Option[t24]
    div[t1, t99]: Option[t0]
    div[t99, t5]: Option[t19]
    div[t68, t5]: Option[t13]
    div[t184, t23]: Option[t8]
  }

  it should "not divide illegal calculations" in {
    illTyped("div[t0, t0]", "diverging.*")
    illTyped("div[t1, t0]", "diverging.*")
    illTyped("div[t100, t0]", "diverging.*")
  }
}
