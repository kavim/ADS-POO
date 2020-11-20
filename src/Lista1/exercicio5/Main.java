/*
@author kavim
 */
package Lista1.exercicio5;

/**
 *
 * @author kavim
 */
public class Main {
    public static void main(String[] args) {
        
        NivelMedio f = new NivelMedio();
        
        f.setCodigo("123123123");
        f.setNome("MEU NOME");
        f.setBasico_inst("Libe");
        f.setMedio_inst("IFSUL");
        
        System.out.println(
                f.getNome()+"\n"+
                f.getCodigo()+"\n"+     
                f.getMedio_inst()+"\n"+
                f.getBasico_inst()+"\n"
        );
                
    }
}
