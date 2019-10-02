package io.typechecked.numerology.binary

import io.typechecked.numerology.binary.BNat.b0
import shapeless.=:!=

trait Minus[A <: BNat, B <: BNat] { type Out <: BNat }

object Minus {

  type Aux[A <: BNat, B <: BNat, Out0 <: BNat] = Minus[A, B] { type Out = Out0 }

  implicit def zeroCase[A <: BNat]: Aux[A, b0, A] = null
  implicit def equalsCase[A <: BOperation[_ <: BNat]]: Aux[A, A, b0] = null

  implicit def minusZeroZero[A <: BNat, B <: BNat, C <: BNat](implicit neq: A =:!= B, ev: Aux[A, B, C]): Aux[Zero[A], Zero[B], Zero[C]] = null
  implicit def minusOneOne[A <: BNat, B <: BNat, C <: BNat](implicit neq: A =:!= B, ev: Aux[A, B, C]): Aux[One[A], One[B], Zero[C]] = null

  implicit def minusZeroOne[A <: BNat, B <: BNat, C <: BNat, D <: BNat](
    implicit s: Minus.Aux[A, B, C],
    i: Decr.Aux[Zero[C], D]
  ): Aux[Zero[A], One[B], D] = null

  implicit def minusOneZero[A <: BNat, B <: BNat, C <: BNat, D <: BNat](
    implicit s: Minus.Aux[A, B, C],
    i: Incr.Aux[Zero[C], D]
  ): Aux[One[A], Zero[B], D] = null
}
