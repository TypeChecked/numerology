package io.typechecked
package numerology
package ternary

import TNat.t0

// If provided a TNat > MaxLong it will overflow and wrap around
// It is faster than ToLong though
// Only use if you're sure you will never exceed MaxLong
trait UnsafeToLong[T <: TNat] { def value: Long }

object UnsafeToLong {

  implicit val baseCase: UnsafeToLong[t0] =
    new UnsafeToLong[t0] { val value: Long = 0L }

  implicit def zeroCase[T <: TNat](implicit i: UnsafeToLong[T]): UnsafeToLong[Zero[T]] =
    new UnsafeToLong[Zero[T]] { val value = 3 * i.value }

  implicit def oneCase[T <: TNat](implicit i: UnsafeToLong[T]): UnsafeToLong[One[T]] =
    new UnsafeToLong[One[T]] { val value = 3 * i.value + 1 }

  implicit def twoCase[T <: TNat](implicit i: UnsafeToLong[T]): UnsafeToLong[Two[T]] =
    new UnsafeToLong[Two[T]] { val value = 3 * i.value + 2 }

}
