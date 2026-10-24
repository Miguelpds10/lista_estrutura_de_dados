public class Recursao{

    static long fatorial(long n){
        if(n <= 1) return 1;
        return  n * fatorial(n-1);
    }
    static int fibonacci(int n){
        if(n <= 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    /*O caso Base é quando n <= 1, a função retorna n 
     Passo Recursivo é quando o  n soma o resultado de somaAte(n-1) */
    static int somaAte(int n){
        if(n <= 1) return n;
        return n + somaAte(n-1);
    }

    /*O caso Base é quando n < 10, a função retorna 1
     Passo Recursivo é quando o n divide por 10 e soma o resultado de contaDigitos(n/10) */
    static int contaDigitos(int n){
        if(n < 10) return 1;
        return 1 + contaDigitos(n/10);
    }

    static int somaAteFor(int n){
        int soma = 0;
        for(int i = 1; i <= n; i++){
            soma += i;
        }
        return soma;
    }

    public static void main(String[] args){
        for(int i = 0; i<=25; i++){
            System.out.println("Fatorial de " + i + " = " + fatorial(i));
        }

        for(int i = 0; i<=45; i++){
            System.out.println("Fibonacci de " + i + " = " + fibonacci(i));
        }

       // Testes para o método somaAte com os valores 1, 5 e 100
        System.out.println("\n--- Testes de somaAte ---");
        System.out.println("somaAte(1) = " + somaAte(1));
        System.out.println("somaAte(5) = " + somaAte(5));
        System.out.println("somaAte(100) = " + somaAte(100));

        // Testes para o método somaAte com os valores 1, 5 e 100
        System.out.println("\n--- Testes de somaAteFor ---");
        System.out.println("somaAte(1) = " + somaAteFor(1));
        System.out.println("somaAte(5) = " + somaAteFor(5));
        System.out.println("somaAte(100) = " + somaAteFor(100));

        // Testes para o método contaDigitos com os valores 7, 4729 e 100000
        System.out.println("\n--- Testes de contaDigitos ---");
        System.out.println("contaDigitos(7) = " + contaDigitos(7));
        System.out.println("contaDigitos(4729) = " + contaDigitos(4729));
        System.out.println("contaDigitos(100000) = " + contaDigitos(100000));
    }
}