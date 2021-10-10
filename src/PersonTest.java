import java.util.ArrayList;
import java.util.function.Function;

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
        System.out.println("The toatl monthly salary amounts to: "+ fn.apply(personList));
    }

    private static void populate(ArrayList<Person> personList) {
        personList.add(new Person("Tafadzwa",20000));
        personList.add(new Person("Tafadzwa",40000));
        personList.add(new Person("Tafadzwa",90000));
        personList.add(new Person("Tafadzwa",22900));
        personList.add(new Person("Tafadzwa",14300));
        personList.add(new Person("Tafadzwa",34510));
        personList.add(new Person("Tafadzwa",54237));
        personList.add(new Person("Tafadzwa",67435));
    }
}
