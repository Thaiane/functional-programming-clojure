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
;; filter #(= (:tipo %) tipo) colecao: Filtra os elementos da coleção onde o valor da chave :tipo é igual a tipo.
;; map :valor ...: Mapeia os elementos filtrados para obter apenas os valores associados à chave :valor.
;; reduce + ...: Reduz a coleção de valores somados a um único valor.
;; Isso resultará na soma de todos os valores da chave :valor para os elementos que têm o tipo especificado.




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


;;Sobre (#(:tipo %))

;; Quando você vê (:tipo %), isso geralmente aparece dentro de uma função anônima que
;; está sendo passada para outra função, como map, filter, ou reduce.
;; A expressão (:tipo %) retorna o valor associado à chave :tipo no mapa representado por %.

;; Lista de transações
(def transacoes [
  {:id 1 :valor 300 :tipo "receita" :categoria "Salário"}
  {:id 2 :valor 50 :tipo "despesa" :categoria "Alimentação"}
  {:id 3 :valor 200 :tipo "receita" :categoria "Freelance"}
  {:id 4 :valor 100 :tipo "despesa" :categoria "Transporte"}
  {:id 5 :valor 150 :tipo "despesa" :categoria "Lazer"}
])

;; Usando map para extrair os tipos de transações
(def tipos (map #(:tipo %) transacoes))

;; Imprimindo os tipos
(println tipos) ;; Imprime ("receita" "despesa" "receita" "despesa" "despesa")

;; Explicação do Exemplo
;; Definição de Transações: Definimos uma lista de transações, onde cada transação é um mapa com várias keywords.

;; Uso de map: Usamos a função map para aplicar uma função anônima a cada elemento da lista transacoes. A função anônima #(:tipo %) extrai o valor associado à keyword :tipo de cada mapa.

;; Resultado: O resultado é uma lista dos valores associados à keyword :tipo em cada mapa da lista transacoes.

;; Portanto, (:tipo %) é uma maneira concisa e idiomática de acessar valores em mapas dentro de funções anônimas em Clojure.