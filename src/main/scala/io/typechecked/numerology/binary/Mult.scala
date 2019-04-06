package io.typechecked
package numerology
package binary

import BNat.b1

trait Mult[A <: BNat, B <: BNat] { type Out <: BNat }

object Mult extends LowPriorityMultImpl {

  type Aux[A <: BNat, B <: BNat, Out0 <: BNat] = Mult[A, B] { type Out = Out0 }

  implicit def multZero1[A <: BNat]: Mult.Aux[A, b0, b0] = null
  implicit def multZero2[B <: BNonZero]: Mult.Aux[b0, B, b0] = null

  implicit def multOdd1[A <: BNonZero]: Mult.Aux[A, b1, A] = null

  implicit def multEvenEven[A <: BNat, B <: BNat, C <: BNat](implicit m: Mult.Aux[A, B, C]): Mult.Aux[Zero[A], Zero[B], Zero[Zero[C]]] = null

  implicit def multEvenOdd[A <: BNat, B <: BNonZero, C <: BNat, D <: BNat](
    implicit m: Mult.Aux[A, B, C],
    s: Sum.Aux[Zero[Zero[C]], Zero[A], D]
  ): Mult.Aux[Zero[A], One[B], D] = null

  implicit def multOddEven[A <: BNonZero, B <: BNat, C <: BNat, D <: BNat](
    implicit m: Mult.Aux[A, B, C],
    s: Sum.Aux[Zero[Zero[C]], Zero[B], D]
  ): Mult.Aux[One[A], Zero[B], D] = null

  implicit def multOddOdd[A <: BNonZero, B <: BNonZero, C <: BNat, D <: BNat, E <: BNat](
    implicit m: Mult.Aux[A, B, C],
    s1: Sum.Aux[A, B, D],
    s2: Sum.Aux[D, Zero[C], E]
  ): Mult.Aux[One[A], One[B], One[E]] = null

}

// TODO: Consider evidence B != 1 instead of low priority
trait LowPriorityMultImpl {
  implicit def mult1Odd2[B <: BNat]: Mult.Aux[b1, B, B] = null
}
