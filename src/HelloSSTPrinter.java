public class HelloSSTPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello SST Printer  " + Thread.currentThread().getName());
    }
}
