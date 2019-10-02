package io.typechecked.numerology.binary

import io.typechecked.numerology.binary.BNat.{b0, b1}
import shapeless.=:!=

trait Decr[A <: BNat] { type Out <: BNat }

object Decr {

  type Aux[A <: BNat, B <: BNat] = Decr[A] { type Out = B }

  implicit def decrOne: Aux[b1, b0] = null
  implicit def decrOdd[A <: BNat](implicit ev: A =:!= b0): Aux[One[A], Zero[A]] = null
  implicit def decrEven[A <: BNat, B <: BNat](implicit i: Aux[A, B]): Aux[Zero[A], One[B]] = null

}
