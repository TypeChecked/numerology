package io.typechecked
package numerology
package ternary

import shapeless.Lazy

trait Karatsuba[M <: TNat, N <: TNat] { type Out <: TNat }

object Karatsuba extends LP111 {

  import TNat._

  def test[M <: TNat, N <: TNat](implicit k: Karatsuba[M, N]): k.Out = ???

  type Aux[M <: TNat, N <: TNat, Out0 <: TNat] = Karatsuba[M, N] { type Out = Out0 }

  // TODO fix...
  implicit def lowPriorityAlgorithm1[M <: TNat]: Karatsuba.Aux[M, t0, t0] = null
  implicit def lowPriorityAlgorithm2[M <: TNat]: Karatsuba.Aux[M, t1, M] = null
  implicit def lowPriorityAlgorithm3[M <: TNat](implicit s: Sum[M, M]): Karatsuba.Aux[M, t2, s.Out] = null

  implicit def algorithm[
    M <: TNat,
    N <: TNat,
    MLow <: TNat,
    MHigh <: TNat,
    NLow <: TNat,
    NHigh <: TNat,
    MinSize <: TNat,
    MinSizeHalved <: TNat,
    MinSizeEvened <: TNat,
    MSplitSum <: TNat,
    NSplitSum <: TNat,
    K0Out <: TNat,
    K1Out <: TNat,
    K2Out <: TNat,
    KTemp <: TNat,
    KMinused <: TNat,
    K2Padded <: TNat,
    KMinusPaddded <: TNat,
    SumTemp <: TNat,
  ](
    implicit
    ev1: M Gte TNat.t3,
    ev2: N Gte TNat.t3,

    minSize: MinLength.Aux[M, N, MinSize],
    halved: Div2.Aux[MinSize, MinSizeHalved],
    minSizeHalved2: Evenify.Aux[MinSize, MinSizeEvened],

    split: SplitAtIndexDouble.Aux[M, MinSizeHalved, N, MLow, MHigh, NLow, NHigh],

    mSum: Sum.Aux[MHigh, MLow, MSplitSum],
    nSum: Sum.Aux[NHigh, NLow, NSplitSum],

    k0: Lazy[Karatsuba.Aux[MLow, NLow, K0Out]],
    k1: Lazy[Karatsuba.Aux[MSplitSum, NSplitSum, K1Out]],
    k2: Lazy[Karatsuba.Aux[MHigh, NHigh, K2Out]],

    k1MinusK2: Minus.Aux[K1Out, K2Out, KTemp],
    kout: Minus.Aux[KTemp, K0Out, KMinused],

    k2PadLeft: PadLeft.Aux[K2Out, MinSizeEvened, K2Padded],
    kMinusedPadLeft: PadLeft.Aux[KMinused, MinSizeHalved, KMinusPaddded],
    sum1: Sum.Aux[K0Out, KMinusPaddded, SumTemp],
    sum2: Sum[SumTemp, K2Padded]
  ): Karatsuba.Aux[M, N, sum2.Out] = null
}

trait LP111 {

  import TNat._
  implicit def lowPriorityAlgorithm4[M <: TNat](implicit ev: M Gte t2): Karatsuba.Aux[t0, M, t0] = null
  implicit def lowPriorityAlgorithm5[M <: TNat](implicit ev: M Gte t2): Karatsuba.Aux[t1, M, M] = null
  implicit def lowPriorityAlgorithm6[M <: TNat](implicit ev: M Gte t2, s: Sum[M, M]): Karatsuba.Aux[t2, M, s.Out] = null

}

object Test {

