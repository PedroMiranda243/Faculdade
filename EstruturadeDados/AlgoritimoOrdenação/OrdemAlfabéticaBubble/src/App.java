

public class App {
    public static void main(String[] args) throws Exception {
       
        String[] nomes = {"Pedro", "Rafael", "Camile", "Maycom", "Ayrton"};
        System.out.println("Antes da ordenação.");
        for(int i=0; i<nomes.length; i++){
            System.out.println(", "+nomes[i]);
        }
        ordena(nomes);
        System.out.println();
        System.out.println("Depois da ordenação");
        for(int i = 0; i<nomes.length; i++){
            System.out.println(", "+ nomes[i]);
        }
     }
     public static void ordena(String[] vetor){
        int out, in;
        int nElems= vetor.length;
        String temp;
      for(out= nElems-1; out>0; out--){
            for(in=0; in<out; in++){
                vetor[in].toLowerCase();

                if(vetor[in].charAt(0)> vetor[in+1].charAt(0)){
                    temp=vetor[in];
                    vetor[in]=vetor[in+1];
                    vetor[in+1]=temp;
                }
            }
        }

    }}

