public class Carro {
    double carroP;

    public double getCarroP() {
        return carroP;
    }

    public void setCarroP(double carroP) {
        this.carroP = (carroP*0.28)+(carroP*0.45)+carroP;
    }
}
