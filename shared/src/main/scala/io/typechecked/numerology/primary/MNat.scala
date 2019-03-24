package io.typechecked
package numerology
package primary


import ternary._
import ternary.TNat._

import Prime._

/**
 * The M in MNat stands for Multiplication, which is all this one is good for
 */
sealed trait MNat

final class m1 extends MNat

trait ^[Pr <: Prime, Po <: TNonZero]

trait *:[P <: ^[_, _], N <: MNat] extends MNat

object MNat {

  type m2 = (p2 ^ t1) *: m1
  type m3 = (p3 ^ t1) *: m1
  type m4 = (p2 ^ t2) *: m1
  type m5 = (p5 ^ t1) *: m1
  type m6 = (p3 ^ t1) *: (p2 ^ t1) *: m1
  type m7 = (p7 ^ t1) *: m1
  type m8 = (p2 ^ t3) *: m1
  type m9 = (p3 ^ t1) *: m1
  type m10 = (p5 ^ t1) *: m2
  type m11 = (p11 ^ t1) *: m1
  type m12 = (p3 ^ t1) *: m4
  type m13 = (p13 ^ t1) *: m1
  type m14 = (p7 ^ t1) *: m2
  type m15 = (p5 ^ t1) *: m3
  type m16 = (p2 ^ t4) *: m1
  type m17 = (p17 ^ t1) *: m1
  type m18 = (p3 ^ t2) *: m2
  type m19 = (p19 ^ t1) *: m1
  type m20 = (p5 ^ t1) *: m4
  type m55 = (p11 ^ t1) *: m5
  type m144 = (p3 ^ t2) *: m16
  type m380 = (p19 ^ t1) *: (p5 ^ t1) *: m4

  type m2599 = (p113 ^ t1) *: (p23 ^ t1) *: m1

  type m62453 = (p173 ^ t1) *: (p19 ^ t2) *: m1

  type m3371550 = (p19 ^ t1) *: (p13 ^ t2) *: (p7 ^ t1) *: (p5 ^ t2) *: (p3 ^ t1) *: (p2 ^ t1) *: m1

  type m162315347 = (p173 ^ t1) *: (p113 ^ t1) *: (p23 ^ t1) *: (p19 ^ t2) *: m1

  type m540970540 = (p17 ^ t3) *: (p13 ^ t1) *: (p11 ^ t2) *: (p7 ^ t1) *: (p5 ^ t1) *: (p2 ^ t1) *: m1

  type m1604163 = (p48611 ^ t1) *: (p11 ^ t1) *: (p3 ^ t1) *: m1

  type m1823909224137000 = (p19 ^ t1) *:
    (p17 ^ t3) *:
    (p13 ^ t3) *:
    (p11 ^ t2) *:
    (p7 ^ t2) *:
    (p5 ^ t3) *:
    (p3 ^ t1) *:
    (p2 ^ t2) *:
    m1

  type m131941772149 = (p2333 ^ t1) *:
    (p227 ^ t1) *:
    (p71 ^ t1) *:
    (p29 ^ t1) *:
    (p11 ^ t2) *:
    m1

}
