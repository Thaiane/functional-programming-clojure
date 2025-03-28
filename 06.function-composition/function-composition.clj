(def transacoes 
  [
   {:valor 33.0 :tipo "despesa" :comentario "Almoço" :moeda "R$" :data "19/11/2015"}
   {:valor 50.0 :tipo "receita" :comentario "Salário" :moeda "R$" :data "20/11/2025"}
   {:valor 10.0 :tipo "despesa" :comentario "Cinema" :moeda "R$" :data "21/11/2015"}
   {:valor 20.0 :tipo "receita" :comentario "Freela" :moeda "R$" :data "22/11/2015"}
   {:valor 15.0 :tipo "despesa" :comentario "Jantar" :moeda "R$" :data "23/11/2015"}
   {:valor 25.0 :tipo "receita" :comentario "Venda de livro" :moeda "R$" :data "24/11/2015"}
  ])

;; Objetivo
;; (texto-resumo uma-transacao)
;; "19/11/2015 => R$ +33.0"


(defn sinal 
  [value]
  (if (= value "receita")
    "+"
    "-"))

(println (sinal "despesa"))

(defn texto-resumo
  [transacao]
  (str (:data transacao) "=> " (:moeda transacao) " " (sinal :tipo) (:valor transacao)))

(texto-resumo (first transacoes))

(println (texto-resumo (first transacoes)))

(defn valor-sinalizado [transacao]
  (let [moeda (:moeda transacao "R$")
       valor (:valor transacao 0)]
  (if (= :tipo transacao "receita")
    (str "+" moeda " " valor)
    (str "-" moeda " " valor))))

(println (valor-sinalizado (first transacoes)))


