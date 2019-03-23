package io.typechecked
package numerology
package ternary

trait ToLong[T <: TNat] { def value: Long }

object ToLong {

  implicit val baseCase: ToLong[t0] =
    new ToLong[t0] { val value: Long = 0l }

  implicit def zeroCase[T <: TNat](implicit i: ToLong[T]): ToLong[Zero[T]] =
    new ToLong[Zero[T]] { val value = 3 * i.value }

  implicit def oneCase[T <: TNat](implicit i: ToLong[T]): ToLong[One[T]] =
    new ToLong[One[T]] { val value = 3 * i.value + 1 }

  implicit def twoCase[T <: TNat](implicit i: ToLong[T]): ToLong[Two[T]] =
    new ToLong[Two[T]] { val value = 3 * i.value + 2 }

}
