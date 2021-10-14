import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class IntPredicates {
    public static void main(String[] args) {
        int[] x = {0,5,10,15,20,25,30,35};
        IntPredicate p = i->i%2==0;
        for(int a: x){
            if(p.test(a)){
                System.out.println(a);
            }
        }
        ToIntFunction<String> f = s->s.length();
        System.out.println(f.applyAsInt("tyfah"));

        IntSupplier s =()-> (int)(Math.random()*10);
        String otp ="";
        for(int i=0;i<6;i++){
            otp = otp+s.getAsInt();
        }
        System.out.println(otp);
        UnaryOperator<Integer> o = i->i*i;
        System.out.println(o.apply(23));
    }
}
