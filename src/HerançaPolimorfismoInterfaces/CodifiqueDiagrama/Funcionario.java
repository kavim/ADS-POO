/*
@author kavim
 */
package HerançaPolimorfismoInterfaces.CodifiqueDiagrama;

/**
 *
 * @author kavim
 */
public class Funcionario extends Pessoa{
    private float salario;

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public float calculaImposto(){
        return (float) (this.salario*0.03);
   }
   
    @Override
    public void imprimeDados(){
        System.out.println("nome: "+this.getNome());
        System.out.println("nascimento: "+this.getNasc());
        System.out.println("calculaImposto: "+this.calculaImposto());
    }
    
}
