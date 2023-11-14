public class Lista {
    double[] vet;
    int livre;

    public Lista() {
        vet = new double[8];
        livre = 0;
    }
    public Lista(int t){
        vet = new double[t];
        livre=0;
    }

    public void add(double e) {
        if (livre < vet.length) {
            vet[livre] = e;
            livre++;
        } else {
            System.out.println("Lista cheia!");
        }
    }

    public double get(int i) {
        if ((i >= 0) && (i < livre)) {
            return vet[i];
        } else {
            System.out.println("Fora da lista");
            return -1;
        }
    }

    public int size(){
        return livre;
    }

    public String toString(){
        String res = "[ ";
        for (int i = 0; i < livre; i++) {
            res += vet[i]+" ";
        }
        res = res+"]";
        return res;
    }

}
