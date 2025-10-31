package OOP_Alura;

import OOP_Alura.Calculos.Classificado;

public class Episodio implements Classificado {

    private int Numeros;
    private String Nome;
    private Series series;
    private int NumerosVisualização;

    public void setNumerosVisualização(int numero) { this.NumerosVisualização = numero;}

    public int getNumerosVisualização() { return NumerosVisualização;}

    public void setNumeros(int numero){
        this.Numeros = numero;
    }

    public int getNumeros(){
        return Numeros;
    }

    public void setNumeros(String nome){
        Nome = nome;
    }

    public String getNome(){
        return Nome;
    }

    public void setSeries(Series s){
        series = s;
    }

    public Series getSeries(){
        return series;
    }

    @Override
    public int getClassificado() {
        if (NumerosVisualização > 100){
            return 4;
        } else {
            return 2;
        }
    }
}
