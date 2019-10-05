package io.typechecked
package numerology
package binary

import io.typechecked.numerology.binary.BNat.{b0, b1}

trait Decr[A <: BNat] { type Out <: BNat }

object Decr {

  type Aux[A <: BNat, B <: BNat] = Decr[A] { type Out = B }

  implicit def decrOne: Aux[b1, b0] = null
  implicit def decrOdd[A <: BNonZero]: Aux[One[A], Zero[A]] = null
  implicit def decrEven[A <: BNat, B <: BNat](implicit i: Aux[A, B]): Aux[Zero[A], One[B]] = null

}
