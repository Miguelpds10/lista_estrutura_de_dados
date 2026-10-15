import java.util.Random;

public class TesteBusca {
    public static void main(String[] args) {
       NossoVetor nossovetor = new NossoVetor(100000);
       nossovetor.preencheVetor();
    //    System.out.println(nossovetor);
    //    if(nossovetor.contains(50))
    //         System.out.println("50 está no vetor");
    //     else
    //         System.out.println("50 não está no vetor");

    //     int posicao = nossovetor.indexOf(30);
    //     if(nossovetor.indexOf(30) == -1)
    //         System.out.println("30 não está no vetor");
    //     else
    //         System.out.println("30 está no vetor na posição: " + posicao);
    //     nossovetor.quicksort(0, 9);
    //     System.out.println(nossovetor);
    //     int posicaoBinaria = nossovetor.buscaBinaria(70);
    //     if(posicaoBinaria == -1)
    //         System.out.println("70 não está no vetor");
    //     else
    //         System.out.println("70 está na posição: " + posicaoBinaria);
        Random random = new Random();
        int x = random.nextInt(100000);
        int contSimples = nossovetor.contadorIteracoes(x);
        nossovetor.quicksort(0, 99999);
        int contBinaria = nossovetor.buscaBinaria(x);

        System.out.println("iterações da busca simples " + contSimples);
        System.out.println("iterações da busca binária " + contBinaria);
    }
}
