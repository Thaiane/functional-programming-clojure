;; clojure -M first_step.clj

;; consulta doc no lein repl => (doc if)

;; Operações

(+ 1 1)
(* 2 3)
(/ 6 2)
(- 3 1)

;; Resultados

(println (+ 1 1))
(println (* 2 3))
(println (/ 6 2))
(println (- 3 1))

;; Comparação
(= "Oi" "Olá")
(= "Oi" "Oi")

(println (= "Oi" "Olá"))
(println (= "Oi" "Oi"))

(println (even? 2))
(println (= 0 (mod 9 3)))
(println (zero? 9))
(println (zero? 0))

(defn oi [nome]
(println (str "Oi " nome)))

(oi "Thai")

(defn par? [number]
    (if (even? number)
         "sim"
         "não"
    )
)

(println (par? 9))
(println (par? 0))

(defn saldo [value]
    (cond (< value 0) "negativo"
          (> value 0) "positivo"
          :else "zero"
    )
)

(println (saldo 3))
(println (saldo 0))
(println (saldo -3))
