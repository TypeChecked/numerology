package io.typechecked
package numerology
package primary

trait Mult[A <: MNat, B <: MNat] { type Out <: MNat }

object Mult {

  type Aux[A <: MNat, B <: MNat, Out0 <: MNat] = Mult[A, B] { type Out = Out0 }

  implicit def multiplyIt[A <: MNat, B <: MNat, ConcatOut <: MNat, SortedOut <: MNat](implicit
    concat: Concat.Aux[A, B, ConcatOut],
    sorted: Sorted.Aux[ConcatOut, SortedOut]
  ): Mult.Aux[A, B, SortedOut] = null

}
