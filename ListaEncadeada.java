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