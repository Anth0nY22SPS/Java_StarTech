import java.util.*;

public class Conta {

    protected int numero_conta;
    protected String titular_conta;
    protected double saldo;

    protected Random gerador_conta = new Random(1000);
    protected Scanner input = new Scanner(System.in);

    public Conta(String nome_titular, double saldo_inicial){
        this.titular_conta = nome_titular;
        this.saldo = saldo_inicial;

        Random gerador_numero = new Random();
        numero_conta = gerador_numero.nextInt(1000);
    }

    public void Ver_saldo(){
        System.out.println("O numero da conta é: " + numero_conta);
        System.out.println("Seu saldo é " + saldo);
        System.out.println("O nome do titular: " + titular_conta);
    }

    private void Adiciona_dindin(double valor) {
        if (valor < 0){
            System.out.println("Sai pobre");
        }else {
            System.out.println("Valeu");
            this.saldo += valor;
        }
    }

    private void Sacar_dindin(double sacar){
        if (sacar > this.saldo) {
            System.out.println("Valor de saquer e maior do que tem na conta");
        } else {
            this.saldo -= sacar;
        }
    }

    public void Iniciar(){
        int opcao;
        do {
            Exibi_menu();
            opcao = input.nextInt();
            Escolher_funcao(opcao);
        }while (opcao > 6 || opcao < 0);
    }

    private void Exibi_menu(){
        System.out.println("Escolhar sua opção");
        System.out.println("1 - Ver Saldo");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Finalizar");
        System.out.println("5 - Emprestimo");
    }

    private void Escolher_funcao(int escolhar){
        switch (escolhar){
            case 1:
                Ver_saldo();
                Iniciar();
                break;
            case 2:
                System.out.print("Valor para sacar: ");
                int valor2 = input.nextInt();
                Sacar_dindin(valor2);
                Iniciar();
                break;
            case 3:
                System.out.print("Valor para depositar: ");
                double valor = input.nextDouble();
                Adiciona_dindin(valor);
                Iniciar();
                break;

            case 4:
                System.out.println("Finalizado");
                break;

            case 5:
                if (saldo < 1000){
                    System.out.println("Saldo e menor que 1000, emprestimo negado");
                }else{
                    System.out.print("Ok, Informe o valor do emprestimo: ");
                    double valor3 = input.nextDouble();
                    System.out.println("o valor vai aparecer no conta em 3 dias util");
                }
                Iniciar();
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
    }

}
