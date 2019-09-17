package io.typechecked
package numerology
package ternary

import io.typechecked.numerology.ternary.TNat.t0

trait Sum[A <: TNat, B <: TNat] { type Out <: TNat }

object Sum {

  type Aux[A <: TNat, B <: TNat, Out0 <: TNat] = Sum[A, B] { type Out = Out0 }

  // A + 0 = A for all A
  implicit def caseA0[A <: TNat]: Sum.Aux[A, t0, A] = null
  // 0 + B = B for all non-zero B
  implicit def case0B[B <: TNonZero]: Sum.Aux[t0, B, B] = null

  // 3A + (3B + 1) = 3(A + B) + 1
  implicit def caseZO[A <: TNat, B <: TNat](implicit s: Sum[A, B]): Sum.Aux[Zero[A], One[B], One[s.Out]] = null
  // (3A + 1) + 3B = 3(A + B) + 1
  implicit def caseOZ[A <: TNat, B <: TNat](implicit s: Sum[A, B]): Sum.Aux[One[A], Zero[B], One[s.Out]] = null

  // 3A + (3B + 2) = 3(A + B) + 2
  implicit def caseZT1[A <: TNat, B <: TNat](implicit s: Sum[A, B]): Sum.Aux[Zero[A], Two[B], Two[s.Out]] = null
  // (3A + 2) + 3B = 3(A + B) + 2
  implicit def caseZT2[A <: TNat, B <: TNat](implicit s: Sum[A, B]): Sum.Aux[Two[A], Zero[B], Two[s.Out]] = null

  // (3A + 1) + (3B + 2) = 3(A + B + 1)
  implicit def caseOT[A <: TNat, B <: TNat, SOut <: TNat, SIncr <: TNat](
    implicit s: Sum.Aux[A, B, SOut],
    incr: Incr.Aux[SOut, SIncr],
    treble: Treble[SIncr]
  ): Sum.Aux[One[A], Two[B], treble.Out] = null

  // (3A + 2) + (3B + 1) = 3(A + B + 1)
  implicit def caseTO[A <: TNat, B <: TNat, SOut <: TNat, SIncr <: TNat](
    implicit s: Sum.Aux[A, B, SOut],
    incr: Incr.Aux[SOut, SIncr],
    treble: Treble[SIncr]
  ): Sum.Aux[Two[A], One[B], treble.Out] = null

  // 3A + 3B = 3(A + B)
  implicit def caseZZ[A <: TNat, B <: TNat, AB <: TNat](
    implicit s: Sum.Aux[A, B, AB],
    treble: Treble[AB]
  ): Sum.Aux[Zero[A], Zero[B], treble.Out] = null

  // (3A + 1) + (3B + 1) = 3(A + B) + 2
  implicit def caseOO[A <: TNat, B <: TNat](implicit s: Sum[A, B]): Sum.Aux[One[A], One[B], Two[s.Out]] = null

  // (3A + 2) + (3B + 2) = 3(A + B + 1) + 1
  implicit def caseTT[A <: TNat, B <: TNat, SOut <: TNat](
    implicit s: Sum.Aux[A, B, SOut],
    incr: Incr[SOut]
  ): Sum.Aux[Two[A], Two[B], One[incr.Out]] = null

}
