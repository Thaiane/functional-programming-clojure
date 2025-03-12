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