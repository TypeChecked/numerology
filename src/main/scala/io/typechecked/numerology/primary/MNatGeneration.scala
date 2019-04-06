package io.typechecked
package numerology
package primary

/**
 * Utility to produce standard-form prime expansion encodings for integers, so you don't have to
 */
object MNatGeneration {

  // TODO: Make this into a macro

  def main(args: Array[String]): Unit = {

    val number = args(0).toInt

    (1 to number).foreach { i =>
      println(generate(i))
    }

  }

  case class PrimePower(prime: BigInt, power: BigInt) {
    override def toString: String = s"(p$prime ^ t$power)"
  }

  def factorize(x: BigInt): List[PrimePower] = {
    @scala.annotation.tailrec
    def recurse(x: BigInt, a: BigInt = 2, list: List[BigInt] = Nil): List[BigInt] = a * a > x match {
      case false if x % a == 0 => recurse(x / a, a, a :: list)
      case false               => recurse(x, a + 1, list)
      case true                => x :: list
    }
    primesToPrimePowers(recurse(x))
  }

  def primesToPrimePowers(primes: List[BigInt]): List[PrimePower] =
    primes
      .groupBy(identity)
      .map { case (prime, xs) => PrimePower(prime, xs.size) }
      .toList
      .sortBy(_.prime)
      .filter(_.power > 0)

  def primeListToString(primeList: List[PrimePower]): String = {

    def recurse(expression: String, remainingList: List[PrimePower]): String = remainingList match {
      case Nil => expression
      case h :: tail => recurse(s"$h *: $expression", tail)
    }

    recurse("m1", primeList)
  }

  def generate(n: BigInt): String = n match {
    case x if x == BigInt(1) => "final class m1 extends MNat"
    case x if x > BigInt(1) => s"type m$n = ${primeListToString(factorize(x))}"
  }

  def generate(i: Long): String = generate(BigInt(i))

  def generate(i: Int): String = generate(BigInt(i))

}
