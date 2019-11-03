package io.typechecked
package numerology
package ternary

import TNat.t0

trait Mod[T <: TNat, U <: TNat] { type Out <: TNat }

object Mod {

  type Aux[T <: TNat, U <: TNat, Out0 <: TNat] = Mod[T, U] { type Out = Out0 }

  implicit def fromDivMod[T <: TNat, U <: TNonZero](implicit dm: DivMod[T, U]): Mod.Aux[T, U, dm.ModOut] = null

}
