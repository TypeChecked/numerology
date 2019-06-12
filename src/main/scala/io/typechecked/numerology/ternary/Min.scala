package io.typechecked
package numerology
package ternary

trait Min[A <: TNat, B <: TNat] { type Out <: TNat }

object Min {

  type Aux[A <: TNat, B <: TNat, Out0 <: TNat] = Min[A, B] { type Out = Out0 }

  implicit def lteCase[A <: TNat, B <: TNat](implicit lte: A Lte B): Min.Aux[A, B, A] = null
  implicit def gtCase[A <: TNat, B <: TNat](implicit gt: A Gt B): Min.Aux[A, B, B] = null

}
