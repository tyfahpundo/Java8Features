import java.util.HashSet;
import java.util.Set;

public class Collection {
    public static void main(String[] args) {
        Set<String> h = new HashSet<>();
        h.add("tyfah");
        h.add("sunny");
        h.add("bunny");
        h.add("tyfah");
        h.add("rodney");

        System.out.println(h);
    }
}
