package io.typechecked
package numerology
package ternary

trait ToInt[T <: TNat] { def value: Int }

object ToInt {

  implicit def longCase[T <: TNat](
    implicit lte: T Lte TNat.MaxInt,
    toLong: ToLong[T]
  ): ToInt[T] = new ToInt[T] { val value: Int = toLong.value.toInt }

}
