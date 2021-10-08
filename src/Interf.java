public interface Interf {
    int squareIt(int x);
}
class Demo{
    public static void main(String[] args) {
        Interf i = x->x*x;
        System.out.println(i.squareIt(5));
        System.out.println(i.squareIt(25));
    }
}
