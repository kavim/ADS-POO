package aula3;

import java.util.ArrayList;

/**
 *
 * @author kavim
 */


public class PessoaJuridica extends Pessoa{
    public String Cnpj;
    public String Ramo_de_atividade;

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String Cnpj) {
        this.Cnpj = Cnpj;
    }

    public String getRamo_de_atividade() {
        return Ramo_de_atividade;
    }

    public void setRamo_de_atividade(String Ramo_de_atividade) {
        this.Ramo_de_atividade = Ramo_de_atividade;
    }
    
    public void PagaImposto(float Valor){
        
        System.out.println("salario: "+Valor);
        
    }
    
}
