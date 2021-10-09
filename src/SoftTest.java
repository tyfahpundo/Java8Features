import java.util.function.Predicate;

public class SoftTest {
    public static void main(String[] args) {
        SoftwareEngineer[] list = {new SoftwareEngineer("Tynoe",21,false),
                new SoftwareEngineer("Blessing",22,true),
                new SoftwareEngineer("Alex",15,true),
                new SoftwareEngineer("Lynn",11,true),
                new SoftwareEngineer("Sly",45,false),
                new SoftwareEngineer("Tyfah",20,true)};
        Predicate<SoftwareEngineer> allowed = se -> se.age > 18 && se.isHavingGf == true;
        for(SoftwareEngineer se : list){
            if(allowed.test(se)){
                System.out.println(se);
            }
        }
    }


}
