public class App {
    public static void main(String[] args) throws Exception {
        int[] vetor1 = new int[]{77,99,44,55,22,88,11,27,66,33};//vetor1 10 posições.
        System.out.println("Antes da ordenação");
        for(int i=0; i<vetor1.length; i++){
            System.out.print(" "+ vetor1[i]);
        }//imprime o vetor antes da ordenação.
        ordenabubble(vetor1);//executa a ordenação.
        System.out.println();
        System.out.println("Depois da ordenação");
        for(int i=0; i<vetor1.length; i++){
            System.out.print(" "+vetor1[i]);
        }//imprime o vetor depois da ordenação.

        

    }

    public static void ordenabubble(int[] vetor){//algoritimo da ordenação 
        int out, in;
        int nElems= vetor.length;
        int temp=0;
        for(out=nElems-1; out>0; out-- ){//um loop de trás pra frente, vai limitando os itens da direita pra esquerda.
                                        // o maior valor já está na extrema direita? então vamos ver qual o maior valor antes desse!

            for(in=0; in<out; in++){//o out diz até onde a ordenação(o for) deve ir.

                if(vetor[in]>vetor[in+1]){//está fora de ordem? se sim, troque. 
                    temp=vetor[in];
                    vetor[in]=vetor[in+1];
                    vetor[in+1]=temp;
                }
            }
        }   
      }
}
