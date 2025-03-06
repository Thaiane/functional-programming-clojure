;; set são listas de valores únicos

(def cantoras (hash-set "Pitty" "Anitta"))
(println cantoras)

(def cantores #{"Gabriel" "Marcelo"})
(println cantores)

(def cantoras-novas (conj cantoras "Pitty"))
(println cantoras-novas) ;; continua igual porque já tinha Pitty

(def cantores-novos (conj cantores "Leonardo"))
(println cantores-novos) ;; mudou porque não tinha Leonardo