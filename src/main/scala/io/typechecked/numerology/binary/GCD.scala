package io.typechecked.numerology.binary

import io.typechecked.numerology.binary.BNat.{b0, b2}
import io.typechecked.numerology.binary.GCD.Aux
import shapeless.{=:!=, Lazy, LowPriority}

trait GCD[A <: BNat, B <: BNat] { type Out <: BNat }

object GCD extends LowPriorityGCD {

  type Aux[A <: BNat, B <: BNat, Out0 <: BNat] = GCD[A, B] { type Out = Out0 }

  implicit def equal[A <: BNat]: Aux[A, A, A] = null
  implicit def zeroLeft[B <: BNat](implicit ev: B =:!= b0): Aux[b0, B, b0] = null
  implicit def zeroRight[A <: BNat](implicit ev: A =:!= b0): Aux[A, b0, b0] = null

  implicit def bothEven[A <: BNat, B <: BNat, Res <: BNat]
  (implicit ev: Aux[A, B, Res], mult: Mult[b2, Res], ev2: A =:!= B): Aux[Zero[A], Zero[B], mult.Out] = null

  implicit def leftEven[A <: BNat, B <: BNat]
  (implicit ev: GCD[A, One[B]]): Aux[Zero[A], One[B], ev.Out] = null

  implicit def rightEven[A <: BNat, B <: BNat]
  (implicit ev: GCD[One[A], B]): Aux[One[A], Zero[B], ev.Out] = null

  implicit def bothOdd1[A <: BNat, B <: BNat, Res <: BNat, Out <: BNat]
  (implicit gcd: Aux[A, One[B], Res],
   sum: Sum.Aux[Zero[A], One[B], One[Out]],
   gt: Gt[Out, B]
  ): Aux[One[Out], One[B], Res] = null
}

trait LowPriorityGCD {

  implicit def bothOdd2[A <: BNat, B <: BNat, Res <: BNat, Out <: BNat]
  (implicit gcd: Aux[One[A], One[B], Res], lt: Lt[B, A]): Aux[One[B], One[A], Res] = null

}
