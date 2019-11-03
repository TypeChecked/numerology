package io.typechecked
package numerology
package ternary

import numerology.ternary.TNat.{t0, t1}

trait Div[T <: TNat, U <: TNat] {
  type Out <: TNat
}

object Div {

  type Aux[T <: TNat, U <: TNonZero, Out0 <: TNat] = Div[T, U] { type Out = Out0 }

  implicit def fromDivMod[T <: TNat, U <: TNonZero](implicit dm: DivMod[T, U]): Div.Aux[T, U, dm.DivOut] = null

}
