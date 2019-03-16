package io.typechecked
package numerology
package binary

import org.scalatest._
import shapeless.test.illTyped

class ComparisonsSpec extends FlatSpec with Matchers {

  import BNat._

  def lte[A <: BNat, B <: BNat](implicit ev: A Lte B) = null
  def lt[A <: BNat, B <: BNat](implicit ev: A Lt B) = null
  def gte[A <: BNat, B <: BNat](implicit ev: A Gte B) = null
  def gt[A <: BNat, B <: BNat](implicit ev: A Gt B) = null

  "Lte" should "work correctly for BNat" in {
    lte[b0, b1]
    lte[b0, b56]
    lte[b0, b0]
    lte[b86, b86]
    lte[b85, b86]
    illTyped("lte[b87, b86]")
    lte[b10, b167]
    illTyped("lte[b11, b10]")
    illTyped("lte[b1, b0]")
    illTyped("lte[b199, b0]")
    illTyped("lte[b143, b87]")
  }

  "Lt" should "work correctly for BNat" in {
    lt[b0, b1]
    lt[b0, b56]
    illTyped("lt[b0, b0]")
    illTyped("lt[b86, b86]")
    lt[b85, b86]
    illTyped("lt[b87, b86]")
    lt[b10, b167]
    illTyped("lt[b11, b10]")
    illTyped("lt[b1, b0]")
    illTyped("lt[b199, b0]")
    illTyped("lt[b143, b87]")
  }

  "Gte" should "work correctly for BNat" in {
    illTyped("gte[b0, b1]")
    illTyped("gte[b0, b56]")
    gte[b0, b0]
    illTyped("gte[b85, b86]")
    gte[b87, b86]
    illTyped("gte[b10, b167]")
    gte[b11, b10]
    gte[b1, b0]
    gte[b199, b0]
    gte[b143, b87]
  }

  "Gt" should "work correctly for BNat" in {
    illTyped("gt[b0, b1]")
    illTyped("gt[b0, b56]")
    illTyped("gt[b0, b0]")
    illTyped("gt[b86, b86]")
    illTyped("gt[b85, b86]")
    gt[b87, b86]
    illTyped("gt[b10, b167]")
    gt[b11, b10]
    gt[b1, b0]
    gt[b199, b0]
    gt[b143, b87]
  }

}
