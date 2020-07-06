/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atibidadeavaliativa;

import java.util.Scanner;

/**
 *
 * @author Kayke
 */
public class AtibidadeAvaliativa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.println("Digite um número para escolher o programa:");
       int esc = entrada.nextInt();
       
        switch (esc) {
            case 1:
                Metodo.geb();
                break;
            case 2:
                Metodo.extenso();
                break;
            case 3:
                Metodo.multiplos();
                break;
            case 4:
                Metodo.crescente();
                break;
            case 5:
                Metodo.horas();
                break;
            case 6:
                Metodo.horaentrada();
                break;
            case 7:
                Metodo.sequencia();
                break;
            case 8:
                Metodo.cardapio();
                break;
            case 9:
                Metodo.somainteiro();
                break;
            case 10:
                Metodo.somaprimos();
                break;
            case 0:
                System.exit(0);
            default:
                break;
        }
           
                   
           
       
       
    }

    private static class Metodo {

        private static void geb() {
        Scanner entrada = new Scanner(System.in); 
        
        System.out.println("Informe o sexo: Digite 1 para Masculino e 2 para Feminino");
        int sexo = entrada.nextInt();
        System.out.println("Digite o seu peso em Kg:");
        float pc = entrada.nextFloat();
        System.out.println("Digite a sua altura em centímetros:");
        int alt = entrada.nextInt();
        System.out.println("Digite a sua idade em anos:");
        int i = entrada.nextInt();
        
       if(sexo==1){
            float geb = (float)(66.47 + 13.75 * pc + 5 * alt - 6.76 * i);
          System.out.println("\nGEB = " +geb);
       }
       else if(sexo==2){
            float geb = (float) (655.1 + (9.56 * pc) + (1.85 * alt) - (i * 4.67));
           System.out.println("\nGEB = " +geb);
       }
             
        
        
        
        }

        private static void extenso() {
 
		int n=0,resto1,resto2,div1,div2;
		String centena="",dezena="",unidade="";
		System.out.println("Digite um numero entre 0 e 999: ");
		
		Scanner scanner = new Scanner(System.in);    
		n = scanner.nextInt();
		
		while(n<=999 && n!=-1){
			resto1 = n%100;
			div1 = n/100;
			resto2 = resto1%10;
			div2 = resto1/10;	
	 
		switch(div1){
                case 1 : centena = "cento"; break;
                case 2 : centena = "duzentos"; break;
		case 3 : centena = "trezentos"; break;
		case 4 : centena = "quatrocentos"; break;
		case 5 : centena = "quinhentos"; break;
		case 6 : centena = "seiscentos"; break;
                case 7 : centena = "setecentos"; break;
		case 8 : centena = "oitocentos"; break;
                case 9 : centena = "novecentos"; break;
		}
 
		if(resto1 !=0 && resto1>10 && resto1<20) {
		switch(resto1){
                case 11: dezena = "onze"; break;
		case 12: dezena = "doze"; break;
		case 13: dezena = "treze"; break;
		case 14: dezena = "quatorze"; break;
		case 15: dezena = "quinze"; break;
		case 16: dezena = "dezesseis"; break;
		case 17: dezena = "dezessete"; break;
		case 18: dezena = "dezoito"; break;
		case 19: dezena = "dezenove"; break;
		}
		}else{
		switch(div2){
		case 1 : dezena = "dez"; break;
		case 2 : dezena = "vinte"; break;
		case 3 : dezena = "trinta"; break;
		case 4 : dezena = "quarenta"; break;
		case 5 : dezena = "cinquenta"; break;
		case 6 : dezena = "sessenta"; break;
		case 7 : dezena = "setenta"; break;
                case 8 : dezena = "oitenta"; break;
                case 9 : dezena = "noventa"; break;
		}
	}
 
                if(resto1>=20 || n<10 || resto1<10){
		switch(resto2){
                    case 1 : unidade = "um"; break;
                    case 2 : unidade = "dois"; break;
                    case 3 : unidade = "tres"; break;
                    case 4 : unidade = "quatro"; break;
                    case 5 : unidade = "cinco"; break;
                    case 6 : unidade = "seis"; break;
                    case 7 : unidade = "sete"; break;
                    case 8 : unidade = "oito"; break;
                    case 9 : unidade = "nove"; break;
		}
	}
 
                    if(n==0)
			System.out.println("zero");
			else{
                            if(n==1000)
                            System.out.println("mil"); 
			else{
                            if(n==100)
                            System.out.println("cem");
			else{
                            if(n>100 && resto1<10 && resto1!=0)
                            System.out.println(centena + " e " + unidade);
			else{
                            if(n>100 && resto1 ==0)
                            System.out.println(centena);
                        else {
                            if(n>100 && resto1 !=0 && resto2 !=0 && resto1>=20)
                            System.out.println(centena + " e " + dezena + " e " + unidade);
			else{
                            if(n>100 && resto1 !=0 && resto2 ==0)
                            System.out.println(centena + " e " + dezena);
			else{
                            if(n>100 && resto1 !=0)
                            System.out.println(centena + " e "+ dezena);
			else{
                            if(n<100 && resto1 !=0 && resto2 ==0)
                            System.out.println(dezena);
                        else{
                            if(n>20 && resto1 !=0 && resto2 !=0)
                            System.out.println(dezena + " e " + unidade);
                        else{
                            if(n<10)
                            System.out.println(unidade);
                        else
                            System.out.println(dezena);
                                                   }
                                                }
												
                                            }
                                        }
                                    }
				}
                            }   
                        }								 
	}
}
            

        private static void multiplos() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double a = entrada.nextDouble();
        System.out.println("Digite o segundo número: ");
        double b = entrada.nextDouble();
        
        if(a%b==0)
            System.out.println("Não são múltiplos");
        else
            System.out.println("São múltiplos!");
            
        
        }

        private static void crescente() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int i = entrada.nextInt();
        System.out.println("Digite o segundo número: ");
        double a = entrada.nextDouble();
        System.out.println("Digite o terceiro número: ");
        double b = entrada.nextDouble();
        System.out.println("Digite o quarto número: ");
        double c = entrada.nextDouble();
        
        if (i==1){
        if (a>b && b>c){
            System.out.println("Ordem crescente" +c+b+a);
        }
        else if (a>c && c>b){
            System.out.println("Ordem crescente" +c+a+b);
        }
        else if (b>a && a>c){
            System.out.println("Ordem crescente" +a+c+b);
        }
        else if (c>a && a>c){
            System.out.println("Ordem crescente" +b+a+c);
        }   
        else if (c>b && b>a){
            System.out.println("Ordem crescente" +a+b+c);
        }
        else if(i==2)
        if(c>b && a>b){
           System.out.println("Ordem decrescente"+a+c+b);
        }
        else if (a>c && c>b){
           System.out.println("Ordem decrescente"+a+b+c); 
        }
        else if (b>a && a>c){
            System.out.println("Ordem decrescente"+b+c+a);
        }
        else if (c>a && a>c){
            System.out.println("Ordem decrescente"+c+a+b);
        }
        else if(c>b && b>a){
            System.out.println("Ordem decrescente"+c+b+a);
        }    

        private static void horas() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o número de horas extras: ");
        int he = entrada.nextInt();
        System.out.println("Informe a quantidade de horas de faktas: ");
        int hf = entrada.nextInt();
        int h = he - 2/3 * hf;
        
        
        if(h>40){
            System.out.println("500 reais");
        }
        else if (h >20 && h <= 30) {
            System.out.println("300 reais"); 
        }  
        else if (h >10 && h <= 20) {
            System.out.println("200 reais");
        }
        else if (h <= 10) {
            System.out.println("100 reais");
        }
        
        }

        private static void horaentrada() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a hora de entrada no formato 24h: ");
        int ent = entrada.nextInt();
        int sai = ent + 6;
        System.out.println("A sua hora de saída é:" +sai+ "horas");
        
        }

        private static void sequencia() {
        Scanner entrada = new Scanner(System.in);
        
        float a = 1;
        float f = 1;
        float i = 0;
        
        if(a>=0){
            System.out.println("Digite um número: ");
            a = entrada.nextInt();
            f+=a;
        }
        System.out.println("A média foi de"+f/(i-1));   
        }

        private static void cardapio() {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de cachorros quentes (R$2)");
        int c = entrada.nextInt();
        System.out.println("Digite a quantidade de refrigerantes (R$2,50)");
        int r = entrada.nextInt();
        System.out.println("Digite a quantidade de sobremesas (R$1,50)");
        int s = entrada.nextInt();
        
        float conta = (float) (2*c + 2.5*r + 1.5*s);
        System.out.println("O valor total da conta é: R$"+conta);
        
        }

        private static void somainteiro() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro");
        int num = entrada.nextInt();
        int soma = 0;

        
        for (int i=0; i<=num;i++){
            soma += i;
        }
        System.out.println("A soma dos números inteiros"+soma);
        }

        private static void somaprimos() {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite até que número serão somados os primos");
        int num = entrada.nextInt();
        int soma = 0;
        if (num>=2)
            soma+=2;
        if (num>=3)
            soma+=3;
        if (num>=5)
            soma+=5;
        if (num>=7)
            soma+=7;
        if (num>=11)
            soma+=11;
        for (int i=2; i<=num;i++){
            if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0 && i%11!=0)
                soma+=i;
        }
        System.out.println("A soma dos primos até "+num+" é: "+soma);
    }
}
        }

      
        
      
        
        









