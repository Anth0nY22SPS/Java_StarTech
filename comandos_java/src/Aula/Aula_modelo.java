package Aula;


public class Aula_modelo {

    boolean Professor;
    boolean Aluno;
    String Materia;
    boolean Horario;
    String Periodo;
    String Local;
    String Curso;
    String TipoAula;
    int Tempo_aula;

    void Iniciar(){
        if (Horario && Professor) {
            System.out.println("Aula Iniciada");
        }else {
            System.out.println("Não esta na hora de começa ou falta o Professo");
        }
    }

    void Pausa(){
        if (Periodo == "Tarde")
        {
            System.out.println("Hora do Intervalo");
        }else {
            System.out.println("Não e hora ainda");
        }
    }

    void Finaliza() {
        if (Horario) {
            System.out.println("Não esta na hora de Sair");
        }else {
            System.out.println("Está na hora de acaba a aula");
        }
    }

    void Trocar_aluno(){
        Aluno = false;
    }

    void Estado(){
        System.out.println("Professo dentro está na sala " + Professor);
        System.out.println("Tem Aluno dentro da sala " + Aluno);
        System.out.println("A Materia Agora é " + Materia);
        System.out.println("Perioda é " + Periodo);
        System.out.println("A escola fica na : " + Local);
        System.out.println("O curso agora é de " + Curso);
        System.out.println("Hoje o tipo de aula e  " + TipoAula);
    }
}
