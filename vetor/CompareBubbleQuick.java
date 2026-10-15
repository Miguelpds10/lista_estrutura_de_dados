import java.util.Date;
import java.util.Scanner;

public class CompareBubbleQuick{
    public static void main(String[] args) {
        NossoVetor vetor;
        int capacidade;
        Scanner scanner  = new Scanner(System.in);
        do{
            System.out.print("Digite a capacidade do vetor, 0 encerra: ");
            capacidade = scanner.nextInt();
            if(capacidade > 0){
                vetor = new NossoVetor(capacidade);
                vetor.preencheVetor();
                // System.out.println("Vetor original: \n" + vetor);
                long inicio = new Date().getTime();
                vetor.bubble();
                long fim = new Date().getTime();
                // System.out.println("\nVetor ordenado com bubble: \n" + vetor);
                System.out.println("Bubble demorou: " + (fim - inicio) + " ms");
                vetor.preencheVetor();
                // System.out.println("Vetor original: \n" + vetor);
                inicio = new Date().getTime();
                vetor.quicksort(0, capacidade-1);
                fim = new Date().getTime();
                // System.out.println("\nVetor ordenado com quicksort: \n" + vetor);
                System.out.println("Quicksort demorou: " + (fim - inicio) + " ms");
                inicio = new Date().getTime();
                vetor.quicksort(0, capacidade -1);
                fim = new Date().getTime();
                System.out.println("Quicksort demorou: " + (fim - inicio) + " ms");    
            }
        } while(capacidade > 0);
        scanner.close();
    }
}