package io.typechecked
package numerology
package binary

// Less than
trait Lt[A <: BNat, B <: BNat]

object Lt {

  implicit def zeroInstance[B <: BNonZero]: Lt[b0, B] = null

  implicit def ltSameOperation[A <: BNat, B <: BNat, O[_ <: BNat] <: BOperation[_]](implicit lt: Lt[A, B]): Lt[O[A], O[B]] = null
  implicit def ltZeroOne[A <: BNat, B <: BNat](implicit lte: Lte[A, B]): Lt[Zero[A], One[B]] = null
  implicit def ltOneZero[A <: BNat, B <: BNat](implicit lt: Lt[A, B]): Lt[One[A], Zero[B]] = null

}

// Greater than
trait Gt[A <: BNat, B <: BNat]

object Gt {
  implicit def gtInstance[A <: BNat, B <: BNat](implicit ev: A Lt B): B Gt A = null
}

// Less than or equal
trait Lte[A <: BNat, B <: BNat]

object Lte {
  implicit def lteEqCase[A <: BNat]: Lte[A, A] = null
  implicit def lteLtCase[A <: BNat, B <: BNat](implicit lt: A Lt B): A Lte B = null
}

// Greater than or equal
trait Gte[A <: BNat, B <: BNat]

object Gte {
  implicit def gteInstance[A <: BNat, B <: BNat](implicit ev: A Lte B): B Gte A = null
}
