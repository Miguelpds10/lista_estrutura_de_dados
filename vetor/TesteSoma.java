public class TesteSoma {
    public static void main(String[] args){

        //Escolhi testar os métodos maior, menor e media, para retornarem 0, 
        // pois o vetor está vazio, e não há elementos para calcular a soma, maior, menor e média.
        System.out.println("------------Vetor Vazio----------------");
        NossoVetor vetorvazio = new NossoVetor(4);
        System.out.println(vetorvazio.maior()); 
        System.out.println(vetorvazio.menor());
        System.out.println(vetorvazio.media());
        
        System.out.println("----------------Vetor Cheio-------------------");

        NossoVetor vetor = new NossoVetor(4);
        vetor.add(-5);
        vetor.add(-30);
        vetor.add(34);
        vetor.add(10);
        System.out.println("Soma dos elementos do vetor: " + vetor.soma()); 
        System.out.println("Maior dos elementos do vetor: " + vetor.maior());
        System.out.println("Menor dos elementos do vetor: " + vetor.menor());
        System.out.println("Média dos elementos do vetor: " + vetor.media());

    }
}
