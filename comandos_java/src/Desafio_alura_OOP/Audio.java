package Desafio_alura_OOP;

public class Audio {

    private String Musica;
    private int Duracao;
    private int TotalReproducao;


    public void Curtida(boolean curti){
        if (curti){
            System.out.println("Adicionada no Favoritos");
        }
    }

    public void Reproduzir(boolean reproduzir) {
        if(reproduzir){
            System.out.println("Tocar musica");
        }
    }

    // setts
    public void setDuracao(int duracao) {Duracao = duracao;}
    public void setMusica(String musica) {Musica = musica;}
    public void setTotalReproducao(int totalReproducao) {TotalReproducao = totalReproducao;}

    // gettes
    public int getDuracao() {return Duracao;}
    public int getTotalReproducao() {return TotalReproducao;}
    public String getMusica() {return Musica;}
}
