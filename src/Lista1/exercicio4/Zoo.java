/*
@author kavim
 */
package Lista1.exercicio4;

/**
 *
 * @author kavim
 */
public class Zoo {
    
    private Animal[] jaulas = new Animal[10];
    
    public void criarJaula()
	{
		jaulas[0] = new Cachorro();
		jaulas[1] = new Cavalo();
		jaulas[2] = new Preguica();
		jaulas[3] = new Cachorro();
		jaulas[4] = new Cavalo();
		jaulas[5] = new Preguica();
		jaulas[6] = new Cachorro();
		jaulas[7] = new Cavalo();
		jaulas[8] = new Preguica();
		jaulas[9] = new Preguica();
	}
    
    public void cutucarJaulas()
    {
        for (Animal jaula : jaulas) {
            jaula.sonido();
            if (jaula instanceof Cavalo) {
                Cavalo c = (Cavalo) jaula;
                c.correr();
            } else if (jaula instanceof Cachorro) {
                Cachorro c = (Cachorro) jaula;
                c.correr();
            }
        }
    }
    
}
