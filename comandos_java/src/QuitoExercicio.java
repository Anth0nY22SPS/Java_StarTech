import java.util.Scanner;

public class QuitoExercicio {
    public static void main(String[] args){

        System.out.println(media());
    }

    static String media(){
        Scanner input = new Scanner(System.in);

        System.out.println("primeira nota");
        int n1 = input.nextInt();
        System.out.println("segunda nota");
        int n2 = input.nextInt();
        System.out.println("terceira nota");
        int n3 = input.nextInt();
        System.out.println("quarta nota");
        int n4 = input.nextInt();

        int calculo = (n1+n2+n3+n4)/4;

        if(calculo < 6){
            return "a media fico: (" + calculo + ") vc esta reprovado";
        }else{
            return "a media fico: ("+ calculo + ") vc esta aprovado";
        }
    }
}
