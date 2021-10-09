import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredRemove {
    public static void main(String[] args) {
        String[] names = {"","tyfah", null, "Blessing","Sylvester",null,""};
        Predicate<String> notNull = s->s!=null && s.length()!=0;
        List<String> newList = new ArrayList<>();
        for(String a: names){
            if(notNull.test(a)){
                newList.add(a);
            }
        }
        System.out.println(newList);
    }
}
