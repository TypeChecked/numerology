package io.typechecked
package numerology
package primary

import MNat.m1

trait Concat[A <: MNat, B <: MNat] { type Out <: MNat }

object Concat {

  type Aux[A <: MNat, B <: MNat, C <: MNat] = Concat[A, B] { type Out = C }

  implicit def oneConcat[B <: MNat]: Aux[m1, B, B] = null

  implicit def recurseConcat[A1 <: ^[_, _], A <: MNat, B <: MNat](
    implicit ev: Concat[A, B]
  ): Aux[A1 *: A, B, A1 *: ev.Out] = null

}
