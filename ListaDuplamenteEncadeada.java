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