public interface Str {
    int getLength(String s);
}
class Test2{
    public static void main(String[] args) {
        Str i = s-> s.length();
        System.out.println(i.getLength("Tafadzwa"));
    }
}
