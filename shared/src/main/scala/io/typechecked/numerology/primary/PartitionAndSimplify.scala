package io.typechecked
package numerology
package primary

import ternary.Sum
import ternary.TNat._
import ternary.TNonZero

trait PartitionAndSimplify[P <: Prime, Ex <: TNonZero, M <: MNat] {
  type LtOut <: MNat
  type GtOut <: MNat
  type PowerAcc <: TNonZero
}

object PartitionAndSimplify {

  type Aux[P <: Prime, Ex <: TNonZero, M <: MNat, L <: MNat, G <: MNat, Acc <: TNonZero] = PartitionAndSimplify[P, Ex, M] {
    type LtOut = L
    type GtOut = G
    type PowerAcc = Acc
  }

  implicit def oneCase[P <: Prime, Ex <: TNonZero]: PartitionAndSimplify.Aux[P, Ex, m1, m1, m1, Ex] = null

  implicit def ltCase[P <: Prime, Ex <: TNonZero, HeadP <: Prime, HeadEx <: TNonZero, Tail <: MNat](
    implicit p: PrimeLt[HeadP, P],
    x: PartitionAndSimplify[P, Ex, Tail]
  ): Aux[P, Ex, (HeadP ^ HeadEx) *: Tail, (HeadP ^ HeadEx) *: x.LtOut, x.GtOut, x.PowerAcc] = null

  implicit def gtCase[P <: Prime, Ex <: TNonZero, HeadP <: Prime, HeadEx <: TNonZero, Tail <: MNat](
    implicit p: PrimeGt[HeadP, P],
    x: PartitionAndSimplify[P, Ex, Tail]
  ): Aux[P, Ex, (HeadP ^ HeadEx) *: Tail, x.LtOut, (HeadP ^ HeadEx) *: x.GtOut, x.PowerAcc] = null

  implicit def eqCase[P <: Prime, Ex <: TNonZero, HeadEx <: TNonZero, ExSum <: TNonZero, Tail <: MNat](
    implicit s: Sum.Aux[Ex, HeadEx, ExSum],
    x: PartitionAndSimplify[P, ExSum, Tail]
  ): Aux[P, Ex, (P ^ HeadEx) *: Tail, x.LtOut, x.GtOut, ExSum] = null

}