  import TNat._
  type t323 = Two[Two[Two[Two[Zero[One[t0]]]]]]
  type t340 = One[Two[One[Zero[One[One[t0]]]]]]
  type X = Two[Two[Zero[One[Zero[Zero[Zero[One[t0]]]]]]]]
  type t1164009493 = Two[Two[Zero[One[Zero[One[One[One[Zero[Zero[Two[One[Two[Zero[Two[One[Zero[Zero[Two[Two[Two[Two[Two[One[Two[t0]]]]]]]]]]]]]]]]]]]]]]]]]
  type t18025691539297459 = One[One[Zero[Two[One[Zero[One[Zero[Zero[Two[Two[One[Two[Two[Zero[One[Two[One[One[Two[Zero[Zero[Zero[Two[One[One[Two[Two[One[One[Zero[Two[Zero[Zero[One[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]

  Karatsuba.test[t3, t3]: t9
  Karatsuba.test[t3, t9]: t27
  Karatsuba.test[t7, t7]: t49
  Karatsuba.test[t19, t17]: t323
  Karatsuba.test[t4, t5]: t20
  Karatsuba.test[t24, t3]: t72
  Karatsuba.test[t68, t5]: t340
  Karatsuba.test[One[One[One[One[Two[t0]]]]], Two[Zero[One[t0]]]]: X
  Karatsuba.test[t15485863, t48611]: t1164009493
  // GC overhead exceeded:
  // Karatsuba.test[t1164009493, t15485863]: t18025691539297459

}

// Rounds down to the nearest even number
trait Evenify[M <: TNat] { type Out <: TNat }
object Evenify {
  type Aux[M <: TNat, Out0 <: TNat] = Evenify[M] { type Out = Out0 }

  implicit def isEven[M <: TNat](implicit ev: IsEven[M]): Evenify.Aux[M, M] = null
  implicit def isOdd[M <: TNat](implicit ev: IsOdd[M], d: Decr[M]): Evenify.Aux[M, d.Out] = null
}

trait MinLength[M <: TNat, N <: TNat] { type Out <: TNat }
object MinLength {
  type Aux[M <: TNat, N <: TNat, Out0 <: TNat] = MinLength[M, N] { type Out = Out0 }

  implicit def baseCase0: MinLength.Aux[t0, t0, t0] = null
  implicit def baseCase1[M <: TNonZero]: MinLength.Aux[M, t0, t0] = null
  implicit def baseCase2[M <: TNonZero]: MinLength.Aux[t0, M, t0] = null

  implicit def recurse[
    X[_ <: TNat] <: TOperation[_],
    M <: TNat,
    Y[_ <: TNat] <: TOperation[_],
    N <: TNat, I <: TNat
  ](
    implicit min: MinLength.Aux[M, N, I],
    i: Incr[I]
  ): MinLength.Aux[X[M], Y[N], i.Out] = null
}

trait PadLeft[M <: TNat, Pad <: TNat] { type Out <: TNat }

object PadLeft {
  type Aux[M <: TNat, Pad <: TNat, Out0 <: TNat] = PadLeft[M, Pad] { type Out = Out0 }

  implicit def t0Case[M <: TNat]: PadLeft.Aux[M, t0, M] = null

  implicit def recurseCase[M <: TNat, P <: TNat, P1 <: TNat, X <: TNat](
    implicit d: Decr.Aux[P, P1],
    recurse: PadLeft.Aux[M, P1, X],
    app: SplitAtIndex.ApplyOperation[X, Zero]
  ): PadLeft.Aux[M, P, app.Out] = null

}

trait Min[A <: TNat, B <: TNat] { type Out <: TNat }
object Min {
  type Aux[A <: TNat, B <: TNat, C <: TNat] = Min[A, B] { type Out = C }
  implicit def lte1[A <: TNat, B <: TNat](implicit ev: A Gte B): Min.Aux[A, B, B] = null
  implicit def lte2[A <: TNat, B <: TNat](implicit ev: A Lt B): Min.Aux[A, B, A] = null
}

trait Length[M <: TNat] { type Out <: TNat }
object Length {

  type Aux[M <: TNat, Out0 <: TNat] = Length[M] { type Out = Out0 }

  implicit def baseCase: Length.Aux[t0, t0] = null

  implicit def opCase[Op[_ <: TNat] <: TOperation[_], M <: TNat, A <: TNat, A1 <: TNat](
    implicit f: Length.Aux[M, A],
    i: Incr.Aux[A, A1]
  ): Length.Aux[Op[M], A1] = null

}

trait Div2[M <: TNat] { type Out <: TNat }

object Div2 {
  type Aux[M <: TNat, Out0 <: TNat] = Div2[M] { type Out = Out0 }

  implicit def baseCase: Div2.Aux[t0, t0] = null

  // (3m+0)/2 = 1.5m
  implicit def zeroCase[M <: TNat, M2 <: TNat](
    implicit d: Div2.Aux[M, M2],
    s: Sum[M, M2]
  ): Div2.Aux[Zero[M], s.Out] = null

  // (3m+2)/2 = (3m+0)/2 + 1
  implicit def twoCase[M <: TNat, M2 <: TNat](
    implicit d: Div2.Aux[Zero[M], M2],
    incr: Incr[M2]
  ): Div2.Aux[Two[M], incr.Out] = null

  implicit def oneOddCase[M <: TNat, M2 <: TNat](
    implicit d: Div2.Aux[Zero[M], M2],
    isOdd: IsOdd[M],
    incr: Incr[M2]
  ): Div2.Aux[One[M], incr.Out] = null

  implicit def oneEvenCase[M <: TNat, M2 <: TNat](
    implicit d: Div2.Aux[Zero[M], M2],
    isEven: IsEven[M],
  ): Div2.Aux[One[M], M2] = null

}

trait IsEven[M <: TNat]
object IsEven {
  implicit def t0Case: IsEven[t0] = null
  implicit def zeroCase[M <: TNat](implicit e: IsEven[M]): IsEven[Zero[M]] = null
  implicit def twoCase[M <: TNat](implicit e: IsEven[M]): IsEven[Two[M]] = null
  implicit def oneCase[M <: TNat](implicit e: IsOdd[M]): IsEven[One[M]] = null
}

trait IsOdd[M <: TNat]
object IsOdd {
  implicit def zeroCase[M <: TNat](implicit o: IsOdd[M]): IsOdd[Zero[M]] = null
  implicit def oneCase[M <: TNat](implicit o: IsEven[M]): IsOdd[One[M]] = null
  implicit def twoCase[M <: TNat](implicit o: IsOdd[M]): IsOdd[Two[M]] = null
}

trait Decr[M <: TNat] { type Out <: TNat }
object Decr {
  type Aux[M <: TNat, Out0 <: TNat] = Decr[M] { type Out = Out0 }

  implicit def zeroCase[M <: TNat](implicit d: Decr[M]): Decr.Aux[Zero[M], Two[d.Out]] = null
  implicit def oneCase[M <: TNat](implicit app: SplitAtIndex.ApplyOperation[M, Zero]): Decr.Aux[One[M], app.Out] = null
  implicit def twoCase[M <: TNat]: Decr.Aux[Two[M], One[M]] = null

}

trait SplitAtIndex[M <: TNat, I <: TNat] {
  type Low <: TNat
  type High <: TNat
}

object SplitAtIndex {

  type Aux[M <: TNat, I <: TNat, L <: TNat, R <: TNat] = SplitAtIndex[M, I] {
    type Low = L
    type High = R
  }

  implicit def t0Case[M <: TNat]: SplitAtIndex.Aux[M, t0, t0, M] = null

  implicit def fooCase[Op[_ <: TNat] <: TOperation[_], Index <: TNat, I2 <: TNat, M <: TNat, L <: TNat, R <: TNat](
    implicit decr: Decr.Aux[Index, I2],
    recurse: SplitAtIndex.Aux[M, I2, L, R],
    app: ApplyOperation[L, Op]
  ): SplitAtIndex.Aux[Op[M], Index, app.Out, R] = null

  trait ApplyOperation[M <: TNat, Op[_ <: TNat] <: TOperation[_]] { type Out <: TNat }
  object ApplyOperation {
    type Aux[M <: TNat, Op[_ <: TNat] <: TOperation[_], Out0 <: TNat] = ApplyOperation[M, Op] { type Out = Out0 }

    implicit def t00Case: ApplyOperation.Aux[t0, Zero, t0] = null
    implicit def t01Case: ApplyOperation.Aux[t0, One, One[t0]] = null
    implicit def t02Case: ApplyOperation.Aux[t0, Two, Two[t0]] = null
    implicit def otherCase[M <: TNonZero, Op[_ <: TNat] <: TOperation[_]]: ApplyOperation.Aux[M, Op, Op[M]] = null
  }

}

trait SplitAtIndexDouble[M <: TNat, I <: TNat, N <: TNat] {
  type MLow <: TNat
  type MHigh <: TNat
  type NLow <: TNat
  type NHigh <: TNat
}


object SplitAtIndexDouble {

  import SplitAtIndex.ApplyOperation

  type Aux[M <: TNat, I <: TNat, N <: TNat, ML <: TNat, MH <: TNat, NL <: TNat, NH <: TNat] = SplitAtIndexDouble[M, I, N] {
    type MLow = ML
    type MHigh = MH
    type NLow = NL
    type NHigh = NH
  }

  implicit def t0Case[M <: TNat, N <: TNat]: SplitAtIndexDouble.Aux[M, t0, N, t0, M, t0, N] = null

  implicit def fooCase[
    OpM[_ <: TNat] <: TOperation[_],
    OpN[_ <: TNat] <: TOperation[_],
    Index <: TNat,
    I2 <: TNat,
    M <: TNat,
    N <: TNat,
    ML <: TNat,
    MH <: TNat,
    NL <: TNat,
    NH <: TNat
  ](
    implicit decr: Decr.Aux[Index, I2],
    recurse: SplitAtIndexDouble.Aux[M, I2, N, ML, MH, NL, NH],
    app: ApplyOperation[ML, OpM],
    app2: ApplyOperation[NL, OpN],
  ): SplitAtIndexDouble.Aux[OpM[M], Index, OpN[N], app.Out, MH, app2.Out, NH] = null


}
