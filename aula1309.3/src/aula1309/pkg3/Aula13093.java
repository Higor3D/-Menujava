
package aula1309.pkg3;

import javax.swing.JOptionPane;

public class Aula13093 {

   
    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog(null, "Insira um valor em reais: ");
        double reais = Double.parseDouble(valor);
        
        double conta = reais * 0.10;
        JOptionPane.showMessageDialog(null,"10% de " + reais + " é " + conta);
    }
    
}
