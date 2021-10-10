public class Person {
    String name;
    double salary;

    public Person(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name+" : "+salary;
    }
}
