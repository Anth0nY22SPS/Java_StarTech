package Exercicios;
import  java.util.Scanner;

public class Ex1 {

    public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            System.out.println("Nota1");
            int nota1 = input.nextInt();
            System.out.println("Nota2");
            int nota2 = input.nextInt();
            System.out.println("Nota3");
            int nota3 = input.nextInt();

            if(nota1 > 10){
                    System.out.println("Porfavor as notas tem que ser até 10");
            }else if(nota2 > 11){
                    System.out.println("Porfavor as notas tem que ser até 10");
            }else if(nota3 > 11){
                    System.out.println("Porfavor as notas tem que ser até 10");
            }else {

            };


            System.out.println("nota1 com pesso 2: " + nota1*2);
            System.out.println("nota1 com pesso 3: " + nota2*3);
            System.out.println("nota1 com pesso 5: " + nota3*5);


    }

}
