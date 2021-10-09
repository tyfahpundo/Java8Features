import java.util.function.Predicate;

public class PredTest {
    public static void mi(Predicate<Integer> p, int[]x){
        for(int a : x){
            if(p.test(a)){
                System.out.println(a);
            }
        }
    }

    public static void main(String[] args) {
        int[] x = {0,2,3,5,10,15,20,25,30};
        Predicate<Integer> p1 = i->i>10;
        Predicate<Integer> p2 = i->i%2==0;
        System.out.println("The numbers greater than 10 are: ");
        mi(p1,x);
        System.out.println("The even numbers are: ");
        mi(p2,x);
        System.out.println("The numbers greater than 10 and even are: ");
        mi(p1.and(p2), x);
        System.out.println("The numbers greater than 10 or even: ");
        mi(p1.or(p2), x);
    }
}
