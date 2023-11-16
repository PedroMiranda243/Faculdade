public class Trabalhador extends Humano {
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

    public double exibeAumento(double a) {
        System.out.println("Fui promovido!\nRecebi um aumento de " + a + "%");
        a = a / 100;
        salario = (salario * a) + salario;
        System.out.println("Agora meu salário é de R$" + salario);
        System.out.println();
        return salario;
    }

    // Essa anotação @Override indica que, o mesmo método "seApresenta"
    // funcionará de maneira diferente nesa classe.
    @Override
    public void seApresenta() {
        System.out.println("Trabalho como " + profissao);
        System.out.println("Meu salário é R$" + salario);
        super.seApresenta();
    }

}
