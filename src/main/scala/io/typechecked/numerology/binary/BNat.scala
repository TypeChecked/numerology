package io.typechecked
package numerology
package binary

sealed trait BNat

sealed trait BNonZero extends BNat

final class b0 extends BNat

trait BOperation[N <: BNat] extends BNonZero

trait One[T <: BNat] extends BOperation[T]
trait Zero[T <: BNat] extends BOperation[T]

object BNat {

  type b1 = One[b0]
  type b2 = Zero[One[b0]]
  type b3 = One[One[b0]]
  type b4 = Zero[Zero[One[b0]]]
  type b5 = One[Zero[One[b0]]]
  type b6 = Zero[One[One[b0]]]
  type b7 = One[One[One[b0]]]
  type b8 = Zero[Zero[Zero[One[b0]]]]
  type b9 = One[Zero[Zero[One[b0]]]]
  type b10 = Zero[One[Zero[One[b0]]]]
  type b11 = One[One[Zero[One[b0]]]]
  type b12 = Zero[Zero[One[One[b0]]]]
  type b13 = One[Zero[One[One[b0]]]]
  type b14 = Zero[One[One[One[b0]]]]
  type b15 = One[One[One[One[b0]]]]
  type b16 = Zero[Zero[Zero[Zero[One[b0]]]]]
  type b17 = One[Zero[Zero[Zero[One[b0]]]]]
  type b18 = Zero[One[Zero[Zero[One[b0]]]]]
  type b19 = One[One[Zero[Zero[One[b0]]]]]
  type b20 = Zero[Zero[One[Zero[One[b0]]]]]
  type b21 = One[Zero[One[Zero[One[b0]]]]]
  type b22 = Zero[One[One[Zero[One[b0]]]]]
  type b23 = One[One[One[Zero[One[b0]]]]]
  type b24 = Zero[Zero[Zero[One[One[b0]]]]]
  type b25 = One[Zero[Zero[One[One[b0]]]]]
  type b26 = Zero[One[Zero[One[One[b0]]]]]
  type b27 = One[One[Zero[One[One[b0]]]]]
  type b28 = Zero[Zero[One[One[One[b0]]]]]
  type b29 = One[Zero[One[One[One[b0]]]]]
  type b30 = Zero[One[One[One[One[b0]]]]]
  type b31 = One[One[One[One[One[b0]]]]]
  type b32 = Zero[Zero[Zero[Zero[Zero[One[b0]]]]]]
  type b33 = One[Zero[Zero[Zero[Zero[One[b0]]]]]]
  type b34 = Zero[One[Zero[Zero[Zero[One[b0]]]]]]
  type b35 = One[One[Zero[Zero[Zero[One[b0]]]]]]
  type b36 = Zero[Zero[One[Zero[Zero[One[b0]]]]]]
  type b37 = One[Zero[One[Zero[Zero[One[b0]]]]]]
  type b38 = Zero[One[One[Zero[Zero[One[b0]]]]]]
  type b39 = One[One[One[Zero[Zero[One[b0]]]]]]
  type b40 = Zero[Zero[Zero[One[Zero[One[b0]]]]]]
  type b41 = One[Zero[Zero[One[Zero[One[b0]]]]]]
  type b42 = Zero[One[Zero[One[Zero[One[b0]]]]]]
  type b43 = One[One[Zero[One[Zero[One[b0]]]]]]
  type b44 = Zero[Zero[One[One[Zero[One[b0]]]]]]
  type b45 = One[Zero[One[One[Zero[One[b0]]]]]]
  type b46 = Zero[One[One[One[Zero[One[b0]]]]]]
  type b47 = One[One[One[One[Zero[One[b0]]]]]]
  type b48 = Zero[Zero[Zero[Zero[One[One[b0]]]]]]
  type b49 = One[Zero[Zero[Zero[One[One[b0]]]]]]
  type b50 = Zero[One[Zero[Zero[One[One[b0]]]]]]
  type b51 = One[One[Zero[Zero[One[One[b0]]]]]]
  type b52 = Zero[Zero[One[Zero[One[One[b0]]]]]]
  type b53 = One[Zero[One[Zero[One[One[b0]]]]]]
  type b54 = Zero[One[One[Zero[One[One[b0]]]]]]
  type b55 = One[One[One[Zero[One[One[b0]]]]]]
  type b56 = Zero[Zero[Zero[One[One[One[b0]]]]]]
  type b57 = One[Zero[Zero[One[One[One[b0]]]]]]
  type b58 = Zero[One[Zero[One[One[One[b0]]]]]]
  type b59 = One[One[Zero[One[One[One[b0]]]]]]
  type b60 = Zero[Zero[One[One[One[One[b0]]]]]]
  type b61 = One[Zero[One[One[One[One[b0]]]]]]
  type b62 = Zero[One[One[One[One[One[b0]]]]]]
  type b63 = One[One[One[One[One[One[b0]]]]]]
  type b64 = Zero[Zero[Zero[Zero[Zero[Zero[One[b0]]]]]]]
  type b65 = One[Zero[Zero[Zero[Zero[Zero[One[b0]]]]]]]
  type b66 = Zero[One[Zero[Zero[Zero[Zero[One[b0]]]]]]]
  type b67 = One[One[Zero[Zero[Zero[Zero[One[b0]]]]]]]
  type b68 = Zero[Zero[One[Zero[Zero[Zero[One[b0]]]]]]]
  type b69 = One[Zero[One[Zero[Zero[Zero[One[b0]]]]]]]
  type b70 = Zero[One[One[Zero[Zero[Zero[One[b0]]]]]]]
  type b71 = One[One[One[Zero[Zero[Zero[One[b0]]]]]]]
  type b72 = Zero[Zero[Zero[One[Zero[Zero[One[b0]]]]]]]
  type b73 = One[Zero[Zero[One[Zero[Zero[One[b0]]]]]]]
  type b74 = Zero[One[Zero[One[Zero[Zero[One[b0]]]]]]]
  type b75 = One[One[Zero[One[Zero[Zero[One[b0]]]]]]]
  type b76 = Zero[Zero[One[One[Zero[Zero[One[b0]]]]]]]
  type b77 = One[Zero[One[One[Zero[Zero[One[b0]]]]]]]
  type b78 = Zero[One[One[One[Zero[Zero[One[b0]]]]]]]
  type b79 = One[One[One[One[Zero[Zero[One[b0]]]]]]]
  type b80 = Zero[Zero[Zero[Zero[One[Zero[One[b0]]]]]]]
  type b81 = One[Zero[Zero[Zero[One[Zero[One[b0]]]]]]]
  type b82 = Zero[One[Zero[Zero[One[Zero[One[b0]]]]]]]
  type b83 = One[One[Zero[Zero[One[Zero[One[b0]]]]]]]
  type b84 = Zero[Zero[One[Zero[One[Zero[One[b0]]]]]]]
  type b85 = One[Zero[One[Zero[One[Zero[One[b0]]]]]]]
  type b86 = Zero[One[One[Zero[One[Zero[One[b0]]]]]]]
  type b87 = One[One[One[Zero[One[Zero[One[b0]]]]]]]
  type b88 = Zero[Zero[Zero[One[One[Zero[One[b0]]]]]]]
  type b89 = One[Zero[Zero[One[One[Zero[One[b0]]]]]]]
  type b90 = Zero[One[Zero[One[One[Zero[One[b0]]]]]]]
  type b91 = One[One[Zero[One[One[Zero[One[b0]]]]]]]
  type b92 = Zero[Zero[One[One[One[Zero[One[b0]]]]]]]
  type b93 = One[Zero[One[One[One[Zero[One[b0]]]]]]]
  type b94 = Zero[One[One[One[One[Zero[One[b0]]]]]]]
  type b95 = One[One[One[One[One[Zero[One[b0]]]]]]]
  type b96 = Zero[Zero[Zero[Zero[Zero[One[One[b0]]]]]]]
  type b97 = One[Zero[Zero[Zero[Zero[One[One[b0]]]]]]]
  type b98 = Zero[One[Zero[Zero[Zero[One[One[b0]]]]]]]
  type b99 = One[One[Zero[Zero[Zero[One[One[b0]]]]]]]
  type b100 = Zero[Zero[One[Zero[Zero[One[One[b0]]]]]]]
  type b101 = One[Zero[One[Zero[Zero[One[One[b0]]]]]]]
  type b102 = Zero[One[One[Zero[Zero[One[One[b0]]]]]]]
  type b103 = One[One[One[Zero[Zero[One[One[b0]]]]]]]
  type b104 = Zero[Zero[Zero[One[Zero[One[One[b0]]]]]]]
  type b105 = One[Zero[Zero[One[Zero[One[One[b0]]]]]]]
  type b106 = Zero[One[Zero[One[Zero[One[One[b0]]]]]]]
  type b107 = One[One[Zero[One[Zero[One[One[b0]]]]]]]
  type b108 = Zero[Zero[One[One[Zero[One[One[b0]]]]]]]
  type b109 = One[Zero[One[One[Zero[One[One[b0]]]]]]]
  type b110 = Zero[One[One[One[Zero[One[One[b0]]]]]]]
  type b111 = One[One[One[One[Zero[One[One[b0]]]]]]]
  type b112 = Zero[Zero[Zero[Zero[One[One[One[b0]]]]]]]
  type b113 = One[Zero[Zero[Zero[One[One[One[b0]]]]]]]
  type b114 = Zero[One[Zero[Zero[One[One[One[b0]]]]]]]
  type b115 = One[One[Zero[Zero[One[One[One[b0]]]]]]]
  type b116 = Zero[Zero[One[Zero[One[One[One[b0]]]]]]]
  type b117 = One[Zero[One[Zero[One[One[One[b0]]]]]]]
  type b118 = Zero[One[One[Zero[One[One[One[b0]]]]]]]
  type b119 = One[One[One[Zero[One[One[One[b0]]]]]]]
  type b120 = Zero[Zero[Zero[One[One[One[One[b0]]]]]]]
  type b121 = One[Zero[Zero[One[One[One[One[b0]]]]]]]
  type b122 = Zero[One[Zero[One[One[One[One[b0]]]]]]]
  type b123 = One[One[Zero[One[One[One[One[b0]]]]]]]
  type b124 = Zero[Zero[One[One[One[One[One[b0]]]]]]]
  type b125 = One[Zero[One[One[One[One[One[b0]]]]]]]
  type b126 = Zero[One[One[One[One[One[One[b0]]]]]]]
  type b127 = One[One[One[One[One[One[One[b0]]]]]]]
  type b128 = Zero[Zero[Zero[Zero[Zero[Zero[Zero[One[b0]]]]]]]]
  type b129 = One[Zero[Zero[Zero[Zero[Zero[Zero[One[b0]]]]]]]]
  type b130 = Zero[One[Zero[Zero[Zero[Zero[Zero[One[b0]]]]]]]]
  type b131 = One[One[Zero[Zero[Zero[Zero[Zero[One[b0]]]]]]]]
  type b132 = Zero[Zero[One[Zero[Zero[Zero[Zero[One[b0]]]]]]]]
  type b133 = One[Zero[One[Zero[Zero[Zero[Zero[One[b0]]]]]]]]
  type b134 = Zero[One[One[Zero[Zero[Zero[Zero[One[b0]]]]]]]]
  type b135 = One[One[One[Zero[Zero[Zero[Zero[One[b0]]]]]]]]
  type b136 = Zero[Zero[Zero[One[Zero[Zero[Zero[One[b0]]]]]]]]
  type b137 = One[Zero[Zero[One[Zero[Zero[Zero[One[b0]]]]]]]]
  type b138 = Zero[One[Zero[One[Zero[Zero[Zero[One[b0]]]]]]]]
  type b139 = One[One[Zero[One[Zero[Zero[Zero[One[b0]]]]]]]]
  type b140 = Zero[Zero[One[One[Zero[Zero[Zero[One[b0]]]]]]]]
  type b141 = One[Zero[One[One[Zero[Zero[Zero[One[b0]]]]]]]]
  type b142 = Zero[One[One[One[Zero[Zero[Zero[One[b0]]]]]]]]
  type b143 = One[One[One[One[Zero[Zero[Zero[One[b0]]]]]]]]
  type b144 = Zero[Zero[Zero[Zero[One[Zero[Zero[One[b0]]]]]]]]
  type b145 = One[Zero[Zero[Zero[One[Zero[Zero[One[b0]]]]]]]]
  type b146 = Zero[One[Zero[Zero[One[Zero[Zero[One[b0]]]]]]]]
  type b147 = One[One[Zero[Zero[One[Zero[Zero[One[b0]]]]]]]]
  type b148 = Zero[Zero[One[Zero[One[Zero[Zero[One[b0]]]]]]]]
  type b149 = One[Zero[One[Zero[One[Zero[Zero[One[b0]]]]]]]]
  type b150 = Zero[One[One[Zero[One[Zero[Zero[One[b0]]]]]]]]
  type b151 = One[One[One[Zero[One[Zero[Zero[One[b0]]]]]]]]
  type b152 = Zero[Zero[Zero[One[One[Zero[Zero[One[b0]]]]]]]]
  type b153 = One[Zero[Zero[One[One[Zero[Zero[One[b0]]]]]]]]
  type b154 = Zero[One[Zero[One[One[Zero[Zero[One[b0]]]]]]]]
  type b155 = One[One[Zero[One[One[Zero[Zero[One[b0]]]]]]]]
  type b156 = Zero[Zero[One[One[One[Zero[Zero[One[b0]]]]]]]]
  type b157 = One[Zero[One[One[One[Zero[Zero[One[b0]]]]]]]]
  type b158 = Zero[One[One[One[One[Zero[Zero[One[b0]]]]]]]]
  type b159 = One[One[One[One[One[Zero[Zero[One[b0]]]]]]]]
  type b160 = Zero[Zero[Zero[Zero[Zero[One[Zero[One[b0]]]]]]]]
  type b161 = One[Zero[Zero[Zero[Zero[One[Zero[One[b0]]]]]]]]
  type b162 = Zero[One[Zero[Zero[Zero[One[Zero[One[b0]]]]]]]]
  type b163 = One[One[Zero[Zero[Zero[One[Zero[One[b0]]]]]]]]
  type b164 = Zero[Zero[One[Zero[Zero[One[Zero[One[b0]]]]]]]]
  type b165 = One[Zero[One[Zero[Zero[One[Zero[One[b0]]]]]]]]
  type b166 = Zero[One[One[Zero[Zero[One[Zero[One[b0]]]]]]]]
  type b167 = One[One[One[Zero[Zero[One[Zero[One[b0]]]]]]]]
  type b168 = Zero[Zero[Zero[One[Zero[One[Zero[One[b0]]]]]]]]
  type b169 = One[Zero[Zero[One[Zero[One[Zero[One[b0]]]]]]]]
  type b170 = Zero[One[Zero[One[Zero[One[Zero[One[b0]]]]]]]]
  type b171 = One[One[Zero[One[Zero[One[Zero[One[b0]]]]]]]]
  type b172 = Zero[Zero[One[One[Zero[One[Zero[One[b0]]]]]]]]
  type b173 = One[Zero[One[One[Zero[One[Zero[One[b0]]]]]]]]
  type b174 = Zero[One[One[One[Zero[One[Zero[One[b0]]]]]]]]
  type b175 = One[One[One[One[Zero[One[Zero[One[b0]]]]]]]]
  type b176 = Zero[Zero[Zero[Zero[One[One[Zero[One[b0]]]]]]]]
  type b177 = One[Zero[Zero[Zero[One[One[Zero[One[b0]]]]]]]]
  type b178 = Zero[One[Zero[Zero[One[One[Zero[One[b0]]]]]]]]
  type b179 = One[One[Zero[Zero[One[One[Zero[One[b0]]]]]]]]
  type b180 = Zero[Zero[One[Zero[One[One[Zero[One[b0]]]]]]]]
  type b181 = One[Zero[One[Zero[One[One[Zero[One[b0]]]]]]]]
  type b182 = Zero[One[One[Zero[One[One[Zero[One[b0]]]]]]]]
  type b183 = One[One[One[Zero[One[One[Zero[One[b0]]]]]]]]
  type b184 = Zero[Zero[Zero[One[One[One[Zero[One[b0]]]]]]]]
  type b185 = One[Zero[Zero[One[One[One[Zero[One[b0]]]]]]]]
  type b186 = Zero[One[Zero[One[One[One[Zero[One[b0]]]]]]]]
  type b187 = One[One[Zero[One[One[One[Zero[One[b0]]]]]]]]
  type b188 = Zero[Zero[One[One[One[One[Zero[One[b0]]]]]]]]
  type b189 = One[Zero[One[One[One[One[Zero[One[b0]]]]]]]]
  type b190 = Zero[One[One[One[One[One[Zero[One[b0]]]]]]]]
  type b191 = One[One[One[One[One[One[Zero[One[b0]]]]]]]]
  type b192 = Zero[Zero[Zero[Zero[Zero[Zero[One[One[b0]]]]]]]]
  type b193 = One[Zero[Zero[Zero[Zero[Zero[One[One[b0]]]]]]]]
  type b194 = Zero[One[Zero[Zero[Zero[Zero[One[One[b0]]]]]]]]
  type b195 = One[One[Zero[Zero[Zero[Zero[One[One[b0]]]]]]]]
  type b196 = Zero[Zero[One[Zero[Zero[Zero[One[One[b0]]]]]]]]
  type b197 = One[Zero[One[Zero[Zero[Zero[One[One[b0]]]]]]]]
  type b198 = Zero[One[One[Zero[Zero[Zero[One[One[b0]]]]]]]]
  type b199 = One[One[One[Zero[Zero[Zero[One[One[b0]]]]]]]]
  type b200 = Zero[Zero[Zero[One[Zero[Zero[One[One[b0]]]]]]]]

  type b2147483647 = One[One[One[One[One[One[One[One[One[One[One[One[One[One[One[One[One[One[One[One[One[One[One[One[One[One[One[One[One[One[One[b0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
  type MaxInt = b2147483647

  type b2147483648 = Zero[Zero[Zero[Zero[Zero[Zero[Zero[Zero[Zero[Zero[Zero[Zero[Zero[Zero[Zero[Zero[Zero[Zero[Zero[Zero[Zero[Zero[Zero[Zero[Zero[Zero[Zero[Zero[Zero[Zero[Zero[One[b0]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]

}