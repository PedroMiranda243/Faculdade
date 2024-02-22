import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;


public class App {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws Exception {
        Livro umLivro = new Livro();
        ObjectContainer db;

        db = Db4o.openFile("meubanco.dbo");
        umLivro.setTitulo("Paradigmas da Programação");
        umLivro.setAutor("Flávio");
        umLivro.setEditora("UNINASSAU");
        umLivro.setAnoedicao("2023");
        umLivro.setLocalizacao("Olinda/PE");
        db.store(umLivro);
        db.close();

        db = Db4o.openFile("meubanco.dbo");
        umLivro.setTitulo("Metodologia Científica");
        umLivro.setAutor("Maria Antonieta");
        umLivro.setEditora("UNINASSAU");
        umLivro.setAnoedicao("2020");
        umLivro.setLocalizacao("Paulista/PE");
        db.store(umLivro);
        db.close();

        ObjectSet<Livro> lista;
        db = Db4o.openFile("meubanco.dbo");
        lista = db.query(Livro.class);
        while (lista.hasNext()) {
            umLivro=lista.next();
            System.out.println("##################");
            System.out.println(umLivro.getTitulo());
            System.out.println(umLivro.getAutor());
            System.out.println(umLivro.getEditora());
            System.out.println(umLivro.getAnoedicao());
            System.out.println(umLivro.getLocalizacao());
            
        }
    }
}
