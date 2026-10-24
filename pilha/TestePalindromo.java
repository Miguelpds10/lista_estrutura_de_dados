public class TestePalindromo {

    public static void main(String[] args) {
        System.out.println("arara é palíndromo? " + palindromo("arara"));
        System.out.println("osso é palíndromo? " + palindromo("osso"));
        System.out.println("java é palíndromo? " + palindromo("java"));
        System.out.println("a é palíndromo? " + palindromo("a"));
    }



    public static boolean palindromo(String palavra){
        Pilha pilha = new Pilha(palavra.length());

        for(int i = 0; i < palavra.length(); i++){
            pilha.empilha(palavra.charAt(i));
        }

        for(int i = 0; i < palavra.length(); i++){
            if(palavra.charAt(i) != pilha.desempilha()){
                return false;
            }
        }
        return true;
    }
}