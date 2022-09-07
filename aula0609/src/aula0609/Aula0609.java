package aula0609;

import java.util.Scanner;


public class Aula0609 {

    
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        int escolha = 0;
        int cont;
        int far;
        int pes;
        int sx;
        int quantMasc = 0, quantFem = 0;
    
        
        while(escolha != 8){
            
        System.out.println(" Escolha uma opção: \n1 - Tabela de conversão de polegadas\n2 - Tabela de conversão de Fahrenheit\n3 - Verificação de idade/sexo\n4 - Verificação de Sexo \n5 - ex5 \n6 - ex6\n7 - ex7\n8 - Sair");
        escolha = grava.nextInt();
        
                switch(escolha){  
                    case 1: 
                    for(cont = 0;cont < 21; cont++){
             double conta = cont * 2.54;
             System.out.println(cont + " polegadas = " + conta + " cm");   
        } break;
        
                    case 2 : 
                   for(far = 50; far < 151; far++) {
                       double cel;
                       cel = 5*(far-32)/9;
                       System.out.println(far + (" fahrenheit = " + cel + " C"));
                   }break;
                   
                    case 3: for(pes = 0; pes < 21; pes++){
                        String nome;
                        int idade;
                        int sexo;
                        System.out.println("Digite seu nome: ");
                        nome = grava.next();
                        System.out.println("Digite sua idade: ");
                        idade = grava.nextInt();
                        System.out.println("Escolha seu sexo: 1(feminino) ou 2(masculino)");
                        sexo = grava.nextInt();
                        
                        if(sexo == 2 && idade > 21){
                        System.out.println(nome);
                        }           
                    }break;
                    case 4: 
                        for(sx = 0; sx < 4; sx++){
                        int quantSexo = 0;
                        System.out.println("Digite seu sexo: 1(Feminino) ou 2(Masculino)");
                        quantSexo = grava.nextInt();
                        
                        
                        if(quantSexo == 1 ){
                            quantFem++;
                        }
                        else if(quantSexo == 2){
                            quantMasc++;
                        }
                        else{
                            System.out.println("OPÇÃO INVÁLIDA!!");
                            sx --;
                        }}
                        System.out.println("De "+ sx + " pessoas: \nSão " + quantMasc + " Homens e " + quantFem + " mulheres" );
                        
                    break;
                    case 5: 
                       double paisa = 5000000;
                       double paisb = 7000000;
                       int contAno = 0;
                       
                      while(paisa < paisb){
                          paisa = (paisa * 0.03) + paisa;
                          paisb = (paisb * 0.02) + paisb;
                          contAno ++;
                      }
                      System.out.println("Demorará " + contAno + " Anos para o pais A ultrapassar o pais b em população");
                        
                        
                    break;
        
       
               }
        
    }}
    
}
