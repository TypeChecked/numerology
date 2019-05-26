package io.typechecked
package numerology
package ternary

trait Mult[A <: TNat, B <: TNat] { type Out <: TNat }

object Mult {

  type Aux[A <: TNat, B <: TNat, C <: TNat] = Mult[A, B] { type Out = C }

  implicit def case0[A <: TNat]: Mult.Aux[t0, A, t0] = null

  implicit def caseZ[A <: TNat, B <: TNat, AB <: TNat, AB3 <: TNat](
    implicit m: Mult.Aux[A, B, AB],
    app: Treble.Aux[AB, AB3]
  ): Mult.Aux[Zero[A], B, AB3] = null

  implicit def caseO[A <: TNat, B <: TNat, AB <: TNat, AB3 <: TNat](
    implicit m: Mult.Aux[A, B, AB],
    app: Treble.Aux[AB, AB3],
    s: Sum[AB3, B]
  ): Mult.Aux[One[A], B, s.Out] = null

  implicit def caseT[A <: TNat, B <: TNat, AB <: TNat, AB3 <: TNat, AB3plusB <: TNat](
    implicit m: Mult.Aux[A, B, AB],
    app: Treble.Aux[AB, AB3],
    s1: Sum.Aux[AB3, B, AB3plusB],
    s2: Sum[AB3plusB, B],
  ): Mult.Aux[Two[A], B, s2.Out] = null

}
