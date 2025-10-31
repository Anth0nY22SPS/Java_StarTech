package OOP_Alura.Calculos;

import OOP_Alura.Titulo;

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
