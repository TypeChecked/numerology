package io.typechecked
package numerology
package ternary

trait ToLong[T <: TNat] { def value: Long }

object ToLong {

  implicit def intCase[T <: TNat](
    implicit lte: T Lte TNat.MaxLong,
    toLong: UnsafeToLong[T]
  ): ToLong[T] = new ToLong[T] { val value: Long = toLong.value }

}
