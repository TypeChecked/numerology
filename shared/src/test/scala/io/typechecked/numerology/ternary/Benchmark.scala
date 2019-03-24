package io.typechecked
package numerology
package ternary

import TNat._

/**
 * Each sum in this benchmark example object compiles in trivial time
 */
object Benchmark {

  // This code is never run so it is safe to throw this exception here
  def sum[A <: TNat, B <: TNat](implicit s: Sum[A, B]): s.Out = ???

  /* Billions - Integer overflow */
  type t4837640932 = One[Zero[One[Zero[One[Two[One[Two[One[Two[One[Two[Zero[One[Zero[One[One[One[Zero[One[One[t0]]]]]]]]]]]]]]]]]]]]]
  type t7251937882 = One[Two[Two[Zero[Two[One[One[Two[One[Zero[One[Two[One[Zero[One[One[Zero[Two[Zero[Zero[Two[t0]]]]]]]]]]]]]]]]]]]]]
  type t12089578814 = Two[Two[Zero[One[Zero[One[Zero[Two[Zero[Zero[Zero[Two[Two[One[One[Two[One[Zero[One[One[Zero[One[t0]]]]]]]]]]]]]]]]]]]]]]

  sum[t4837640932, t7251937882]: t12089578814


  /* Quadrillions */
  type t2183335248920485 = One[One[One[Zero[One[One[Zero[One[Zero[Two[Zero[Two[Zero[One[One[Zero[Two[Two[Zero[One[Two[Two[One[One[Two[Two[Zero[One[Two[One[One[Zero[One[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  type t5778936850372648 = One[Two[Two[One[One[Zero[Two[Two[Zero[One[Two[Zero[One[Two[Zero[Zero[One[Zero[Two[Two[Two[One[One[One[One[One[Two[One[Zero[Zero[One[Zero[Zero[One[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  type t7962272099293133 = Two[Zero[One[Two[Two[One[Two[Zero[One[Zero[Zero[Zero[Two[Zero[Two[Zero[Zero[Zero[Zero[One[Two[One[Zero[Zero[One[One[Zero[Zero[Zero[Two[Two[Zero[One[One[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]

  sum[t2183335248920485, t5778936850372648]: t7962272099293133


  /* Quintillions - Long overflow */
  type t3623159657334655154 = Two[Zero[Two[Zero[One[One[One[Zero[Two[One[One[Zero[Zero[Zero[One[Two[One[Two[One[One[One[One[Zero[Two[Zero[Two[Zero[Zero[One[One[Two[Zero[Two[Zero[One[Zero[Zero[Two[Two[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  type t7484613168431353138 = One[Two[Zero[Zero[Zero[Two[Two[Zero[Two[One[Zero[Zero[One[One[Zero[Two[Zero[Zero[Two[Two[Two[One[Two[Two[Zero[Zero[Two[One[Two[Zero[One[Zero[One[Two[One[Two[One[One[Two[One[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  type t11107772825766008292 = Zero[Zero[Zero[One[One[Zero[One[One[One[Zero[Two[Zero[One[One[One[One[Two[Two[Zero[One[One[Zero[Zero[Two[One[Two[Two[One[Zero[Two[Zero[One[Zero[Zero[Zero[Zero[Two[Zero[Two[Two[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]

  sum[t3623159657334655154, t7484613168431353138]: t11107772825766008292


  /* Octillions */
  type t6862134337616076187979017153 = One[Zero[Two[Zero[Two[One[One[Zero[Zero[Two[One[One[One[One[Two[Two[Zero[Two[Zero[Two[Zero[One[One[Zero[One[Two[Two[Two[Two[One[Two[Two[Two[Zero[Two[Two[Zero[Zero[Zero[Zero[One[Zero[Two[One[One[One[One[Two[Two[One[Zero[Zero[Zero[Zero[One[Zero[One[One[One[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  type t1183015878653188467097883862 = Zero[Two[One[Zero[Two[Two[Two[Two[Two[Zero[One[One[Two[Two[One[One[Two[Two[Zero[One[One[Zero[One[One[Two[One[Two[Two[Zero[One[One[One[One[Two[One[Zero[Zero[One[Zero[One[One[Two[Zero[Two[Two[Two[Two[Two[One[Two[Zero[Zero[Zero[One[Two[Zero[Two[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  type t8045150216269264655076901015 = One[Two[Zero[One[One[One[One[Zero[Zero[Zero[Zero[Zero[One[One[One[One[Zero[Two[One[Zero[Two[One[Two[One[Zero[One[Two[Two[Zero[Zero[One[One[One[Zero[One[Zero[One[One[Zero[One[Two[Two[Two[Zero[One[One[One[Two[One[One[One[Zero[Zero[One[Zero[One[Zero[Two[One[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]

  sum[t6862134337616076187979017153, t1183015878653188467097883862]: t8045150216269264655076901015


  /* Duodecillions */
  type t4556429720455012975942620873084153484065 = Zero[Zero[Zero[Two[Two[Zero[One[Two[Zero[Zero[Zero[Two[One[Two[Two[Two[Two[Two[Two[Two[Zero[Zero[Zero[Zero[One[Zero[One[Zero[One[Two[Zero[Zero[Two[One[One[Two[One[Zero[Zero[Two[One[Zero[One[Zero[Zero[Two[Two[Zero[Two[One[One[Zero[One[Two[Zero[Two[Two[Two[Two[Two[One[Zero[Zero[Two[Zero[Zero[Zero[Zero[Zero[One[Zero[Two[One[One[Two[Two[Zero[One[One[Two[Zero[One[Zero[One[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  type t8863511729796141422180068438666102565735 = Two[One[One[One[Two[Zero[One[Zero[One[One[Two[Zero[Two[Zero[Two[Two[Zero[One[One[Two[Zero[One[Zero[Zero[One[One[Zero[One[Two[Zero[Two[Two[Two[Two[Zero[Zero[One[One[One[Two[One[Two[Zero[One[Two[One[Two[Two[One[Zero[One[Zero[Zero[Two[Two[Two[Zero[One[Two[One[One[Zero[Two[One[Two[One[One[Two[Two[Zero[Two[Zero[Two[Zero[Two[Zero[Zero[Two[Two[Two[Two[One[Zero[Two[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  type t13419941450251154398122689311750256049800 = Two[One[One[Zero[Two[One[Two[Two[One[One[Two[Two[Zero[Zero[Two[Two[Zero[One[One[Two[One[One[Zero[Zero[Two[One[One[One[Zero[Zero[Zero[Zero[Two[One[Two[Two[Two[One[One[One[Zero[Zero[Two[One[Two[Zero[Two[Zero[One[Two[Two[Zero[One[One[Zero[Two[Zero[One[Two[One[Zero[One[Two[Zero[Zero[Two[One[Two[Two[One[Two[Two[Zero[Two[One[Zero[One[Zero[One[Two[Zero[Zero[One[Zero[One[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]

  sum[t4556429720455012975942620873084153484065, t8863511729796141422180068438666102565735]: t13419941450251154398122689311750256049800

  /* 10^45 */
  type t5632123423323808712794529648935639591408604650 = One[One[Two[Zero[One[Two[Zero[Two[One[One[One[One[Zero[Zero[Two[One[Two[Two[Two[Two[Two[Two[Two[Zero[Zero[One[Zero[One[One[Zero[One[One[Two[One[One[Two[One[One[One[One[Two[Zero[Zero[Two[One[One[Zero[One[Two[Two[Two[One[Two[Zero[One[Two[Two[One[One[One[Two[One[One[Zero[One[Zero[One[One[One[Zero[One[Zero[One[Two[One[One[Two[Zero[One[Two[Two[One[Zero[Zero[Zero[Zero[Zero[Two[Two[Zero[Zero[Two[Two[Two[One[Two[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  type t2712271086234362504553341386324303443695104072 = One[Zero[Two[One[Two[Zero[Zero[One[One[One[Zero[Two[One[One[Zero[Zero[Two[Two[One[One[One[Two[Two[Two[Two[One[Two[One[Two[Zero[One[One[Zero[One[Two[Zero[Two[Zero[Two[Zero[One[One[One[Two[Two[One[Zero[One[Zero[Zero[Two[One[Zero[Zero[One[One[Zero[Two[One[One[Two[One[Two[One[Zero[One[One[One[Zero[Zero[Two[Zero[Two[Two[Two[Zero[Zero[One[Zero[One[One[Zero[One[One[Two[Zero[One[Two[Zero[Two[One[One[One[Two[Zero[One[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  type t8344394509558171217347871035259943035103708722 = Two[One[One[Two[Zero[Zero[One[Zero[Zero[Zero[Two[Zero[Two[One[Two[One[One[Two[One[One[One[Two[Two[Zero[Zero[Zero[Zero[Zero[One[One[Two[Two[Two[Two[Zero[Zero[One[Two[Zero[Two[Zero[Two[One[One[One[Zero[One[Two[Two[Two[One[Zero[Zero[One[Two[Zero[Zero[One[Zero[Zero[Two[Zero[One[Two[One[One[Two[Two[One[Zero[Zero[One[Zero[Two[One[Two[Two[One[One[Zero[One[Two[One[One[Two[Zero[One[One[Zero[Zero[Two[Zero[One[Two[Two[Zero[One[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]

  // This annoyingly gives a compiler stack overflow for scalajs, but trivial compile time for scala jvm
  // sum[t5632123423323808712794529648935639591408604650, t2712271086234362504553341386324303443695104072]: t8344394509558171217347871035259943035103708722

  /* 10^50 */
  type t401422602123193590141631333690802526614264227921188 = Zero[Zero[Zero[Two[Zero[Zero[One[One[One[Zero[Zero[Two[Zero[Zero[Zero[Zero[One[One[One[Zero[Two[Two[Zero[Two[Zero[Zero[One[One[Zero[Zero[Two[Two[One[Two[Two[Zero[Two[Zero[Zero[Two[Two[Zero[Zero[Zero[Two[Zero[One[One[Zero[Zero[Zero[Zero[Two[Two[One[Zero[Two[One[Zero[Zero[Two[Two[Two[Two[One[One[Two[Zero[Two[Two[One[One[One[Zero[Two[Zero[Zero[Zero[One[Zero[Zero[One[Two[Zero[Two[Two[One[Two[Zero[Zero[Two[Two[Zero[Zero[One[Zero[Zero[Zero[Two[Two[One[One[Two[One[Zero[Zero[One[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  type t611952501695161384557749890526138871611387873931900 = Zero[Zero[Two[Two[Zero[Zero[One[One[Two[Zero[Zero[Two[Two[Zero[Zero[Zero[Two[One[One[Zero[Zero[One[Two[Zero[One[Zero[Zero[One[Two[Zero[One[Zero[Zero[Two[Two[Two[Zero[Zero[One[Two[Two[One[Zero[One[One[Zero[One[One[Two[One[Two[Zero[Zero[Zero[One[One[Zero[Two[One[One[Two[Zero[Zero[Two[Zero[One[Two[One[One[One[Two[One[One[Zero[Zero[One[Two[Zero[Two[Zero[Zero[Zero[One[One[Zero[Two[Zero[Zero[Zero[One[Two[Zero[Zero[Zero[Zero[One[One[One[Zero[One[Two[Two[Two[One[Two[One[One[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  type t1013375103818354974699381224216941398225652101853088 = Zero[Zero[Two[One[One[Zero[Two[Two[Zero[One[Zero[One[Zero[One[Zero[Zero[Zero[Zero[Zero[One[Two[Zero[Zero[Zero[Two[Zero[One[Two[Two[Zero[Zero[Zero[Two[One[Two[Zero[Zero[One[One[One[Two[Two[Zero[One[Zero[One[Two[Two[Two[One[Two[Zero[Two[Two[Two[One[Two[Zero[Two[One[One[Zero[Zero[Two[Two[Two[One[Two[Zero[One[One[Zero[Zero[One[Two[One[Two[Zero[Zero[One[Zero[One[Zero[Two[Two[One[Two[Two[Zero[One[One[Zero[One[Zero[One[One[One[One[Two[Zero[One[One[Two[Zero[Zero[Two[Two[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]

  // Compiler stack overflow
  // sum[t401422602123193590141631333690802526614264227921188, t611952501695161384557749890526138871611387873931900]: t1013375103818354974699381224216941398225652101853088

}
