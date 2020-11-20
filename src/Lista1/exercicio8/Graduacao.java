/*
@author kavim
 */
package Lista1.exercicio8;

/**
 *
 * @author kavim
 */
public class Graduacao extends NivelMedio{
    private String graduacao_inst;

    public String getGraduacao_inst() {
        return graduacao_inst;
    }

    public void setGraduacao_inst(String graduacao_inst) {
        this.graduacao_inst = graduacao_inst;
    }
    
    public double getRenda(){
    
        return super.getRenda()*2;
    
    }
    
    
}
