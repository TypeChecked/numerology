package io.typechecked
package numerology
package binary

trait ToInt[T <: BNat] { def value: Int }

object ToInt {

  implicit def longCase[T <: BNat](
    implicit lte: T Lte BNat.MaxInt,
    toLong: ToLong[T]
  ): ToInt[T] = new ToInt[T] { val value: Int = toLong.value.toInt }

}
