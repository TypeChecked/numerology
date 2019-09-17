package io.typechecked
package numerology
package ternary

sealed trait TNat

// Positive int -- TODO Could replace with implicit =:!= t0
sealed trait TNonZero extends TNat

// Recursive definition
sealed trait TOperation[N <: TNat] extends TNonZero

trait Zero[T <: TNat] extends TOperation[T]   // Zero[t] = 3t + 0
trait One[T <: TNat] extends TOperation[T]    // One[t] = 3t + 1
trait Two[T <: TNat] extends TOperation[T]    // Two[t] = 3t + 2

object TNat {

  final class t0 extends TNat

  type t1 = One[t0]
  type t2 = Two[t0]
  type t3 = Zero[One[t0]]
  type t4 = One[One[t0]]
  type t5 = Two[One[t0]]
  type t6 = Zero[Two[t0]]
  type t7 = One[Two[t0]]
  type t8 = Two[Two[t0]]
  type t9 = Zero[Zero[One[t0]]]
  type t10 = One[Zero[One[t0]]]
  type t11 = Two[Zero[One[t0]]]
  type t12 = Zero[One[One[t0]]]
  type t13 = One[One[One[t0]]]
  type t14 = Two[One[One[t0]]]
  type t15 = Zero[Two[One[t0]]]
  type t16 = One[Two[One[t0]]]
  type t17 = Two[Two[One[t0]]]
  type t18 = Zero[Zero[Two[t0]]]
  type t19 = One[Zero[Two[t0]]]
  type t20 = Two[Zero[Two[t0]]]
  type t21 = Zero[One[Two[t0]]]
  type t22 = One[One[Two[t0]]]
  type t23 = Two[One[Two[t0]]]
  type t24 = Zero[Two[Two[t0]]]
  type t25 = One[Two[Two[t0]]]
  type t26 = Two[Two[Two[t0]]]
  type t27 = Zero[Zero[Zero[One[t0]]]]
  type t28 = One[Zero[Zero[One[t0]]]]
  type t29 = Two[Zero[Zero[One[t0]]]]
  type t30 = Zero[One[Zero[One[t0]]]]
  type t31 = One[One[Zero[One[t0]]]]
  type t32 = Two[One[Zero[One[t0]]]]
  type t33 = Zero[Two[Zero[One[t0]]]]
  type t34 = One[Two[Zero[One[t0]]]]
  type t35 = Two[Two[Zero[One[t0]]]]
  type t36 = Zero[Zero[One[One[t0]]]]
  type t37 = One[Zero[One[One[t0]]]]
  type t38 = Two[Zero[One[One[t0]]]]
  type t39 = Zero[One[One[One[t0]]]]
  type t40 = One[One[One[One[t0]]]]
  type t41 = Two[One[One[One[t0]]]]
  type t42 = Zero[Two[One[One[t0]]]]
  type t43 = One[Two[One[One[t0]]]]
  type t44 = Two[Two[One[One[t0]]]]
  type t45 = Zero[Zero[Two[One[t0]]]]
  type t46 = One[Zero[Two[One[t0]]]]
  type t47 = Two[Zero[Two[One[t0]]]]
  type t48 = Zero[One[Two[One[t0]]]]
  type t49 = One[One[Two[One[t0]]]]
  type t50 = Two[One[Two[One[t0]]]]
  type t51 = Zero[Two[Two[One[t0]]]]
  type t52 = One[Two[Two[One[t0]]]]
  type t53 = Two[Two[Two[One[t0]]]]
  type t54 = Zero[Zero[Zero[Two[t0]]]]
  type t55 = One[Zero[Zero[Two[t0]]]]
  type t56 = Two[Zero[Zero[Two[t0]]]]
  type t57 = Zero[One[Zero[Two[t0]]]]
  type t58 = One[One[Zero[Two[t0]]]]
  type t59 = Two[One[Zero[Two[t0]]]]
  type t60 = Zero[Two[Zero[Two[t0]]]]
  type t61 = One[Two[Zero[Two[t0]]]]
  type t62 = Two[Two[Zero[Two[t0]]]]
  type t63 = Zero[Zero[One[Two[t0]]]]
  type t64 = One[Zero[One[Two[t0]]]]
  type t65 = Two[Zero[One[Two[t0]]]]
  type t66 = Zero[One[One[Two[t0]]]]
  type t67 = One[One[One[Two[t0]]]]
  type t68 = Two[One[One[Two[t0]]]]
  type t69 = Zero[Two[One[Two[t0]]]]
  type t70 = One[Two[One[Two[t0]]]]
  type t71 = Two[Two[One[Two[t0]]]]
  type t72 = Zero[Zero[Two[Two[t0]]]]
  type t73 = One[Zero[Two[Two[t0]]]]
  type t74 = Two[Zero[Two[Two[t0]]]]
  type t75 = Zero[One[Two[Two[t0]]]]
  type t76 = One[One[Two[Two[t0]]]]
  type t77 = Two[One[Two[Two[t0]]]]
  type t78 = Zero[Two[Two[Two[t0]]]]
  type t79 = One[Two[Two[Two[t0]]]]
  type t80 = Two[Two[Two[Two[t0]]]]
  type t81 = Zero[Zero[Zero[Zero[One[t0]]]]]
  type t82 = One[Zero[Zero[Zero[One[t0]]]]]
  type t83 = Two[Zero[Zero[Zero[One[t0]]]]]
  type t84 = Zero[One[Zero[Zero[One[t0]]]]]
  type t85 = One[One[Zero[Zero[One[t0]]]]]
  type t86 = Two[One[Zero[Zero[One[t0]]]]]
  type t87 = Zero[Two[Zero[Zero[One[t0]]]]]
  type t88 = One[Two[Zero[Zero[One[t0]]]]]
  type t89 = Two[Two[Zero[Zero[One[t0]]]]]
  type t90 = Zero[Zero[One[Zero[One[t0]]]]]
  type t91 = One[Zero[One[Zero[One[t0]]]]]
  type t92 = Two[Zero[One[Zero[One[t0]]]]]
  type t93 = Zero[One[One[Zero[One[t0]]]]]
  type t94 = One[One[One[Zero[One[t0]]]]]
  type t95 = Two[One[One[Zero[One[t0]]]]]
  type t96 = Zero[Two[One[Zero[One[t0]]]]]
  type t97 = One[Two[One[Zero[One[t0]]]]]
  type t98 = Two[Two[One[Zero[One[t0]]]]]
  type t99 = Zero[Zero[Two[Zero[One[t0]]]]]

