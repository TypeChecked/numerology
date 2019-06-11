# Numerology

A library demonstrating various approaches to developing a faster `Nat`

See [here](https://medium.com/swlh/counting-to-infinity-at-compile-time-2bbdd6446329) for a blog post introduction to the main concept
of the repo.

## Problem

Traditional church-encoded `Nat` is slow. What alternatives are there?

### BNat

Binary-encoded `Nat`. Significantly faster, and relatively easy for programmers to reason about.

### TNat

Ternary-encoded `Nat`. Significantly faster again. Can reach 10<sup>300</sup> whilst performing addition and approx 10<sup>40</sup> for multiplication.

It is harder to implement typeclasses for `TNat` than the alternatives.

### MNat

An experiment to see if I could get a `Nat` specialised for multiplication.

An `MNat` is formed as an `HList` of pairs of prime numbers and exponents - the prime factorisation
of the number `MNat` represents.

The theory was that multiplication is then reduced to simple list operations (concat, sort, etc), and it would
prove faster than `TNat` which relies on recursing on `Sum`.

Unfortunately this was not the case. `MNat` reaches approx 10<sup>20</sup> * 10<sup>20</sup> (worst-case integers) before failing. About the square root of `TNat`'s limit.

When paired with the approach in [symbology](), this encoding would compile primality testing typeclasses in trivial time.
