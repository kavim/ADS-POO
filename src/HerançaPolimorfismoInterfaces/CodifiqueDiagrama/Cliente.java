/*
@author kavim
 */
package HerançaPolimorfismoInterfaces.CodifiqueDiagrama;

/**
 *
 * @author kavim
 */
public class Cliente extends Pessoa{
    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public void imprimeDados(){
        System.out.println("nome: "+this.getNome());
        System.out.println("nascimento: "+this.getNasc());
        System.out.println("getCodigo: "+this.getCodigo());
    }
}
