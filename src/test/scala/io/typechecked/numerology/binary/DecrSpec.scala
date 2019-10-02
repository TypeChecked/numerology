package io.typechecked.numerology.binary

import io.typechecked.numerology.binary.BNat.{b0, b1, b2, b3}
import org.scalatest.{FlatSpec, Matchers}

class DecrSpec extends FlatSpec with Matchers {

  def decrOpt[A <: BNat](implicit i: Decr[A]): Option[i.Out] = Option.empty[i.Out]

  decrOpt[b1] : Option[b0]
  decrOpt[b2] : Option[b1]
  decrOpt[b3] : Option[b2]

}