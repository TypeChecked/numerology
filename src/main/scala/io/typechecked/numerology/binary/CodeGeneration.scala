package io.typechecked
package numerology
package binary

/**
 * Utility to produce reverse binary encodings for integers, so you don't have to
 */
object CodeGeneration {

  // TODO: Make this into a macro

  def main(args: Array[String]): Unit = {

    val number = args(0).toInt

    (0 to number).foreach { i =>
      println(generate(i))
    }

  }

  def toBinaryExpansion(n: Long): String = n match {
    case 0 => "b0"
    case _ => (n % 2) match {
      case 0 => s"Zero[${toBinaryExpansion(n / 2)}]"
      case 1 => s"One[${toBinaryExpansion((n - 1) / 2)}]"
    }
  }

  def generate(i: Long): String =
    if (i == 0) "final class b0 extends BNat"
    else if (i > 0) s"type b$i = ${toBinaryExpansion(i)}"
    else throw new Exception("Negative numbers are not currently supported")


}

