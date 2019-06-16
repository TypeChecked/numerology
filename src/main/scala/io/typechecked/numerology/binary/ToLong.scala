package io.typechecked
package numerology
package binary

trait ToLong[T <: BNat] { def value: Long }

object ToLong {

  implicit val baseCase: ToLong[b0] =
    new ToLong[b0] { val value: Long = 0L }

  implicit def zeroCase[T <: BNat](implicit i: ToLong[T]): ToLong[Zero[T]] =
    new ToLong[Zero[T]] { val value = 2 * i.value }

  implicit def oneCase[T <: BNat](implicit i: ToLong[T]): ToLong[One[T]] =
    new ToLong[One[T]] { val value = 2 * i.value + 1 }

}
