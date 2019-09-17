package io.typechecked
package numerology
package binary

import BNat.b0

trait Sum[A <: BNat, B <: BNat] { type Out <: BNat }

object Sum {

  type Aux[A <: BNat, B <: BNat, Out0 <: BNat] = Sum[A, B] { type Out = Out0 }

  implicit def zeroSum0: Sum.Aux[b0, b0, b0] = null
  implicit def zeroSumA[A <: BNonZero]: Sum.Aux[A, b0, A] = null
  implicit def zeroSumB[B <: BNonZero]: Sum.Aux[b0, B, B] = null

  implicit def sumZeroZero[A <: BNat, B <: BNat, C <: BNat](implicit s: Sum.Aux[A, B, C]): Sum.Aux[Zero[A], Zero[B], Zero[C]] = null
  implicit def sumOneZero[A <: BNat, B <: BNat, C <: BNat](implicit s: Sum.Aux[A, B, C]): Sum.Aux[One[A], Zero[B], One[C]] = null
  implicit def sumZeroOne[A <: BNat, B <: BNat, C <: BNat](implicit s: Sum.Aux[A, B, C]): Sum.Aux[Zero[A], One[B], One[C]] = null

  implicit def sumOneOne[A <: BNat, B <: BNat, C <: BNat, D <: BNat](
    implicit s: Sum.Aux[A, B, C],
    i: Incr.Aux[C, D]
  ): Sum.Aux[One[A], One[B], Zero[D]] = null

}
