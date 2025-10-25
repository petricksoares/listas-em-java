public class NoCircular {
    int valor;
    NoCircular proximo;
    
    public NoCircular(int valor) {
        this.valor = valor;
        this.proximo = null;
    }    
}