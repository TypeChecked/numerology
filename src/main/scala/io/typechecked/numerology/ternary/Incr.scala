package io.typechecked
package numerology
package ternary

import TNat.{t0, t1}

trait Incr[A <: TNat] { type Out <: TNat }

object Incr {

  type Aux[A <: TNat, B <: TNat] = Incr[A] { type Out = B }

  implicit def incr0: Incr.Aux[t0, t1] = null
  implicit def incrZero[A <: TNat]: Incr.Aux[Zero[A], One[A]] = null
  implicit def incrOne[A <: TNat]: Incr.Aux[One[A], Two[A]] = null
  implicit def incrTwo[A <: TNat, B <: TNat](implicit i: Incr.Aux[A, B]): Incr.Aux[Two[A], Zero[B]] = null

}
