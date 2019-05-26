package io.typechecked
package numerology
package ternary

trait Sum[A <: TNat, B <: TNat] { type Out <: TNat }

object Sum {

  type Aux[A <: TNat, B <: TNat, Out0 <: TNat] = Sum[A, B] { type Out = Out0 }

  implicit def zeroSumA[A <: TNonZero]: Sum.Aux[A, t0, A] = null
  implicit def zeroSumB[B <: TNonZero]: Sum.Aux[t0, B, B] = null
  implicit def zeroSum0: Sum.Aux[t0, t0, t0] = null

  implicit def sumZO1[A <: TNat, B <: TNat](implicit s: Sum[A, B]): Sum.Aux[Zero[A], One[B], One[s.Out]] = null
  implicit def sumZO2[A <: TNat, B <: TNat](implicit s: Sum[A, B]): Sum.Aux[One[A], Zero[B], One[s.Out]] = null

  implicit def sumZT1[A <: TNat, B <: TNat](implicit s: Sum[A, B]): Sum.Aux[Zero[A], Two[B], Two[s.Out]] = null
  implicit def sumZT2[A <: TNat, B <: TNat](implicit s: Sum[A, B]): Sum.Aux[Two[A], Zero[B], Two[s.Out]] = null

  implicit def sumTO1[A <: TNat, B <: TNat, SOut <: TNat, SIncr <: TNat](
    implicit s: Sum.Aux[A, B, SOut],
    incr: Incr.Aux[SOut, SIncr],
    treble: Treble[SIncr]
  ): Sum.Aux[One[A], Two[B], treble.Out] = null

  implicit def sumTO2[A <: TNat, B <: TNat, SOut <: TNat, SIncr <: TNat](
    implicit s: Sum.Aux[A, B, SOut],
    incr: Incr.Aux[SOut, SIncr],
    treble: Treble[SIncr]
  ): Sum.Aux[Two[A], One[B], treble.Out] = null

  implicit def sumZZ[A <: TNat, B <: TNat, AB <: TNat](
    implicit s: Sum.Aux[A, B, AB],
    treble: Treble[AB]
  ): Sum.Aux[Zero[A], Zero[B], treble.Out] = null

  implicit def sumOO[A <: TNat, B <: TNat](implicit s: Sum[A, B]): Sum.Aux[One[A], One[B], Two[s.Out]] = null

  implicit def sumTT[A <: TNat, B <: TNat, SOut <: TNat](
    implicit s: Sum.Aux[A, B, SOut],
    incr: Incr[SOut]
  ): Sum.Aux[Two[A], Two[B], One[incr.Out]] = null

}
