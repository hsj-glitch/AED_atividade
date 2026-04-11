/*
a) Custo da inserção no meio.
Por que inserir no meio de um array é mais lento que inserir no meio de uma lista
encadeada? Pense no que cada estrutura precisa fazer com os elementos existentes.

R: Ao inserir um elemento no meio de um array, é necessário mover todos os elementos da direita um indice alem, o que custa O(n) onde n é o número de elementos que devem ser movidos para a direita. Ja uma lista encadeada é muito mais otimizada para insercao no meio, sendo tempo O(1) para qualquer indice da lista. Isso se ocorre devido a forma com que uma lista encadeada se estrutura, onde cada no contem apenas uma referencia ao endereco do proximo no, nao havendo relacao entre indice e espaco na memoria fisica.

b) Custo de acesso por índice.
Para acessar o k-ésimo elemento, qual estrutura é mais rápida – o array ou a lista? Por
quê?

R: Um array seria mais rapido, pois o acesso e direto por indice, enquanto a lista encadeada precisa percorrer todos os componentes da lista ate o k-esimo elemento.

c) Circularidade.
Seria possível resolver o Problema de Josephus usando um array em vez de uma lista
circular? Se sim, como ficaria a remoção? Seria mais ou menos eficiente?

R: Seria possivel, mas existiria uma penalidade de performace. Pois o array teria que, ao eliminar um membro no problema de Josephus, deslocar todos os elementos depois deste para a esquerda.

*/