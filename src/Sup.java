import java.time.LocalDateTime;
import java.util.function.Supplier;

public class Sup {
    public static void main(String[] args) {
        Supplier<LocalDateTime> date = () -> LocalDateTime.now();
        System.out.println(date.get());

        Supplier<String> s = () ->{
            String[] names ={"Tafadzwa","Blessing","Sylvester","Monalisah"};
            int x = (int) (Math.random()*4);
            return names[x];
        };
        System.out.println(s.get());
    }
}
