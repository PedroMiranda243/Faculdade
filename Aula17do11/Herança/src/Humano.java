//Humano se tornou agora uma super classe para as classes que dela herdam.
public class Humano {

    private String nome;
    private double altura;
    private int idade;
    private char sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

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
