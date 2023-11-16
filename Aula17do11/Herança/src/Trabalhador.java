//Classe herdeira da classe Humando
public class Trabalhador extends Humano {
    // Possui seus próprios atributos ALÉM dos atributos de Humano
    private String profissao;
    private double salario;

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Com seus próprios comportamentos ALÉM dos comportamentos de Humano
    public double exibeAumento(double a) {
        System.out.println("Fui promovido!\nRecebi um aumento de " + a + "%");
        a = a / 100;
        salario = (salario * a) + salario;
        System.out.println("Agora meu salário é de R$" + salario);
        return salario;
    }

}
