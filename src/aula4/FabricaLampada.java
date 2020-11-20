/*
@author kavim
 */
package aula4;

/**
 *
 * @author kavim
 */
public class FabricaLampada {
        
    public class Incandescente implements Lampada{
        @Override
        public void Ligar() {            
             System.out.println("Lampada Incandescente ligada!");
        }

        @Override
        public void Desligar() {            
            System.out.println("Lampada Incandescente 10ligada!");
        }   
    }
    
    public class Fluorescente implements Lampada{
        @Override
        public void Ligar() {            
             System.out.println("Lampada Fluorescente ligada!");
        }

        @Override
        public void Desligar() {            
            System.out.println("Lampada Fluorescente 10ligada!");
        }
    }
    
    public Lampada construir (boolean fluorescente) {
        if (fluorescente) {
            return new Fluorescente();
        }
        return new Incandescente ();
    }
    
}
