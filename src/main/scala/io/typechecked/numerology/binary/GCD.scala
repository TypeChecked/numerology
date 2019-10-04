package io.typechecked.numerology.binary

import io.typechecked.numerology.binary.BNat.{b0, b2}
import shapeless.=:!=

trait GCD[A <: BNat, B <: BNat] { type Out <: BNat }

object GCD {

  //Stein's Algorithm for binary GCD.

  type Aux[A <: BNat, B <: BNat, Out0 <: BNat] = GCD[A, B] { type Out = Out0 }

  implicit def equal[A <: BNat]: Aux[A, A, A] = null
  implicit def zeroLeft[B <: BNat](implicit ev: B =:!= b0): Aux[b0, B, b0] = null
  implicit def zeroRight[A <: BNat](implicit ev: A =:!= b0): Aux[A, b0, b0] = null

  implicit def bothEven[A <: BNat, B <: BNat, Res <: BNat](
    implicit neq: A =:!= B,
    ev: Aux[A, B, Res],
    mult: Mult[b2, Res]
  ): Aux[Zero[A], Zero[B], mult.Out] = null

  implicit def leftEven[A <: BNat, B <: BNat](
    implicit ev: GCD[A, One[B]]
  ): Aux[Zero[A], One[B], ev.Out] = null

  implicit def rightEven[A <: BNat, B <: BNat](
    implicit ev: GCD[One[A], B]
  ): Aux[One[A], Zero[B], ev.Out] = null

  implicit def bothOddLeftGreater[A <: BNat, B <: BNat, MinusOut <: BNat, HalveOut <: BNat, Res <: BNat](
    implicit gt: Gt[A, B],
    minus: Minus.Aux[One[A], One[B], MinusOut],
    halve: Halve.Aux[MinusOut, HalveOut],
    gcd: Aux[HalveOut, One[B], Res]
  ): Aux[One[A], One[B], Res] = null

  implicit def bothOddRightGreater[A <: BNat, B <: BNat, Res <: BNat, Out <: BNat](
    implicit lt: Lt[A, B],
    gcd: Aux[One[B], One[A], Res]
  ): Aux[One[A], One[B], Res] = null
}
