package Aula;

public class Aula {

    public static void main(String[] args) {


        Aula_modelo a = new Aula_modelo();

        a.TipoAula = "Dentro da sala";
        a.Materia = "Matematica";
        a.Professor = true;
        a.Curso = "Startech";
        a.Local = "Rua logoAli";
        a.Periodo = "Manha";
        a.Aluno = true;
        a.Horario = true;
        a.Tempo_aula = 5;

        a.Finaliza();
        a.Pausa();
        a.Iniciar();
        a.Estado();
    }
}
