
package arvore;

import java.util.Stack;
/**
 *
 * @author Luiz Torres
 */
public class Arvore {
    
    int id;
    Arvore[] filhos;
   
    Arvore(int id, Arvore[] filhos) {
        this.id = id;
        this.filhos = filhos;

    }
    
    public static Arvore criaArvore(){
        
        //root = new Arvore(1,new Arvore[]{new Arvore(4, new Arvore[]{new Arvore(10, new Arvore[]{new Arvore(8)}),new Arvore(2, new Arvore[]{new Arvore(12, new Arvore[]{new Arvore(13, new Arvore[]{new Arvore(9)})})})}), new Arvore(7, new Arvore[]{new Arvore(3), new Arvore(11, new Arvore[]{new Arvore(6), new Arvore(5)})})});
        Arvore no9 = new Arvore(9, new Arvore[]{null, null});
        Arvore no13 = new Arvore(13,new Arvore[]{no9,null}); 
        //System.out.printf("O filho da direita %d\n",no13.filhos[0].id);
        Arvore no12 = new Arvore(12, new Arvore[]{no13, null}); 
        Arvore no2 = new Arvore(2, new Arvore[]{no12, null}); 
        //System.out.printf("O filho da direita %d\n",no2.filhos[0].id);
        Arvore no8 = new Arvore(8, new Arvore[]{null, null});
        Arvore no10 = new Arvore(10, new Arvore[]{no8, null}); 
        Arvore no4 = new Arvore(4, new Arvore[]{no10, no2}); 
        //System.out.printf("O filho da direita %d e %d\n",no4.filhos[0].id, no4.filhos[1].id);
        Arvore no3 = new Arvore(3, new Arvore[]{null, null}); 
        Arvore no5 = new Arvore(5, new Arvore[]{null, null}); 
        Arvore no6 = new Arvore(6, new Arvore[]{null, null}); 
        Arvore no11 = new Arvore(11, new Arvore[]{no6, no5}); 
        Arvore no7 = new Arvore(7, new Arvore[]{no3, no11}); 
        Arvore no1 = new Arvore(1, new Arvore[]{no4, no7}); 
       
        return no1;
    }
    
    public static void buscaElemento(Arvore a, int n, Stack pilhaNo) {
        pilhaNo.push(a.id);
        
        if (a.id == n || (Integer) pilhaNo.peek() == n) {
            return;
        } else {
            if (a.filhos[0] != null) {
                if ((Integer) pilhaNo.peek() != n) 
                    buscaElemento(a.filhos[0], n, pilhaNo);   
            }
            if (a.filhos[1] != null) {
                if ((Integer) pilhaNo.peek() != n){
                    buscaElemento(a.filhos[1], n, pilhaNo);
                    if((Integer) pilhaNo.peek()==a.id){
                        pilhaNo.pop();
                    }      
                }
                
            } else {
                if ((Integer) pilhaNo.peek() != n) {
                    pilhaNo.pop();
                    return;
                }
            }
        }
    }
    
    public static int[] caminho_Arvore(Arvore a, int n) {
        
    
        Stack<Integer> pilhaNo = new Stack<>();
        buscaElemento(a, n, pilhaNo);
        int[] vetor = new int[pilhaNo.size()];
        int i = pilhaNo.size()-1;
        while(!pilhaNo.empty()){
            vetor[i] = pilhaNo.pop();
            i--;
        }

   
        return vetor;
    }
    
}
