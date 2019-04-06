package io.typechecked
package numerology
package primary
package mult

import ternary.TNat
import ternary.TNonZero
import shapeless.=:!=

/**
 * Iterate through LHS and insert each element into RHS in turn
 */
trait Mult2[M <: MNat, N <: MNat] { type Out <: MNat }

object Mult2 {

  type Aux[M <: MNat, N <: MNat, Out0 <: MNat] = Mult2[M, N] { type Out = Out0 }

  implicit def m1Case[N <: MNat]: Mult2.Aux[m1, N, N] = null

  implicit def headCase[P <: Prime, A <: TNonZero, M <: MNat, N <: MNat, PN <: MNat](
    implicit byPrime: MultiplyByPrime.Aux[N, P ^ A, PN],
    recurse: Mult2[M, PN]
  ): Mult2.Aux[(P ^ A) *: M, N, recurse.Out] = null

}

trait MultiplyByPrime[M <: MNat, P <: PrimePower] {
  type Out <: MNat
}

object MultiplyByPrime {

  type Aux[M <: MNat, P <: PrimePower, Out0 <: MNat] = MultiplyByPrime[M, P] { type Out = Out0 }

  implicit def m1Case[P <: Prime, A <: TNonZero]: MultiplyByPrime.Aux[m1, P ^ A, (P ^ A) *: m1] = null

  implicit def primeGtHeadCase[P <: Prime, A <: TNonZero, H <: Prime, B <: TNonZero, M <: MNat](
    implicit gt: P PrimeGt H
  ): MultiplyByPrime.Aux[(H ^ B) *: M, P^A, (P ^ A) *: (H ^ B) *: M] = null

  implicit def primeEqHeadCase[H <: Prime, A <: TNonZero, M <: MNat, B <: TNonZero, AB <: TNat, ABOut <: TNonZero](
    implicit sum: ternary.Sum.Aux[A, B, AB],
    nonZero: ternary.AsNonZero.Aux[AB, ABOut]
  ): MultiplyByPrime.Aux[(H ^ B) *: M, H ^ A, (H ^ ABOut) *: M] = null

  implicit def primeLtHeadCase[P <: Prime, A <: TNonZero, H <: Prime, B <: TNonZero, M <: MNat](
    implicit lt: P PrimeLt H,
    recurse: MultiplyByPrime[M, (P ^ A)]
  ): MultiplyByPrime.Aux[(H ^ B) *: M, (P ^ A), (H ^ B) *: recurse.Out] = null

}
