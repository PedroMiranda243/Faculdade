//Abstração de um humano no código
public class Humano {
    // Variáveis ou Atributos de um humano (ao menos da nossa classe humano ;)
    String nome;
    double altura;
    int idade;
    char sexo;

    // métodos/funções ou comportamentos da nossa classe humano
    public void seApresenta() {
        System.out.println("Meu nome é " + nome);
        System.out.println("Eu tenho " + altura + "m de altura");
        System.out.println("Tenho " + idade + " anos de idade");
        System.out.println("Sou do sexo " + sexo);
    }

    public int fazAniversário() {
        return idade++;
    }
}
