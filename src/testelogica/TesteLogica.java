
package testelogica;

/**
 *
 * @author Luiz Torres
 */
public class TesteLogica {

    public static void main(String[] args) {
        //Exercicio01
        //imprimeNumero();
        
        //Exercicio02
        int[] a = {1,2,3,4,5};
        //System.out.print(somaDeQuadrados(a));
        
        //Exercicio03
        System.out.print(fibonacci());
        
        
        
    }
    
    private static void imprimeNumero(){
        
        for(int i = 1; i<=100; i++){
            System.out.printf("\n %d", i);
            if(i%3==0)
                System.out.printf("BUZZ");
            if(i%5==0)
                System.out.printf("BIZZ");
        }
    }

    
    private static int somaDeQuadrados(int[] a) {
        int soma = 0;
        
        for(int i=0; i<a.length;i++){
            soma += a[i]*a[i];
        }
        
        return soma;
    }
    
    
    private static int fibonacci() {
        int f1, f2, aux, fibonacci;
        fibonacci = f1 = f2 = 1;
        float div;
        int i = 0;
        boolean roof = false;
        
        while(!roof){
            fibonacci = f1 + f2;
            aux = f2;
            f1 = f2;
            f2 = fibonacci;
            div = fibonacci / 10000;
            if(div >= 1){
                roof = true;
            }
        }
        return fibonacci;
    }
    
}