package io.typechecked
package numerology
package ternary

import TNat.t0

trait Length[M <: TNat] { type Out <: TNat }

object Length {

  type Aux[M <: TNat, Out0 <: TNat] = Length[M] { type Out = Out0 }

  implicit def baseCase: Length.Aux[t0, t0] = null

  implicit def opCase[Op[_ <: TNat] <: TOperation[_], M <: TNat, A <: TNat, A1 <: TNat](
    implicit f: Length.Aux[M, A],
    i: Incr.Aux[A, A1]
  ): Length.Aux[Op[M], A1] = null

}
