package Exercicios;

import java.util.Scanner;

public class AprenderFOR2 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numeroPergunta = 0;
        int valores = 0;

        while (numeroPergunta != 5) {

            int num1 = input.nextInt();
            valores += num1;
            numeroPergunta++;
        }

        System.out.println("Total = " + valores+ " a media e "+ (valores/numeroPergunta));
    }
}
