/*
@author kavim
 */
package HerançaPolimorfismoInterfaces.CodifiqueDiagrama;

import java.util.ArrayList;

/**
 *
 * @author kavim
 */
public class CadastroPessoas {
    private int qtdAtual;
    
    ArrayList<Pessoa> dados = new ArrayList<>();
    
    public void CadastrarPessoa(Pessoa pessoa){
        
        dados.add(pessoa);
    
    }
    
    public void imprimePessoas(){
        
        dados.forEach((Pessoa dado) -> {
            dado.imprimeDados();
        });
      
    }
    
    
}
