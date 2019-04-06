package io.typechecked
package numerology
package ternary

trait AsNonZero[T <: TNat] { type Out <: TNonZero }

object AsNonZero {

  type Aux[T <: TNat, Out0 <: TNonZero] = AsNonZero[T] { type Out = Out0 }

  implicit def zeroInstance[T <: TNat]: AsNonZero.Aux[Zero[T], Zero[T]] = null
  implicit def oneInstance[T <: TNat]: AsNonZero.Aux[One[T], One[T]] = null
  implicit def twoInstance[T <: TNat]: AsNonZero.Aux[Two[T], Two[T]] = null

}
