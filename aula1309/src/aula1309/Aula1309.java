package aula1309;

import javax.swing.JOptionPane;


public class Aula1309 {


    public static void main(String[] args) {
        String texto = "";
        double valor1;
        double valor2;
        double valor3;
        double media;
        String nome;
        nome = JOptionPane.showInputDialog(null, "Insira seu nome: ");
        texto = JOptionPane.showInputDialog(null, "digite sua nota do primeiro bimestre: ");
        valor1 = Double.parseDouble(texto);
         texto = JOptionPane.showInputDialog(null, "digite sua nota do segundo bimestre: ");
        valor2 = Double.parseDouble(texto);
         texto = JOptionPane.showInputDialog(null, "digite sua nota do terceiro bimestre: ");
        valor3 = Double.parseDouble(texto);
        
        media = (valor1 + valor2 + valor3)/3;
        JOptionPane.showMessageDialog(null,nome + " Sua média final é: " + media);
        
    }
    
}
