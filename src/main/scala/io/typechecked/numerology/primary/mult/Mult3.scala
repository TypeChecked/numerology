package io.typechecked
package numerology
package primary
package mult

import MNat.m1
import ternary.AsNonZero
import ternary.TNat
import ternary.TNonZero
import shapeless.=:!=

trait Mult3[M <: MNat, N <: MNat] { type Out <: MNat }

object Mult3 {

  type Aux[M <: MNat, N <: MNat, Out0 <: MNat] = Mult3[M, N] { type Out = Out0 }

  implicit def m1Case[N <: MNat]: Mult3.Aux[m1, N, N] = null
  implicit def m1Case2[N <: Compound]: Mult3.Aux[N, m1, N] = null

  implicit def lhsGreaterPrimeRecurse[P <: Prime, A <: TNonZero, M <: MNat, Q <: Prime, B <: TNonZero, N <: MNat](
    implicit ev: Q PrimeLt P,
    recurse: Mult3[M, (Q^B) *: N]
  ): Mult3.Aux[(P^A) *: M, (Q^B) *: N, (P^A) *: recurse.Out] = null

  implicit def rhsGreaterPrimeRecurse[P <: Prime, A <: TNonZero, M <: MNat, Q <: Prime, B <: TNonZero, N <: MNat](
    implicit ev: P PrimeLt Q,
    recurse: Mult3[(P^A) *: M, N]
  ): Mult3.Aux[(P^A) *: M, (Q^B) *: N, (Q^B) *: recurse.Out] = null

  implicit def headEqPrimeRecurse[P <: Prime, A <: TNonZero, M <: MNat, B <: TNonZero, N <: MNat, C <: TNat, D <: TNonZero](
    implicit recurse: Mult3[M, N],
    s: ternary.Sum.Aux[A, B, C],
    nonZero: AsNonZero.Aux[C, D]
  ): Mult3.Aux[(P^A) *: M, (P^B) *: N, (P^D) *: recurse.Out] = null

}
