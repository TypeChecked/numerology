package io.typechecked
package numerology
package ternary

import org.scalatest._

class CodeGenerationSpec extends FlatSpec with Matchers {

  "CodeGeneration" should "produce correct reverse ternary expansions" in {

    CodeGeneration.generate(0) shouldBe "final class t0 extends TNat"
    CodeGeneration.generate(1) shouldBe "type t1 = One[t0]"
    CodeGeneration.generate(2) shouldBe "type t2 = Two[t0]"
    CodeGeneration.generate(3) shouldBe "type t3 = Zero[One[t0]]"
    CodeGeneration.generate(4) shouldBe "type t4 = One[One[t0]]"
    CodeGeneration.generate(8) shouldBe "type t8 = Two[Two[t0]]"
    CodeGeneration.generate(10) shouldBe "type t10 = One[Zero[One[t0]]]"
    CodeGeneration.generate(423644304720l) shouldBe "type t423644304720 = Zero[One[One[One[One[One[One[One[One[One[One[One[One[One[One[One[One[One[One[One[One[One[One[One[One[t0]]]]]]]]]]]]]]]]]]]]]]]]]"

    // Nested definitions
    CodeGeneration.toTernaryExpansion(75) shouldBe s"Zero[${CodeGeneration.toTernaryExpansion(25)}]"
    CodeGeneration.toTernaryExpansion(1543) shouldBe s"One[${CodeGeneration.toTernaryExpansion((1543 - 1) / 3)}]"
  }
}
