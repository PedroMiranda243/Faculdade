//Classe herdeira da classe Humando
public class Universitario extends Humano {
    // Possui seus próprios atributos ALÉM dos atributos de Humano
    private String curso;
    private int periodo;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    // Com seus próprios comportamentos ALÉM dos comportamentos de Humano
    public int passaPeriodo() {
        periodo++;
        System.out.println("Eu passei de período!!!");
        System.out.println("Agora estou no " + periodo + "º perído :)");

        return periodo;
    }

}
