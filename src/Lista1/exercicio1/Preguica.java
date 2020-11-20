/*
@author kavim
 */
package Lista1.exercicio1;

/**
 *
 * @author kavim
 */
public class Preguica extends Animal{
    
    private boolean arvore = false;
    
    @Override
    public void sonido(){
        System.out.println("Mais tarde eu faço!!!");
    }
    
    public void subirArvore(){
        if(arvore){
            System.out.println("To na arvere");
        }else{
            arvore = true;
            System.out.println("Subindo na arvore");
        }
    }
}
