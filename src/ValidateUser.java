import java.util.Scanner;
import java.util.function.Predicate;

public class ValidateUser {
    public static void main(String[] args) {
        Predicate<User> p = user->user.username.equals("tyfah")&& user.password.equals("java");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your Username: ");
        String username = sc.next();
        System.out.println("Please enter your password: ");
        String password = sc.next();

        User user = new User(username,password);
        if(p.test(user)){
            System.out.println("Your Credintials were Correct You can Log in");
        }else{
            System.out.println("Invalid Username or Password please try again");
        }
    }
}
