;;mapa
(hash-map :valor 200 :tipo "receita")

(def transacao {:valor 300 :tipo "receita"})

(println (get transacao :valor))

;; Adiciona chave-valor na transação
(assoc transacao :categoria "Educação") 
;; mas isso não altera transacao depois porque é imutável
(println (get transacao :categoria)) 

(println (:valor transacao)) ;; outra forma de fazer o get

(println (:categoria transacao '())) ;; se categoria for nil, entao retorna o () que tá depois de transacao 
(println (:categoria transacao '9)) ;; se categoria for nil, entao retorna o 9


;; Definindo uma lista de transações
(def transacoes [
  {:id 1 :valor 300 :tipo "receita" :categoria "Salário"}
  {:id 2 :valor 50 :tipo "despesa" :categoria "Alimentação"}
  {:id 3 :valor 200 :tipo "receita" :categoria "Freelance"}
  {:id 4 :valor 100 :tipo "despesa" :categoria "Transporte"}
  {:id 5 :valor 150 :tipo "despesa" :categoria "Lazer"}
])

;; Função para calcular o total de receitas ou despesas
(defn total-por-tipo [tipo]
  (reduce + (map :valor (filter #(= (:tipo %) tipo) transacoes))))

;; Função para agrupar transações por categoria
(defn agrupar-por-categoria []
  (reduce (fn [acc transacao]
            (let [categoria (:categoria transacao)]
              (update acc categoria conj transacao)))
          {}
          transacoes))

;; Calculando o total de receitas e despesas
(def total-receitas (total-por-tipo "receita"))
(def total-despesas (total-por-tipo "despesa"))

;; Agrupando transações por categoria
(def transacoes-por-categoria (agrupar-por-categoria))

;; Imprimindo os resultados
(println "Total de Receitas:" total-receitas)
(println "Total de Despesas:" total-despesas)
(println "Transações por Categoria:" transacoes-por-categoria)