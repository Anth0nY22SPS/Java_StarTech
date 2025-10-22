import java.util.Scanner;

public class QuartoExercicio {

    public static void main(String[] args) {

        Imc();
    }

    static void Imc(){
        Scanner input = new Scanner(System.in);

        System.out.println("Seu peso");
        float Peso = input.nextFloat();
        System.out.println("Seu Altura");
        float Altura = input.nextFloat();

        float imc = Peso / (Altura * Altura);

        if(imc < 18.5){
            System.out.println("seu imc é " + imc + " abaixo do peso");
        } else if (imc > 18.5 && imc < 24.9) {
            System.out.println("seu imc é " + imc + " Pesso Ideal");
        } else if (imc > 25.0 && imc < 29.9) {
            System.out.println("seu imc é " + imc + " Levemente acima do peso");
        } else if (imc > 30.0 && imc < 34.9) {
            System.out.println("seu imc é " + imc + " Obesidade grau 1");
        } else if (imc > 35.0 && imc < 39.9) {
            System.out.println("seu imc é " + imc + " Obesiddade grau 2");
        } else if (imc > 40 ) {
            System.out.println("seu imc é " + imc + " Obesidade grau 3");
        }else {
            System.out.println("Erro");
        }
    }
}