package io.typechecked
package numerology
package ternary

// If provided a TNat > MaxInt it will overflow and wrap around
// It is faster than ToInt though
// Only use if you're sure you will never exceed MaxInt
trait UnsafeToInt[T <: TNat] { def value: Int }

object UnsafeToInt {

  implicit val baseCase: UnsafeToInt[t0] =
    new UnsafeToInt[t0] { val value: Int = 0 }

  implicit def zeroCase[T <: TNat](implicit i: UnsafeToInt[T]): UnsafeToInt[Zero[T]] =
    new UnsafeToInt[Zero[T]] { val value = 3 * i.value }

  implicit def oneCase[T <: TNat](implicit i: UnsafeToInt[T]): UnsafeToInt[One[T]] =
    new UnsafeToInt[One[T]] { val value = 3 * i.value + 1 }

  implicit def twoCase[T <: TNat](implicit i: UnsafeToInt[T]): UnsafeToInt[Two[T]] =
    new UnsafeToInt[Two[T]] { val value = 3 * i.value + 2 }

}
