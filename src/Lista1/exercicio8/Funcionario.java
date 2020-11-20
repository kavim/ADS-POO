/*
@author kavim
 */
package Lista1.exercicio8;

/**
 *
 * @author kavim
 */
public class Funcionario {
    private String nome;
    private String codigo;
    private double renda = 1000.00;
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public double getRenda(){
    
        return this.renda;
    
    }
    
    public double comissao(){
        
        if(cargo.equals("Vendedor")){
            return 250.00;
        }
        if(cargo.equals("Supervisor")){
            return 600.00;
        }
        if(cargo.equals("Gerente")){
            return 1500.00;
        }        
        
        return 0.00;
    }
    
    
}
