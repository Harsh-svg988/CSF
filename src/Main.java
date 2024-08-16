public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello world!  " + Thread.currentThread().getName());
//        HelloSSTPrinter task = new HelloSSTPrinter();
//        Thread thread = new Thread(task);
//        thread.start();
//        System.out.println("Hello world!  " + Thread.currentThread().getName());
        for (int i = 0; i < 100; i++) {
            NumberPrinter t1 = new NumberPrinter(i);
            Thread thread1 = new Thread(t1);
            thread1.start();
        }
    }
}