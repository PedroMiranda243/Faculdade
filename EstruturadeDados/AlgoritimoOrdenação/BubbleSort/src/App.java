public class App {
    public static void main(String[] args) throws Exception {
        int[] vetor1 = new int[]{77,99,44,55,22,88,11,27,66,33};
        System.out.println("Antes da ordenação");
        for(int i=0; i<vetor1.length; i++){
            System.out.print(" "+ vetor1[i]);
        }
        ordenabubble(vetor1);
        System.out.println();
        System.out.println("Depois da ordenação");
        for(int i=0; i<vetor1.length; i++){
            System.out.print(" "+vetor1[i]);
        }

        

    }

    public static void ordenabubble(int[] vetor){
        int out, in;
        int nElems= vetor.length;
        int temp=0;
        for(out=nElems-1; out>0; out-- ){//um loop de trás pra frente
            for(in=0; in<out; in++){
                if(vetor[in]>vetor[in+1]){//está fora de ordem?
                    temp=vetor[in];
                    vetor[in]=vetor[in+1];
                    vetor[in+1]=temp;
                }
            }
        }   
      }
}
