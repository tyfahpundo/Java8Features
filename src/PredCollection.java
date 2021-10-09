import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredCollection {
    public static void main(String[] args) {
        Predicate<Collection> p = c->c.isEmpty();
        ArrayList list = new ArrayList();
        list.add('A');
        System.out.println(p.test(list));
    }
}
