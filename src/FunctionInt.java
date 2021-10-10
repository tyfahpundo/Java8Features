import java.util.Scanner;
import java.util.function.Function;

public class FunctionInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String and l will give you its length: ");
        String name = sc.next();

        Function<String,Integer> f = s->s.length();
        System.out.println(f.apply(name));
        System.out.println("*********************************************************");
        System.out.println("The square of the Provided Number: ");

        Function<Integer,Integer>fn = i->i*i;
        System.out.println("Please enter the number you want to square");
        int number = sc.nextInt();
        System.out.println(fn.apply(number));
        System.out.println("*********************************************************");
        String s = "tyfah is good in java ";
        Function<String,String> fm = string->string.replaceAll(" ","");
        System.out.println(fm.apply(s));
        //Find the number of spaces in the spring
        Function<String,Integer>fp = si->si.length()- si.replaceAll(" ","").length();
        System.out.println(fp.apply(s));
    }
}
