package io.typechecked
package numerology
package binary

// If provided a BNat > MaxInt it will overflow and wrap around
// It is faster than ToInt though
// Only use if you're sure you will never exceed MaxInt
trait UnsafeToInt[T <: BNat] { def value: Int }

object UnsafeToInt {

  implicit val baseCase: UnsafeToInt[b0] =
    new UnsafeToInt[b0] { val value: Int = 0 }

  implicit def zeroCase[T <: BNat](implicit i: UnsafeToInt[T]): UnsafeToInt[Zero[T]] =
    new UnsafeToInt[Zero[T]] { val value = 2 * i.value }

  implicit def oneCase[T <: BNat](implicit i: UnsafeToInt[T]): UnsafeToInt[One[T]] =
    new UnsafeToInt[One[T]] { val value = 2 * i.value + 1 }

}
