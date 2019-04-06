package io.typechecked
package numerology
package ternary

import org.scalatest._

class SumSpec extends FlatSpec with Matchers {

  import TNat._

  // Option is a hack because there are no values of type s.Out
  def sum[A <: TNat, B <: TNat](implicit s: Sum[A, B]): Option[s.Out] = Option.empty[s.Out]

  "Sum" should "add small numbers together correctly" in {

    sum[t0, t0]: Option[t0]
    sum[t0, t1]: Option[t1]
    sum[t1, t0]: Option[t1]
    sum[t0, t2]: Option[t2]
    sum[t0, t3]: Option[t3]
    sum[t0, t4]: Option[t4]
    sum[t1, t1]: Option[t2]
    sum[t1, t2]: Option[t3]
    sum[t1, t3]: Option[t4]
    sum[t1, t4]: Option[t5]
    sum[t2, t1]: Option[t3]
    sum[t2, t2]: Option[t4]
    sum[t2, t3]: Option[t5]
    sum[t2, t4]: Option[t6]
    sum[t2, t5]: Option[t7]
    sum[t2, t6]: Option[t8]
    sum[t2, t7]: Option[t9]
    sum[t2, t8]: Option[t10]
    sum[t3, t7]: Option[t10]
    sum[t8, t5]: Option[t13]
    sum[t4, t4]: Option[t8]
    sum[t6, t3]: Option[t9]

  }

  it should "add very large numbers together correctly" in {

    // 77 quadrillion-ish
    type t77145285937108463 = Two[Two[One[Zero[Two[Two[One[One[Zero[One[Zero[Two[One[Zero[Two[Zero[Zero[One[Two[Two[Zero[Zero[One[Two[One[Two[One[Zero[Zero[Two[Two[One[Two[One[One[One[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
    // 72 trillion-ish
    type t73846204742124 = Zero[Zero[Two[Zero[One[Two[Two[One[Two[One[Zero[One[Two[Two[Two[One[Two[Two[One[Two[One[Zero[One[One[Zero[Zero[Two[Zero[Zero[One[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]

    // Their sum
    type t77219132141850587 = Two[Two[Zero[One[Zero[Two[One[Zero[Zero[Zero[One[Zero[One[Zero[Two[Two[Two[Zero[One[Two[Two[Zero[Two[Zero[Two[Two[Zero[One[Zero[Zero[Zero[Two[Two[One[One[One[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]

    // Prove the numbers add up in real life
    77145285937108463l + 73846204742124l shouldBe 77219132141850587l

    // Compiles in < 1s
    sum[t77145285937108463, t73846204742124]: Option[t77219132141850587]
  }
}
