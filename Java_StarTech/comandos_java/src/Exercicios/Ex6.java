package Exercicios;
import  java.util.Scanner;

public class Ex6 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Digiter um número");
        int valor = input.nextInt();
        int verificar = valor%2;

        if (verificar == 0){
            System.out.println("Esse numero é par");
        }else{
            System.out.println("Esse numero é impar");
        }
    }
}
