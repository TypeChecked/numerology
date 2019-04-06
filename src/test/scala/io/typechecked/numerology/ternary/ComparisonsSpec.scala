package io.typechecked
package numerology
package ternary

import org.scalatest._
import shapeless.test.illTyped

class ComparisonsSpec extends FlatSpec with Matchers {

  import TNat._

  def lte[A <: TNat, B <: TNat](implicit ev: A Lte B) = null
  def lt[A <: TNat, B <: TNat](implicit ev: A Lt B) = null
  def gte[A <: TNat, B <: TNat](implicit ev: A Gte B) = null
  def gt[A <: TNat, B <: TNat](implicit ev: A Gt B) = null

  "Lte" should "work correctly for TNat" in {
    lte[t0, t1]
    lte[t0, t56]
    lte[t0, t0]
    lte[t86, t86]
    lte[t85, t86]
    illTyped("lte[t87, t86]")
    lte[t10, t167]
    illTyped("lte[t11, t10]")
    illTyped("lte[t1, t0]")
    illTyped("lte[t199, t0]")
    illTyped("lte[t143, t87]")
  }

  "Lt" should "work correctly for TNat" in {
    lt[t0, t1]
    lt[t0, t56]
    illTyped("lt[t0, t0]")
    illTyped("lt[t86, t86]")
    lt[t85, t86]
    illTyped("lt[t87, t86]")
    lt[t10, t167]
    illTyped("lt[t11, t10]")
    illTyped("lt[t1, t0]")
    illTyped("lt[t199, t0]")
    illTyped("lt[t143, t87]")
  }

  "Gte" should "work correctly for TNat" in {
    illTyped("gte[t0, t1]")
    illTyped("gte[t0, t56]")
    gte[t0, t0]
    illTyped("gte[t85, t86]")
    gte[t87, t86]
    illTyped("gte[t10, t167]")
    gte[t11, t10]
    gte[t1, t0]
    gte[t199, t0]
    gte[t143, t87]
  }

  "Gt" should "work correctly for TNat" in {
    illTyped("gt[t0, t1]")
    illTyped("gt[t0, t56]")
    illTyped("gt[t0, t0]")
    illTyped("gt[t86, t86]")
    illTyped("gt[t85, t86]")
    gt[t87, t86]
    illTyped("gt[t10, t167]")
    gt[t11, t10]
    gt[t1, t0]
    gt[t199, t0]
    gt[t143, t87]
  }

}
