package io.typechecked
package numerology
package primary

object Benchmark {

  // Worst case: Longest expansion with the lowest value, ie chain of n unique lowest primes

  import ternary._
  import ternary.TNat._
  import MNat._
  import Prime._
  import primary.mult._

  def mult[A <: MNat, B <: MNat](implicit s: Mult2[A, B]): Option[s.Out] = Option.empty[s.Out]

  // 10^21
  type m1922760350154212639070 = (p59 ^ t1) *: (p53 ^ t1) *: (p47 ^ t1) *: (p43 ^ t1) *: (p41 ^ t1) *: (p37 ^ t1) *: (p31 ^ t1) *: (p29 ^ t1) *: (p23 ^ t1) *: (p19 ^ t1) *: (p17 ^ t1) *: (p13 ^ t1) *: (p11 ^ t1) *: (p7 ^ t1) *: (p5 ^ t1) *: (p3 ^ t1) *: (p2 ^ t1) *: m1
  type m117288381359406970983270 = (p61 ^ t1) *: (p59 ^ t1) *: (p53 ^ t1) *: (p47 ^ t1) *: (p43 ^ t1) *: (p41 ^ t1) *: (p37 ^ t1) *: (p31 ^ t1) *: (p29 ^ t1) *: (p23 ^ t1) *: (p19 ^ t1) *: (p17 ^ t1) *: (p13 ^ t1) *: (p11 ^ t1) *: (p7 ^ t1) *: (p5 ^ t1) *: (p3 ^ t1) *: (p2 ^ t1) *: m1
  type m225517449211634174141914812509984979518358900 = (p61 ^ t1) *: (p59 ^ t2) *: (p53 ^ t2) *: (p47 ^ t2) *: (p43 ^ t2) *: (p41 ^ t2) *: (p37 ^ t2) *: (p31 ^ t2) *: (p29 ^ t2) *: (p23 ^ t2) *: (p19 ^ t2) *: (p17 ^ t2) *: (p13 ^ t2) *: (p11 ^ t2) *: (p7 ^ t2) *: (p5 ^ t2) *: (p3 ^ t2) *: (p2 ^ t2) *: m1

  type a1 = (p61 ^ t1) *: (p59 ^ t1) *: (p53 ^ t1) *: (p47 ^ t1) *: (p43 ^ t1) *: (p41 ^ t1) *: (p37 ^ t1) *: (p31 ^ t1) *: (p29 ^ t1) *: (p23 ^ t1) *: (p19 ^ t1) *: (p17 ^ t1) *: (p13 ^ t1) *: (p11 ^ t1) *: (p7 ^ t1) *: (p5 ^ t1) *: (p3 ^ t1) *: (p2 ^ t1) *: m1
  type a2 = (p67 ^ t1) *: (p61 ^ t1) *: (p59 ^ t1) *: (p53 ^ t1) *: (p47 ^ t1) *: (p43 ^ t1) *: (p41 ^ t1) *: (p37 ^ t1) *: (p31 ^ t1) *: (p29 ^ t1) *: (p23 ^ t1) *: (p19 ^ t1) *: (p17 ^ t1) *: (p13 ^ t1) *: (p11 ^ t1) *: (p7 ^ t1) *: (p5 ^ t1) *: (p3 ^ t1) *: (p2 ^ t1) *: m1
  type a3 = (p67 ^ t1) *: (p61 ^ t2) *: (p59 ^ t2) *: (p53 ^ t2) *: (p47 ^ t2) *: (p43 ^ t2) *: (p41 ^ t2) *: (p37 ^ t2) *: (p31 ^ t2) *: (p29 ^ t2) *: (p23 ^ t2) *: (p19 ^ t2) *: (p17 ^ t2) *: (p13 ^ t2) *: (p11 ^ t2) *: (p7 ^ t2) *: (p5 ^ t2) *: (p3 ^ t2) *: (p2 ^ t2) *: m1

  type b1 = (p67 ^ t1) *: (p61 ^ t1) *: (p59 ^ t1) *: (p53 ^ t1) *: (p47 ^ t1) *: (p43 ^ t1) *: (p41 ^ t1) *: (p37 ^ t1) *: (p31 ^ t1) *: (p29 ^ t1) *: (p23 ^ t1) *: (p19 ^ t1) *: (p17 ^ t1) *: (p13 ^ t1) *: (p11 ^ t1) *: (p7 ^ t1) *: (p5 ^ t1) *: (p3 ^ t1) *: (p2 ^ t1) *: m1
  type b2 = (p61 ^ t1) *: (p53 ^ t1) *: (p43 ^ t1) *: (p37 ^ t1) *: (p29 ^ t1) *: (p19 ^ t1) *: (p13 ^ t1) *: (p7 ^ t1) *: (p3 ^ t1) *: m1
  type b3 = (p67 ^ t1) *: (p61 ^ t2) *: (p59 ^ t1) *: (p53 ^ t2) *: (p47 ^ t1) *: (p43 ^ t2) *: (p41 ^ t1) *: (p37 ^ t2) *: (p31 ^ t1) *: (p29 ^ t2) *: (p23 ^ t1) *: (p19 ^ t2) *: (p17 ^ t1) *: (p13 ^ t2) *: (p11 ^ t1) *: (p7 ^ t2) *: (p5 ^ t1) *: (p3 ^ t2) *: (p2 ^ t1) *: m1
  // Mult1: 56s, 55s, 56s
  // Mult2: 11s, 11s, 11s
  // Mult3: 12s, 11s, 11s
  // mult[m1922760350154212639070, m117288381359406970983270]: Option[m225517449211634174141914812509984979518358900]

  // Mult2: 20s, 20s, 20s
  // Mult3: 22s, 23s, 22s: 27s, 26s, 25s,
  mult[a1, a2]: Option[a3]

  // mult[b1, b2]: Option[b3]
}
