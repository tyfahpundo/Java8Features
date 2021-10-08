@FunctionalInterface
public interface Inter {
    void add(int a, int b);
}
class Test{
    public static void main(String[] args) {
        Inter i = (a,b)-> System.out.println("The sum : "+(a+b));
        i.add(29,234);
        i.add(45,76);
    }
}
