package OOP_Alura.Calculos;

public class FiltroRecomendaçao {

    private String recomendaçao;

    public void filtro(Classificado classificado) {
        if(classificado.getClassificado() >= 4){
            System.out.println("Está entre os preferidos");
        }else if (classificado.getClassificado() >= 2) {
            System.out.println("Muito bem avaliado");
        }else{
            System.out.println("Colocar a sua lista para ver depois");
        }
    }

}
