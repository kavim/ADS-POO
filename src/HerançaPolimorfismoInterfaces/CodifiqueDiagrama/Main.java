/*
@author kavim
 */
package HerançaPolimorfismoInterfaces.CodifiqueDiagrama;

/**
 *
 * @author kavim
 */
public class Main {
    public static void main(String[] args) {
        
        CadastroPessoas cp = new CadastroPessoas();
        
        Pessoa cliente = new Cliente();
        cliente.setNome("nomeeee");        
        cliente.setNasc("06/12/2211");
        
        Funcionario fun = new Funcionario();
        fun.setNome("nomeeee");        
        fun.setNasc("06/12/2211");
        fun.setSalario(1000);
        
        Gerente ge = new Gerente();
        ge.setNome("nomeeee");        
        ge.setNasc("06/12/2211");
        ge.setArea("CTO");
        ge.setSalario(5000);
        
        cp.CadastrarPessoa(cliente);
        cp.CadastrarPessoa(fun);
        cp.CadastrarPessoa(ge);
                
        cp.imprimePessoas();
                
    }
}
