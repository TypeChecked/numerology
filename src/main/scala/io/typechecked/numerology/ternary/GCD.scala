package io.typechecked.numerology.ternary

import io.typechecked.numerology.ternary.TNat.t0
import shapeless.=:!=

trait GCD[A <: TNat, B <: TNat] { type Out <: TNat }

object GCD {

  type Aux[A <: TNat, B <: TNat, Out0 <: TNat] = GCD[A, B] { type Out = Out0 }

  //Euclid's Algorithm

  implicit def equal[A <: TNat]: Aux[A, A, A] = null
  implicit def zeroLeft[B <: TNat](implicit ev: B =:!= t0): Aux[t0, B, t0] = null
  implicit def zeroRight[A <: TNat](implicit ev: A =:!= t0): Aux[A, t0, t0] = null

  implicit def leftGreater[A <: TNat, B <: TNat, MinusOut <: TNat, Out <: TNat](
    implicit gt: Gt[A, B],
    minus: Minus.Aux[A, B, MinusOut],
    ev: Aux[MinusOut, B, Out]
  ): Aux[A, B, Out] = null

  implicit def rightGreater[A <: TNat, B <: TNat, Out <: TNat](
    implicit lt: Lt[A, B],
    ev: Aux[B, A, Out]
  ): Aux[A, B, Out] = null
}
