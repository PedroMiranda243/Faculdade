public class OrdenacaoBubble {
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
