package aula4;

import java.util.Scanner;

/**
 *
 * @author kavim
 */
public class Exercicio1 {
    
    public static void main(String[] args) {
        
        FabricaLampada fabrica = new FabricaLampada ();
            
        System.out.println("[1] para fluorescente \n[2] para incandescente \n");
        Scanner input = new Scanner(System.in);
        int resposta = input.nextInt();
        
        if(resposta == 1){
           
            Lampada fluorescente = fabrica.construir(true);           
            
            fluorescente.Ligar();
            fluorescente.Desligar();
            
        }else{
            
            Lampada incandescente = fabrica.construir(false);
            
            incandescente.Ligar();
            incandescente.Desligar();
            
        }
        
    }
    
}
