/*
@author kavim
 */
package Lista1.exercicio3;

/**
 *
 * @author kavim
 */
public class Main {
    public static void main(String[] args) {
        
        Veterinario veterinario = new Veterinario();
        
        Cachorro cachorro = new Cachorro();
        Cavalo cavalo = new Cavalo();
        Preguica preguica = new Preguica();
        
        veterinario.examinar(preguica);
        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
                
    }
}
