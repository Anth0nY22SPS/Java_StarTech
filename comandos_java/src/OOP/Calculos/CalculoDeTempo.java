package OOP.Calculos;

import OOP.Titulo;

public class CalculoDeTempo {

    private int TempoTotal;

    public int getTempoTemporada() {
        return TempoTotal;
    }

    public void  Incluir(Titulo titulo)
    {
        TempoTotal += titulo.getDuracaoEmMinutos();
    }


}
