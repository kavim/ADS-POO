/*
@author kavim
 */
package Lista1.exercicio8;

/**
 *
 * @author kavim
 */
public class Financeiro {
    private Funcionario[] funcionarios = new Funcionario[10];
    
    public void criarFun()
	{
		funcionarios[0] = new NivelBasico();
		funcionarios[1] = new NivelBasico();
		funcionarios[2] = new NivelBasico();
		funcionarios[3] = new NivelBasico();
		funcionarios[4] = new NivelMedio();
		funcionarios[5] = new NivelMedio();
		funcionarios[6] = new NivelMedio();
		funcionarios[7] = new NivelMedio();
		funcionarios[8] = new Graduacao();
		funcionarios[9] = new Graduacao();
	}
    
    public void calcular()
    {
        double basico = 0.0;
        double medio = 0.0;
        double graduado = 0.0;
        double total = 0.0;
        
        for (Funcionario fun : funcionarios) {
            
            if (fun instanceof Graduacao) {   
                Graduacao g = (Graduacao) fun;
                graduado += g.getRenda();
                total += g.getRenda();                
                
                continue;
            }
            
            if (fun instanceof NivelMedio) {
                
                NivelMedio m = (NivelMedio) fun;
                medio += m.getRenda();
                total += m.getRenda();
                                
                continue;
            }
            
            if (fun instanceof NivelBasico) {
                
                NivelBasico b = (NivelBasico) fun;
                basico += b.getRenda();
                total += b.getRenda();
                
                continue;
            }
                        
//            if (fun instanceof NivelBasico) {
//                
//                NivelBasico b = (NivelBasico) fun;
//                basico += b.getRenda();
//                total += b.getRenda();
//                
//            } else if (fun instanceof NivelMedio) {
//                
//                NivelMedio m = (NivelMedio) fun;
//                
//                System.out.println(" - - -- - - medio - - - - - -");
//                System.out.println(m.getRenda());
//                
//                medio += m.getRenda();
//                total += m.getRenda();
//                                
//            } else if (fun instanceof Graduacao) {
//                
//                Graduacao g = (Graduacao) fun;
//                graduado += g.getRenda();
//                total += g.getRenda();
//                
//            } else {
//                total += fun.getRenda();
//            }
        }
        
        System.out.println("basico: "+basico);
        System.out.println("medio: "+medio);
        System.out.println("graduado: "+graduado);
        System.out.println("total: "+total);
    }
}
