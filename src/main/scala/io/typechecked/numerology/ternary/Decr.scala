package io.typechecked
package numerology
package ternary

trait Decr[M <: TNat] { type Out <: TNat }

object Decr {

  type Aux[M <: TNat, Out0 <: TNat] = Decr[M] { type Out = Out0 }

  implicit def zeroCase[M <: TNat](implicit d: Decr[M]): Decr.Aux[Zero[M], Two[d.Out]] = null

  implicit def oneCase[M <: TNat](implicit app: SplitAtIndex.ApplyOperation[M, Zero]): Decr.Aux[One[M], app.Out] = null

  implicit def twoCase[M <: TNat]: Decr.Aux[Two[M], One[M]] = null

}
