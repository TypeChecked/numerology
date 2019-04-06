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
  type m9 = (p3 ^ t2) *: m1
  type m10 = (p5 ^ t1) *: (p2 ^ t1) *: m1
  type m11 = (p11 ^ t1) *: m1
  type m12 = (p3 ^ t1) *: (p2 ^ t2) *: m1
  type m13 = (p13 ^ t1) *: m1
  type m14 = (p7 ^ t1) *: (p2 ^ t1) *: m1
  type m15 = (p5 ^ t1) *: (p3 ^ t1) *: m1
  type m16 = (p2 ^ t4) *: m1
  type m17 = (p17 ^ t1) *: m1
  type m18 = (p3 ^ t2) *: (p2 ^ t1) *: m1
  type m19 = (p19 ^ t1) *: m1
  type m20 = (p5 ^ t1) *: (p2 ^ t2) *: m1
  type m21 = (p7 ^ t1) *: (p3 ^ t1) *: m1
  type m22 = (p11 ^ t1) *: (p2 ^ t1) *: m1
  type m23 = (p23 ^ t1) *: m1
  type m24 = (p3 ^ t1) *: (p2 ^ t3) *: m1
  type m25 = (p5 ^ t2) *: m1
  type m26 = (p13 ^ t1) *: (p2 ^ t1) *: m1
  type m27 = (p3 ^ t3) *: m1
  type m28 = (p7 ^ t1) *: (p2 ^ t2) *: m1
  type m29 = (p29 ^ t1) *: m1
  type m30 = (p5 ^ t1) *: (p3 ^ t1) *: (p2 ^ t1) *: m1
  type m31 = (p31 ^ t1) *: m1
  type m32 = (p2 ^ t5) *: m1
  type m33 = (p11 ^ t1) *: (p3 ^ t1) *: m1
  type m34 = (p17 ^ t1) *: (p2 ^ t1) *: m1
  type m35 = (p7 ^ t1) *: (p5 ^ t1) *: m1
  type m36 = (p3 ^ t2) *: (p2 ^ t2) *: m1
  type m37 = (p37 ^ t1) *: m1
  type m38 = (p19 ^ t1) *: (p2 ^ t1) *: m1
  type m39 = (p13 ^ t1) *: (p3 ^ t1) *: m1
  type m40 = (p5 ^ t1) *: (p2 ^ t3) *: m1
  type m41 = (p41 ^ t1) *: m1
  type m42 = (p7 ^ t1) *: (p3 ^ t1) *: (p2 ^ t1) *: m1
  type m43 = (p43 ^ t1) *: m1
  type m44 = (p11 ^ t1) *: (p2 ^ t2) *: m1
  type m45 = (p5 ^ t1) *: (p3 ^ t2) *: m1
  type m46 = (p23 ^ t1) *: (p2 ^ t1) *: m1
  type m47 = (p47 ^ t1) *: m1
  type m48 = (p3 ^ t1) *: (p2 ^ t4) *: m1
  type m49 = (p7 ^ t2) *: m1
  type m50 = (p5 ^ t2) *: (p2 ^ t1) *: m1
  type m51 = (p17 ^ t1) *: (p3 ^ t1) *: m1
  type m52 = (p13 ^ t1) *: (p2 ^ t2) *: m1
  type m53 = (p53 ^ t1) *: m1
  type m54 = (p3 ^ t3) *: (p2 ^ t1) *: m1
  type m55 = (p11 ^ t1) *: (p5 ^ t1) *: m1
  type m56 = (p7 ^ t1) *: (p2 ^ t3) *: m1
  type m57 = (p19 ^ t1) *: (p3 ^ t1) *: m1
  type m58 = (p29 ^ t1) *: (p2 ^ t1) *: m1
  type m59 = (p59 ^ t1) *: m1
  type m60 = (p5 ^ t1) *: (p3 ^ t1) *: (p2 ^ t2) *: m1
  type m61 = (p61 ^ t1) *: m1
  type m62 = (p31 ^ t1) *: (p2 ^ t1) *: m1
  type m63 = (p7 ^ t1) *: (p3 ^ t2) *: m1
  type m64 = (p2 ^ t6) *: m1
  type m65 = (p13 ^ t1) *: (p5 ^ t1) *: m1
  type m66 = (p11 ^ t1) *: (p3 ^ t1) *: (p2 ^ t1) *: m1
  type m67 = (p67 ^ t1) *: m1
  type m68 = (p17 ^ t1) *: (p2 ^ t2) *: m1
  type m69 = (p23 ^ t1) *: (p3 ^ t1) *: m1
  type m70 = (p7 ^ t1) *: (p5 ^ t1) *: (p2 ^ t1) *: m1
  type m71 = (p71 ^ t1) *: m1
  type m72 = (p3 ^ t2) *: (p2 ^ t3) *: m1
  type m73 = (p73 ^ t1) *: m1
  type m74 = (p37 ^ t1) *: (p2 ^ t1) *: m1
  type m75 = (p5 ^ t2) *: (p3 ^ t1) *: m1
  type m76 = (p19 ^ t1) *: (p2 ^ t2) *: m1
  type m77 = (p11 ^ t1) *: (p7 ^ t1) *: m1
  type m78 = (p13 ^ t1) *: (p3 ^ t1) *: (p2 ^ t1) *: m1
  type m79 = (p79 ^ t1) *: m1
  type m80 = (p5 ^ t1) *: (p2 ^ t4) *: m1
  type m81 = (p3 ^ t4) *: m1
  type m82 = (p41 ^ t1) *: (p2 ^ t1) *: m1
  type m83 = (p83 ^ t1) *: m1
  type m84 = (p7 ^ t1) *: (p3 ^ t1) *: (p2 ^ t2) *: m1
  type m85 = (p17 ^ t1) *: (p5 ^ t1) *: m1
  type m86 = (p43 ^ t1) *: (p2 ^ t1) *: m1
  type m87 = (p29 ^ t1) *: (p3 ^ t1) *: m1
  type m88 = (p11 ^ t1) *: (p2 ^ t3) *: m1
  type m89 = (p89 ^ t1) *: m1
  type m90 = (p5 ^ t1) *: (p3 ^ t2) *: (p2 ^ t1) *: m1
  type m91 = (p13 ^ t1) *: (p7 ^ t1) *: m1
  type m92 = (p23 ^ t1) *: (p2 ^ t2) *: m1
  type m93 = (p31 ^ t1) *: (p3 ^ t1) *: m1
  type m94 = (p47 ^ t1) *: (p2 ^ t1) *: m1
  type m95 = (p19 ^ t1) *: (p5 ^ t1) *: m1
  type m96 = (p3 ^ t1) *: (p2 ^ t5) *: m1
  type m97 = (p97 ^ t1) *: m1
  type m98 = (p7 ^ t2) *: (p2 ^ t1) *: m1
  type m99 = (p11 ^ t1) *: (p3 ^ t2) *: m1
  type m100 = (p5 ^ t2) *: (p2 ^ t2) *: m1
  type m101 = (p101 ^ t1) *: m1
  type m102 = (p17 ^ t1) *: (p3 ^ t1) *: (p2 ^ t1) *: m1
  type m103 = (p103 ^ t1) *: m1
  type m104 = (p13 ^ t1) *: (p2 ^ t3) *: m1
  type m105 = (p7 ^ t1) *: (p5 ^ t1) *: (p3 ^ t1) *: m1
  type m106 = (p53 ^ t1) *: (p2 ^ t1) *: m1
  type m107 = (p107 ^ t1) *: m1
  type m108 = (p3 ^ t3) *: (p2 ^ t2) *: m1
  type m109 = (p109 ^ t1) *: m1
  type m110 = (p11 ^ t1) *: (p5 ^ t1) *: (p2 ^ t1) *: m1
  type m111 = (p37 ^ t1) *: (p3 ^ t1) *: m1
  type m112 = (p7 ^ t1) *: (p2 ^ t4) *: m1
  type m113 = (p113 ^ t1) *: m1
  type m114 = (p19 ^ t1) *: (p3 ^ t1) *: (p2 ^ t1) *: m1
  type m115 = (p23 ^ t1) *: (p5 ^ t1) *: m1
  type m116 = (p29 ^ t1) *: (p2 ^ t2) *: m1
  type m117 = (p13 ^ t1) *: (p3 ^ t2) *: m1
  type m118 = (p59 ^ t1) *: (p2 ^ t1) *: m1
  type m119 = (p17 ^ t1) *: (p7 ^ t1) *: m1
  type m120 = (p5 ^ t1) *: (p3 ^ t1) *: (p2 ^ t3) *: m1
  type m121 = (p11 ^ t2) *: m1
  type m122 = (p61 ^ t1) *: (p2 ^ t1) *: m1
  type m123 = (p41 ^ t1) *: (p3 ^ t1) *: m1
  type m124 = (p31 ^ t1) *: (p2 ^ t2) *: m1
  type m125 = (p5 ^ t3) *: m1
  type m126 = (p7 ^ t1) *: (p3 ^ t2) *: (p2 ^ t1) *: m1
  type m127 = (p127 ^ t1) *: m1
  type m128 = (p2 ^ t7) *: m1
  type m129 = (p43 ^ t1) *: (p3 ^ t1) *: m1
  type m130 = (p13 ^ t1) *: (p5 ^ t1) *: (p2 ^ t1) *: m1
  type m131 = (p131 ^ t1) *: m1
  type m132 = (p11 ^ t1) *: (p3 ^ t1) *: (p2 ^ t2) *: m1
  type m133 = (p19 ^ t1) *: (p7 ^ t1) *: m1
  type m134 = (p67 ^ t1) *: (p2 ^ t1) *: m1
  type m135 = (p5 ^ t1) *: (p3 ^ t3) *: m1
  type m136 = (p17 ^ t1) *: (p2 ^ t3) *: m1
  type m137 = (p137 ^ t1) *: m1
  type m138 = (p23 ^ t1) *: (p3 ^ t1) *: (p2 ^ t1) *: m1
  type m139 = (p139 ^ t1) *: m1
  type m140 = (p7 ^ t1) *: (p5 ^ t1) *: (p2 ^ t2) *: m1
  type m141 = (p47 ^ t1) *: (p3 ^ t1) *: m1
  type m142 = (p71 ^ t1) *: (p2 ^ t1) *: m1
  type m143 = (p13 ^ t1) *: (p11 ^ t1) *: m1
  type m144 = (p3 ^ t2) *: (p2 ^ t4) *: m1
  type m145 = (p29 ^ t1) *: (p5 ^ t1) *: m1
  type m146 = (p73 ^ t1) *: (p2 ^ t1) *: m1
  type m147 = (p7 ^ t2) *: (p3 ^ t1) *: m1
  type m148 = (p37 ^ t1) *: (p2 ^ t2) *: m1
  type m149 = (p149 ^ t1) *: m1
  type m150 = (p5 ^ t2) *: (p3 ^ t1) *: (p2 ^ t1) *: m1
  type m151 = (p151 ^ t1) *: m1
  type m152 = (p19 ^ t1) *: (p2 ^ t3) *: m1
  type m153 = (p17 ^ t1) *: (p3 ^ t2) *: m1
  type m154 = (p11 ^ t1) *: (p7 ^ t1) *: (p2 ^ t1) *: m1
  type m155 = (p31 ^ t1) *: (p5 ^ t1) *: m1
  type m156 = (p13 ^ t1) *: (p3 ^ t1) *: (p2 ^ t2) *: m1
  type m157 = (p157 ^ t1) *: m1
  type m158 = (p79 ^ t1) *: (p2 ^ t1) *: m1
  type m159 = (p53 ^ t1) *: (p3 ^ t1) *: m1
  type m160 = (p5 ^ t1) *: (p2 ^ t5) *: m1
  type m161 = (p23 ^ t1) *: (p7 ^ t1) *: m1
  type m162 = (p3 ^ t4) *: (p2 ^ t1) *: m1
  type m163 = (p163 ^ t1) *: m1
  type m164 = (p41 ^ t1) *: (p2 ^ t2) *: m1
  type m165 = (p11 ^ t1) *: (p5 ^ t1) *: (p3 ^ t1) *: m1
  type m166 = (p83 ^ t1) *: (p2 ^ t1) *: m1
  type m167 = (p167 ^ t1) *: m1
  type m168 = (p7 ^ t1) *: (p3 ^ t1) *: (p2 ^ t3) *: m1
  type m169 = (p13 ^ t2) *: m1
  type m170 = (p17 ^ t1) *: (p5 ^ t1) *: (p2 ^ t1) *: m1
  type m171 = (p19 ^ t1) *: (p3 ^ t2) *: m1
  type m172 = (p43 ^ t1) *: (p2 ^ t2) *: m1
  type m173 = (p173 ^ t1) *: m1
  type m174 = (p29 ^ t1) *: (p3 ^ t1) *: (p2 ^ t1) *: m1
  type m175 = (p7 ^ t1) *: (p5 ^ t2) *: m1
  type m176 = (p11 ^ t1) *: (p2 ^ t4) *: m1
  type m177 = (p59 ^ t1) *: (p3 ^ t1) *: m1
  type m178 = (p89 ^ t1) *: (p2 ^ t1) *: m1
  type m179 = (p179 ^ t1) *: m1
  type m180 = (p5 ^ t1) *: (p3 ^ t2) *: (p2 ^ t2) *: m1
  type m181 = (p181 ^ t1) *: m1
  type m182 = (p13 ^ t1) *: (p7 ^ t1) *: (p2 ^ t1) *: m1
  type m183 = (p61 ^ t1) *: (p3 ^ t1) *: m1
  type m184 = (p23 ^ t1) *: (p2 ^ t3) *: m1
  type m185 = (p37 ^ t1) *: (p5 ^ t1) *: m1
  type m186 = (p31 ^ t1) *: (p3 ^ t1) *: (p2 ^ t1) *: m1
  type m187 = (p17 ^ t1) *: (p11 ^ t1) *: m1
  type m188 = (p47 ^ t1) *: (p2 ^ t2) *: m1
  type m189 = (p7 ^ t1) *: (p3 ^ t3) *: m1
  type m190 = (p19 ^ t1) *: (p5 ^ t1) *: (p2 ^ t1) *: m1
  type m191 = (p191 ^ t1) *: m1
  type m192 = (p3 ^ t1) *: (p2 ^ t6) *: m1
  type m193 = (p193 ^ t1) *: m1
  type m194 = (p97 ^ t1) *: (p2 ^ t1) *: m1
  type m195 = (p13 ^ t1) *: (p5 ^ t1) *: (p3 ^ t1) *: m1
  type m196 = (p7 ^ t2) *: (p2 ^ t2) *: m1
  type m197 = (p197 ^ t1) *: m1
  type m198 = (p11 ^ t1) *: (p3 ^ t2) *: (p2 ^ t1) *: m1
  type m199 = (p199 ^ t1) *: m1
  type m200 = (p5 ^ t2) *: (p2 ^ t3) *: m1

  type m380 = (p19 ^ t1) *: (p5 ^ t1) *: m4

  type m2599 = (p113 ^ t1) *: (p23 ^ t1) *: m1

  type m62453 = (p173 ^ t1) *: (p19 ^ t2) *: m1

  type m3371550 = (p19 ^ t1) *: (p13 ^ t2) *: (p7 ^ t1) *: (p5 ^ t2) *: (p3 ^ t1) *: (p2 ^ t1) *: m1

  type m162315347 = (p173 ^ t1) *: (p113 ^ t1) *: (p23 ^ t1) *: (p19 ^ t2) *: m1

  type m540970540 = (p17 ^ t3) *: (p13 ^ t1) *: (p11 ^ t2) *: (p7 ^ t1) *: (p5 ^ t1) *: (p2 ^ t1) *: m1

  type m1604163 = (p48611 ^ t1) *: (p11 ^ t1) *: (p3 ^ t1) *: m1

  type m1823909224137000 = (p4051 ^ t1) *:
    (p607 ^ t1) *:
    (p19 ^ t1) *:
    (p13 ^ t2) *:
    (p11 ^ t1) *:
    (p7 ^ t1) *:
    (p5 ^ t3) *:
    (p3 ^ t1) *:
    (p2 ^ t3) *:
    m1

  type m131941772149 = (p2333 ^ t1) *:
    (p227 ^ t1) *:
    (p71 ^ t1) *:
    (p29 ^ t1) *:
    (p11 ^ t2) *:
    m1

  type m240649815271543425160413000 = (p4051 ^ t1) *:
    (p2333 ^ t1) *:
    (p607 ^ t1) *:
    (p227 ^ t1) *:
    (p71 ^ t1) *:
    (p29 ^ t1) *:
    (p19 ^ t1) *:
    (p13 ^ t2) *:
    (p11 ^ t3) *:
    (p7 ^ t1) *:
    (p5 ^ t3) *:
    (p3 ^ t1) *:
    (p2 ^ t3) *:
    m1

}
