package io.typechecked
package numerology
package ternary

trait ToInt[T <: TNat] { def value: Int }

object ToInt {

  implicit def intCase[T <: TNat](
    implicit lte: T Lte TNat.MaxInt,
    toInt: UnsafeToInt[T]
  ): ToInt[T] = new ToInt[T] { val value: Int = toInt.value }

}
