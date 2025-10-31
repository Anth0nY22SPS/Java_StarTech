package OOP_Alura;

public class Series extends Titulo{

    private int Temporada;
    private boolean Ativa;
    private int EpPorTemporada;
    private int MinutosPorEp;

    public void setTemporada(int temporada) {
        Temporada = temporada;
    }

    public int getTemporada() {
        return Temporada;
    }

    public void setEpPorTemporada(int epPorTemporada) {
        EpPorTemporada = epPorTemporada;
    }

    public int getEpPorTemporada() {
        return EpPorTemporada;
    }

    public void setAtiva(boolean ativa) {
        Ativa = ativa;
    }

    public boolean getAtiva() {
        return Ativa;
    }

    public void setMinutosPorEp(int minutosPorEp) {
        MinutosPorEp = minutosPorEp;
    }

    public int getMinutosPorEp() {
        return MinutosPorEp;
    }


    // SOBREESCRITA DOS METODOS

    @Override
    public int getDuracaoEmMinutos() {
        return Temporada * MinutosPorEp * EpPorTemporada;
    }
}

