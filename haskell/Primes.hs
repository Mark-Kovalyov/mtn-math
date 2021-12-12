module Primes where

primes :: [Int]
primes = filter_prime [2..]
  where filter_prime (p:xs) =
          p : filter_prime [x | x <- xs, (mod x p) /= 0]

factorize' :: Int -> [Int] -> [Int] -> [Int]
factorize' x divisors primes_list
  |x == 1 = reverse divisors
  |otherwise = let d = head primes_list
               in if (mod x d) == 0 then factorize' (div x d) (d:divisors) primes_list
               else factorize' x divisors $ tail primes_list

factorize :: Int -> [Int]
factorize x = factorize' x [] primes
