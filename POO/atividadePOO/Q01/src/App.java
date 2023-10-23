
public class App {
    public static void main(String[] args) throws Exception {
       Hipotenusa hipotenusa = new Hipotenusa();
       hipotenusa.leitura();
       double calculo = hipotenusa.Calculo();
       System.out.println("O valor da hipotenusa é: " + calculo);
    }
}