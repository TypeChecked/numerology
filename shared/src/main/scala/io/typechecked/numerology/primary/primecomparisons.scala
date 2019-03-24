package io.typechecked
package numerology
package primary

import ternary._

sealed trait PrimeLt[P <: Prime, Q <: Prime]

object PrimeLt {
  import Prime._
  implicit def primeltInstances[N <: TNat, M <: TNat](implicit p: Lt[N, M]): PrimeLt[PrimeNat[N], PrimeNat[M]] = null
}

sealed trait PrimeGt[P <: Prime, Q <: Prime]

object PrimeGt {
  import Prime._
  implicit def primegtInstances[N <: TNat, M <: TNat](implicit p: Gt[N, M]): PrimeGt[PrimeNat[N], PrimeNat[M]] = null
}
