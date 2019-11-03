package io.typechecked
package numerology
package ternary

import TNat.t0

// U should be <: TNonZero, but in practise there are no implicits satisfying the case U =:= t0,
// so it is more composable to leave U <: TNat
trait DivMod[T <: TNat, U <: TNat] {
  type DivOut <: TNat
  type ModOut <: TNat
}

object DivMod {

  type Aux[T <: TNat, U <: TNat, Div0 <: TNat, Mod0 <: TNat] = DivMod[T, U] {
    type DivOut = Div0
    type ModOut = Mod0
  }

  implicit def ltCase[T <: TNat, U <: TNonZero](implicit lt: T Lt U): DivMod.Aux[T, U, t0, T] = null

  implicit def gteCase[T <: TNat, U <: TNonZero, Diff <: TNat, Div0 <: TNat, Mod0 <: TNat, Div1 <: TNat](
    implicit gte: T Gte U,
    diff: Minus.Aux[T, U, Diff],
    recurse: DivMod.Aux[Diff, U, Div0, Mod0],
    incr: Incr.Aux[Div0, Div1]
  ): DivMod.Aux[T, U, Div1, Mod0] = null

}
