public class ListaCircular {
    NoCircular inicio;
    NoCircular fim;

    public void inserir(int valor) {
        NoCircular novoNo = new NoCircular(valor);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
            novoNo.proximo = inicio;
        } else {
            fim.proximo = novoNo;
            novoNo.proximo = inicio;
            fim = novoNo;
        }
    }

    public void listar() {
        if(inicio == null) {
            System.out.println("Lista vazia");
        } else {
            NoCircular atual = inicio;
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
            while(atual != inicio) {
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
            NoCircular atual = inicio;
            if(atual.valor == valor) {
                System.out.println("Valor " + valor + " encontrado");
                return;
            }
            atual = atual.proximo;
            while(atual != inicio && atual.valor != valor) {
                atual = atual.proximo;
            }
            if(atual.valor == valor) {
                System.out.println("Valor " + valor + " encontrado");
            } else {
                System.out.println("Valor " + valor + " não encontrado");
            }
        } 
    }

    public void remover(int valor) {
        if(inicio == null) {
            System.out.println("Lista vazia");
            return;
        }
        
        NoCircular atual = inicio;
        NoCircular anterior = fim;
        
        do {
            if(atual.valor == valor) {
                if(inicio == fim && inicio.valor == valor) {
                    inicio = null;
                    fim = null;
                }
                else if(atual == inicio) {
                    inicio = inicio.proximo;
                    fim.proximo = inicio;
                }
                else if(atual == fim) {
                    fim = anterior;
                    fim.proximo = inicio;
                }
                else {
                    anterior.proximo = atual.proximo;
                }
                
                System.out.println("Valor " + valor + " removido");
                return;
            }
            
            anterior = atual;
            atual = atual.proximo;
        } while(atual != inicio);
        
        System.out.println("Valor " + valor + " não encontrado para remoção");
    }
}