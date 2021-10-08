import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetPrac {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
        set.add(2);
        set.add(5);
        set.add(9);
        set.add(0);
        set.add(1);
        System.out.println(set);
    }
}
