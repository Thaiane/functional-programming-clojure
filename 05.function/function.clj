;; Higher-order functions -> Functions that take functions as arguments or return functions as results


(defn resumo [transacao]
  (select-keys transacao [:valor :tipo :data]))

(def transacoes
  [{:valor 200 :tipo "despesa" :data "2021-01-01" :comentario "Almoço"}
   {:valor 300 :tipo "receita" :data "2021-01-02" :comentario "Salário"}
   {:valor 50 :tipo "despesa" :data "2021-01-03" :comentario "Jantar"}
   {:valor 100 :tipo "receita" :data "2021-01-04" :comentario "Freelance"}])

(defn resumo-transacao [resumo transacoes]
  (println (map resumo transacoes)))

(resumo-transacao resumo transacoes)

(defn despesa? [transacao]
  (= (:tipo transacao) "despesa"))

(filter despesa? transacoes)

(defn resumo-transacao-despesa [resumo-transacao despesa?]
  (println (filter despesa? transacoes)))

(resumo-transacao-despesa resumo-transacao despesa?)


(filter #(> (:valor %) 100) transacoes)



;; Thread first

(resumo (first transacoes))
;; =
(-> (first transacoes)
    (resumo))

;; Thread last

(->> (filter despesa? transacoes)
     (map resumo)
     (reduce +))
