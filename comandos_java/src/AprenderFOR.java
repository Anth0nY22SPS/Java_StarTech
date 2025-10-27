import  java.util.Scanner;

public class AprenderFOR {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);



        System.out.println("Digite 1 para apena uma tabuada | Ditige 2 para uma sequencia de varias tabuada ");
        int num2 = input.nextInt();

        switch (num2){
            case 1:
                System.out.print("Tabuada: ");
                int escolhar1 = input.nextInt();
                UmaTaboda(escolhar1);
                break;
            case 2:
                System.out.print("Ate: ");
                int escolhar2 = input.nextInt();
                MaisTabada(escolhar2);
                break;
        }

    }

    static void UmaTaboda(int num2){
        for(int n1 = 0; n1!= 11; n1++){

            System.out.println(num2+"x"+n1+" = "+n1*num2);
        }
    }

    static void MaisTabada(int num2){

        for(int num1 = 1; num1!=num2+1; num1++){

            System.out.println("");
            for(int num3=0; num3!= 11; num3++){
                System.out.println(num1 +"x"+num3+" = "+ num1*num3);
            }
        }
    }

}
