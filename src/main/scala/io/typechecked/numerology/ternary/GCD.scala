package io.typechecked
package numerology
package ternary

import io.typechecked.numerology.ternary.TNat.t0

trait GCD[A <: TNat, B <: TNat] { type Out <: TNat }

object GCD {

  type Aux[A <: TNat, B <: TNat, Out0 <: TNat] = GCD[A, B] { type Out = Out0 }

  // Euclid's Algorithm

  implicit def equal[A <: TNat]: Aux[A, A, A] = null
  implicit def zeroLeft[B <: TNonZero]: Aux[t0, B, t0] = null
  implicit def zeroRight[A <: TNonZero]: Aux[A, t0, t0] = null

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
