package io.typechecked
package numerology
package ternary

import TNat.{t0, t1}

// Less than
trait Lt[A <: TNat, B <: TNat]

object Lt {

  implicit def zeroInstance[B <: TNonZero]: Lt[t0, B] = null

  implicit def ltSameOperation[A <: TNat, B <: TNat, O[_ <: TNat] <: TOperation[_]](implicit lt: Lt[A, B]): Lt[O[A], O[B]] = null

  implicit def ltZeroOne[A <: TNat, B <: TNat](implicit lte: A Lte B): Zero[A] Lt One[B] = null
  implicit def ltZeroTwo[A <: TNat, B <: TNat](implicit lte: A Lte B): Zero[A] Lt Two[B] = null
  implicit def ltOneTwo[A <: TNat, B <: TNat](implicit lte: A Lte B): One[A] Lt Two[B] = null

  implicit def ltTwoOne[A <: TNat, B <: TNat](implicit lt: A Lt B): Two[A] Lt One[B] = null
  implicit def ltOneZero[A <: TNat, B <: TNat](implicit lt: A Lt B): One[A] Lt Zero[B] = null
  implicit def ltTwoZero[A <: TNat, B <: TNat](implicit lt: A Lt B): Two[A] Lt Zero[B] = null

}

// Greater than
trait Gt[A <: TNat, B <: TNat]

object Gt {
  implicit def gtInstance[A <: TNat, B <: TNat](implicit ev: A Lt B): B Gt A = null
}

// Less than or equal
trait Lte[A <: TNat, B <: TNat]

object Lte {
  implicit def lteEqCase[A <: TNat]: Lte[A, A] = null
  implicit def lteLtCase[A <: TNat, B <: TNat](implicit lt: A Lt B): A Lte B = null
}

// Greater than or equal
trait Gte[A <: TNat, B <: TNat]

object Gte {
  implicit def gteInstance[A <: TNat, B <: TNat](implicit ev: A Lte B): B Gte A = null
}
