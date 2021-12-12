module Stat where

full_probability :: [(Double,Double)] -> Double

# TODO: Why foldr?
full_probability list = foldr (+) 0.0 (map (\item -> (fst item) * (snd item)) list)
