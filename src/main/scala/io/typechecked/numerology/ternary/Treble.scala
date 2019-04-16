package io.typechecked
package numerology
package ternary

trait Treble[M <: TNat] { type Out <: TNat }

object Treble {
  type Aux[M <: TNat, Out0 <: TNat] = Treble[M] { type Out = Out0 }
  implicit def t0Case: Treble.Aux[t0, t0] = null
  implicit def otherCase[M <: TNonZero]: Treble.Aux[M, Zero[M]] = null
}
