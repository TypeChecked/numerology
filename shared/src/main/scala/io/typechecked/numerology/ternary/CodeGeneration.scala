package io.typechecked
package numerology
package ternary

/**
 * Utility to produce reverse ternary encodings for integers, so you don't have to
 */
object CodeGeneration {

  // TODO: Make this into a macro

  def toTernaryExpansion(n: Long): String = n match {
    case 0 => "t0"
    case _ => (n % 3) match {
      case 0 => s"Zero[${toTernaryExpansion(n / 3)}]"
      case 1 => s"One[${toTernaryExpansion((n - 1) / 3)}]"
      case 2 => s"Two[${toTernaryExpansion((n - 2) / 3)}]"
    }
  }

  def generate(i: Long): String =
    if (i == 0) "class t0 extends TNat"
    else if (i > 0) s"type t$i = ${toTernaryExpansion(i)}"
    else throw new Exception("Negative numbers are not currently supported")

}
