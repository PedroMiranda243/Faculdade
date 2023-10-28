public class App {
    public static void main(String[] args) throws Exception {
        int[] vetor1 = new int[]{5,3,1,4,2};
        System.out.println("Antes da ordenação");
        for(int i=0; i<vetor1.length; i++){
            System.out.print(" "+ vetor1[i]);
        }
        ordenaselect(vetor1);
        System.out.println();
        System.out.println("Depois da ordenação");
        for(int i=0; i<vetor1.length; i++){
            System.out.print(" "+vetor1[i]);
        }
    }

    private static void ordenaselect(int[] vetor) {
        int out, in, min, temp;
        int nElems = vetor.length;

        for(out = 0; out<nElems-1; out++){
            min = out;
            for( in=out+1; in<nElems; in++)
                if(vetor[in]<vetor[min])
                    min = in;
                    temp = vetor[out];
                    vetor[out] = vetor[min];
                    vetor[min]=temp;
                     
        }
    }
}
