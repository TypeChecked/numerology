package io.typechecked
package numerology
package primary
package mult

/**
 * Concat, and then sort and simplify
 */
trait Mult1[A <: MNat, B <: MNat] { type Out <: MNat }

object Mult1 {

  type Aux[A <: MNat, B <: MNat, Out0 <: MNat] = Mult1[A, B] { type Out = Out0 }

  implicit def multiplyIt[A <: MNat, B <: MNat, ConcatOut <: MNat, SortedOut <: MNat](implicit
    concat: Concat.Aux[A, B, ConcatOut],
    sorted: Sorted.Aux[ConcatOut, SortedOut]
  ): Mult1.Aux[A, B, SortedOut] = null

}
