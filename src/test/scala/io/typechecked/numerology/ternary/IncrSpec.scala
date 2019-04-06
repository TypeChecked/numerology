package io.typechecked
package numerology
package ternary

import org.scalatest._
import TNat._

class IncrSpec extends FlatSpec with Matchers {

  def incrOpt[A <: TNat](implicit i: Incr[A]): Option[i.Out] =
    Option.empty[i.Out]  // Hack because there are no values of type i.Out

  "Incr" should "add one to a TNat" in {
    incrOpt[t0]: Option[t1]
    incrOpt[t1]: Option[t2]
    incrOpt[t2]: Option[t3]
    incrOpt[t3]: Option[t4]
    incrOpt[t4]: Option[t5]
    incrOpt[t5]: Option[t6]
    incrOpt[t6]: Option[t7]
    incrOpt[t7]: Option[t8]
    incrOpt[t8]: Option[t9]
    incrOpt[t9]: Option[t10]
    incrOpt[t10]: Option[t11]
    incrOpt[t61]: Option[t62]
    incrOpt[t64]: Option[t65]
    incrOpt[t65]: Option[t66]
    incrOpt[t66]: Option[t67]
    incrOpt[t75]: Option[t76]
    incrOpt[t76]: Option[t77]
    incrOpt[t77]: Option[t78]
    incrOpt[t78]: Option[t79]
    incrOpt[t90]: Option[t91]
    incrOpt[t92]: Option[t93]
    incrOpt[t93]: Option[t94]
    incrOpt[t94]: Option[t95]
    incrOpt[t95]: Option[t96]
    incrOpt[t96]: Option[t97]
    incrOpt[t98]: Option[t99]
    incrOpt[t100]: Option[t101]
    incrOpt[t161]: Option[t162]
    incrOpt[t162]: Option[t163]
    incrOpt[t163]: Option[t164]
    incrOpt[t164]: Option[t165]
    incrOpt[t168]: Option[t169]
    incrOpt[t169]: Option[t170]
    incrOpt[t170]: Option[t171]
    incrOpt[t171]: Option[t172]
    incrOpt[t174]: Option[t175]
    incrOpt[t178]: Option[t179]
    incrOpt[t179]: Option[t180]
    incrOpt[t180]: Option[t181]
    incrOpt[t181]: Option[t182]
    incrOpt[t182]: Option[t183]
    incrOpt[t183]: Option[t184]
    incrOpt[t184]: Option[t185]
    incrOpt[t185]: Option[t186]
    incrOpt[t198]: Option[t199]
    incrOpt[t199]: Option[t200]
    incrOpt[t200]: Option[Zero[t67]]
  }
}
