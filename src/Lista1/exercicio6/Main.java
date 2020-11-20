/*
@author kavim
 */
package Lista1.exercicio6;

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
        
        System.out.println("renda: "+f.getRenda());
        
        System.out.println("------------------------------------------------------------------------------");
        
        
        NivelBasico b = new NivelBasico();
        
        b.setCodigo("00202858");
        b.setNome("MEU NOME Basico");
        b.setBasico_inst("BASIC");
        
        System.out.println(
                b.getNome()+"\n"+
                b.getCodigo()+"\n"+
                b.getBasico_inst()+"\n"
        );
        
        System.out.println("renda: "+b.getRenda());
        
        
        System.out.println("------------------------------------------------------------------------------");
        
        Graduacao g = new Graduacao();
        
        g.setCodigo("11111");
        g.setNome("MEU NOME GRADUADO");
        g.setBasico_inst("GRADUADO");
        
        System.out.println(
                g.getNome()+"\n"+
                g.getCodigo()+"\n"+
                g.getBasico_inst()+"\n"+
                g.getMedio_inst()+"\n"
        );
        
        System.out.println("renda: "+g.getRenda());
                
    }
}
