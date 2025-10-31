package pacote_caneta;

public class Caneta {

        public  static void main(String[] args ){

                Modelo_caneta caneta = new Modelo_caneta();

                caneta.Modelo = "Big";
                caneta.Cor = "Azul";
                caneta.ponta = 0.5f;
                caneta.carga = 10;
                caneta.tampado = true;
                caneta.estado();

                caneta.destampar();
                caneta.tampar();
                caneta.rabiscar();

                caneta.desenha();
        }
}
