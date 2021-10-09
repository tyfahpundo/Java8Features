import java.util.function.Predicate;

public class Pred {
    public static void main(String[] args) {
        Predicate<String> p = s->s.length()>5;
        System.out.println(p.test("Tafadzwa"));
        System.out.println(p.test("Alex"));
        System.out.println(p.test("tyfah"));
    }
}
