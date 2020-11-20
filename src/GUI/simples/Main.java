/*
@author kavim
 */
package GUI.simples;

import javax.swing.JOptionPane;

/**
 *
 * @author kavim
 */
public class Main {
    public static void main(String[] args) {
        String opa = JOptionPane.showInputDialog("OOOOOOOOOOOPPAAA");
        JOptionPane.showMessageDialog(null, opa, "Titulo", JOptionPane.PLAIN_MESSAGE);       
        
        JOptionPane.showConfirmDialog(null,"MENSAASSAAS", "TITULO", JOptionPane.YES_NO_OPTION);
     
        Object[] possibleValues = { "First", "Second", "Third" };
        Object selectedValue = JOptionPane.showInputDialog(null,
        "Choose one", "Input",
        JOptionPane.INFORMATION_MESSAGE, null,
        possibleValues, possibleValues[0]);
        
        Object[] options = { "OK", "CANCEL","opa","aowdin","OK", "CANCEL","opa","aowdin" };
        JOptionPane.showOptionDialog(null, "Click OK to continue", "Warning",
        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
        null, options, options[0]);
        

        String usersChoiceString = JOptionPane.showInputDialog(null, " Qeueueueuueueueu MENU \n" + "1 - UM \n2 - DOIS" + "\n3 - TERCERO \n4 - Ultimo");

    }
}
