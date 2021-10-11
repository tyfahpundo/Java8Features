import java.util.Scanner;
import java.util.function.Function;

public class LoginFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = sc.next();
        System.out.println("Enter your password: ");
        String password = sc.next();
        Function<String,String> f1 = s -> s.substring(0,5);
        Function<String,String> f2 = s -> s.toLowerCase();

        if(f1.andThen(f2).apply(username).equals("tyfah")&& password.equals("java")){
            System.out.println("Successfully Logged in!!!!!");
        }else{
            System.out.println("Invalid Username or Password");
        }
    }
}
