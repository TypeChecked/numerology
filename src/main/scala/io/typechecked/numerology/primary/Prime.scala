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
  type p31 = PrimeNat[t31]
  type p37 = PrimeNat[t37]
  type p41 = PrimeNat[t41]
  type p43 = PrimeNat[t43]
  type p47 = PrimeNat[t47]
  type p53 = PrimeNat[t53]
  type p59 = PrimeNat[t59]
  type p61 = PrimeNat[t61]
  type p67 = PrimeNat[t67]
  type p71 = PrimeNat[t71]
  type p73 = PrimeNat[t73]
  type p79 = PrimeNat[t79]
  type p83 = PrimeNat[t83]
  type p89 = PrimeNat[t89]
  type p97 = PrimeNat[t97]
  type p101 = PrimeNat[t101]
  type p103 = PrimeNat[t103]
  type p107 = PrimeNat[t107]
  type p109 = PrimeNat[t109]
  type p113 = PrimeNat[t113]
  type p127 = PrimeNat[t127]
  type p131 = PrimeNat[t131]
  type p137 = PrimeNat[t137]
  type p139 = PrimeNat[t139]
  type p149 = PrimeNat[t149]
  type p151 = PrimeNat[t151]
  type p157 = PrimeNat[t157]
  type p163 = PrimeNat[t163]
  type p167 = PrimeNat[t167]
  type p173 = PrimeNat[t173]
  type p179 = PrimeNat[t179]
  type p181 = PrimeNat[t181]
  type p191 = PrimeNat[t191]
  type p193 = PrimeNat[t193]
  type p197 = PrimeNat[t197]
  type p199 = PrimeNat[t199]

  type p227 = PrimeNat[t227]
  type p421 = PrimeNat[t421]
  type p607 = PrimeNat[t607]
  type p1543 = PrimeNat[t1543]
  type p2333 = PrimeNat[t2333]
  type p4051 = PrimeNat[t4051]

  type p48611 = PrimeNat[t48611]

  type p15485863 = PrimeNat[t15485863]

}
