package Exercicios;
import java.util.Scanner;
import  java.util.Random;

public class Ex7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random aleatorio = new Random();

        int valor2 = aleatorio.nextInt();
        int valor;

        do {

            valor = input.nextInt();

           if(valor < valor2){
               System.out.println("Maior");
           }else{
               System.out.println("Menor");
           }
        }while (valor != valor2);
    }
}