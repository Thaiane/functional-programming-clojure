;; Listas

(list 1 2 3)
'(1, 2, 3, 4)

(def idades '(3, 4))
(def valores (range 1 16))

(println idades)
(println valores)

(def cantores (list "Pitty" "Ivete Sangalo" "Marcelo D" 2 "Gabriel, o Pensador"))

(println cantores)

(println (nth cantores 1))
(println (nth cantores 3))
(println (last cantores))
(println (first cantores))
(conj cantores "Anitta")
(println cantores) ;; imutável

(def cantores-novos (conj cantores "Anitta"))
(println cantores-novos)