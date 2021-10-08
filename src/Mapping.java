import java.util.ArrayList;
import java.util.Collections;

public class Mapping {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(0);
        list.add(150);
        list.add(8);
        list.add(12);
        System.out.println("Before sorting: "+ list);
        Collections.sort(list);
        //Custom sorting requires Comparator
        System.out.println("After sorting: "+ list);
        Collections.sort(list, (i1,i2)->(i1>i2)?-1:(i1<i2)?+1:0);
        System.out.println("After Custom sorting: "+list);
    }
}
