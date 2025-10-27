import  java.util.Scanner;

public class SextoExercicio {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int NumeroDia = input.nextInt();

        switch (NumeroDia){
            case 0 :
                System.out.println("Tem que ser maior que 0");
            case 1 :
                System.out.println("Domingo"); break;
            case 2 :
                System.out.println("Segunda"); break;
            case 3 :
                System.out.println("Terça"); break;
            case 4 :
                System.out.println("Quarta"); break;
            case 5 :
                System.out.println("Quinta"); break;
            case 6 :
                System.out.println("Sexta"); break;
            case 7 :
                System.out.println("Sabado"); break;
            default:
                System.out.println("Erro porfavor digiter apenas numeros e de 1 a 7");
        }
    }
}
