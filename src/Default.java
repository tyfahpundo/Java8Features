public interface Default {
    default void mi(){
        System.out.println("Default Method in an Interface");
    }
}
class Demoo implements Default{
    public void mi(){
        System.out.println("My own Implementation");
    }
    public static void main(String[] args) {
        Demoo demo = new Demoo();
        demo.mi();
    }
}
