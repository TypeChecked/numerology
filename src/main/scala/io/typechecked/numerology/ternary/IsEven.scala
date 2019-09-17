package io.typechecked
package numerology
package ternary

import TNat.t0

trait IsEven[M <: TNat]

object IsEven {
  implicit def t0Case: IsEven[t0] = null
  implicit def zeroCase[M <: TNat](implicit e: IsEven[M]): IsEven[Zero[M]] = null
  implicit def twoCase[M <: TNat](implicit e: IsEven[M]): IsEven[Two[M]] = null
  implicit def oneCase[M <: TNat](implicit e: IsOdd[M]): IsEven[One[M]] = null
}
