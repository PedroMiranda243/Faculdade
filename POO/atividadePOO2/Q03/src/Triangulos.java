public class Triangulos {
    double la, lb, lc;

    public double triangulo(){
        if(la + lb > lc && la + lc > lb && lb + lc > la){
            System.out.println("Forma um triângulo!");
        if( la == lb && la == lc){
            System.out.println("Equilátero");
        }
        else if(la == lb || la == lc || lb ==lc ){
            System.out.println("Isósceles");
        }
        else {
            System.out.println("Escaleno");
        }}
        else{
            System.out.println("Não forma um triângulo");
        }
        return(la);     
    }
  
    

}