  type t100 = One[Zero[Two[Zero[One[t0]]]]]
  type t101 = Two[Zero[Two[Zero[One[t0]]]]]
  type t102 = Zero[One[Two[Zero[One[t0]]]]]
  type t103 = One[One[Two[Zero[One[t0]]]]]
  type t104 = Two[One[Two[Zero[One[t0]]]]]
  type t105 = Zero[Two[Two[Zero[One[t0]]]]]
  type t106 = One[Two[Two[Zero[One[t0]]]]]
  type t107 = Two[Two[Two[Zero[One[t0]]]]]
  type t108 = Zero[Zero[Zero[One[One[t0]]]]]
  type t109 = One[Zero[Zero[One[One[t0]]]]]
  type t110 = Two[Zero[Zero[One[One[t0]]]]]
  type t111 = Zero[One[Zero[One[One[t0]]]]]
  type t112 = One[One[Zero[One[One[t0]]]]]
  type t113 = Two[One[Zero[One[One[t0]]]]]
  type t114 = Zero[Two[Zero[One[One[t0]]]]]
  type t115 = One[Two[Zero[One[One[t0]]]]]
  type t116 = Two[Two[Zero[One[One[t0]]]]]
  type t117 = Zero[Zero[One[One[One[t0]]]]]
  type t118 = One[Zero[One[One[One[t0]]]]]
  type t119 = Two[Zero[One[One[One[t0]]]]]
  type t120 = Zero[One[One[One[One[t0]]]]]
  type t121 = One[One[One[One[One[t0]]]]]
  type t122 = Two[One[One[One[One[t0]]]]]
  type t123 = Zero[Two[One[One[One[t0]]]]]
  type t124 = One[Two[One[One[One[t0]]]]]
  type t125 = Two[Two[One[One[One[t0]]]]]
  type t126 = Zero[Zero[Two[One[One[t0]]]]]
  type t127 = One[Zero[Two[One[One[t0]]]]]
  type t128 = Two[Zero[Two[One[One[t0]]]]]
  type t129 = Zero[One[Two[One[One[t0]]]]]
  type t130 = One[One[Two[One[One[t0]]]]]
  type t131 = Two[One[Two[One[One[t0]]]]]
  type t132 = Zero[Two[Two[One[One[t0]]]]]
  type t133 = One[Two[Two[One[One[t0]]]]]
  type t134 = Two[Two[Two[One[One[t0]]]]]
  type t135 = Zero[Zero[Zero[Two[One[t0]]]]]
  type t136 = One[Zero[Zero[Two[One[t0]]]]]
  type t137 = Two[Zero[Zero[Two[One[t0]]]]]
  type t138 = Zero[One[Zero[Two[One[t0]]]]]
  type t139 = One[One[Zero[Two[One[t0]]]]]
  type t140 = Two[One[Zero[Two[One[t0]]]]]
  type t141 = Zero[Two[Zero[Two[One[t0]]]]]
  type t142 = One[Two[Zero[Two[One[t0]]]]]
  type t143 = Two[Two[Zero[Two[One[t0]]]]]
  type t144 = Zero[Zero[One[Two[One[t0]]]]]
  type t145 = One[Zero[One[Two[One[t0]]]]]
  type t146 = Two[Zero[One[Two[One[t0]]]]]
  type t147 = Zero[One[One[Two[One[t0]]]]]
  type t148 = One[One[One[Two[One[t0]]]]]
  type t149 = Two[One[One[Two[One[t0]]]]]
  type t150 = Zero[Two[One[Two[One[t0]]]]]
  type t151 = One[Two[One[Two[One[t0]]]]]
  type t152 = Two[Two[One[Two[One[t0]]]]]
  type t153 = Zero[Zero[Two[Two[One[t0]]]]]
  type t154 = One[Zero[Two[Two[One[t0]]]]]
  type t155 = Two[Zero[Two[Two[One[t0]]]]]
  type t156 = Zero[One[Two[Two[One[t0]]]]]
  type t157 = One[One[Two[Two[One[t0]]]]]
  type t158 = Two[One[Two[Two[One[t0]]]]]
  type t159 = Zero[Two[Two[Two[One[t0]]]]]
  type t160 = One[Two[Two[Two[One[t0]]]]]
  type t161 = Two[Two[Two[Two[One[t0]]]]]
  type t162 = Zero[Zero[Zero[Zero[Two[t0]]]]]
  type t163 = One[Zero[Zero[Zero[Two[t0]]]]]
  type t164 = Two[Zero[Zero[Zero[Two[t0]]]]]
  type t165 = Zero[One[Zero[Zero[Two[t0]]]]]
  type t166 = One[One[Zero[Zero[Two[t0]]]]]
  type t167 = Two[One[Zero[Zero[Two[t0]]]]]
  type t168 = Zero[Two[Zero[Zero[Two[t0]]]]]
  type t169 = One[Two[Zero[Zero[Two[t0]]]]]
  type t170 = Two[Two[Zero[Zero[Two[t0]]]]]
  type t171 = Zero[Zero[One[Zero[Two[t0]]]]]
  type t172 = One[Zero[One[Zero[Two[t0]]]]]
  type t173 = Two[Zero[One[Zero[Two[t0]]]]]
  type t174 = Zero[One[One[Zero[Two[t0]]]]]
  type t175 = One[One[One[Zero[Two[t0]]]]]
  type t176 = Two[One[One[Zero[Two[t0]]]]]
  type t177 = Zero[Two[One[Zero[Two[t0]]]]]
  type t178 = One[Two[One[Zero[Two[t0]]]]]
  type t179 = Two[Two[One[Zero[Two[t0]]]]]
  type t180 = Zero[Zero[Two[Zero[Two[t0]]]]]
  type t181 = One[Zero[Two[Zero[Two[t0]]]]]
  type t182 = Two[Zero[Two[Zero[Two[t0]]]]]
  type t183 = Zero[One[Two[Zero[Two[t0]]]]]
  type t184 = One[One[Two[Zero[Two[t0]]]]]
  type t185 = Two[One[Two[Zero[Two[t0]]]]]
  type t186 = Zero[Two[Two[Zero[Two[t0]]]]]
  type t187 = One[Two[Two[Zero[Two[t0]]]]]
  type t188 = Two[Two[Two[Zero[Two[t0]]]]]
  type t189 = Zero[Zero[Zero[One[Two[t0]]]]]
  type t190 = One[Zero[Zero[One[Two[t0]]]]]
  type t191 = Two[Zero[Zero[One[Two[t0]]]]]
  type t192 = Zero[One[Zero[One[Two[t0]]]]]
  type t193 = One[One[Zero[One[Two[t0]]]]]
  type t194 = Two[One[Zero[One[Two[t0]]]]]
  type t195 = Zero[Two[Zero[One[Two[t0]]]]]
  type t196 = One[Two[Zero[One[Two[t0]]]]]
  type t197 = Two[Two[Zero[One[Two[t0]]]]]
  type t198 = Zero[Zero[One[One[Two[t0]]]]]
  type t199 = One[Zero[One[One[Two[t0]]]]]

