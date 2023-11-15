public class App {
    public static void main(String[] args) throws Exception {
        Transporte t = new Transporte();
        Veiculo v = new Veiculo();
        Carro c = new Carro();
        

        mover(t);
        mover(v);
        mover(c);

    }
    static void mover(Transporte trans){
        System.out.println(trans.mover());
    }
}
