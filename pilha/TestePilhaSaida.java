public class TestePilhaSaida {
    public static void main(String[] args) {
        Pilha p = new Pilha(4);
        p.empilha(7);
        p.empilha(3);
        p.empilha(9);
        System.out.println(p);
        System.out.println(p.desempilha());
        System.out.println(p.desempilha());
        System.out.println(p);
        System.out.println(p.tamanho());
        System.out.println(p.estaVazia());
    }
}
