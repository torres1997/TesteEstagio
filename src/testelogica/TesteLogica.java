
package testelogica;

/**
 *
 * @author Luiz Torres
 */
public class TesteLogica {

    public static void main(String[] args) {
        //Exercicio01
        imprimeNumero();
  
    }
    
    private static void imprimeNumero(){
        
        for(int i = 1; i<=100; i++){
            System.out.printf("\n %d", i);
            if(i%3==0){
                System.out.printf("BUZZ");
            }
            if(i%5==0){
                System.out.printf("BIZZ");
            }
        }
        
    }
    
}
