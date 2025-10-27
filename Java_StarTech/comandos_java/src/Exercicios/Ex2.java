package Exercicios;
import  java.util.Scanner;


public class Ex2 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double preco =  5.80;

        System.out.println("Quantidade do produto?");
        int quantidade = input.nextInt();

        double soma = preco * quantidade;

        if(quantidade > 10){
            System.out.println("Vc vai ter 10% de desconto: " + ((soma*0.1)+soma) + " R$");
        } else if (quantidade < 10) {
            System.out.println("Pagar: " + soma + " R$");
        } else {
            System.out.println("Erro");
        }

    }
}
