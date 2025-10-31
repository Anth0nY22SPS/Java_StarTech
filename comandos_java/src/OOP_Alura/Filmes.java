package OOP_Alura;

// SÓ PODE HERDAR APENAS UMA VEZ

import OOP_Alura.Calculos.Classificado;

public class Filmes extends Titulo implements Classificado {

    private String Diretor;

    public String getDireto() {
        return Diretor;
    };

    public void setDireto(String direto){
        Diretor = direto;
    };

    @Override
    public int getClassificado() {

        // (int) para converção de tipo
        return (int) pegaMedia() / 2;
    }
}
