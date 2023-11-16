public class Humano {
    String nome;
    double altura;
    int idade; 
    char sexo;

    public void seApresenta(){
        System.out.println("Meu nome é "+nome);
        System.out.println("Eu tenho "+altura+"m de altura");
        System.out.println("Tenho "+idade+" anos de idade");
        System.out.println("Sou do sexo "+sexo);
    }

    public int fazAniversário(){
        return idade++;
    }
}
