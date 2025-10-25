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