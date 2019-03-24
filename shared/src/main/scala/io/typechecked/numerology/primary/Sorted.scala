package io.typechecked
package numerology
package primary

import ternary.TNat._
import ternary.TNonZero

trait Sorted[M <: MNat] { type Out <: MNat }

object Sorted {

  type Aux[M <: MNat, Out0 <: MNat] = Sorted[M] { type Out = Out0 }

  implicit val oneSorted: Aux[m1, m1] = null

  implicit def otherSorted[
    HeadP <: Prime,
    HeadEx <: TNonZero,
    M <: MNat,
    LtOut <: MNat,
    GtOut <: MNat,
    ExOut <: TNonZero,
    SortedLtOut <: MNat,
    SortedGtOut <: MNat
  ](implicit
    split: PartitionAndSimplify.Aux[HeadP, HeadEx, M, LtOut, GtOut, ExOut],
    sortedSmaller: Sorted.Aux[LtOut, SortedLtOut],
    sortedGreater: Sorted.Aux[GtOut, SortedGtOut],
    concat: Concat[SortedGtOut, (HeadP ^ ExOut) *: SortedLtOut]
  ): Sorted.Aux[(HeadP ^ HeadEx) *: M, concat.Out] = null

}
