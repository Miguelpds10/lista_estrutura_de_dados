public class Pilha {
    private int[] dados;
    private int topo;
    private int capacidade;

    public Pilha(int capacidade){
        this.dados = new int[capacidade];
        this.topo = 0;
        this.capacidade = capacidade;
    }
    public Pilha(){
        this(10);
        // dados = new int[10];
        // topo = 0;
    }

    public int tamanho(){
        return topo;
    }

    public boolean estaVazia(){
        return topo == 0;
    }
    public boolean estaCheia(){
        return topo == capacidade;
    }

    public void empilha(int e){
        dados[topo++] = e;
    }
    public int desempilha(){
        return dados[--topo];
    }
    @Override
    public String toString(){
        // String s = "capacidade: " + capacidade + "\ntamanho atual: " + topo + "\ndados: ";
        // for(int i = topo -1; i >=0; i--){
        //     s = s + dados[i] + " ";
        // }
        if(estaVazia()) return "pilha vazia";
        String s = "---------\n";
        for(int i = topo-1; i>=0; i--)
            s+= dados[i] + " ";
        return s + "\n";
    }
    
    //Métodos para os exercícios de prática
    public int elementoAbaixoDoTopo(){
        if(topo < 2) throw new RuntimeException("Não há elemento abaixo do topo!");
        return dados [topo -2];
    }

    public void empilhaMaiorQueTopo(int e){
        if(estaVazia()){
            empilha(e);
            return;
        }
        if(e > dados[topo - 1]){
            dados[topo - 1] = e; // substitui o topo, sem incrementar
        }
        else {
            throw new RuntimeException("O elemento não é maior que o topo!");
        }
    }

    public void InvertePilha(Pilha p){
        Pilha aux1 = new Pilha(p.capacidade);
        Pilha aux2 = new Pilha(p.capacidade);
        while(!this.estaVazia()){
            aux1.empilha(this.desempilha());
        }
        while(!aux1.estaVazia()){
            aux2.empilha(aux1.desempilha());
        }
        while(!aux2.estaVazia()){
            this.empilha(aux2.desempilha());
        }
    }
}



// Exercícios para prática antes da prova:
// construir um método para cada tarefa a seguir:
// extrair o elemento abaixo do topo;
// Inserir um elemento maior que o topo e substitui o topo;
// Modificar o teste de pilha cheia para preservar sempre uma posição do vetor;
// Inverter uma pilha, utilizando uma pilha auxiliar, sem manipular o vetor diretamente.

// Desafio
// Construir uma classe PilhaAlfabeto que armazena caracteres.