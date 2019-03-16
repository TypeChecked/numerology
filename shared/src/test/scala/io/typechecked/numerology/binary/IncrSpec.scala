package io.typechecked
package numerology
package binary

import org.scalatest._
import BNat._

class IncrSpec extends FlatSpec with Matchers {

  def incrOpt[A <: BNat](implicit i: Incr[A]): Option[i.Out] =
    Option.empty[i.Out]  // Hack because there are no values of type i.Out

  "Incr" should "add one to a BNat" in {
    incrOpt[b0]: Option[b1]
    incrOpt[b1]: Option[b2]
    incrOpt[b2]: Option[b3]
    incrOpt[b3]: Option[b4]
    incrOpt[b4]: Option[b5]
    incrOpt[b5]: Option[b6]
    incrOpt[b6]: Option[b7]
    incrOpt[b7]: Option[b8]
    incrOpt[b8]: Option[b9]
    incrOpt[b9]: Option[b10]
    incrOpt[b10]: Option[b11]
    incrOpt[b61]: Option[b62]
    incrOpt[b64]: Option[b65]
    incrOpt[b65]: Option[b66]
    incrOpt[b66]: Option[b67]
    incrOpt[b75]: Option[b76]
    incrOpt[b76]: Option[b77]
    incrOpt[b77]: Option[b78]
    incrOpt[b78]: Option[b79]
    incrOpt[b90]: Option[b91]
    incrOpt[b92]: Option[b93]
    incrOpt[b93]: Option[b94]
    incrOpt[b94]: Option[b95]
    incrOpt[b95]: Option[b96]
    incrOpt[b96]: Option[b97]
    incrOpt[b98]: Option[b99]
    incrOpt[b100]: Option[b101]
    incrOpt[b161]: Option[b162]
    incrOpt[b162]: Option[b163]
    incrOpt[b163]: Option[b164]
    incrOpt[b164]: Option[b165]
    incrOpt[b168]: Option[b169]
    incrOpt[b169]: Option[b170]
    incrOpt[b170]: Option[b171]
    incrOpt[b171]: Option[b172]
    incrOpt[b174]: Option[b175]
    incrOpt[b178]: Option[b179]
    incrOpt[b179]: Option[b180]
    incrOpt[b180]: Option[b181]
    incrOpt[b181]: Option[b182]
    incrOpt[b182]: Option[b183]
    incrOpt[b183]: Option[b184]
    incrOpt[b184]: Option[b185]
    incrOpt[b185]: Option[b186]
    incrOpt[b198]: Option[b199]
    incrOpt[b199]: Option[b200]
    incrOpt[b200]: Option[One[b100]]
  }
}
