package aula3;

public class PessoaFIsica extends Pessoa{
    private String Cpf;
    
    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }
    
    public void RecebeSalario(float salario){
        System.out.println("sal "+salario);
    }
            
    
}
