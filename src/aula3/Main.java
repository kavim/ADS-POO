package aula3;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        //- - - - - - - - - - - pessoa Fisica - - - - - - - - - - - 
        PessoaFIsica pessoa = new PessoaFIsica();        
        pessoa.setNome("o nome da pessoa fisica");
        pessoa.setEndereco("um endereço");
        pessoa.setCpf("123123123");
                
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Digite o salario: ");
        Float entrada = input.nextFloat();
        
        pessoa.RecebeSalario(entrada);
        
        ArrayList<String> dados = new ArrayList<>();
        
        dados.add(pessoa.getNome()+", "+pessoa.getEndereco()+", "+pessoa.getCpf()+", "+entrada);
        
        System.out.println(dados);
        
        //- - - - - - - - - - -  pessoa Juridica - - - - - - - - - - - 
        PessoaJuridica pessoa2 = new PessoaJuridica();        
        pessoa2.setNome("o nome da empresa");
        pessoa2.setEndereco("um endereço");
        pessoa2.setCnpj("123123123");
        pessoa2.setRamo_de_atividade("dev");
                
        Scanner input2 = new Scanner(System.in); 
        
        System.out.println("Digite o imposto: ");
        entrada = input2.nextFloat();
        
        pessoa.RecebeSalario(entrada);
        
        ArrayList<String> dadosF = new ArrayList<>();
        
        dadosF.add(pessoa2.getNome()+", "+pessoa2.getEndereco()+", "+pessoa2.getCnpj()+", "+pessoa2.getRamo_de_atividade()+", "+entrada);
        
        System.out.println(dadosF);
                
    }
    
}
