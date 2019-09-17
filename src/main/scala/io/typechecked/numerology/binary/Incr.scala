package io.typechecked
package numerology
package binary

import BNat.{b0, b1}

trait Incr[A <: BNat] { type Out <: BNat }

object Incr {

  type Aux[A <: BNat, B <: BNat] = Incr[A] { type Out = B }

  implicit def incrZero: Incr.Aux[b0, b1] = null
  implicit def incrEven[A <: BNat]: Incr.Aux[Zero[A], One[A]] = null
  implicit def incrOdd[A <: BNat, B <: BNat](implicit i: Incr.Aux[A, B]): Incr.Aux[One[A], Zero[B]] = null

}
