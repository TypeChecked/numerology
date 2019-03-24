package io.typechecked
package numerology
package ternary

/**
 * Utility to produce reverse ternary encodings for integers, so you don't have to
 */
object CodeGeneration {

  // TODO: Make this into a macro

  def main(args: Array[String]): Unit = {

    val number = args(0).toInt

    (0 to number).foreach { i =>
      println(generate(i))
    }

  }

  def toTernaryExpansion(n: BigInt): String = n match {
    case x if x == BigInt(0) => "t0"
    case _ => (n % 3) match {
      case x if x == BigInt(0) => s"Zero[${toTernaryExpansion(n / 3)}]"
      case x if x == BigInt(1) => s"One[${toTernaryExpansion((n - 1) / 3)}]"
      case x if x == BigInt(2) => s"Two[${toTernaryExpansion((n - 2) / 3)}]"
    }
  }

  def generate(i: BigInt): String =
    if (i == 0) "final class t0 extends TNat"
    else if (i > 0) s"type t$i = ${toTernaryExpansion(i)}"
    else throw new Exception("Negative numbers are not currently supported")

  def generate(i: Long): String = generate(BigInt(i))

}