  type t200 = Two[Zero[One[One[Two[t0]]]]]
  type t201 = Zero[One[One[One[Two[t0]]]]]
  type t202 = One[One[One[One[Two[t0]]]]]
  type t203 = Two[One[One[One[Two[t0]]]]]
  type t204 = Zero[Two[One[One[Two[t0]]]]]
  type t205 = One[Two[One[One[Two[t0]]]]]
  type t206 = Two[Two[One[One[Two[t0]]]]]
  type t207 = Zero[Zero[Two[One[Two[t0]]]]]
  type t208 = One[Zero[Two[One[Two[t0]]]]]
  type t209 = Two[Zero[Two[One[Two[t0]]]]]
  type t210 = Zero[One[Two[One[Two[t0]]]]]
  type t211 = One[One[Two[One[Two[t0]]]]]
  type t212 = Two[One[Two[One[Two[t0]]]]]
  type t213 = Zero[Two[Two[One[Two[t0]]]]]
  type t214 = One[Two[Two[One[Two[t0]]]]]
  type t215 = Two[Two[Two[One[Two[t0]]]]]
  type t216 = Zero[Zero[Zero[Two[Two[t0]]]]]
  type t217 = One[Zero[Zero[Two[Two[t0]]]]]
  type t218 = Two[Zero[Zero[Two[Two[t0]]]]]
  type t219 = Zero[One[Zero[Two[Two[t0]]]]]
  type t220 = One[One[Zero[Two[Two[t0]]]]]
  type t221 = Two[One[Zero[Two[Two[t0]]]]]
  type t222 = Zero[Two[Zero[Two[Two[t0]]]]]
  type t223 = One[Two[Zero[Two[Two[t0]]]]]
  type t224 = Two[Two[Zero[Two[Two[t0]]]]]
  type t225 = Zero[Zero[One[Two[Two[t0]]]]]
  type t226 = One[Zero[One[Two[Two[t0]]]]]
  type t227 = Two[Zero[One[Two[Two[t0]]]]]
  type t228 = Zero[One[One[Two[Two[t0]]]]]
  type t229 = One[One[One[Two[Two[t0]]]]]
  type t230 = Two[One[One[Two[Two[t0]]]]]
  type t231 = Zero[Two[One[Two[Two[t0]]]]]
  type t232 = One[Two[One[Two[Two[t0]]]]]
  type t233 = Two[Two[One[Two[Two[t0]]]]]
  type t234 = Zero[Zero[Two[Two[Two[t0]]]]]
  type t235 = One[Zero[Two[Two[Two[t0]]]]]
  type t236 = Two[Zero[Two[Two[Two[t0]]]]]
  type t237 = Zero[One[Two[Two[Two[t0]]]]]
  type t238 = One[One[Two[Two[Two[t0]]]]]
  type t239 = Two[One[Two[Two[Two[t0]]]]]
  type t240 = Zero[Two[Two[Two[Two[t0]]]]]
  type t241 = One[Two[Two[Two[Two[t0]]]]]
  type t242 = Two[Two[Two[Two[Two[t0]]]]]
  type t243 = Zero[Zero[Zero[Zero[Zero[One[t0]]]]]]
  type t244 = One[Zero[Zero[Zero[Zero[One[t0]]]]]]
  type t245 = Two[Zero[Zero[Zero[Zero[One[t0]]]]]]
  type t246 = Zero[One[Zero[Zero[Zero[One[t0]]]]]]
  type t247 = One[One[Zero[Zero[Zero[One[t0]]]]]]
  type t248 = Two[One[Zero[Zero[Zero[One[t0]]]]]]
  type t249 = Zero[Two[Zero[Zero[Zero[One[t0]]]]]]
  type t250 = One[Two[Zero[Zero[Zero[One[t0]]]]]]
  type t251 = Two[Two[Zero[Zero[Zero[One[t0]]]]]]
  type t252 = Zero[Zero[One[Zero[Zero[One[t0]]]]]]
  type t253 = One[Zero[One[Zero[Zero[One[t0]]]]]]
  type t254 = Two[Zero[One[Zero[Zero[One[t0]]]]]]
  type t255 = Zero[One[One[Zero[Zero[One[t0]]]]]]
  type t256 = One[One[One[Zero[Zero[One[t0]]]]]]
  type t257 = Two[One[One[Zero[Zero[One[t0]]]]]]
  type t258 = Zero[Two[One[Zero[Zero[One[t0]]]]]]
  type t259 = One[Two[One[Zero[Zero[One[t0]]]]]]
  type t260 = Two[Two[One[Zero[Zero[One[t0]]]]]]
  type t261 = Zero[Zero[Two[Zero[Zero[One[t0]]]]]]
  type t262 = One[Zero[Two[Zero[Zero[One[t0]]]]]]
  type t263 = Two[Zero[Two[Zero[Zero[One[t0]]]]]]
  type t264 = Zero[One[Two[Zero[Zero[One[t0]]]]]]
  type t265 = One[One[Two[Zero[Zero[One[t0]]]]]]
  type t266 = Two[One[Two[Zero[Zero[One[t0]]]]]]
  type t267 = Zero[Two[Two[Zero[Zero[One[t0]]]]]]
  type t268 = One[Two[Two[Zero[Zero[One[t0]]]]]]
  type t269 = Two[Two[Two[Zero[Zero[One[t0]]]]]]
  type t270 = Zero[Zero[Zero[One[Zero[One[t0]]]]]]
  type t271 = One[Zero[Zero[One[Zero[One[t0]]]]]]
  type t272 = Two[Zero[Zero[One[Zero[One[t0]]]]]]
  type t273 = Zero[One[Zero[One[Zero[One[t0]]]]]]
  type t274 = One[One[Zero[One[Zero[One[t0]]]]]]
  type t275 = Two[One[Zero[One[Zero[One[t0]]]]]]
  type t276 = Zero[Two[Zero[One[Zero[One[t0]]]]]]
  type t277 = One[Two[Zero[One[Zero[One[t0]]]]]]
  type t278 = Two[Two[Zero[One[Zero[One[t0]]]]]]
  type t279 = Zero[Zero[One[One[Zero[One[t0]]]]]]
  type t280 = One[Zero[One[One[Zero[One[t0]]]]]]
  type t281 = Two[Zero[One[One[Zero[One[t0]]]]]]
  type t282 = Zero[One[One[One[Zero[One[t0]]]]]]
  type t283 = One[One[One[One[Zero[One[t0]]]]]]
  type t284 = Two[One[One[One[Zero[One[t0]]]]]]
  type t285 = Zero[Two[One[One[Zero[One[t0]]]]]]
  type t286 = One[Two[One[One[Zero[One[t0]]]]]]
  type t287 = Two[Two[One[One[Zero[One[t0]]]]]]
  type t288 = Zero[Zero[Two[One[Zero[One[t0]]]]]]
  type t289 = One[Zero[Two[One[Zero[One[t0]]]]]]
  type t290 = Two[Zero[Two[One[Zero[One[t0]]]]]]
  type t291 = Zero[One[Two[One[Zero[One[t0]]]]]]
  type t292 = One[One[Two[One[Zero[One[t0]]]]]]
  type t293 = Two[One[Two[One[Zero[One[t0]]]]]]
  type t294 = Zero[Two[Two[One[Zero[One[t0]]]]]]
  type t295 = One[Two[Two[One[Zero[One[t0]]]]]]
  type t296 = Two[Two[Two[One[Zero[One[t0]]]]]]
  type t297 = Zero[Zero[Zero[Two[Zero[One[t0]]]]]]
  type t298 = One[Zero[Zero[Two[Zero[One[t0]]]]]]
  type t299 = Two[Zero[Zero[Two[Zero[One[t0]]]]]]

