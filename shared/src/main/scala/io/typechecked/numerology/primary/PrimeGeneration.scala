package io.typechecked
package numerology
package primary

object PrimeGeneration {

  def main(args: Array[String]) = {

    val number = args(0).toInt

    (2 to number).filter(isPrime).foreach { n =>
      println(generate(n))
    }

  }

  def isPrime(n: Int): Boolean = ! ((2 until n-1) exists (n % _ == 0))

  def generate(n: Int): String = s"type p$n = PrimeNat[t$n]"

}
