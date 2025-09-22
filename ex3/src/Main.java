import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        long inicio;
        long fim;

        List<Long> time = new ArrayList<>();

        Livro livro = new Livro(0, "O iluminado", "Suspense");
        Livro livro1 = new Livro(1, "Morro dos ventos uivantes", "Romance");
        Livro livro2 = new Livro(2, "Inferno de Dante", "Conto");

        ArrayList<Livro> list = new ArrayList<>();
        list.add(livro);
        list.add(livro1);
        list.add(livro2);

        for(int i = 0; i < list.size(); i++ ){

            inicio = System.nanoTime();

            System.out.println(list.get(i));

            fim = System.nanoTime();            

            time.add(fim - inicio);
        }

        for(int i = 0; i < list.size(); i++ ){
             System.out.println("O livro: " + list.get(i).getName()+ " teve o tempo de retorno: " + time.get(i));
        }

        list.removeLast();

        for(int i = 0; i < list.size(); i++ ){
             System.out.println(list.get(i));
        }
        
       
    }
}
