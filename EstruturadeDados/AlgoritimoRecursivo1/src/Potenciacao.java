public class Potenciacao {
  
    double potencia(double base, int exp){
        if(exp == 1){//caso base
            return base;
        }
        return potencia(base, exp-1)*base;//passo indutivo
    }
}