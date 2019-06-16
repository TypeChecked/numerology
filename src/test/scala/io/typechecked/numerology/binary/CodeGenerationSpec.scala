package io.typechecked
package numerology
package binary

import org.scalatest._

class CodeGenerationSpec extends FlatSpec with Matchers {

  "CodeGeneration" should "produce correct reverse binary expansions" in {

    CodeGeneration.generate(0) shouldBe "final class b0 extends BNat"
    CodeGeneration.generate(1) shouldBe "type b1 = One[b0]"
    CodeGeneration.generate(2) shouldBe "type b2 = Zero[One[b0]]"
    CodeGeneration.generate(3) shouldBe "type b3 = One[One[b0]]"
    CodeGeneration.generate(4) shouldBe "type b4 = Zero[Zero[One[b0]]]"
    CodeGeneration.generate(8) shouldBe "type b8 = Zero[Zero[Zero[One[b0]]]]"
    CodeGeneration.generate(10) shouldBe "type b10 = Zero[One[Zero[One[b0]]]]"
    CodeGeneration.generate(423644304720L) shouldBe "type b423644304720 = Zero[Zero[Zero[Zero[One[Zero[One[Zero[One[Zero[One[Zero[One[Zero[Zero[Zero[One[One[Zero[One[Zero[One[Zero[Zero[One[One[Zero[Zero[Zero[One[Zero[One[Zero[One[Zero[Zero[Zero[One[One[b0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]"

    // Nested definitions
    CodeGeneration.toBinaryExpansion(75) shouldBe s"One[${CodeGeneration.toBinaryExpansion(37)}]"
    CodeGeneration.toBinaryExpansion(1543) shouldBe s"One[${CodeGeneration.toBinaryExpansion((1543 - 1) / 2)}]"
  }
}
