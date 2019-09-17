package io.typechecked
package numerology
package primary
package mult

import io.typechecked.numerology.primary.MNat.m1
import ternary.TNat
import ternary.TNonZero
import shapeless.=:!=

/**
 * Iterate through LHS and insert each element into RHS in turn
 */
trait Mult2[M <: MNat, N <: MNat] { type Out <: MNat }

object Mult2 extends LP1 {

  type Aux[M <: MNat, N <: MNat, Out0 <: MNat] = Mult2[M, N] { type Out = Out0 }

  implicit def m1Case[N <: MNat]: Mult2.Aux[m1, N, N] = null

  implicit def squaredCase[M <: MNat](implicit s: Squared[M]): Mult2.Aux[M, M, s.Out] = null

}

trait LP1 {
  implicit def headCase[X <: _ ^ _, M <: MNat, N <: MNat, PN <: MNat](
    implicit byPrime: MultiplyByPrime.Aux[N, X, PN],
    recurse: Mult2[M, PN]
  ): Mult2.Aux[X *: M, N, recurse.Out] = null

}

trait Squared[M <: MNat] { type Out <: MNat }

object Squared {

  type Aux[M <: MNat, Out0 <: MNat] = Squared[M] { type Out = Out0 }

  implicit def m1Case: Squared.Aux[m1, m1] = null

  implicit def headCase[P <: Prime, A <: TNonZero, A2 <: TNonZero, M <: MNat](
    implicit double: ternary.Sum.Aux[A, A, A2],
    recurse: Squared[M]
  ): Squared.Aux[(P ^ A) *: M, (P ^ A2) *: recurse.Out] = null

}

trait MultiplyByPrime[M <: MNat, P <: PrimePower] {
  type Out <: MNat
}

object MultiplyByPrime {

  type Aux[M <: MNat, P <: PrimePower, Out0 <: MNat] = MultiplyByPrime[M, P] { type Out = Out0 }

  implicit def m1Case[X <: _ ^ _]: MultiplyByPrime.Aux[m1, X, X *: m1] = null

  implicit def primeGtHeadCase[P <: Prime, A <: TNonZero, H <: Prime, B <: TNonZero, M <: MNat](
    implicit gt: H PrimeLt P
  ): MultiplyByPrime.Aux[(H ^ B) *: M, P^A, (P ^ A) *: (H ^ B) *: M] = null

  implicit def primeEqHeadCase[H <: Prime, A <: TNonZero, M <: MNat, B <: TNonZero, AB <: TNonZero](
    implicit sum: ternary.Sum.Aux[A, B, AB]
  ): MultiplyByPrime.Aux[(H ^ B) *: M, H ^ A, (H ^ AB) *: M] = null

  implicit def primeLtHeadCase[P <: Prime, A <: TNonZero, H <: Prime, B <: TNonZero, M <: MNat](
    implicit lt: P PrimeLt H,
    recurse: MultiplyByPrime[M, (P ^ A)]
  ): MultiplyByPrime.Aux[(H ^ B) *: M, (P ^ A), (H ^ B) *: recurse.Out] = null

}
