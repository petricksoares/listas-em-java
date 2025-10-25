// Classe NoCircular
public class NoCircular {
    int valor;
    NoCircular proximo;
    
    public NoCircular(int valor) {
        this.valor = valor;
        this.proximo = null;
    }    
}

// Classe ListaCircular
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

// Classe Main
public class Main {
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();
        
        lista.inserir(8);
        lista.inserir(13);
        lista.inserir(15);
        lista.inserir(31);
        
        System.out.println("Lista circular completa:");
        lista.listar();
        
        System.out.println("Buscando valores:");
        lista.buscar(15);
        lista.buscar(99);
        
        System.out.println("Removendo valores:");
        lista.remover(13);
        lista.remover(8);
        lista.remover(99);
        
        System.out.println("Lista após remoções:");
        lista.listar();
        
        System.out.println("Removendo últimos elementos:");
        lista.remover(15);
        lista.remover(31);
        
        System.out.println("Lista final:");
        lista.listar();
    }
}
