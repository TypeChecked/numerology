package io.typechecked
package numerology
package ternary

object BenchmarkMult {

  def mult[M <: TNat, N <: TNat](implicit m: Mult[M, N]): m.Out = ???

  // 10^18
  type t3623159657334655154 = Two[Zero[Two[Zero[One[One[One[Zero[Two[One[One[Zero[Zero[Zero[One[Two[One[Two[One[One[One[One[Zero[Two[Zero[Two[Zero[Zero[One[One[Two[Zero[Two[Zero[One[Zero[Zero[Two[Two[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  type t7484613168431353138 = One[Two[Zero[Zero[Zero[Two[Two[Zero[Two[One[Zero[Zero[One[One[Zero[Two[Zero[Zero[Two[Two[Two[One[Two[Two[Zero[Zero[Two[One[Two[Zero[One[Zero[One[Two[One[Two[One[One[Two[One[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]

  // Their product
  type t27117948482616189036033776088825773252 = Two[One[Zero[Two[Two[One[Zero[Zero[One[One[Zero[One[One[Zero[One[Two[Zero[Two[Two[One[Zero[Two[One[Two[Zero[One[One[Zero[Zero[Zero[Two[One[Two[Two[Zero[Two[Zero[One[One[Two[One[Zero[One[One[Zero[Two[Two[Zero[One[One[Zero[Zero[One[Two[Two[One[Two[Zero[Zero[Two[Zero[One[Zero[One[Two[Two[One[One[One[One[Zero[Two[Zero[Two[One[Two[Two[One[One[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]

  // 4s
  mult[t3623159657334655154, t7484613168431353138]: t27117948482616189036033776088825773252


  // 10^27
  type t6862134337616076187979017153 = One[Zero[Two[Zero[Two[One[One[Zero[Zero[Two[One[One[One[One[Two[Two[Zero[Two[Zero[Two[Zero[One[One[Zero[One[Two[Two[Two[Two[One[Two[Two[Two[Zero[Two[Two[Zero[Zero[Zero[Zero[One[Zero[Two[One[One[One[One[Two[Two[One[Zero[Zero[Zero[Zero[One[Zero[One[One[One[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  type t1183015878653188467097883862 = Zero[Two[One[Zero[Two[Two[Two[Two[Two[Zero[One[One[Two[Two[One[One[Two[Two[Zero[One[One[Zero[One[One[Two[One[Two[Two[Zero[One[One[One[One[Two[One[Zero[Zero[One[Zero[One[One[Two[Zero[Two[Two[Two[Two[Two[One[Two[Zero[Zero[Zero[One[Two[Zero[Two[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]

  // Their product
  type t8118013882851097807444087473143246786900398624899884886 = Zero[Two[One[One[Two[One[Zero[One[Zero[Zero[One[Two[Zero[One[One[Two[Two[Zero[Two[One[Zero[Two[One[Zero[One[Two[One[Zero[One[One[Zero[Two[One[One[Two[Two[Two[Zero[Zero[Zero[One[Zero[Zero[Two[One[Two[Two[One[Two[Zero[One[Zero[Two[Two[One[One[One[Zero[Two[One[Zero[Zero[Zero[Zero[Zero[Two[One[Two[Two[Zero[One[Two[Zero[Two[One[One[Zero[Two[One[Zero[Zero[Two[Two[Zero[Zero[Two[One[Zero[Zero[Zero[Two[Zero[One[One[Two[Zero[One[One[Zero[Zero[Zero[One[Zero[Zero[One[Zero[One[Two[Zero[Two[Two[One[Two[Zero[Zero[One[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]

  // 18s
  mult[t6862134337616076187979017153, t1183015878653188467097883862]: t8118013882851097807444087473143246786900398624899884886


  // 10^35
  type t563212342332380871279452964893563959 = Zero[Two[Zero[Two[Zero[Zero[Zero[Zero[Zero[Zero[One[Zero[Zero[One[Zero[Zero[Zero[One[Two[One[One[One[Zero[One[Two[One[Zero[One[Two[One[Zero[Two[Two[Two[Two[Two[Two[Zero[Two[One[One[Two[Zero[One[Zero[Two[Two[Zero[Two[Two[One[Zero[Zero[Two[Zero[One[Zero[Two[One[One[One[Zero[Zero[Two[Zero[Zero[Zero[Zero[Zero[Zero[Zero[Zero[One[Two[Two[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  type t271227108623436250455334138632430344 = Zero[Zero[One[Two[Two[One[Zero[Two[Two[Two[Zero[One[One[One[One[Two[One[Two[Zero[Two[Zero[Zero[Two[One[Zero[Two[Zero[Two[Zero[Two[One[Zero[Zero[Zero[One[Two[Two[Two[Zero[One[Two[Zero[Two[One[Two[Zero[Two[One[One[One[One[Two[Two[One[One[One[Two[Two[Two[Two[Zero[Zero[One[Zero[Zero[Two[One[Zero[Zero[One[Zero[Zero[Zero[One[One[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]

  // Their product
  type t152758455151844629385511878215369867815257805377753115738588919976371896 = Zero[Zero[Zero[Two[One[One[Two[Zero[Two[Zero[One[One[Zero[One[Two[Two[One[Two[Two[Zero[Two[Zero[Two[Zero[Two[One[One[Zero[Zero[Two[One[Zero[One[Zero[Two[One[Two[Two[One[One[One[Zero[One[Zero[Zero[Two[Two[Zero[One[Two[One[One[One[One[Two[Two[One[Two[Two[Two[Zero[Zero[One[Two[One[Two[One[Two[One[One[Zero[Zero[Zero[Two[One[One[Zero[One[Two[Two[Two[Zero[Two[One[Two[Two[Two[One[Two[One[Two[Two[Zero[One[Zero[Zero[Zero[Zero[Two[Zero[One[Two[One[Two[Two[One[Two[Two[Two[Zero[One[One[One[Zero[One[Zero[Zero[Zero[Zero[Zero[Two[Zero[Zero[One[Two[Two[Zero[Two[One[Two[Two[Zero[Zero[Zero[Zero[One[Two[Two[Zero[Two[One[Two[Two[Two[Zero[One[Zero[Two[Zero[One[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]

  // 30s
  mult[t563212342332380871279452964893563959, t271227108623436250455334138632430344]: t152758455151844629385511878215369867815257805377753115738588919976371896

  // 10^42
  type t5632123423323808712794529648935639591408604650 = One[One[Two[Zero[One[Two[Zero[Two[One[One[One[One[Zero[Zero[Two[One[Two[Two[Two[Two[Two[Two[Two[Zero[Zero[One[Zero[One[One[Zero[One[One[Two[One[One[Two[One[One[One[One[Two[Zero[Zero[Two[One[One[Zero[One[Two[Two[Two[One[Two[Zero[One[Two[Two[One[One[One[Two[One[One[Zero[One[Zero[One[One[One[Zero[One[Zero[One[Two[One[One[Two[Zero[One[Two[Two[One[Zero[Zero[Zero[Zero[Zero[Two[Two[Zero[Zero[Two[Two[Two[One[Two[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  type t2712271086234362504553341386324303443695104072 = One[Zero[Two[One[Two[Zero[Zero[One[One[One[Zero[Two[One[One[Zero[Zero[Two[Two[One[One[One[Two[Two[Two[Two[One[Two[One[Two[Zero[One[One[Zero[One[Two[Zero[Two[Zero[Two[Zero[One[One[One[Two[Two[One[Zero[One[Zero[Zero[Two[One[Zero[Zero[One[One[Zero[Two[One[One[Two[One[Two[One[Zero[One[One[One[Zero[Zero[Two[Zero[Two[Two[Two[Zero[Zero[One[Zero[One[One[Zero[One[One[Two[Zero[One[Two[Zero[Two[One[One[One[Two[Zero[One[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]

  // Their product
  type t15275845515184462938551187821536986806157580397435970936754519852557862153733347258053134800 = One[One[One[One[Zero[Zero[Zero[Two[One[One[One[Two[One[One[Zero[One[One[Two[One[Zero[Two[One[One[One[Zero[Two[Two[Zero[Zero[Zero[Zero[Zero[Two[One[Zero[Zero[Two[One[Zero[Two[One[Zero[Zero[One[Two[Two[Zero[One[Two[Two[Zero[One[Zero[One[Two[One[One[Zero[One[Two[Zero[One[Two[One[Zero[One[Zero[Two[Zero[Two[One[Two[Two[One[Two[Zero[One[Two[Two[Two[One[Two[Zero[One[One[Zero[Two[One[One[Zero[Zero[Two[Two[One[Two[Two[Zero[Two[One[Zero[Two[Zero[Two[Two[One[Two[Zero[One[Two[One[One[One[One[Zero[Two[Two[Two[Zero[Zero[One[Zero[One[One[Zero[Two[One[One[Two[Two[Zero[One[One[One[Zero[Two[One[Two[Two[One[Zero[One[Zero[Two[Two[Two[One[Zero[Zero[Two[Zero[Two[One[Two[One[Two[One[Zero[Two[Zero[Two[One[Zero[Two[One[One[Two[Two[One[Zero[Two[Two[One[Two[Zero[Zero[Zero[Two[Zero[Zero[Zero[One[Zero[Zero[Two[Zero[Zero[Two[One[Zero[One[Zero[One[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]

  // mult[t5632123423323808712794529648935639591408604650, t2712271086234362504553341386324303443695104072]: t15275845515184462938551187821536986806157580397435970936754519852557862153733347258053134800
  /*
  The above does not compile. Produces the fantastic error:

    [info] Compiling 1 Scala source to /Users/james/code/numerology/target/scala-2.12/bench-classes ...
    [error] Could not write class io/typechecked/numerology/ternary/BenchmarkMult$ because it exceeds JVM code size limits. Method <init>'s code too large!
    [error] one error found
    [error] (Bench / compileIncremental) Compilation failed
    [error] Total time: 95 s

  */

}
