package io.typechecked
package numerology
package ternary

trait Minus[A <: TNat, B <: TNat] { type Out <: TNat }

object Minus {

  type Aux[A <: TNat, B <: TNat, Out0 <: TNat] = Minus[A, B] { type Out = Out0 }

  implicit def zeroMinus0: Minus.Aux[t0, t0, t0] = null
  implicit def zeroMinusA[A <: TNonZero]: Minus.Aux[A, t0, A] = null

  implicit def minusZO1[A <: TNat, B <: TNat, AB <: TNat](
    implicit s: Minus.Aux[A, B, AB],
    d: Decr[AB]
  ): Minus.Aux[Zero[A], One[B], Two[d.Out]] = null

  implicit def minusZO2[A <: TNat, B <: TNat](implicit s: Minus[A, B]): Minus.Aux[One[A], Zero[B], One[s.Out]] = null

  implicit def minusZT1[A <: TNat, B <: TNat, AB <: TNat](
    implicit s: Minus.Aux[A, B, AB],
    d: Decr[AB]
  ): Minus.Aux[Zero[A], Two[B], One[d.Out]] = null

  implicit def minusZT2[A <: TNat, B <: TNat](implicit s: Minus[A, B]): Minus.Aux[Two[A], Zero[B], Two[s.Out]] = null

  implicit def minusTO1[A <: TNat, B <: TNat, SOut <: TNat](
    implicit s: Minus.Aux[A, B, SOut],
    d: Decr[SOut]
  ): Minus.Aux[One[A], Two[B], Two[d.Out]] = null

  implicit def minusTO2[A <: TNat, B <: TNat](implicit s: Minus[A, B]): Minus.Aux[Two[A], One[B], One[s.Out]] = null

  implicit def minusZZ[A <: TNat, B <: TNat, Out <: TNat](
    implicit s: Minus.Aux[A, B, Out],
    treble: Treble[Out]
  ): Minus.Aux[Zero[A], Zero[B], treble.Out] = null

  implicit def minusOO[A <: TNat, B <: TNat, Out <: TNat](
    implicit s: Minus.Aux[A, B, Out],
    treble: Treble[Out]
  ): Minus.Aux[One[A], One[B], treble.Out] = null

  implicit def minusTT[A <: TNat, B <: TNat, Out <: TNat](
    implicit s: Minus.Aux[A, B, Out],
    treble: Treble[Out]
  ): Minus.Aux[Two[A], Two[B], treble.Out] = null

}
