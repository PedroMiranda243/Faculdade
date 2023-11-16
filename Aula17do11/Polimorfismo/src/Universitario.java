public class Universitario extends Humano {
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

    public int passaPeriodo() {
        periodo++;
        System.out.println("Eu passei de período!!!");
        System.out.println("Agora estou no " + periodo + "º perído :)");
        System.out.println();

        return periodo;
    }

    // Essa anotação @Override indica que, o mesmo método "seApresenta"
    // funcionará de maneira diferente nesa classe.
    @Override
    public void seApresenta() {
        System.out.println("Eu curso " + curso);
        System.out.println("E estou no " + periodo + "º período");
        super.seApresenta();
    }

}