  type t300 = Zero[One[Zero[Two[Zero[One[t0]]]]]]
  type t421 = One[Two[One[Zero[Two[One[t0]]]]]]
  type t607 = One[One[One[One[One[Two[t0]]]]]]
  type t1543 = One[One[Zero[Zero[One[Zero[Two[t0]]]]]]]
  type t2333 = Two[Zero[One[Two[One[Zero[Zero[One[t0]]]]]]]]
  type t4051 = One[Zero[Zero[Zero[Two[One[Two[One[t0]]]]]]]]
  type t48611 = Two[Zero[One[Zero[Zero[Two[Zero[One[One[Two[t0]]]]]]]]]]
  type t15485863 = One[One[One[One[Two[One[Two[Zero[Two[Zero[One[Zero[Two[Zero[Zero[One[t0]]]]]]]]]]]]]]]]
  type t2147483647 = One[Zero[One[Two[Zero[Two[Zero[One[One[Two[One[Two[Two[Two[One[Two[One[One[Two[One[t0]]]]]]]]]]]]]]]]]]]]
  type MaxInt = t2147483647

  type t2147483648 = Two[Zero[One[Two[Zero[Two[Zero[One[One[Two[One[Two[Two[Two[One[Two[One[One[Two[One[t0]]]]]]]]]]]]]]]]]]]]

  type t9223372036854775807 = One[Two[Two[Zero[Two[Two[One[Zero[One[Zero[Two[Two[One[Two[Zero[Zero[One[Zero[Two[Zero[One[Two[One[Zero[Zero[One[Two[Two[Two[Zero[One[One[Zero[Zero[One[One[One[Two[Zero[Two[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  type MaxLong = t9223372036854775807

  type t9223372036854775808 = Two[Two[Two[Zero[Two[Two[One[Zero[One[Zero[Two[Two[One[Two[Zero[Zero[One[Zero[Two[Zero[One[Two[One[Zero[Zero[One[Two[Two[Two[Zero[One[One[Zero[Zero[One[One[One[Two[Zero[Two[t0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]

}
