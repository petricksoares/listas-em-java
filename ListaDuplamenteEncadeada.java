// Classe No
public class No {
    int valor;
    No proximo;
    No anterior;

    public No(int valor) {
        this.valor = valor;
        this.proximo = null;
        this.anterior = null;
    }
}

// Classe ListaDuplamenteEncadeada
public class ListaDuplamenteEncadeada {
    No inicio;
    No fim;

    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    public void inserir(int valor) {
        No novoNo = new No(valor);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
    }

    public void listar() {
        if (inicio == null) {
            System.out.println("Lista vazia");
        } else {
            No atual = inicio;
            System.out.print("Lista (normal): ");
            while (atual != null) {
                System.out.print(atual.valor + " ");
                atual = atual.proximo;
            }
            System.out.println();
        }
    }

    public void listarReverso() {
        if (fim == null) {
            System.out.println("Lista vazia");
        } else {
            No atual = fim;
            System.out.print("Lista (reversa): ");
            while (atual != null) {
                System.out.print(atual.valor + " ");
                atual = atual.anterior;
            }
            System.out.println();
        }
    }

    public void buscar(int valor) {
        if (inicio == null) {
            System.out.println("Lista vazia");
            return;
        }

        No atual = inicio;
        while (atual != null && atual.valor != valor) {
            atual = atual.proximo;
        }

        if (atual == null) {
            System.out.println("Valor " + valor + " não encontrado");
        } else {
            System.out.println("Valor " + valor + " encontrado");
        }
    }

    public void remover(int valor) {
        if (inicio == null) {
            System.out.println("Lista vazia");
            return;
        }

        No atual = inicio;

        while (atual != null && atual.valor != valor) {
            atual = atual.proximo;
        }

        if (atual == null) {
            System.out.println("Valor " + valor + " não encontrado para remoção");
            return;
        }

        if (atual.proximo != null) {
            atual.proximo.anterior = atual.anterior;
        } else {
            fim = atual.anterior;
        }

        if (atual.anterior != null) {
            atual.anterior.proximo = atual.proximo;
        } else {
            inicio = atual.proximo;
        }

        System.out.println("Valor " + valor + " removido");
    }

}

// Classe Main
public class MainDupla {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        lista.inserir(8);
        lista.inserir(13);
        lista.inserir(15);
        lista.inserir(31);

        System.out.println("Lista completa:");
        lista.listar();
        lista.listarReverso();

        System.out.println("\nBuscando valores:");
        lista.buscar(15);
        lista.buscar(99);

        System.out.println("\nRemovendo valores:");
        lista.remover(13);
        lista.remover(8);
        lista.remover(99);

        System.out.println("\nLista após remoções:");
        lista.listar();
        lista.listarReverso();

        System.out.println("\nRemovendo o último:");
        lista.remover(31);

        System.out.println("\nLista após remoção do último:");
        lista.listar();
        lista.listarReverso();

        System.out.println("\nInserindo novamente:");
        lista.inserir(50);
        lista.listar();
    }
}
