import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class PersonTest {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        populate(personList);
        Function<ArrayList<Person>, Double> fn = list -> {
          double total = 0;
          for (Person person : list) {
              total += person.salary;
          }
          return total;
        };
        System.out.println("The total monthly salary amounts to: "+ fn.apply(personList));
        Predicate<Person> p = person->person.salary<30000;
        Function<Person,Person> f = p1->{
            p1.salary +=447;
            return p1;
        };
        ArrayList<Person> list2 = new ArrayList<>();
        for(Person person: personList){
            if(p.test(person)){
                f.apply(person);
                list2.add(person);
            }
        }
        System.out.println("After Increments");
        System.out.println(list2);
    }

    private static void populate(ArrayList<Person> personList) {
        personList.add(new Person("Tafadzwa",20000));
        personList.add(new Person("Blessing",40000));
        personList.add(new Person("Rodney",90000));
        personList.add(new Person("Tadiwa",22900));
        personList.add(new Person("Monalisah",14300));
        personList.add(new Person("Allen",34510));
        personList.add(new Person("Alex",54237));
        personList.add(new Person("Lynn",67435));
    }
}
