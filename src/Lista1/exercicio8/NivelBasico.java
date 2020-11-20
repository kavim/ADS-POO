/*
@author kavim
 */
package Lista1.exercicio8;

/**
 *
 * @author kavim
 */
public class NivelBasico extends Funcionario{
    private String basico_inst;

    public String getBasico_inst() {
        return basico_inst;
    }

    public void setBasico_inst(String basico_inst) {
        this.basico_inst = basico_inst;
    }
    
    
    public double getRenda(){
    
        return super.getRenda()*1.1;
    
    }
}
