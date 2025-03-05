(defn divisivel-por? [numero divisor]
    (zero? (mod numero divisor))
)

(defn fizzbuzz [value]
    (cond (and (divisivel-por? value 3) (divisivel-por? value 5)) "fizzbuzz"
          (divisivel-por? value 3) "fizz"
          (divisivel-por? value 5) "buzz"
          :else value
    )
)

(println (fizzbuzz 4))
(println (fizzbuzz 5))
(println (fizzbuzz 15))
(println (fizzbuzz 9))