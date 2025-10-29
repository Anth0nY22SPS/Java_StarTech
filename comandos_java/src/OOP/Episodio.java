package OOP;

public class Episodio {

    private int Numeros;
    private String Nome;
    private Series series;

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


}
