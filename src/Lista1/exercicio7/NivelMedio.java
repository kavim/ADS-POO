/*
@author kavim
 */
package Lista1.exercicio7;

/**
 *
 * @author kavim
 */
public class NivelMedio extends NivelBasico{
    
    private String medio_inst;

    public String getMedio_inst() {
        return medio_inst;
    }

    public void setMedio_inst(String medio_inst) {
        this.medio_inst = medio_inst;
    }
    
    public double getRenda(){
    
        return super.getRenda()*1.5;
    
    }
}
