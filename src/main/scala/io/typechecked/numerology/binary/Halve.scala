package io.typechecked.numerology.binary

import io.typechecked.numerology.binary.BNat.b0

trait Halve[A <: BNat] {
  type Out <: BNat
}

object Halve {

  type Aux[A <: BNat, Out0 <: BNat] = Halve[A] { type Out = Out0 }

  implicit val zeroCase: Aux[b0, b0] = null

  implicit def evenCase[A <: BNat]: Aux[Zero[A], A] = null
}
