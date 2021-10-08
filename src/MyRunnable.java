public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <5;i++){
            System.out.println("Child Thread!!!");
        }
    }
}
class ThreadDemo{
    public static void main(String[] args) {
        Runnable r = new MyRunnable();
        Thread k = new Thread(r);
        k.start();

        for(int i=0;i<5;i++){
            System.out.println("Main Thread!!!");
        }
    }
}
