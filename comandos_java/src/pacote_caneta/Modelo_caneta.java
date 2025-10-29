package pacote_caneta;

public class Modelo_caneta {

        String Modelo;
        String Cor;
        float ponta;
        int  carga;
        boolean tampado;

         void rabiscar() {

            if (this.tampado && this.carga > 5){
                System.out.println("Estou rabiscando");
            }else{
                System.out.println("Erro! Tira a tampa ou sem tinta!");
            }
        }

        void tampar(){
             this.tampado = true;
        }

        void destampar(){
             this.tampado = false;
        }

        void estado(){
            System.out.println("Esta caneta e do modelo " + this.Modelo);
            System.out.println("Esta caneta tem a cor " + this.Cor);
            System.out.println("Esta caneta é tem a ponta " + this.ponta);
            System.out.println("Esta caneta esta com a carga em " + this.carga + "%");
            System.out.println("Esta caneta esta tampada " + this.tampado);
        }

        void desenha(){
             if (this.tampado && this.carga > 5 ){
                System.out.println("Esta Pronto");
             } else {
                System.out.println("Erro! Esta tampanda ou sem tinta");
             }

        }
 }
