package io.typechecked
package numerology
package ternary

trait IsOdd[M <: TNat]

object IsOdd {
  implicit def zeroCase[M <: TNat](implicit o: IsOdd[M]): IsOdd[Zero[M]] = null
  implicit def oneCase[M <: TNat](implicit o: IsEven[M]): IsOdd[One[M]] = null
  implicit def twoCase[M <: TNat](implicit o: IsOdd[M]): IsOdd[Two[M]] = null
}
