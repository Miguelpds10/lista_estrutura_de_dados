//import java.util.Random;

public class TestePilha {
    public static void main(String[] args) {
        // // Pilha p1 = new Pilha(5);
        // // p1.empilha(5);
        // // p1.empilha(10);
        // // System.out.println(p1);
        // // Pilha p2 = new Pilha();
        // // p2.empilha(30);
        // // System.out.println(p2);
        // Pilha p = new Pilha();
        // Random random = new Random();
        // do{
        //     if(random.nextInt(2) ==1){//empilhar, se puder
        //         if(!p.estaCheia())
        //             p.empilha(random.nextInt(10));
        //     }
        //     else{//desempilha, se puder
        //         if(!p.estaVazia())
        //             System.out.println(p.desempilha() + " saiu");
        //     }
        //     System.out.println(p);
        // }while(!p.estaVazia());
        elementoAbaixoDoTopo();
        empilhaMaiorQueTopo();
        InvertePilha();

    }

    public static void elementoAbaixoDoTopo(){
        Pilha p = new Pilha(5);
        p.empilha(10);
        p.empilha(20);
        p.empilha(50);
        System.out.println(p);
        System.out.println("Elemento abaixo do topo: " + p.elementoAbaixoDoTopo());

        //Pilha com 1 elemento
        Pilha p1 = new Pilha(5);
        p1.empilha(99);
        try{
            p1.elementoAbaixoDoTopo();
            System.out.println("Erro: não deveria ter elemento abaixo do topo");
        } catch (Exception e) {
            System.out.println("Exceção lançada: " + e.getMessage());
        }
    }

    public static void empilhaMaiorQueTopo(){
        Pilha p = new Pilha(5);
        p.empilha(10);
        p.empilha(20);
        System.out.println(p);
        p.empilhaMaiorQueTopo(30);
        System.out.println("Após empilhar maior que topo: " + p);

        try{
            p.empilhaMaiorQueTopo(15);
            System.out.println("Erro: não deveria permitir empilhar menor que topo");
        } catch (Exception e) {
            System.out.println("Exceção lançada: " + e.getMessage());
        }
        //Pilha vazia
        Pilha  p1 = new Pilha(5);
        p1.empilhaMaiorQueTopo(5);
        System.out.println("Após empilhar em pilha vazia: " + p1);
    }

    public static void InvertePilha(){
        Pilha p = new Pilha(5);
        p.empilha(10);
        p.empilha(20);
        p.empilha(30);
        System.out.println("Pilha original: " + p);
        p.InvertePilha(p);
        System.out.println("Pilha invertida: " + p);

        //Pilha vazia
        Pilha p3 = new Pilha(5);
        p3.InvertePilha(p3);
        System.out.println("Pilha vazia invertida: " + p3);
    }

  
}

