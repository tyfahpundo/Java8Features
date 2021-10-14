import java.util.function.IntPredicate;

public class IntPredicates {
    public static void main(String[] args) {
        int[] x = {0,5,10,15,20,25,30,35};
        IntPredicate p = i->i%2==0;
        for(int a: x){
            if(p.test(a)){
                System.out.println(a);
            }
        }
    }
}
