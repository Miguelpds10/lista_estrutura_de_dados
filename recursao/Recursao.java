public class Recursao{

    static int fatorial(int n){
        if( n <= 1) return 1;
        return  n * fatorial(n-1);
    }
    static int fibonacci(int n){
        if(n <= 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args){
        // for(int i = 0; i<=20; i++){
        //     System.out.println("Fatorial de " + i + " = " + fatorial(i));
        // }
        for(int i = 0; i<=45; i++){
            System.out.println("Fibonacci de " + i + " = " + fibonacci(i));
        }
    }
}