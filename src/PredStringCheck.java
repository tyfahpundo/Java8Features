import java.util.function.Predicate;

public class PredStringCheck {
    public static void main(String[] args) {
        String[] names = {"Kelly","Tafadzwa","Blessing","Kim","Karma","Sly"};
        Predicate<String> startsWith = s->s.startsWith("K");

        for(String s: names){
            if(startsWith.test(s)){
                System.out.println(s);
            }
        }
    }
}
