// Classe No
public class No {
    int valor;
    No proximo;
    
    public No(int valor) {
        this.valor = valor;
        this.proximo = null;
    }    
}

// Classe ListaEncadeada
public class ListaEncadeada {
    No inicio;

    public void inserir(int valor) {
        No novoNo = new No(valor);
        if (inicio == null) {
            inicio = novoNo;
        } else {
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo; 
        }
    }

    public void listar() {
        if(inicio == null) {
            System.out.println("Lista vazia");
        } else {
            No atual = inicio;
            while(atual != null) {
                System.out.print(atual.valor + " ");
                atual = atual.proximo;
            }
            System.out.println();
        }
    }

    public void buscar(int valor) {
        if(inicio == null) {
            System.out.println("Lista vazia");
        } else {
            No atual = inicio;
            while(atual != null && atual.valor != valor) {
                atual = atual.proximo;
            }
            if(atual == null) {
                System.out.println("Valor " + valor + " não encontrado");
            } else {
                System.out.println("Valor " + valor + " encontrado");
            }
        } 
    }

    public void remover(int valor) {
        if(inicio == null) {
            System.out.println("Lista vazia");
        } else {
            if(inicio.valor == valor) {
                inicio = inicio.proximo;
                System.out.println("Valor " + valor + " removido");
            } else {
                No atual = inicio;
                No anterior = null;
                while(atual != null && atual.valor != valor) {
                    anterior = atual;
                    atual = atual.proximo;
                }
                if(atual == null) {
                    System.out.println("Valor " + valor + " não encontrado para remoção");
                } else {
                    anterior.proximo = atual.proximo;
                    System.out.println("Valor " + valor + " removido");
                }
            }
        }
    }
}

// Classe Main
public class Main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        
        // Testando as operações
        lista.inserir(8);
        lista.inserir(13);
        lista.inserir(15);
        lista.inserir(31);
        
        System.out.println("Lista completa:");
        lista.listar();
        
        System.out.println("\nBuscando valores:");
        lista.buscar(15);
        lista.buscar(99);
        
        System.out.println("\nRemovendo valores:");
        lista.remover(13);
        lista.remover(99); 
        
        System.out.println("\nLista após remoções:");
        lista.listar();
    }
}
