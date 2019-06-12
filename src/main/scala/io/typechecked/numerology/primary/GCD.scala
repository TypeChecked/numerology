package io.typechecked
package numerology
package primary

import shapeless.=:!=

import ternary.Lt
import ternary.TNonZero

trait GCD[A <: MNat, B <: MNat] { type Out <: MNat }

object GCD {

  type Aux[A <: MNat, B <: MNat, Out0 <: MNat] = GCD[A, B] { type Out = Out0 }

  implicit def unitCase1[A <: MNat]: GCD.Aux[A, m1, m1] = null
  implicit def unitCase2[A <: ^[_ <: Prime, _ <: TNonZero], T <: MNat]: GCD.Aux[m1, A *: T, m1] = null

  implicit def lhsLtCase[
    AH <: TNonZero,
    X <: TNonZero,
    A <: MNat,
    BH <: TNonZero,
    Y <: TNonZero,
    B <: MNat,
    ABGCD <: MNat
  ](
    implicit ev2: AH Lt BH,
    recurse: GCD.Aux[(PrimeNat[AH]^X) *: A, B, ABGCD]
  ): GCD.Aux[(PrimeNat[AH]^X) *: A, (PrimeNat[BH]^Y) *: B, ABGCD] = null

  implicit def rhsLtCase[
    AH <: TNonZero,
    X <: TNonZero,
    A <: MNat,
    BH <: TNonZero,
    Y <: TNonZero,
    B <: MNat,
    ABGCD <: MNat
  ](
    implicit ev2: BH Lt AH,
    recurse: GCD.Aux[A, (PrimeNat[BH]^Y) *: B, ABGCD]
  ): GCD.Aux[(PrimeNat[AH]^X) *: A, (PrimeNat[BH]^Y) *: B, ABGCD] = null

  implicit def headEqCase[
    H <: Prime,
    X <: TNonZero,
    Y <: TNonZero,
    A <: MNat,
    B <: MNat,
    XYMIN <: TNonZero,
    ABGCD <: MNat
  ](
    implicit min: ternary.Min.Aux[X, Y, XYMIN],
    recurse: GCD.Aux[A, B, ABGCD]
  ): GCD.Aux[(H^X) *: A, (H^Y) *: B, (H^XYMIN) *: ABGCD] = null

}
