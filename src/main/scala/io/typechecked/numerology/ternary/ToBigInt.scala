package io.typechecked
package numerology
package ternary

import TNat.t0

// Slowest way to get a number value from a TNat but is always safe
trait ToBigInt[T <: TNat] { def value: BigInt }

object ToBigInt {

  implicit val baseCase: ToBigInt[t0] =
    new ToBigInt[t0] { val value: BigInt = 0 }

  implicit def zeroCase[T <: TNat](implicit i: ToBigInt[T]): ToBigInt[Zero[T]] =
    new ToBigInt[Zero[T]] { val value = 3 * i.value }

  implicit def oneCase[T <: TNat](implicit i: ToBigInt[T]): ToBigInt[One[T]] =
    new ToBigInt[One[T]] { val value = 3 * i.value + 1 }

  implicit def twoCase[T <: TNat](implicit i: ToBigInt[T]): ToBigInt[Two[T]] =
    new ToBigInt[Two[T]] { val value = 3 * i.value + 2 }

}
