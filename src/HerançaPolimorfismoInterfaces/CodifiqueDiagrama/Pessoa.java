/*
@author kavim
 */
package HerançaPolimorfismoInterfaces.CodifiqueDiagrama;

import java.util.Date;

/**
 *
 * @author kavim
 */
public abstract class Pessoa {
    private String nome;
    
//    private Date nasc = new Date(int year, int month, int date);
    private String nasc;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNasc() {
        return nasc;
    }

    public void setNasc(String nasc) {
        
        this.nasc = nasc;
    }
    
    public abstract void imprimeDados();
    
}
