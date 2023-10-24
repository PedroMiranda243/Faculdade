import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
       Alunos[] a1 = new Alunos[2];
       
       for(int i=0; i<a1.length; i++){
        a1[i]= new Alunos();
        a1[i].notas = new double[2];
        System.out.println("Insira as informações do " +(i+1)+ "º aluno \n");
        System.out.print("Nome do aluno: ");
        a1[i].nome= ler.next();
        System.out.print("Semestre de " + a1[i].nome);
        a1[i].semestre= ler.nextInt();
        System.out.println("Sala de "+ a1[i].nome);
        a1[i].sala= ler.next();
        System.out.println("Curso de: "+ a1[i].nome);
        a1[i].curso= ler.next();
        System.out.println("Notas da primeira e segunda unidade: ");
        a1[i].notas[0]= ler.nextDouble();
        a1[i].notas[1]= ler.nextDouble();

       }
       for(int i=0; i<a1.length; i++){
        double media = (a1[i].notas[0]+a1[i].notas[1])/2;
        if(media>=7){
            System.out.println(a1[i].nome+ " está aprovado(a)!");
        }
        if(media<7&& media>=4){
            System.out.println(a1[i].nome+" é elegível para a recuperação final!");

        }
        if(media<4){
            System.out.println(a1[i].nome +" está reprovado!");
        }
       }
       ler.close();
    }
}
