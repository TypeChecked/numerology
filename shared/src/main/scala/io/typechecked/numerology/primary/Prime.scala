package io.typechecked
package numerology
package primary

import ternary.TNat
import ternary.TNat._

sealed trait Prime
sealed trait PrimeNat[N <: TNat] extends Prime

object Prime {

  type p2 = PrimeNat[t2]
  type p3 = PrimeNat[t3]
  type p5 = PrimeNat[t5]
  type p7 = PrimeNat[t7]
  type p11 = PrimeNat[t11]
  type p13 = PrimeNat[t13]
  type p17 = PrimeNat[t17]
  type p19 = PrimeNat[t19]
  type p23 = PrimeNat[t23]
  type p29 = PrimeNat[t29]
  type p71 = PrimeNat[t71]
  type p113 = PrimeNat[t113]
  type p173 = PrimeNat[t173]
  type p227 = PrimeNat[t227]
  type p421 = PrimeNat[t421]
  type p1543 = PrimeNat[t1543]
  type p2333 = PrimeNat[t2333]

  type p48611 = PrimeNat[t48611]

  type p15485863 = PrimeNat[t15485863]

}
