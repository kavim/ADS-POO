/*
@author kavim
 */
package HerançaPolimorfismoInterfaces.CodifiqueDiagrama;

/**
 *
 * @author kavim
 */
public class Gerente extends Funcionario{
    
    private String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    public float calculaImposto(){
        return (float) (this.getSalario()*0.05);
    }
    
    @Override
    public void imprimeDados(){
        System.out.println("nome: "+this.getNome());
        System.out.println("nascimento: "+this.getNasc());
        System.out.println("Salario: "+this.getSalario());
        System.out.println("Imposto: "+this.calculaImposto());
        System.out.println("getArea: "+this.getArea());
    }
}
