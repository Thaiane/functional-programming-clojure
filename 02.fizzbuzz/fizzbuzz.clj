(defn fizzbuzz [value]
    (cond (= 0 (mod value 3) (mod value 5)) "fizzbuzz"
          (= 0 (mod value 3)) "fizz"
          (= 0 (mod value 5)) "buzz"
          :else value
    )
)

(println (fizzbuzz 4))
(println (fizzbuzz 5))
(println (fizzbuzz 15))
(println (fizzbuzz 9))