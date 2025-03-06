;; vetor
[1, 2, 3, 4, 5]
(vector 1 2 3 4 5)

(println [1, 2, 3, 4, 5, 6])
(println (vector 1 2 3 4 5))

(def valores (vec (range 1 16)))

(println valores)


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

(println (map fizzbuzz valores))

(def bandas (vector "SOAD" "Iron Maiden" "Blink" 182 "U2"))

(println (get bandas 3))
(println (last bandas))
(println (get bandas 0))
(println (first bandas))
(conj bandas "Pitty")
(println bandas)

(def bandas-novo (conj bandas "Pitty"))

(println bandas-novo)
