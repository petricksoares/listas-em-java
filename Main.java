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