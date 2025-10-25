#  Sobre o Projeto
## Explicação da Estrutura da Lista Encadeada
O código é dividido em três classes principais: ListaEncadeada, No e Main.
* ListaEncadeada -> Esta classe gerencia a coleção de nós e fornece os métodos para manipular a lista.
* No inicio; : É o ponteiro de referência principal da lista, apontando para o primeiro No. Se inicio for null, a lista está vazia.
## Métodos Principais
* inserir: Adiciona um novo nó no final da lista.
* listar: Percorre a lista e exibe todos os valores.
* buscar: Procura um valor específico.
* remover: Remove a primeira ocorrência do valor.

## Classe No
Esta classe define o bloco de construção fundamental da lista. Cada objeto "No" representa um elemento da lista.
* int valor; : Armazena o dado útil do elemento.
* No proximo; : É o ponteiro que armazena a referência para o próximo No na sequência. Isso é o que "encadeia" a lista.
* Construtor No: Inicializa o nó com o valor fornecido e define o proximo como null, indicando que, por enquanto, ele não aponta para mais nenhum elemento.

## Classe Main
Esta classe contém o método main para criar uma instância da lista e testar suas operações em sequência.

* Saída do Código
  
Lista Completa:
 * 8-13-15-31

Buscando valores:
 * Valor 15 encontrado
 * Valor 99 não encontrado

Removendo valores:
 * Valor 13 removido
 * Valor 99 não encontrado para remoção

Lista após remoções:
 * 8-15-31

## Explicação da Estrutura da Lista Duplamente Encadeada
O código implementa uma Lista Duplamente Encadeada.
A principal diferença em relação a uma lista simples é a inclusão de um ponteiro para o nó anterior, permitindo o percurso bidirecional.

O código é dividido em três classes principais: ListaDuplamenteEncadeada, No e MainDupla.
## Classe ListaDuplamenteEncadeada
Esta classe gerencia a coleção de nós e fornece os métodos para manipular a lista.
* No inicio; : É o ponteiro de referência principal, apontando para o primeiro No. Se inicio for null, a lista está vazia.
* No fim; : É o ponteiro que aponta para o último No. É usado para otimizar a inserção no final e para iniciar o percurso reverso.
## Métodos Principais
* inserir: Adiciona um novo nó no final da lista, atualizando os ponteiros proximo e anterior do nó anterior e do novo nó.
* listar: Percorre a lista e exibe todos os valores do início ao fim.
* listarReverso: Percorre a lista e exibe todos os valores do fim ao início, usando o ponteiro anterior.
* buscar: Procura um valor específico.
* remover: Remove a primeira ocorrência do valor, ajustando os ponteiros proximo e anterior dos nós adjacentes ao nó removido.
## Classe No
Esta classe define o bloco de construção fundamental da lista. Cada objeto No representa um elemento da lista.
* int valor; : Armazena o dado útil do elemento.
* No proximo; : É o ponteiro que armazena a referência para o próximo No na sequência.
* No anterior; : Ponteiro Adicional que armazena a referência para o nó precedente na sequência.
* Construtor No: Inicializa o nó com o valor fornecido e define proximo e anterior como null.
## Classe Main
Esta classe contém o método main para criar uma instância da lista e testar suas operações em sequência.

A saída é mais extensa devido ao novo método listarReverso e aos testes de remoção do primeiro e do último elemento.
### Saída do Código
Lista completa:
 * Lista (normal): 8 13 15 31
 * Lista (reversa): 31 15 13 8
   
Buscando valores:
 * Valor 15 encontrado
 * Valor 99 não encontrado
   
Removendo valores:
 * Valor 13 removido
 * Valor 8 removido
 * Valor 99 não encontrado para remoção
   
Lista após remoções:
 * Lista (normal): 15 31
 * Lista (reversa): 31 15
   
Removendo o último:
 * Valor 31 removido
   
Lista após remoção do último:
 * Lista (normal): 15
 * Lista (reversa): 15
 * Inserindo novamente:
 * Lista (normal): 15 50
