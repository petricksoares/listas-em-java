# 📌Sobre o Projeto
## Explicação da Estrutura da Lista Encadeada⛓️
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

## Explicação da Estrutura da Lista Duplamente Encadeada🔗
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

## Explicação da Estrutura da Lista Encadeada Circular⚪
O código implementa uma Lista Encadeada Circular. A principal característica desse tipo de lista é que o último nó
aponta de volta para o primeiro nó, formando um ciclo contínuo em vez de terminar em null.

O código é dividido em três classes principais: ListaCircular, No e MainCircular.
* ListaCircular → Esta classe gerencia a coleção de nós e fornece os métodos para manipular a lista.
* No inicio; → É o ponteiro de referência principal da lista. Ele define o ponto de partida padrão para as operações. O último nó da lista sempre aponta para este inicio.
### Classe ListaCircular
Esta classe gerencia a coleção de nós e fornece os métodos para manipular a lista.
* No inicio; : É o ponteiro de referência principal. Ele define o ponto de partida padrão para operações. O último nó da lista sempre aponta para este inicio.

### Métodos Principais
* inserir: Adiciona um novo nó no final da lista. Se a lista estiver vazia, o nó aponta para si mesmo. Caso contrário, ele percorre a lista até o nó cujo proximo é o inicio, insere o novo nó ali e garante que o novo nó continue apontando para o inicio.
* listar: Percorre a lista exibindo os valores.
* buscar: Procura um valor específico, parando quando o valor é encontrado ou quando o percurso retornar ao inicio.
* remover: Remove a primeira ocorrência do valor. A remoção exige o ajuste do ponteiro proximo do nó anterior e, se o nó removido for o inicio, o ajuste do próprio ponteiro inicio.
### Classe No
Esta classe define o bloco de construção fundamental da lista circular.
* int valor; : Armazena o dado útil do elemento.
* No proximo;: É o ponteiro que armazena a referência para o próximo No na sequência.
### Saída do Código
Lista completa:
 * Lista (circular): 8 13 15 31
   
Buscando valores:
 * Valor 15 encontrado
 * Valor 99 não encontrado
   
Removendo valores:
 * Valor 13 removido
 * Valor 99 não encontrado para remoção
   
Lista após remoções:
 * Lista (circular): 8 15 31
## Como Executar o Projeto!💻
Este repositório contém três implementações independentes de listas encadeadas (Simples, Dupla e Circular). O projeto é escrito em Java e pode ser executado em qualquer IDE que suporte o desenvolvimento Java.
### Pré Requisitos
Certifique-se de ter o seguinte instalado em sua máquina:
* Java Development Kit (JDK): Versão 8 ou superior.
* IDE Java: Recomendamos o IntelliJ IDEA (Community ou Ultimate) ou VS Code com extensões Java.

### ⚙️ Estrutura de Arquivos
Para rodar o código corretamente, certifique-se de que os arquivos estejam organizados na estrutura de pastas padrão do Java
* Classe No -> Primeira classe a ser executada
* Classe Lista(Encadeada, Duplamente Encadeada ou Circular) -> Segunda a ser exercutada
* Classe Main(Saída do código) -> Terceira Classe a ser executada.
## Clone o Repositório💡 
cd https://github.com/petricksoares/listas-em-java
