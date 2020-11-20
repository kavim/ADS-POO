package aula3Exe2;
/**
 *
 * @author kavim
 */
public class Main {
    public static void main(String[] args) {
        
//        cadastrar cd
          Cd cd = new Cd();
          cd.setAutor("Amon Amarth");
          cd.setDuracao(321);
          cd.setTitulo("Berserker");
          cd.setNumDeFaixas(11);
          cd.setDescricao("Descricao");
          
//        cadastrar DVD
          Dvd dvd = new Dvd();
          dvd.setAutor("Christopher Lennertz");
          dvd.setDuracao(1231);
          dvd.setTitulo("The Boys");
          dvd.setClassificacao("Drama");
          dvd.setEstudio("AmanazonPrimeVideo");
          
          
          //Cadastrar Pendrive
          Pendrive pendrive = new Pendrive();
          pendrive.setCapacidade(16);
          pendrive.setConteudo("Service Pack 2 for Windows XP Professional, x64 Edition - ISO-9660 CD Image File");
                
    }
}
