
package aula1309.pkg4;

import javax.swing.JOptionPane;


public class Aula13094 {

    
    public static void main(String[] args) {
        double valor1;
        double valor2;
        String convert;
        
        convert = JOptionPane.showInputDialog(null, "Insira o primeiro valor: ");
        valor1 = Double.parseDouble(convert);
        convert = JOptionPane.showInputDialog(null, "Insira o segundo valor: ");
        valor2 = Double.parseDouble(convert);
        
        JOptionPane.showMessageDialog(null, valor1 + " + " + valor2 + " = "  + (valor1+valor2) );
        JOptionPane.showMessageDialog(null, valor1 + " - " + valor2 + " = "  + (valor1-valor2) );
        JOptionPane.showMessageDialog(null, valor1 + " x " + valor2 + " = "  + (valor1*valor2) );
        JOptionPane.showMessageDialog(null, valor1 + " / " + valor2 + " = "  + (valor1/valor2) );
    }
    
}
