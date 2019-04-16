package io.typechecked
package numerology
package ternary

import org.scalatest._

class MultSpec extends FlatSpec with Matchers {

  import TNat._

  // Option is a hack because there are no values of type s.Out
  def mult[A <: TNat, B <: TNat](implicit s: Mult[A, B]): Option[s.Out] = Option.empty[s.Out]

  type t323 = Two[Two[Two[Two[Zero[One[t0]]]]]]
  type t340 = One[Two[One[Zero[One[One[t0]]]]]]
  type t48611 = Two[Zero[One[Zero[Zero[Two[Zero[One[One[Two[t0]]]]]]]]]]
  type t4229157 = Zero[One[One[Two[Two[Zero[Two[One[Two[One[Two[Two[One[Two[t0]]]]]]]]]]]]]]
  type t38208246 = Zero[Two[Zero[Two[One[Two[One[One[Zero[Zero[Two[Two[Two[Two[One[Two[t0]]]]]]]]]]]]]]]]
  type t114721960 = One[One[One[One[Two[Two[Zero[One[One[Two[One[Two[Two[Two[Two[One[Two[t0]]]]]]]]]]]]]]]]]
  type t344165880 = Zero[One[One[One[One[Two[Two[Zero[One[One[Two[One[Two[Two[Two[Two[One[Two[t0]]]]]]]]]]]]]]]]]]
  type t1032594862 = One[One[Zero[Two[One[Two[Zero[Two[Zero[Zero[Zero[Zero[Two[Two[Two[Two[Two[One[Two[t0]]]]]]]]]]]]]]]]]]]
  type t3097833197 = Two[One[Two[Zero[Two[Zero[Zero[Two[Zero[Zero[One[Zero[Zero[Two[Two[Two[Two[Two[One[Two[t0]]]]]]]]]]]]]]]]]]]]
  type t9293596813 = One[Zero[One[Zero[One[Zero[Two[Two[One[Two[One[One[Zero[Zero[Two[Two[Two[Two[Two[One[Two[t0]]]]]]]]]]]]]]]]]]]]]
  type t27880839050 = Two[One[One[One[Zero[Zero[One[Zero[One[One[Zero[Two[One[Zero[Zero[Two[Two[Two[Two[Two[One[Two[t0]]]]]]]]]]]]]]]]]]]]]]
  type t250927745894 = Two[Two[Zero[Zero[Two[Zero[Zero[Two[Zero[One[One[Two[Zero[Two[One[Zero[Zero[Two[Two[Two[Two[Two[One[Two[t0]]]]]]]]]]]]]]]]]]]]]]]]
  type t752783286293 = Two[Two[Zero[One[Zero[One[One[One[Zero[Zero[Two[One[Two[Zero[Two[One[Zero[Zero[Two[Two[Two[Two[Two[One[Two[t0]]]]]]]]]]]]]]]]]]]]]]]]]


  "Mult" should "multiply numbers together correctly" in {

    mult[t0, t0]: Option[t0]
    mult[t0, t1]: Option[t0]
    mult[t1, t0]: Option[t0]
    mult[t0, t2]: Option[t0]
    mult[t0, t3]: Option[t0]
    mult[t3, t3]: Option[t9]
    mult[t3, t9]: Option[t27]
    mult[t7, t7]: Option[t49]
    mult[t19, t17]: Option[t323]
    mult[t4, t5]: Option[t20]
    mult[t24, t3]: Option[t72]
    mult[t24, t1]: Option[t24]
    mult[t1, t99]: Option[t99]
    mult[t68, t5]: Option[t340]
    mult[Zero[Two[Zero[Zero[One[t0]]]]], t48611]: Option[t4229157]
    mult[Zero[One[Zero[Two[Zero[Zero[One[t0]]]]]]], t48611]: Option[t38208246]
    mult[Two[Zero[One[Zero[Two[Zero[Zero[One[t0]]]]]]]], t48611]: Option[t114721960]
    mult[Zero[Two[Zero[One[Zero[Two[Zero[Zero[One[t0]]]]]]]]], t48611]: Option[t344165880]
    mult[Two[Zero[Two[Zero[One[Zero[Two[Zero[Zero[One[t0]]]]]]]]]], t48611]: Option[t1032594862]
    mult[One[Two[Zero[Two[Zero[One[Zero[Two[Zero[Zero[One[t0]]]]]]]]]]], t48611]: Option[t3097833197]
    mult[Two[One[Two[Zero[Two[Zero[One[Zero[Two[Zero[Zero[One[t0]]]]]]]]]]]], t48611]: Option[t9293596813]
    mult[One[Two[One[Two[Zero[Two[Zero[One[Zero[Two[Zero[Zero[One[t0]]]]]]]]]]]]], t48611]: Option[t27880839050]
    mult[One[One[One[Two[One[Two[Zero[Two[Zero[One[Zero[Two[Zero[Zero[One[t0]]]]]]]]]]]]]]], t48611]: Option[t250927745894]
    mult[One[One[One[One[Two[One[Two[Zero[Two[Zero[One[Zero[Two[Zero[Zero[One[t0]]]]]]]]]]]]]]]], t48611]: Option[t752783286293]

  }
}
