import java.util.function.BiPredicate;

public class BiPred {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> p = (a,b)->(a+b)%2==0;
        System.out.println(p.test(23,66));
    }
}
