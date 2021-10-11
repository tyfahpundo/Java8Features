import java.util.ArrayList;
import java.util.function.Consumer;

public class MovieTest {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<>();
        populate(list);
        Consumer<Movie> c = m ->{
            System.out.println("Movie Name: "+m.name);
            System.out.println("Movie Hero: "+m.hero);
            System.out.println("Movie Heroine: "+m.heroine);
            System.out.println("************************************************************");
        };
        for(Movie m : list){
            c.accept(m);
        }
    }

    private static void populate(ArrayList<Movie> list) {
        list.add(new Movie("Terminator","Schwazznigger","Angelina"));
        list.add(new Movie("Squid Game","Wayne","Octavia"));
        list.add(new Movie("Boy Next Door","Rambo","Jolie"));
        list.add(new Movie("The 100","Berlamy","Clarke"));
    }
}
