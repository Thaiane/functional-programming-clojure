(def registros (atom ()))

(println registros)
(println @registros)

(swap! registros conj {:valor 29M :tipo "despesa" :comentario "Livro" :moeda "R$" :data "17/02/2025"})
(println @registros)

(defn registrar
  [transacao]
  (swap! registros conj transacao))

(registrar {:valor 2700M :tipo "receita" :comentario "Freela" :moeda "R$" :data "15/02/2025"})
(registrar {:valor 290M :tipo "despesa" :comentario "Compras" :moeda "R$" :data "15/02/2025"})
(println @registros)

;; Atom é referencia para um simbolo. É a forma de trabalhar com estados.
;; Se quiser o valor do atom, precida pedir o @ antes do nome dele. @registros é um exemplo.




