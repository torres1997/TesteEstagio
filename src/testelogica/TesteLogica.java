
package testelogica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
        //System.out.print(fibonacci());
        
        //Exercicio05
        System.out.print(palavraTriangulo("SKY"));
        
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
    
    
   private static int palavraTriangulo(String s){
       Map map = new HashMap();  
        //Adding elements to map  
        map.put('A',1);  
        map.put('B',2);  
        map.put('C',3);  
        map.put('D',4);
        map.put('E',5);
        map.put('F',6);
        map.put('G',7);
        map.put('H',8);
        map.put('I',9);
        map.put('J',10);
        map.put('K',11);
        map.put('L',12);
        map.put('M',13);
        map.put('N',14);
        map.put('O',15);
        map.put('P',16);
        map.put('Q',17);
        map.put('R',18);
        map.put('S',19);
        map.put('T',20);
        map.put('U',21);
        map.put('V',22);
        map.put('W',23);
        map.put('X',24);
        map.put('Y',25);
        map.put('Z',26);
        
        int soma = 0;
        for (int i = 0; i < s.length(); i++) {
          //System.out.println(map.get(s.charAt(i)));
          if(map.containsKey(s.charAt(i))){
              soma += (int)map.get(s.charAt(i));
          }
        }
        
        int position = numeroTriangulo(soma, s);
        
        return position;
    }

    private static int numeroTriangulo(int soma, String s) {
        
        int pos = 0, element = 0;
        int n = s.length();
        int valorMaximo = n*26, i = 1, numero;
        
        ArrayList<Integer> triangulos = new ArrayList<Integer>();
        
        while(element < valorMaximo){
            element = i*(i+1)/2;
            triangulos.add(element);
            i++;
        }
     
        pos = triangulos.indexOf(soma) + 1;
        
        if(pos == 0)
            pos = -1;
        
        return pos;
    
   }
    
}